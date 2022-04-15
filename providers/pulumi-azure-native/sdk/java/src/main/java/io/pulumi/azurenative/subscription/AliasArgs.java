// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.subscription;

import io.pulumi.azurenative.subscription.inputs.PutAliasRequestPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Name for this subscription creation request also known as alias. Note that this is not the same as subscription name and this doesn’t have any other lifecycle need beyond the request for subscription creation.
     * 
     */
    @Import(name="aliasName")
      private final @Nullable Output<String> aliasName;

    public Output<String> aliasName() {
        return this.aliasName == null ? Codegen.empty() : this.aliasName;
    }

    /**
     * Put alias request properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<PutAliasRequestPropertiesArgs> properties;

    public Output<PutAliasRequestPropertiesArgs> properties() {
        return this.properties;
    }

    public AliasArgs(
        @Nullable Output<String> aliasName,
        Output<PutAliasRequestPropertiesArgs> properties) {
        this.aliasName = aliasName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private AliasArgs() {
        this.aliasName = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aliasName;
        private Output<PutAliasRequestPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
    	      this.properties = defaults.properties;
        }

        public Builder aliasName(@Nullable Output<String> aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public Builder aliasName(@Nullable String aliasName) {
            this.aliasName = Codegen.ofNullable(aliasName);
            return this;
        }
        public Builder properties(Output<PutAliasRequestPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(PutAliasRequestPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }        public AliasArgs build() {
            return new AliasArgs(aliasName, properties);
        }
    }
}
