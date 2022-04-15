// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.avs.enums.DhcpTypeEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadNetworkDhcpArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadNetworkDhcpArgs Empty = new WorkloadNetworkDhcpArgs();

    /**
     * NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    @Import(name="dhcpId")
      private final @Nullable Output<String> dhcpId;

    public Output<String> dhcpId() {
        return this.dhcpId == null ? Codegen.empty() : this.dhcpId;
    }

    /**
     * Type of DHCP: SERVER or RELAY.
     * 
     */
    @Import(name="dhcpType", required=true)
      private final Output<Either<String,DhcpTypeEnum>> dhcpType;

    public Output<Either<String,DhcpTypeEnum>> dhcpType() {
        return this.dhcpType;
    }

    /**
     * Display name of the DHCP entity.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
      private final Output<String> privateCloudName;

    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * NSX revision number.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<Double> revision;

    public Output<Double> revision() {
        return this.revision == null ? Codegen.empty() : this.revision;
    }

    public WorkloadNetworkDhcpArgs(
        @Nullable Output<String> dhcpId,
        Output<Either<String,DhcpTypeEnum>> dhcpType,
        @Nullable Output<String> displayName,
        Output<String> privateCloudName,
        Output<String> resourceGroupName,
        @Nullable Output<Double> revision) {
        this.dhcpId = dhcpId;
        this.dhcpType = Objects.requireNonNull(dhcpType, "expected parameter 'dhcpType' to be non-null");
        this.displayName = displayName;
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.revision = revision;
    }

    private WorkloadNetworkDhcpArgs() {
        this.dhcpId = Codegen.empty();
        this.dhcpType = Codegen.empty();
        this.displayName = Codegen.empty();
        this.privateCloudName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.revision = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dhcpId;
        private Output<Either<String,DhcpTypeEnum>> dhcpType;
        private @Nullable Output<String> displayName;
        private Output<String> privateCloudName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Double> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkDhcpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpId = defaults.dhcpId;
    	      this.dhcpType = defaults.dhcpType;
    	      this.displayName = defaults.displayName;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.revision = defaults.revision;
        }

        public Builder dhcpId(@Nullable Output<String> dhcpId) {
            this.dhcpId = dhcpId;
            return this;
        }
        public Builder dhcpId(@Nullable String dhcpId) {
            this.dhcpId = Codegen.ofNullable(dhcpId);
            return this;
        }
        public Builder dhcpType(Output<Either<String,DhcpTypeEnum>> dhcpType) {
            this.dhcpType = Objects.requireNonNull(dhcpType);
            return this;
        }
        public Builder dhcpType(Either<String,DhcpTypeEnum> dhcpType) {
            this.dhcpType = Output.of(Objects.requireNonNull(dhcpType));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder privateCloudName(Output<String> privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }
        public Builder privateCloudName(String privateCloudName) {
            this.privateCloudName = Output.of(Objects.requireNonNull(privateCloudName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder revision(@Nullable Output<Double> revision) {
            this.revision = revision;
            return this;
        }
        public Builder revision(@Nullable Double revision) {
            this.revision = Codegen.ofNullable(revision);
            return this;
        }        public WorkloadNetworkDhcpArgs build() {
            return new WorkloadNetworkDhcpArgs(dhcpId, dhcpType, displayName, privateCloudName, resourceGroupName, revision);
        }
    }
}
