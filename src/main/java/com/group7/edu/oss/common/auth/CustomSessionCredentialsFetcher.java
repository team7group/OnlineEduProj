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

package com.group7.edu.oss.common.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpResponse;
import com.group7.edu.oss.common.utils.AuthUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

public class CustomSessionCredentialsFetcher extends HttpCredentialsFetcher {

    public CustomSessionCredentialsFetcher(String ossAuthServerHost) {
        this.ossAuthServerHost = ossAuthServerHost;
    }

    @Override
    public URL buildUrl() throws ClientException {
        try {
            return new URL(ossAuthServerHost);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    public Credentials parse(HttpResponse response) throws ClientException {
        String jsonContent = new String(response.getHttpContent());

        try {
            JSONObject jsonObject = new JSONObject(jsonContent);

            if (!jsonObject.has("StatusCode")) {
                throw new ClientException("Invalid json " + jsonContent + " got from oss auth server.");
            }

            if (!"200".equals(jsonObject.get("StatusCode"))) {
                throw new ClientException("Failed to get credentials from oss auth server");
            }

            if (!jsonObject.has("AccessKeyId") || !jsonObject.has("AccessKeySecret")) {
                throw new ClientException("Invalid json " + jsonContent + " got from oss auth server.");
            }

            String securityToken = null;
            if (jsonObject.has("SecurityToken")) {
                securityToken = jsonObject.getString("SecurityToken");
            }

            if (jsonObject.has("Expiration")) {
                return new InstanceProfileCredentials(jsonObject.getString("AccessKeyId"),
                        jsonObject.getString("AccessKeySecret"), securityToken, jsonObject.getString("Expiration"))
                                .withExpiredDuration(
                                        AuthUtils.DEFAULT_STS_SESSION_TOKEN_DURATION_SECONDS);
            }

            return new BasicCredentials(jsonObject.getString("AccessKeyId"), jsonObject.getString("AccessKeySecret"),
                    securityToken);
        } catch (JSONException e) {
            throw new ClientException("CustomSessionCredentialsFetcher.parse [" + jsonContent + "] exception:" + e);
        }
    }

    private String ossAuthServerHost;
}
