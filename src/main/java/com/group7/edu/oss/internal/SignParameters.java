package com.group7.edu.oss.internal;

import java.util.Arrays;
import java.util.List;

import static com.group7.edu.oss.internal.RequestParameters.*;
import static com.group7.edu.oss.model.ResponseHeaderOverrides.*;

public class SignParameters {

    public static final String AUTHORIZATION_PREFIX = "OSS ";

    public static final String AUTHORIZATION_PREFIX_V2 = "OSS2 ";

    public static final String AUTHORIZATION_V2 = "OSS2";

    public static final String AUTHORIZATION_ACCESS_KEY_ID = "AccessKeyId";

    public static final String AUTHORIZATION_ADDITIONAL_HEADERS = "AdditionalHeaders";

    public static final String AUTHORIZATION_SIGNATURE = "Signature";

    public static final String NEW_LINE = "\n";

    public static final List<String> SIGNED_PARAMTERS = Arrays.asList(new String[] { SUBRESOURCE_ACL,
            SUBRESOURCE_UPLOADS, SUBRESOURCE_LOCATION, SUBRESOURCE_CORS, SUBRESOURCE_LOGGING, SUBRESOURCE_WEBSITE,
            SUBRESOURCE_REFERER, SUBRESOURCE_LIFECYCLE, SUBRESOURCE_DELETE, SUBRESOURCE_APPEND, SUBRESOURCE_TAGGING,
            SUBRESOURCE_OBJECTMETA, UPLOAD_ID, PART_NUMBER, SECURITY_TOKEN, POSITION, RESPONSE_HEADER_CACHE_CONTROL,
            RESPONSE_HEADER_CONTENT_DISPOSITION, RESPONSE_HEADER_CONTENT_ENCODING, RESPONSE_HEADER_CONTENT_LANGUAGE,
            RESPONSE_HEADER_CONTENT_TYPE, RESPONSE_HEADER_EXPIRES, SUBRESOURCE_IMG, SUBRESOURCE_STYLE, STYLE_NAME,
            SUBRESOURCE_REPLICATION, SUBRESOURCE_REPLICATION_PROGRESS, SUBRESOURCE_REPLICATION_LOCATION,
            SUBRESOURCE_CNAME, SUBRESOURCE_BUCKET_INFO, SUBRESOURCE_COMP, SUBRESOURCE_QOS, SUBRESOURCE_LIVE,
            SUBRESOURCE_STATUS, SUBRESOURCE_VOD, SUBRESOURCE_START_TIME, SUBRESOURCE_END_TIME, SUBRESOURCE_PROCESS,
            SUBRESOURCE_PROCESS_CONF, SUBRESOURCE_SYMLINK, SUBRESOURCE_STAT, SUBRESOURCE_UDF, SUBRESOURCE_UDF_NAME,
            SUBRESOURCE_UDF_IMAGE, SUBRESOURCE_UDF_IMAGE_DESC, SUBRESOURCE_UDF_APPLICATION, SUBRESOURCE_UDF_LOG,
            SUBRESOURCE_RESTORE, });


}
