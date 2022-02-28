// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink;

import io.pulumi.aws.worklink.inputs.FleetIdentityProviderArgs;
import io.pulumi.aws.worklink.inputs.FleetNetworkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetArgs Empty = new FleetArgs();

    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
     * 
     */
    @InputImport(name="auditStreamArn")
      private final @Nullable Input<String> auditStreamArn;

    public Input<String> getAuditStreamArn() {
        return this.auditStreamArn == null ? Input.empty() : this.auditStreamArn;
    }

    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @InputImport(name="deviceCaCertificate")
      private final @Nullable Input<String> deviceCaCertificate;

    public Input<String> getDeviceCaCertificate() {
        return this.deviceCaCertificate == null ? Input.empty() : this.deviceCaCertificate;
    }

    /**
     * The name of the fleet.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @InputImport(name="identityProvider")
      private final @Nullable Input<FleetIdentityProviderArgs> identityProvider;

    public Input<FleetIdentityProviderArgs> getIdentityProvider() {
        return this.identityProvider == null ? Input.empty() : this.identityProvider;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<FleetNetworkArgs> network;

    public Input<FleetNetworkArgs> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    @InputImport(name="optimizeForEndUserLocation")
      private final @Nullable Input<Boolean> optimizeForEndUserLocation;

    public Input<Boolean> getOptimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation == null ? Input.empty() : this.optimizeForEndUserLocation;
    }

    public FleetArgs(
        @Nullable Input<String> auditStreamArn,
        @Nullable Input<String> deviceCaCertificate,
        @Nullable Input<String> displayName,
        @Nullable Input<FleetIdentityProviderArgs> identityProvider,
        @Nullable Input<String> name,
        @Nullable Input<FleetNetworkArgs> network,
        @Nullable Input<Boolean> optimizeForEndUserLocation) {
        this.auditStreamArn = auditStreamArn;
        this.deviceCaCertificate = deviceCaCertificate;
        this.displayName = displayName;
        this.identityProvider = identityProvider;
        this.name = name;
        this.network = network;
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
    }

    private FleetArgs() {
        this.auditStreamArn = Input.empty();
        this.deviceCaCertificate = Input.empty();
        this.displayName = Input.empty();
        this.identityProvider = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.optimizeForEndUserLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> auditStreamArn;
        private @Nullable Input<String> deviceCaCertificate;
        private @Nullable Input<String> displayName;
        private @Nullable Input<FleetIdentityProviderArgs> identityProvider;
        private @Nullable Input<String> name;
        private @Nullable Input<FleetNetworkArgs> network;
        private @Nullable Input<Boolean> optimizeForEndUserLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditStreamArn = defaults.auditStreamArn;
    	      this.deviceCaCertificate = defaults.deviceCaCertificate;
    	      this.displayName = defaults.displayName;
    	      this.identityProvider = defaults.identityProvider;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.optimizeForEndUserLocation = defaults.optimizeForEndUserLocation;
        }

        public Builder setAuditStreamArn(@Nullable Input<String> auditStreamArn) {
            this.auditStreamArn = auditStreamArn;
            return this;
        }

        public Builder setAuditStreamArn(@Nullable String auditStreamArn) {
            this.auditStreamArn = Input.ofNullable(auditStreamArn);
            return this;
        }

        public Builder setDeviceCaCertificate(@Nullable Input<String> deviceCaCertificate) {
            this.deviceCaCertificate = deviceCaCertificate;
            return this;
        }

        public Builder setDeviceCaCertificate(@Nullable String deviceCaCertificate) {
            this.deviceCaCertificate = Input.ofNullable(deviceCaCertificate);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setIdentityProvider(@Nullable Input<FleetIdentityProviderArgs> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setIdentityProvider(@Nullable FleetIdentityProviderArgs identityProvider) {
            this.identityProvider = Input.ofNullable(identityProvider);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<FleetNetworkArgs> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable FleetNetworkArgs network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setOptimizeForEndUserLocation(@Nullable Input<Boolean> optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = optimizeForEndUserLocation;
            return this;
        }

        public Builder setOptimizeForEndUserLocation(@Nullable Boolean optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = Input.ofNullable(optimizeForEndUserLocation);
            return this;
        }
        public FleetArgs build() {
            return new FleetArgs(auditStreamArn, deviceCaCertificate, displayName, identityProvider, name, network, optimizeForEndUserLocation);
        }
    }
}
