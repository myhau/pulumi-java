// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultUserRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultUserRuleArgs Empty = new DefaultUserRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName", required=true)
      private final Output<String> configurationName;

    public Output<String> configurationName() {
        return this.configurationName;
    }

    /**
     * Default rule flag.
     * 
     */
    @Import(name="flag")
      private final @Nullable Output<String> flag;

    public Output<String> flag() {
        return this.flag == null ? Codegen.empty() : this.flag;
    }

    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
      private final Output<String> networkManagerName;

    public Output<String> networkManagerName() {
        return this.networkManagerName;
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

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @Import(name="ruleCollectionName", required=true)
      private final Output<String> ruleCollectionName;

    public Output<String> ruleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> ruleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    public DefaultUserRuleArgs(
        Output<String> configurationName,
        @Nullable Output<String> flag,
        Output<String> kind,
        Output<String> networkManagerName,
        Output<String> resourceGroupName,
        Output<String> ruleCollectionName,
        @Nullable Output<String> ruleName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.flag = flag;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
        this.ruleName = ruleName;
    }

    private DefaultUserRuleArgs() {
        this.configurationName = Codegen.empty();
        this.flag = Codegen.empty();
        this.kind = Codegen.empty();
        this.networkManagerName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleCollectionName = Codegen.empty();
        this.ruleName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultUserRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configurationName;
        private @Nullable Output<String> flag;
        private Output<String> kind;
        private Output<String> networkManagerName;
        private Output<String> resourceGroupName;
        private Output<String> ruleCollectionName;
        private @Nullable Output<String> ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultUserRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.flag = defaults.flag;
    	      this.kind = defaults.kind;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionName = defaults.ruleCollectionName;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder configurationName(Output<String> configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
            return this;
        }
        public Builder configurationName(String configurationName) {
            this.configurationName = Output.of(Objects.requireNonNull(configurationName));
            return this;
        }
        public Builder flag(@Nullable Output<String> flag) {
            this.flag = flag;
            return this;
        }
        public Builder flag(@Nullable String flag) {
            this.flag = Codegen.ofNullable(flag);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder networkManagerName(Output<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }
        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Output.of(Objects.requireNonNull(networkManagerName));
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
        public Builder ruleCollectionName(Output<String> ruleCollectionName) {
            this.ruleCollectionName = Objects.requireNonNull(ruleCollectionName);
            return this;
        }
        public Builder ruleCollectionName(String ruleCollectionName) {
            this.ruleCollectionName = Output.of(Objects.requireNonNull(ruleCollectionName));
            return this;
        }
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }        public DefaultUserRuleArgs build() {
            return new DefaultUserRuleArgs(configurationName, flag, kind, networkManagerName, resourceGroupName, ruleCollectionName, ruleName);
        }
    }
}
