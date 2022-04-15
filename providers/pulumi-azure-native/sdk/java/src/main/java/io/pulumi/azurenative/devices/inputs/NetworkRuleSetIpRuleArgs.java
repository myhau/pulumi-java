// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.NetworkRuleIPAction;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP Rule to be applied as part of Network Rule Set
 * 
 */
public final class NetworkRuleSetIpRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetIpRuleArgs Empty = new NetworkRuleSetIpRuleArgs();

    /**
     * IP Filter Action
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,NetworkRuleIPAction>> action;

    public Output<Either<String,NetworkRuleIPAction>> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Name of the IP filter rule.
     * 
     */
    @Import(name="filterName", required=true)
      private final Output<String> filterName;

    public Output<String> filterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
      private final Output<String> ipMask;

    public Output<String> ipMask() {
        return this.ipMask;
    }

    public NetworkRuleSetIpRuleArgs(
        @Nullable Output<Either<String,NetworkRuleIPAction>> action,
        Output<String> filterName,
        Output<String> ipMask) {
        this.action = action == null ? Output.ofLeft("Allow") : action;
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
    }

    private NetworkRuleSetIpRuleArgs() {
        this.action = Codegen.empty();
        this.filterName = Codegen.empty();
        this.ipMask = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetIpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,NetworkRuleIPAction>> action;
        private Output<String> filterName;
        private Output<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetIpRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable Output<Either<String,NetworkRuleIPAction>> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Either<String,NetworkRuleIPAction> action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder filterName(Output<String> filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }
        public Builder filterName(String filterName) {
            this.filterName = Output.of(Objects.requireNonNull(filterName));
            return this;
        }
        public Builder ipMask(Output<String> ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Output.of(Objects.requireNonNull(ipMask));
            return this;
        }        public NetworkRuleSetIpRuleArgs build() {
            return new NetworkRuleSetIpRuleArgs(action, filterName, ipMask);
        }
    }
}
