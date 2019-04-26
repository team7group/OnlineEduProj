/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.group7.edu.oss.common.comm;

import com.group7.edu.oss.ClientException;
import com.group7.edu.oss.OSSException;
import com.group7.edu.oss.common.utils.HttpHeaders;
import com.group7.edu.oss.event.ProgressInputStream;
import com.group7.edu.oss.event.ProgressListener;
import com.group7.edu.oss.model.WebServiceRequest;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Map;

import static com.group7.edu.oss.common.utils.LogUtils.logException;
import static com.group7.edu.oss.event.ProgressPublisher.publishRequestContentLength;

public class RequestProgressHanlder implements RequestHandler {

    @Override
    public void handle(RequestMessage request) throws OSSException, ClientException {

        final WebServiceRequest originalRequest = request.getOriginalRequest();
        final ProgressListener listener = originalRequest.getProgressListener();
        Map<String, String> headers = request.getHeaders();
        String s = headers.get(HttpHeaders.CONTENT_LENGTH);
        if (s != null) {
            try {
                long contentLength = Long.parseLong(s);
                publishRequestContentLength(listener, contentLength);
            } catch (NumberFormatException e) {
                logException("Cannot parse the Content-Length header of the request: ", e);
            }
        }

        InputStream content = request.getContent();
        if (content == null) {
            return;
        }
        if (!content.markSupported()) {
            content = new BufferedInputStream(content);
        }
        request.setContent(listener == ProgressListener.NOOP ? content
                : ProgressInputStream.inputStreamForRequest(content, originalRequest));
    }

}
