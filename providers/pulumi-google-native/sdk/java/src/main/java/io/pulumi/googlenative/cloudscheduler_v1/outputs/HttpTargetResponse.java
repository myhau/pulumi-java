// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudscheduler_v1.outputs.OAuthTokenResponse;
import io.pulumi.googlenative.cloudscheduler_v1.outputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class HttpTargetResponse {
    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod.
     * 
     */
    private final String body;
    /**
     * The user can specify HTTP request headers to send with the job's HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header value can contain commas. These headers represent a subset of the headers that will accompany the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format. The total size of headers must be less than 80KB.
     * 
     */
    private final Map<String,String> headers;
    /**
     * Which HTTP method to use for the request.
     * 
     */
    private final String httpMethod;
    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    private final OAuthTokenResponse oauthToken;
    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    private final OidcTokenResponse oidcToken;
    /**
     * The full URI path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private HttpTargetResponse(
        @OutputCustomType.Parameter("body") String body,
        @OutputCustomType.Parameter("headers") Map<String,String> headers,
        @OutputCustomType.Parameter("httpMethod") String httpMethod,
        @OutputCustomType.Parameter("oauthToken") OAuthTokenResponse oauthToken,
        @OutputCustomType.Parameter("oidcToken") OidcTokenResponse oidcToken,
        @OutputCustomType.Parameter("uri") String uri) {
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.oauthToken = oauthToken;
        this.oidcToken = oidcToken;
        this.uri = uri;
    }

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a job with an incompatible HttpMethod.
     * 
    */
    public String getBody() {
        return this.body;
    }
    /**
     * The user can specify HTTP request headers to send with the job's HTTP request. This map contains the header field names and values. Repeated headers are not supported, but a header value can contain commas. These headers represent a subset of the headers that will accompany the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal use only. * `X-AppEngine-*`: Google internal use only. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format. The total size of headers must be less than 80KB.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * Which HTTP method to use for the request.
     * 
    */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
    */
    public OAuthTokenResponse getOauthToken() {
        return this.oauthToken;
    }
    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
    */
    public OidcTokenResponse getOidcToken() {
        return this.oidcToken;
    }
    /**
     * The full URI path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private OAuthTokenResponse oauthToken;
        private OidcTokenResponse oidcToken;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.uri = defaults.uri;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOauthToken(OAuthTokenResponse oauthToken) {
            this.oauthToken = Objects.requireNonNull(oauthToken);
            return this;
        }

        public Builder setOidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public HttpTargetResponse build() {
            return new HttpTargetResponse(body, headers, httpMethod, oauthToken, oidcToken, uri);
        }
    }
}
