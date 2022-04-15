// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSwiftVirtualNetworkConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSwiftVirtualNetworkConnectionSlotArgs Empty = new WebAppSwiftVirtualNetworkConnectionSlotArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> slot() {
        return this.slot;
    }

    /**
     * The Virtual Network subnet's resource ID. This is the subnet that this Web App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     * 
     */
    @Import(name="subnetResourceId")
      private final @Nullable Output<String> subnetResourceId;

    public Output<String> subnetResourceId() {
        return this.subnetResourceId == null ? Codegen.empty() : this.subnetResourceId;
    }

    /**
     * A flag that specifies if the scale unit this Web App is on supports Swift integration.
     * 
     */
    @Import(name="swiftSupported")
      private final @Nullable Output<Boolean> swiftSupported;

    public Output<Boolean> swiftSupported() {
        return this.swiftSupported == null ? Codegen.empty() : this.swiftSupported;
    }

    public WebAppSwiftVirtualNetworkConnectionSlotArgs(
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        Output<String> slot,
        @Nullable Output<String> subnetResourceId,
        @Nullable Output<Boolean> swiftSupported) {
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.subnetResourceId = subnetResourceId;
        this.swiftSupported = swiftSupported;
    }

    private WebAppSwiftVirtualNetworkConnectionSlotArgs() {
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.slot = Codegen.empty();
        this.subnetResourceId = Codegen.empty();
        this.swiftSupported = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSwiftVirtualNetworkConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private Output<String> slot;
        private @Nullable Output<String> subnetResourceId;
        private @Nullable Output<Boolean> swiftSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSwiftVirtualNetworkConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.subnetResourceId = defaults.subnetResourceId;
    	      this.swiftSupported = defaults.swiftSupported;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }
        public Builder subnetResourceId(@Nullable Output<String> subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }
        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = Codegen.ofNullable(subnetResourceId);
            return this;
        }
        public Builder swiftSupported(@Nullable Output<Boolean> swiftSupported) {
            this.swiftSupported = swiftSupported;
            return this;
        }
        public Builder swiftSupported(@Nullable Boolean swiftSupported) {
            this.swiftSupported = Codegen.ofNullable(swiftSupported);
            return this;
        }        public WebAppSwiftVirtualNetworkConnectionSlotArgs build() {
            return new WebAppSwiftVirtualNetworkConnectionSlotArgs(kind, name, resourceGroupName, slot, subnetResourceId, swiftSupported);
        }
    }
}
