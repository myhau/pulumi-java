// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse Empty = new GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse();

    @InputImport(name="allowedCaCerts", required=true)
    private final List<String> allowedCaCerts;

    public List<String> getAllowedCaCerts() {
        return this.allowedCaCerts;
    }

    @InputImport(name="password", required=true)
    private final String password;

    public String getPassword() {
        return this.password;
    }

    @InputImport(name="requestHeaders", required=true)
    private final Map<String,String> requestHeaders;

    public Map<String,String> getRequestHeaders() {
        return this.requestHeaders;
    }

    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    @InputImport(name="username", required=true)
    private final String username;

    public String getUsername() {
        return this.username;
    }

    public GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse(
        List<String> allowedCaCerts,
        String password,
        Map<String,String> requestHeaders,
        String uri,
        String username) {
        this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts, "expected parameter 'allowedCaCerts' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.requestHeaders = Objects.requireNonNull(requestHeaders, "expected parameter 'requestHeaders' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse() {
        this.allowedCaCerts = List.of();
        this.password = null;
        this.requestHeaders = Map.of();
        this.uri = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedCaCerts;
        private String password;
        private Map<String,String> requestHeaders;
        private String uri;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder setAllowedCaCerts(List<String> allowedCaCerts) {
            this.allowedCaCerts = Objects.requireNonNull(allowedCaCerts);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setRequestHeaders(Map<String,String> requestHeaders) {
            this.requestHeaders = Objects.requireNonNull(requestHeaders);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse build() {
            return new GoogleCloudDialogflowCxV3WebhookGenericWebServiceResponse(allowedCaCerts, password, requestHeaders, uri, username);
        }
    }
}