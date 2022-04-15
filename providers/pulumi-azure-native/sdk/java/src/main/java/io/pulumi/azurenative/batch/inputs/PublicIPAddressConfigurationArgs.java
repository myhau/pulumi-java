// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.IPAddressProvisioningType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The public IP Address configuration of the networking configuration of a Pool.
 * 
 */
public final class PublicIPAddressConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressConfigurationArgs Empty = new PublicIPAddressConfigurationArgs();

    /**
     * The number of IPs specified here limits the maximum size of the Pool - 100 dedicated nodes or 100 low-priority nodes can be allocated for each public IP. For example, a pool needing 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form: /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     * 
     */
    @Import(name="ipAddressIds")
      private final @Nullable Output<List<String>> ipAddressIds;

    public Output<List<String>> ipAddressIds() {
        return this.ipAddressIds == null ? Codegen.empty() : this.ipAddressIds;
    }

    /**
     * The default value is BatchManaged
     * 
     */
    @Import(name="provision")
      private final @Nullable Output<IPAddressProvisioningType> provision;

    public Output<IPAddressProvisioningType> provision() {
        return this.provision == null ? Codegen.empty() : this.provision;
    }

    public PublicIPAddressConfigurationArgs(
        @Nullable Output<List<String>> ipAddressIds,
        @Nullable Output<IPAddressProvisioningType> provision) {
        this.ipAddressIds = ipAddressIds;
        this.provision = provision;
    }

    private PublicIPAddressConfigurationArgs() {
        this.ipAddressIds = Codegen.empty();
        this.provision = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ipAddressIds;
        private @Nullable Output<IPAddressProvisioningType> provision;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddressIds = defaults.ipAddressIds;
    	      this.provision = defaults.provision;
        }

        public Builder ipAddressIds(@Nullable Output<List<String>> ipAddressIds) {
            this.ipAddressIds = ipAddressIds;
            return this;
        }
        public Builder ipAddressIds(@Nullable List<String> ipAddressIds) {
            this.ipAddressIds = Codegen.ofNullable(ipAddressIds);
            return this;
        }
        public Builder ipAddressIds(String... ipAddressIds) {
            return ipAddressIds(List.of(ipAddressIds));
        }
        public Builder provision(@Nullable Output<IPAddressProvisioningType> provision) {
            this.provision = provision;
            return this;
        }
        public Builder provision(@Nullable IPAddressProvisioningType provision) {
            this.provision = Codegen.ofNullable(provision);
            return this;
        }        public PublicIPAddressConfigurationArgs build() {
            return new PublicIPAddressConfigurationArgs(ipAddressIds, provision);
        }
    }
}
