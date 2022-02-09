// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.HubPublicIPAddressesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubIPAddressesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubIPAddressesArgs Empty = new HubIPAddressesArgs();

    @InputImport(name="privateIPAddress")
    private final @Nullable Input<String> privateIPAddress;

    public Input<String> getPrivateIPAddress() {
        return this.privateIPAddress == null ? Input.empty() : this.privateIPAddress;
    }

    @InputImport(name="publicIPs")
    private final @Nullable Input<HubPublicIPAddressesArgs> publicIPs;

    public Input<HubPublicIPAddressesArgs> getPublicIPs() {
        return this.publicIPs == null ? Input.empty() : this.publicIPs;
    }

    public HubIPAddressesArgs(
        @Nullable Input<String> privateIPAddress,
        @Nullable Input<HubPublicIPAddressesArgs> publicIPs) {
        this.privateIPAddress = privateIPAddress;
        this.publicIPs = publicIPs;
    }

    private HubIPAddressesArgs() {
        this.privateIPAddress = Input.empty();
        this.publicIPs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubIPAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> privateIPAddress;
        private @Nullable Input<HubPublicIPAddressesArgs> publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(HubIPAddressesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder setPrivateIPAddress(@Nullable Input<String> privateIPAddress) {
            this.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder setPrivateIPAddress(@Nullable String privateIPAddress) {
            this.privateIPAddress = Input.ofNullable(privateIPAddress);
            return this;
        }

        public Builder setPublicIPs(@Nullable Input<HubPublicIPAddressesArgs> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }

        public Builder setPublicIPs(@Nullable HubPublicIPAddressesArgs publicIPs) {
            this.publicIPs = Input.ofNullable(publicIPs);
            return this;
        }

        public HubIPAddressesArgs build() {
            return new HubIPAddressesArgs(privateIPAddress, publicIPs);
        }
    }
}