// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    @InputImport(name="autoResolveBestVoicesEnabled")
      private final @Nullable Input<Boolean> autoResolveBestVoicesEnabled;

    public Input<Boolean> getAutoResolveBestVoicesEnabled() {
        return this.autoResolveBestVoicesEnabled == null ? Input.empty() : this.autoResolveBestVoicesEnabled;
    }

    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    @InputImport(name="contactFlowLogsEnabled")
      private final @Nullable Input<Boolean> contactFlowLogsEnabled;

    public Input<Boolean> getContactFlowLogsEnabled() {
        return this.contactFlowLogsEnabled == null ? Input.empty() : this.contactFlowLogsEnabled;
    }

    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    @InputImport(name="contactLensEnabled")
      private final @Nullable Input<Boolean> contactLensEnabled;

    public Input<Boolean> getContactLensEnabled() {
        return this.contactLensEnabled == null ? Input.empty() : this.contactLensEnabled;
    }

    /**
     * The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    @InputImport(name="directoryId")
      private final @Nullable Input<String> directoryId;

    public Input<String> getDirectoryId() {
        return this.directoryId == null ? Input.empty() : this.directoryId;
    }

    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    @InputImport(name="earlyMediaEnabled")
      private final @Nullable Input<Boolean> earlyMediaEnabled;

    public Input<Boolean> getEarlyMediaEnabled() {
        return this.earlyMediaEnabled == null ? Input.empty() : this.earlyMediaEnabled;
    }

    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    @InputImport(name="identityManagementType", required=true)
      private final Input<String> identityManagementType;

    public Input<String> getIdentityManagementType() {
        return this.identityManagementType;
    }

    /**
     * Specifies whether inbound calls are enabled.
     * 
     */
    @InputImport(name="inboundCallsEnabled", required=true)
      private final Input<Boolean> inboundCallsEnabled;

    public Input<Boolean> getInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    @InputImport(name="instanceAlias")
      private final @Nullable Input<String> instanceAlias;

    public Input<String> getInstanceAlias() {
        return this.instanceAlias == null ? Input.empty() : this.instanceAlias;
    }

    /**
     * Specifies whether outbound calls are enabled.
     * <!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` -->
     * 
     */
    @InputImport(name="outboundCallsEnabled", required=true)
      private final Input<Boolean> outboundCallsEnabled;

    public Input<Boolean> getOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }

    public InstanceArgs(
        @Nullable Input<Boolean> autoResolveBestVoicesEnabled,
        @Nullable Input<Boolean> contactFlowLogsEnabled,
        @Nullable Input<Boolean> contactLensEnabled,
        @Nullable Input<String> directoryId,
        @Nullable Input<Boolean> earlyMediaEnabled,
        Input<String> identityManagementType,
        Input<Boolean> inboundCallsEnabled,
        @Nullable Input<String> instanceAlias,
        Input<Boolean> outboundCallsEnabled) {
        this.autoResolveBestVoicesEnabled = autoResolveBestVoicesEnabled;
        this.contactFlowLogsEnabled = contactFlowLogsEnabled;
        this.contactLensEnabled = contactLensEnabled;
        this.directoryId = directoryId;
        this.earlyMediaEnabled = earlyMediaEnabled;
        this.identityManagementType = Objects.requireNonNull(identityManagementType, "expected parameter 'identityManagementType' to be non-null");
        this.inboundCallsEnabled = Objects.requireNonNull(inboundCallsEnabled, "expected parameter 'inboundCallsEnabled' to be non-null");
        this.instanceAlias = instanceAlias;
        this.outboundCallsEnabled = Objects.requireNonNull(outboundCallsEnabled, "expected parameter 'outboundCallsEnabled' to be non-null");
    }

    private InstanceArgs() {
        this.autoResolveBestVoicesEnabled = Input.empty();
        this.contactFlowLogsEnabled = Input.empty();
        this.contactLensEnabled = Input.empty();
        this.directoryId = Input.empty();
        this.earlyMediaEnabled = Input.empty();
        this.identityManagementType = Input.empty();
        this.inboundCallsEnabled = Input.empty();
        this.instanceAlias = Input.empty();
        this.outboundCallsEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoResolveBestVoicesEnabled;
        private @Nullable Input<Boolean> contactFlowLogsEnabled;
        private @Nullable Input<Boolean> contactLensEnabled;
        private @Nullable Input<String> directoryId;
        private @Nullable Input<Boolean> earlyMediaEnabled;
        private Input<String> identityManagementType;
        private Input<Boolean> inboundCallsEnabled;
        private @Nullable Input<String> instanceAlias;
        private Input<Boolean> outboundCallsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoResolveBestVoicesEnabled = defaults.autoResolveBestVoicesEnabled;
    	      this.contactFlowLogsEnabled = defaults.contactFlowLogsEnabled;
    	      this.contactLensEnabled = defaults.contactLensEnabled;
    	      this.directoryId = defaults.directoryId;
    	      this.earlyMediaEnabled = defaults.earlyMediaEnabled;
    	      this.identityManagementType = defaults.identityManagementType;
    	      this.inboundCallsEnabled = defaults.inboundCallsEnabled;
    	      this.instanceAlias = defaults.instanceAlias;
    	      this.outboundCallsEnabled = defaults.outboundCallsEnabled;
        }

        public Builder setAutoResolveBestVoicesEnabled(@Nullable Input<Boolean> autoResolveBestVoicesEnabled) {
            this.autoResolveBestVoicesEnabled = autoResolveBestVoicesEnabled;
            return this;
        }

        public Builder setAutoResolveBestVoicesEnabled(@Nullable Boolean autoResolveBestVoicesEnabled) {
            this.autoResolveBestVoicesEnabled = Input.ofNullable(autoResolveBestVoicesEnabled);
            return this;
        }

        public Builder setContactFlowLogsEnabled(@Nullable Input<Boolean> contactFlowLogsEnabled) {
            this.contactFlowLogsEnabled = contactFlowLogsEnabled;
            return this;
        }

        public Builder setContactFlowLogsEnabled(@Nullable Boolean contactFlowLogsEnabled) {
            this.contactFlowLogsEnabled = Input.ofNullable(contactFlowLogsEnabled);
            return this;
        }

        public Builder setContactLensEnabled(@Nullable Input<Boolean> contactLensEnabled) {
            this.contactLensEnabled = contactLensEnabled;
            return this;
        }

        public Builder setContactLensEnabled(@Nullable Boolean contactLensEnabled) {
            this.contactLensEnabled = Input.ofNullable(contactLensEnabled);
            return this;
        }

        public Builder setDirectoryId(@Nullable Input<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        public Builder setDirectoryId(@Nullable String directoryId) {
            this.directoryId = Input.ofNullable(directoryId);
            return this;
        }

        public Builder setEarlyMediaEnabled(@Nullable Input<Boolean> earlyMediaEnabled) {
            this.earlyMediaEnabled = earlyMediaEnabled;
            return this;
        }

        public Builder setEarlyMediaEnabled(@Nullable Boolean earlyMediaEnabled) {
            this.earlyMediaEnabled = Input.ofNullable(earlyMediaEnabled);
            return this;
        }

        public Builder setIdentityManagementType(Input<String> identityManagementType) {
            this.identityManagementType = Objects.requireNonNull(identityManagementType);
            return this;
        }

        public Builder setIdentityManagementType(String identityManagementType) {
            this.identityManagementType = Input.of(Objects.requireNonNull(identityManagementType));
            return this;
        }

        public Builder setInboundCallsEnabled(Input<Boolean> inboundCallsEnabled) {
            this.inboundCallsEnabled = Objects.requireNonNull(inboundCallsEnabled);
            return this;
        }

        public Builder setInboundCallsEnabled(Boolean inboundCallsEnabled) {
            this.inboundCallsEnabled = Input.of(Objects.requireNonNull(inboundCallsEnabled));
            return this;
        }

        public Builder setInstanceAlias(@Nullable Input<String> instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }

        public Builder setInstanceAlias(@Nullable String instanceAlias) {
            this.instanceAlias = Input.ofNullable(instanceAlias);
            return this;
        }

        public Builder setOutboundCallsEnabled(Input<Boolean> outboundCallsEnabled) {
            this.outboundCallsEnabled = Objects.requireNonNull(outboundCallsEnabled);
            return this;
        }

        public Builder setOutboundCallsEnabled(Boolean outboundCallsEnabled) {
            this.outboundCallsEnabled = Input.of(Objects.requireNonNull(outboundCallsEnabled));
            return this;
        }
        public InstanceArgs build() {
            return new InstanceArgs(autoResolveBestVoicesEnabled, contactFlowLogsEnabled, contactLensEnabled, directoryId, earlyMediaEnabled, identityManagementType, inboundCallsEnabled, instanceAlias, outboundCallsEnabled);
        }
    }
}
