// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VM;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Bastion Shareable Link.
 * 
 */
public final class BastionShareableLink extends io.pulumi.resources.InvokeArgs {

    public static final BastionShareableLink Empty = new BastionShareableLink();

    /**
     * Reference of the virtual machine resource.
     * 
     */
    @Import(name="vm", required=true)
      private final VM vm;

    public VM vm() {
        return this.vm;
    }

    public BastionShareableLink(VM vm) {
        this.vm = Objects.requireNonNull(vm, "expected parameter 'vm' to be non-null");
    }

    private BastionShareableLink() {
        this.vm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionShareableLink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VM vm;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionShareableLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vm = defaults.vm;
        }

        public Builder vm(VM vm) {
            this.vm = Objects.requireNonNull(vm);
            return this;
        }        public BastionShareableLink build() {
            return new BastionShareableLink(vm);
        }
    }
}
