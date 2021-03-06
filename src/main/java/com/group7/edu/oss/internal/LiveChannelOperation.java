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

package com.group7.edu.oss.internal;

import com.group7.edu.oss.ClientConfiguration;
import com.group7.edu.oss.ClientException;
import com.group7.edu.oss.HttpMethod;
import com.group7.edu.oss.OSSException;
import com.group7.edu.oss.common.auth.Credentials;
import com.group7.edu.oss.common.auth.CredentialsProvider;
import com.group7.edu.oss.common.auth.ServiceSignature;
import com.group7.edu.oss.common.comm.RequestMessage;
import com.group7.edu.oss.common.comm.ResponseHandler;
import com.group7.edu.oss.common.comm.ServiceClient;
import com.group7.edu.oss.common.utils.BinaryUtil;
import com.group7.edu.oss.common.utils.HttpHeaders;
import com.group7.edu.oss.common.utils.HttpUtil;
import com.group7.edu.oss.model.*;

import java.io.ByteArrayInputStream;
import java.util.*;

import static com.group7.edu.oss.common.parser.RequestMarshallers.createLiveChannelRequestMarshaller;
import static com.group7.edu.oss.common.utils.CodingUtils.assertParameterNotNull;
import static com.group7.edu.oss.internal.OSSConstants.DEFAULT_CHARSET_NAME;
import static com.group7.edu.oss.internal.OSSUtils.ensureBucketNameValid;
import static com.group7.edu.oss.internal.OSSUtils.ensureLiveChannelNameValid;
import static com.group7.edu.oss.internal.RequestParameters.*;
import static com.group7.edu.oss.internal.ResponseParsers.*;

/**
 * Live channel operation.
 */
public class LiveChannelOperation extends OSSOperation {

    public LiveChannelOperation(ServiceClient client, CredentialsProvider credsProvider) {
        super(client, credsProvider);
    }

    public CreateLiveChannelResult createLiveChannel(CreateLiveChannelRequest createLiveChannelRequest)
            throws OSSException, ClientException {
        assertParameterNotNull(createLiveChannelRequest, "createLiveChannelRequest");

        String bucketName = createLiveChannelRequest.getBucketName();
        String liveChannelName = createLiveChannelRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);

