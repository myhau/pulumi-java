// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the IP tag associated with the public IP address.
 * 
 */
public final class VirtualMachineIpTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineIpTagArgs Empty = new VirtualMachineIpTagArgs();

    /**
     * IP tag type. Example: FirstPartyUsage.
     * 
     */
    @Import(name="ipTagType")
      private final @Nullable Output<String> ipTagType;

    public Output<String> ipTagType() {
        return this.ipTagType == null ? Codegen.empty() : this.ipTagType;
    }

    /**
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> tag() {
        return this.tag == null ? Codegen.empty() : this.tag;
    }

    public VirtualMachineIpTagArgs(
        @Nullable Output<String> ipTagType,
        @Nullable Output<String> tag) {
        this.ipTagType = ipTagType;
        this.tag = tag;
    }

    private VirtualMachineIpTagArgs() {
        this.ipTagType = Codegen.empty();
        this.tag = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineIpTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipTagType;
        private @Nullable Output<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineIpTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipTagType = defaults.ipTagType;
    	      this.tag = defaults.tag;
        }

        public Builder ipTagType(@Nullable Output<String> ipTagType) {
            this.ipTagType = ipTagType;
            return this;
        }
        public Builder ipTagType(@Nullable String ipTagType) {
            this.ipTagType = Codegen.ofNullable(ipTagType);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Codegen.ofNullable(tag);
            return this;
        }        public VirtualMachineIpTagArgs build() {
            return new VirtualMachineIpTagArgs(ipTagType, tag);
        }
    }
}
