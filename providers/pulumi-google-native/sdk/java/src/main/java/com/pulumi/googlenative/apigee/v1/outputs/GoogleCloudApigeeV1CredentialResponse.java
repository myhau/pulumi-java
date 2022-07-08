// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1ApiProductRefResponse;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1CredentialResponse {
    /**
     * @return List of API products this credential can be used for.
     * 
     */
    private final List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts;
    /**
     * @return List of attributes associated with this credential.
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;
    /**
     * @return Consumer key.
     * 
     */
    private final String consumerKey;
    /**
     * @return Secret key.
     * 
     */
    private final String consumerSecret;
    /**
     * @return Time the credential will expire in milliseconds since epoch.
     * 
     */
    private final String expiresAt;
    /**
     * @return Time the credential was issued in milliseconds since epoch.
     * 
     */
    private final String issuedAt;
    /**
     * @return List of scopes to apply to the app. Specified scopes must already exist on the API product that you associate with the app.
     * 
     */
    private final List<String> scopes;
    /**
     * @return Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GoogleCloudApigeeV1CredentialResponse(
        @CustomType.Parameter("apiProducts") List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts,
        @CustomType.Parameter("attributes") List<GoogleCloudApigeeV1AttributeResponse> attributes,
        @CustomType.Parameter("consumerKey") String consumerKey,
        @CustomType.Parameter("consumerSecret") String consumerSecret,
        @CustomType.Parameter("expiresAt") String expiresAt,
        @CustomType.Parameter("issuedAt") String issuedAt,
        @CustomType.Parameter("scopes") List<String> scopes,
        @CustomType.Parameter("status") String status) {
        this.apiProducts = apiProducts;
        this.attributes = attributes;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.expiresAt = expiresAt;
        this.issuedAt = issuedAt;
        this.scopes = scopes;
        this.status = status;
    }

    /**
     * @return List of API products this credential can be used for.
     * 
     */
    public List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts() {
        return this.apiProducts;
    }
    /**
     * @return List of attributes associated with this credential.
     * 
     */
    public List<GoogleCloudApigeeV1AttributeResponse> attributes() {
        return this.attributes;
    }
    /**
     * @return Consumer key.
     * 
     */
    public String consumerKey() {
        return this.consumerKey;
    }
    /**
     * @return Secret key.
     * 
     */
    public String consumerSecret() {
        return this.consumerSecret;
    }
    /**
     * @return Time the credential will expire in milliseconds since epoch.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return Time the credential was issued in milliseconds since epoch.
     * 
     */
    public String issuedAt() {
        return this.issuedAt;
    }
    /**
     * @return List of scopes to apply to the app. Specified scopes must already exist on the API product that you associate with the app.
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }
    /**
     * @return Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private String consumerKey;
        private String consumerSecret;
        private String expiresAt;
        private String issuedAt;
        private List<String> scopes;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProducts = defaults.apiProducts;
    	      this.attributes = defaults.attributes;
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecret = defaults.consumerSecret;
    	      this.expiresAt = defaults.expiresAt;
    	      this.issuedAt = defaults.issuedAt;
    	      this.scopes = defaults.scopes;
    	      this.status = defaults.status;
        }

        public Builder apiProducts(List<GoogleCloudApigeeV1ApiProductRefResponse> apiProducts) {
            this.apiProducts = Objects.requireNonNull(apiProducts);
            return this;
        }
        public Builder apiProducts(GoogleCloudApigeeV1ApiProductRefResponse... apiProducts) {
            return apiProducts(List.of(apiProducts));
        }
        public Builder attributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }
        public Builder attributes(GoogleCloudApigeeV1AttributeResponse... attributes) {
            return attributes(List.of(attributes));
        }
        public Builder consumerKey(String consumerKey) {
            this.consumerKey = Objects.requireNonNull(consumerKey);
            return this;
        }
        public Builder consumerSecret(String consumerSecret) {
            this.consumerSecret = Objects.requireNonNull(consumerSecret);
            return this;
        }
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        public Builder issuedAt(String issuedAt) {
            this.issuedAt = Objects.requireNonNull(issuedAt);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GoogleCloudApigeeV1CredentialResponse build() {
            return new GoogleCloudApigeeV1CredentialResponse(apiProducts, attributes, consumerKey, consumerSecret, expiresAt, issuedAt, scopes, status);
        }
    }
}