        byte[] rawContent = createLiveChannelRequestMarshaller.marshall(createLiveChannelRequest);
        Map<String, String> headers = new HashMap<String, String>();
        addRequestRequiredHeaders(headers, rawContent);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.PUT).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setHeaders(headers).setInputSize(rawContent.length)
                .setInputStream(new ByteArrayInputStream(rawContent)).setOriginalRequest(createLiveChannelRequest)
                .build();

        List<ResponseHandler> reponseHandlers = new ArrayList<ResponseHandler>();
        reponseHandlers.add(new OSSCallbackErrorResponseHandler());

        return doOperation(request, createLiveChannelResponseParser, bucketName, liveChannelName, true);
    }

    public void setLiveChannelStatus(SetLiveChannelRequest setLiveChannelRequest) throws OSSException, ClientException {

        assertParameterNotNull(setLiveChannelRequest, "setLiveChannelRequest");

        String bucketName = setLiveChannelRequest.getBucketName();
        String liveChannelName = setLiveChannelRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);
        parameters.put(RequestParameters.SUBRESOURCE_STATUS, setLiveChannelRequest.getLiveChannelStatus().toString());

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.PUT).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(setLiveChannelRequest).build();

        doOperation(request, emptyResponseParser, bucketName, liveChannelName);
    }

    public LiveChannelInfo getLiveChannelInfo(LiveChannelGenericRequest liveChannelGenericRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(liveChannelGenericRequest, "liveChannelGenericRequest");

        String bucketName = liveChannelGenericRequest.getBucketName();
        String liveChannelName = liveChannelGenericRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.GET).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(liveChannelGenericRequest).build();

        return doOperation(request, getLiveChannelInfoResponseParser, bucketName, liveChannelName, true);
    }

    public LiveChannelStat getLiveChannelStat(LiveChannelGenericRequest liveChannelGenericRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(liveChannelGenericRequest, "liveChannelGenericRequest");

        String bucketName = liveChannelGenericRequest.getBucketName();
        String liveChannelName = liveChannelGenericRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);
        parameters.put(RequestParameters.SUBRESOURCE_COMP, RequestParameters.STAT);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.GET).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(liveChannelGenericRequest).build();

        return doOperation(request, getLiveChannelStatResponseParser, bucketName, liveChannelName, true);
    }

    public void deleteLiveChannel(LiveChannelGenericRequest liveChannelGenericRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(liveChannelGenericRequest, "liveChannelGenericRequest");

        String bucketName = liveChannelGenericRequest.getBucketName();
        String liveChannelName = liveChannelGenericRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.DELETE).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(liveChannelGenericRequest).build();

        doOperation(request, emptyResponseParser, bucketName, liveChannelName);
    }

    /**
     * List all live channels.
     */
    public List<LiveChannel> listLiveChannels(String bucketName) throws OSSException, ClientException {
        LiveChannelListing liveChannelListing = listLiveChannels(new ListLiveChannelsRequest(bucketName));
        List<LiveChannel> liveChannels = liveChannelListing.getLiveChannels();
        while (liveChannelListing.isTruncated()) {
            liveChannelListing = listLiveChannels(
                    new ListLiveChannelsRequest(bucketName, liveChannelListing.getNextMarker(), null));
            liveChannels.addAll(liveChannelListing.getLiveChannels());
        }
        return liveChannels;
    }

    /**
     * List live channels.
     */
    public LiveChannelListing listLiveChannels(ListLiveChannelsRequest listLiveChannelRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(listLiveChannelRequest, "listObjectsRequest");

        String bucketName = listLiveChannelRequest.getBucketName();
        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);

        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);
        populateListLiveChannelsRequestParameters(listLiveChannelRequest, parameters);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.GET).setBucket(bucketName).setParameters(parameters)
                .setOriginalRequest(listLiveChannelRequest).build();

        return doOperation(request, listLiveChannelsReponseParser, bucketName, null, true);
    }

    public List<LiveRecord> getLiveChannelHistory(LiveChannelGenericRequest liveChannelGenericRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(liveChannelGenericRequest, "liveChannelGenericRequest");

        String bucketName = liveChannelGenericRequest.getBucketName();
        String liveChannelName = liveChannelGenericRequest.getLiveChannelName();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_LIVE, null);
        parameters.put(RequestParameters.SUBRESOURCE_COMP, RequestParameters.HISTORY);

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.GET).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(liveChannelGenericRequest).build();

        return doOperation(request, getLiveChannelHistoryResponseParser, bucketName, liveChannelName, true);
    }

    public void generateVodPlaylist(GenerateVodPlaylistRequest generateVodPlaylistRequest)
            throws OSSException, ClientException {

        assertParameterNotNull(generateVodPlaylistRequest, "generateVodPlaylistRequest");

        String bucketName = generateVodPlaylistRequest.getBucketName();
        String liveChannelName = generateVodPlaylistRequest.getLiveChannelName();
        String playlistName = generateVodPlaylistRequest.getPlaylistName();
        Long startTime = generateVodPlaylistRequest.getStartTime();
        Long endTime = generateVodPlaylistRequest.getEndTime();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);
        assertParameterNotNull(playlistName, "playlistName");
        assertParameterNotNull(startTime, "startTime");
        assertParameterNotNull(endTime, "endTime");

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_VOD, null);
        parameters.put(RequestParameters.SUBRESOURCE_START_TIME, startTime.toString());
        parameters.put(RequestParameters.SUBRESOURCE_END_TIME, endTime.toString());

        String key = liveChannelName + "/" + playlistName;
        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.POST).setBucket(bucketName).setKey(key).setParameters(parameters)
                .setInputStream(new ByteArrayInputStream(new byte[0])).setInputSize(0)
                .setOriginalRequest(generateVodPlaylistRequest).build();

        doOperation(request, emptyResponseParser, bucketName, key);
    }

    public OSSObject getVodPlaylist(GetVodPlaylistRequest getVodPlaylistRequest) throws OSSException, ClientException {

        assertParameterNotNull(getVodPlaylistRequest, "getVodPlaylistRequest");

        String bucketName = getVodPlaylistRequest.getBucketName();
        String liveChannelName = getVodPlaylistRequest.getLiveChannelName();
        Long startTime = getVodPlaylistRequest.getStartTime();
        Long endTime = getVodPlaylistRequest.getEndTime();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);
        assertParameterNotNull(startTime, "startTime");
        assertParameterNotNull(endTime, "endTime");

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(RequestParameters.SUBRESOURCE_VOD, null);
        parameters.put(RequestParameters.SUBRESOURCE_START_TIME, startTime.toString());
        parameters.put(RequestParameters.SUBRESOURCE_END_TIME, endTime.toString());

        RequestMessage request = new OSSRequestMessageBuilder(getInnerClient()).setEndpoint(getEndpoint())
                .setMethod(HttpMethod.GET).setBucket(bucketName).setKey(liveChannelName).setParameters(parameters)
                .setOriginalRequest(getVodPlaylistRequest).build();

        return doOperation(request, new GetObjectResponseParser(bucketName, liveChannelName), bucketName, liveChannelName, true);
    }

    public String generateRtmpUri(GenerateRtmpUriRequest request) throws OSSException, ClientException {

        assertParameterNotNull(request, "request");

        String bucketName = request.getBucketName();
        String liveChannelName = request.getLiveChannelName();
        String playlistName = request.getPlaylistName();
        Long expires = request.getExpires();

        assertParameterNotNull(bucketName, "bucketName");
        ensureBucketNameValid(bucketName);
        assertParameterNotNull(liveChannelName, "liveChannelName");
        ensureLiveChannelNameValid(liveChannelName);
        assertParameterNotNull(playlistName, "playlistName");
        assertParameterNotNull(expires, "expires");

        Credentials currentCreds = this.credsProvider.getCredentials();
        String accessId = currentCreds.getAccessKeyId();
        String accessKey = currentCreds.getSecretAccessKey();
        boolean useSecurityToken = currentCreds.useSecurityToken();

        // Endpoint
        RequestMessage requestMessage = new RequestMessage(bucketName, liveChannelName);
        ClientConfiguration config = this.client.getClientConfiguration();
        requestMessage.setEndpoint(OSSUtils.determineFinalEndpoint(this.endpoint, bucketName, config));

        // Headers
        requestMessage.addHeader(HttpHeaders.DATE, expires.toString());

        // Parameters
        requestMessage.addParameter(RequestParameters.PLAYLIST_NAME, playlistName);

        if (useSecurityToken) {
            requestMessage.addParameter(SECURITY_TOKEN, currentCreds.getSecurityToken());
        }

        // Signature
        String canonicalResource = "/" + bucketName + "/" + liveChannelName;
        String canonicalString = SignUtils.buildRtmpCanonicalString(canonicalResource, requestMessage,
                expires.toString());
        String signature = ServiceSignature.create().computeSignature(accessKey, canonicalString);

        // Build query string
        Map<String, String> params = new LinkedHashMap<String, String>();
        params.put(HttpHeaders.EXPIRES, expires.toString());
        params.put(OSS_ACCESS_KEY_ID, accessId);
        params.put(SIGNATURE, signature);
        params.putAll(requestMessage.getParameters());

        String queryString = HttpUtil.paramToQueryString(params, DEFAULT_CHARSET_NAME);

        // Compose rtmp request uri
        String uri = requestMessage.getEndpoint().toString();
        String livChan = RequestParameters.SUBRESOURCE_LIVE + "/" + liveChannelName;

        if (uri.startsWith(OSSConstants.PROTOCOL_HTTP)) {
            uri = uri.replaceFirst(OSSConstants.PROTOCOL_HTTP, OSSConstants.PROTOCOL_RTMP);
        } else if (uri.startsWith(OSSConstants.PROTOCOL_HTTPS)) {
            uri = uri.replaceFirst(OSSConstants.PROTOCOL_HTTPS, OSSConstants.PROTOCOL_RTMP);
        } else if (!uri.startsWith(OSSConstants.PROTOCOL_RTMP)) {
            uri = OSSConstants.PROTOCOL_RTMP + uri;
        }

        if (!uri.endsWith("/")) {
            uri += "/";
        }
        uri += livChan + "?" + queryString;

        return uri;
    }

    private static void populateListLiveChannelsRequestParameters(ListLiveChannelsRequest listLiveChannelRequest,
            Map<String, String> params) {

        if (listLiveChannelRequest.getPrefix() != null) {
            params.put(RequestParameters.PREFIX, listLiveChannelRequest.getPrefix());
        }

        if (listLiveChannelRequest.getMarker() != null) {
            params.put(RequestParameters.MARKER, listLiveChannelRequest.getMarker());
        }

        if (listLiveChannelRequest.getMaxKeys() != null) {
            params.put(RequestParameters.MAX_KEYS, Integer.toString(listLiveChannelRequest.getMaxKeys()));
        }
    }

    private static void addRequestRequiredHeaders(Map<String, String> headers, byte[] rawContent) {
        headers.put(HttpHeaders.CONTENT_LENGTH, String.valueOf(rawContent.length));

        byte[] md5 = BinaryUtil.calculateMd5(rawContent);
        String md5Base64 = BinaryUtil.toBase64String(md5);
        headers.put(HttpHeaders.CONTENT_MD5, md5Base64);
    }

}
