// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookReceiverResponse {
    /**
     * Indicates the identifier uri for aad auth.
     * 
     */
    private final @Nullable String identifierUri;
    /**
     * The name of the webhook receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * Indicates the webhook app object Id for aad auth.
     * 
     */
    private final @Nullable String objectId;
    /**
     * The URI where webhooks should be sent.
     * 
     */
    private final String serviceUri;
    /**
     * Indicates the tenant id for aad auth.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Indicates whether or not use AAD authentication.
     * 
     */
    private final @Nullable Boolean useAadAuth;
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private WebhookReceiverResponse(
        @CustomType.Parameter("identifierUri") @Nullable String identifierUri,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("serviceUri") String serviceUri,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("useAadAuth") @Nullable Boolean useAadAuth,
        @CustomType.Parameter("useCommonAlertSchema") @Nullable Boolean useCommonAlertSchema) {
        this.identifierUri = identifierUri;
        this.name = name;
        this.objectId = objectId;
        this.serviceUri = serviceUri;
        this.tenantId = tenantId;
        this.useAadAuth = useAadAuth;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * Indicates the identifier uri for aad auth.
     * 
    */
    public Optional<String> identifierUri() {
        return Optional.ofNullable(this.identifierUri);
    }
    /**
     * The name of the webhook receiver. Names must be unique across all receivers within an action group.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Indicates the webhook app object Id for aad auth.
     * 
    */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * The URI where webhooks should be sent.
     * 
    */
    public String serviceUri() {
        return this.serviceUri;
    }
    /**
     * Indicates the tenant id for aad auth.
     * 
    */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Indicates whether or not use AAD authentication.
     * 
    */
    public Optional<Boolean> useAadAuth() {
        return Optional.ofNullable(this.useAadAuth);
    }
    /**
     * Indicates whether to use common alert schema.
     * 
    */
    public Optional<Boolean> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identifierUri;
        private String name;
        private @Nullable String objectId;
        private String serviceUri;
        private @Nullable String tenantId;
        private @Nullable Boolean useAadAuth;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifierUri = defaults.identifierUri;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.serviceUri = defaults.serviceUri;
    	      this.tenantId = defaults.tenantId;
    	      this.useAadAuth = defaults.useAadAuth;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder identifierUri(@Nullable String identifierUri) {
            this.identifierUri = identifierUri;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder serviceUri(String serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder useAadAuth(@Nullable Boolean useAadAuth) {
            this.useAadAuth = useAadAuth;
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public WebhookReceiverResponse build() {
            return new WebhookReceiverResponse(identifierUri, name, objectId, serviceUri, tenantId, useAadAuth, useCommonAlertSchema);
        }
    }
}
