// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FirewallPolicyRuleConditionNetworkProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule condition of type network.
 * 
 */
public final class NetworkRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleConditionArgs Empty = new NetworkRuleConditionArgs();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
      private final @Nullable Output<List<String>> destinationAddresses;

    public Output<List<String>> destinationAddresses() {
        return this.destinationAddresses == null ? Codegen.empty() : this.destinationAddresses;
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
      private final @Nullable Output<List<String>> destinationIpGroups;

    public Output<List<String>> destinationIpGroups() {
        return this.destinationIpGroups == null ? Codegen.empty() : this.destinationIpGroups;
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
      private final @Nullable Output<List<String>> destinationPorts;

    public Output<List<String>> destinationPorts() {
        return this.destinationPorts == null ? Codegen.empty() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
      private final @Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols;

    public Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols() {
        return this.ipProtocols == null ? Codegen.empty() : this.ipProtocols;
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Rule Condition Type.
     * Expected value is 'NetworkRuleCondition'.
     * 
     */
    @Import(name="ruleConditionType", required=true)
      private final Output<String> ruleConditionType;

    public Output<String> ruleConditionType() {
        return this.ruleConditionType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable Output<List<String>> sourceAddresses;

    public Output<List<String>> sourceAddresses() {
        return this.sourceAddresses == null ? Codegen.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable Output<List<String>> sourceIpGroups;

    public Output<List<String>> sourceIpGroups() {
        return this.sourceIpGroups == null ? Codegen.empty() : this.sourceIpGroups;
    }

    public NetworkRuleConditionArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> destinationAddresses,
        @Nullable Output<List<String>> destinationIpGroups,
        @Nullable Output<List<String>> destinationPorts,
        @Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols,
        @Nullable Output<String> name,
        Output<String> ruleConditionType,
        @Nullable Output<List<String>> sourceAddresses,
        @Nullable Output<List<String>> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = Objects.requireNonNull(ruleConditionType, "expected parameter 'ruleConditionType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NetworkRuleConditionArgs() {
        this.description = Codegen.empty();
        this.destinationAddresses = Codegen.empty();
        this.destinationIpGroups = Codegen.empty();
        this.destinationPorts = Codegen.empty();
        this.ipProtocols = Codegen.empty();
        this.name = Codegen.empty();
        this.ruleConditionType = Codegen.empty();
        this.sourceAddresses = Codegen.empty();
        this.sourceIpGroups = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> destinationAddresses;
        private @Nullable Output<List<String>> destinationIpGroups;
        private @Nullable Output<List<String>> destinationPorts;
        private @Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols;
        private @Nullable Output<String> name;
        private Output<String> ruleConditionType;
        private @Nullable Output<List<String>> sourceAddresses;
        private @Nullable Output<List<String>> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Codegen.ofNullable(destinationAddresses);
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationIpGroups(@Nullable Output<List<String>> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = Codegen.ofNullable(destinationIpGroups);
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Codegen.ofNullable(destinationPorts);
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder ipProtocols(@Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(@Nullable List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>> ipProtocols) {
            this.ipProtocols = Codegen.ofNullable(ipProtocols);
            return this;
        }
        public Builder ipProtocols(Either<String,FirewallPolicyRuleConditionNetworkProtocol>... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ruleConditionType(Output<String> ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
            return this;
        }
        public Builder ruleConditionType(String ruleConditionType) {
            this.ruleConditionType = Output.of(Objects.requireNonNull(ruleConditionType));
            return this;
        }
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Codegen.ofNullable(sourceAddresses);
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Codegen.ofNullable(sourceIpGroups);
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }        public NetworkRuleConditionArgs build() {
            return new NetworkRuleConditionArgs(description, destinationAddresses, destinationIpGroups, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
