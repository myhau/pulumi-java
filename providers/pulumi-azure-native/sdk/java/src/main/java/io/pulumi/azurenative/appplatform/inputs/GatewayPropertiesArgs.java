// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.GatewayApiMetadataPropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.GatewayCorsPropertiesArgs;
import io.pulumi.azurenative.appplatform.inputs.GatewayResourceRequestsArgs;
import io.pulumi.azurenative.appplatform.inputs.SsoPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayPropertiesArgs Empty = new GatewayPropertiesArgs();

    @InputImport(name="apiMetadataProperties")
    private final @Nullable Input<GatewayApiMetadataPropertiesArgs> apiMetadataProperties;

    public Input<GatewayApiMetadataPropertiesArgs> getApiMetadataProperties() {
        return this.apiMetadataProperties == null ? Input.empty() : this.apiMetadataProperties;
    }

    @InputImport(name="corsProperties")
    private final @Nullable Input<GatewayCorsPropertiesArgs> corsProperties;

    public Input<GatewayCorsPropertiesArgs> getCorsProperties() {
        return this.corsProperties == null ? Input.empty() : this.corsProperties;
    }

    @InputImport(name="httpsOnly")
    private final @Nullable Input<Boolean> httpsOnly;

    public Input<Boolean> getHttpsOnly() {
        return this.httpsOnly == null ? Input.empty() : this.httpsOnly;
    }

    @InputImport(name="public")
    private final @Nullable Input<Boolean> $public;

    public Input<Boolean> get$public() {
        return this.$public == null ? Input.empty() : this.$public;
    }

    @InputImport(name="resourceRequests")
    private final @Nullable Input<GatewayResourceRequestsArgs> resourceRequests;

    public Input<GatewayResourceRequestsArgs> getResourceRequests() {
        return this.resourceRequests == null ? Input.empty() : this.resourceRequests;
    }

    @InputImport(name="ssoProperties")
    private final @Nullable Input<SsoPropertiesArgs> ssoProperties;

    public Input<SsoPropertiesArgs> getSsoProperties() {
        return this.ssoProperties == null ? Input.empty() : this.ssoProperties;
    }

    public GatewayPropertiesArgs(
        @Nullable Input<GatewayApiMetadataPropertiesArgs> apiMetadataProperties,
        @Nullable Input<GatewayCorsPropertiesArgs> corsProperties,
        @Nullable Input<Boolean> httpsOnly,
        @Nullable Input<Boolean> $public,
        @Nullable Input<GatewayResourceRequestsArgs> resourceRequests,
        @Nullable Input<SsoPropertiesArgs> ssoProperties) {
        this.apiMetadataProperties = apiMetadataProperties;
        this.corsProperties = corsProperties;
        this.httpsOnly = httpsOnly;
        this.$public = $public;
        this.resourceRequests = resourceRequests;
        this.ssoProperties = ssoProperties;
    }

    private GatewayPropertiesArgs() {
        this.apiMetadataProperties = Input.empty();
        this.corsProperties = Input.empty();
        this.httpsOnly = Input.empty();
        this.$public = Input.empty();
        this.resourceRequests = Input.empty();
        this.ssoProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GatewayApiMetadataPropertiesArgs> apiMetadataProperties;
        private @Nullable Input<GatewayCorsPropertiesArgs> corsProperties;
        private @Nullable Input<Boolean> httpsOnly;
        private @Nullable Input<Boolean> $public;
        private @Nullable Input<GatewayResourceRequestsArgs> resourceRequests;
        private @Nullable Input<SsoPropertiesArgs> ssoProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiMetadataProperties = defaults.apiMetadataProperties;
    	      this.corsProperties = defaults.corsProperties;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.$public = defaults.$public;
    	      this.resourceRequests = defaults.resourceRequests;
    	      this.ssoProperties = defaults.ssoProperties;
        }

        public Builder setApiMetadataProperties(@Nullable Input<GatewayApiMetadataPropertiesArgs> apiMetadataProperties) {
            this.apiMetadataProperties = apiMetadataProperties;
            return this;
        }

        public Builder setApiMetadataProperties(@Nullable GatewayApiMetadataPropertiesArgs apiMetadataProperties) {
            this.apiMetadataProperties = Input.ofNullable(apiMetadataProperties);
            return this;
        }

        public Builder setCorsProperties(@Nullable Input<GatewayCorsPropertiesArgs> corsProperties) {
            this.corsProperties = corsProperties;
            return this;
        }

        public Builder setCorsProperties(@Nullable GatewayCorsPropertiesArgs corsProperties) {
            this.corsProperties = Input.ofNullable(corsProperties);
            return this;
        }

        public Builder setHttpsOnly(@Nullable Input<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }

        public Builder setHttpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Input.ofNullable(httpsOnly);
            return this;
        }

        public Builder set$public(@Nullable Input<Boolean> $public) {
            this.$public = $public;
            return this;
        }

        public Builder set$public(@Nullable Boolean $public) {
            this.$public = Input.ofNullable($public);
            return this;
        }

        public Builder setResourceRequests(@Nullable Input<GatewayResourceRequestsArgs> resourceRequests) {
            this.resourceRequests = resourceRequests;
            return this;
        }

        public Builder setResourceRequests(@Nullable GatewayResourceRequestsArgs resourceRequests) {
            this.resourceRequests = Input.ofNullable(resourceRequests);
            return this;
        }

        public Builder setSsoProperties(@Nullable Input<SsoPropertiesArgs> ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }

        public Builder setSsoProperties(@Nullable SsoPropertiesArgs ssoProperties) {
            this.ssoProperties = Input.ofNullable(ssoProperties);
            return this;
        }

        public GatewayPropertiesArgs build() {
            return new GatewayPropertiesArgs(apiMetadataProperties, corsProperties, httpsOnly, $public, resourceRequests, ssoProperties);
        }
    }
}