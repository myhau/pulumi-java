// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrefixArgs Empty = new PrefixArgs();

    /**
     * The name of the peering service.
     * 
     */
    @Import(name="peeringServiceName", required=true)
      private final Output<String> peeringServiceName;

    public Output<String> peeringServiceName() {
        return this.peeringServiceName;
    }

    /**
     * The peering service prefix key
     * 
     */
    @Import(name="peeringServicePrefixKey")
      private final @Nullable Output<String> peeringServicePrefixKey;

    public Output<String> peeringServicePrefixKey() {
        return this.peeringServicePrefixKey == null ? Codegen.empty() : this.peeringServicePrefixKey;
    }

    /**
     * The prefix from which your traffic originates.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * The name of the prefix.
     * 
     */
    @Import(name="prefixName")
      private final @Nullable Output<String> prefixName;

    public Output<String> prefixName() {
        return this.prefixName == null ? Codegen.empty() : this.prefixName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public PrefixArgs(
        Output<String> peeringServiceName,
        @Nullable Output<String> peeringServicePrefixKey,
        @Nullable Output<String> prefix,
        @Nullable Output<String> prefixName,
        Output<String> resourceGroupName) {
        this.peeringServiceName = Objects.requireNonNull(peeringServiceName, "expected parameter 'peeringServiceName' to be non-null");
        this.peeringServicePrefixKey = peeringServicePrefixKey;
        this.prefix = prefix;
        this.prefixName = prefixName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrefixArgs() {
        this.peeringServiceName = Codegen.empty();
        this.peeringServicePrefixKey = Codegen.empty();
        this.prefix = Codegen.empty();
        this.prefixName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> peeringServiceName;
        private @Nullable Output<String> peeringServicePrefixKey;
        private @Nullable Output<String> prefix;
        private @Nullable Output<String> prefixName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringServiceName = defaults.peeringServiceName;
    	      this.peeringServicePrefixKey = defaults.peeringServicePrefixKey;
    	      this.prefix = defaults.prefix;
    	      this.prefixName = defaults.prefixName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder peeringServiceName(Output<String> peeringServiceName) {
            this.peeringServiceName = Objects.requireNonNull(peeringServiceName);
            return this;
        }
        public Builder peeringServiceName(String peeringServiceName) {
            this.peeringServiceName = Output.of(Objects.requireNonNull(peeringServiceName));
            return this;
        }
        public Builder peeringServicePrefixKey(@Nullable Output<String> peeringServicePrefixKey) {
            this.peeringServicePrefixKey = peeringServicePrefixKey;
            return this;
        }
        public Builder peeringServicePrefixKey(@Nullable String peeringServicePrefixKey) {
            this.peeringServicePrefixKey = Codegen.ofNullable(peeringServicePrefixKey);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder prefixName(@Nullable Output<String> prefixName) {
            this.prefixName = prefixName;
            return this;
        }
        public Builder prefixName(@Nullable String prefixName) {
            this.prefixName = Codegen.ofNullable(prefixName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public PrefixArgs build() {
            return new PrefixArgs(peeringServiceName, peeringServicePrefixKey, prefix, prefixName, resourceGroupName);
        }
    }
}
