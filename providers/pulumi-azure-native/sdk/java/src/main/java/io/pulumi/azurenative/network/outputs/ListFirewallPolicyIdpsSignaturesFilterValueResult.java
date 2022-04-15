// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListFirewallPolicyIdpsSignaturesFilterValueResult {
    /**
     * Describes the possible values
     * 
     */
    private final @Nullable List<String> filterValues;

    @CustomType.Constructor
    private ListFirewallPolicyIdpsSignaturesFilterValueResult(@CustomType.Parameter("filterValues") @Nullable List<String> filterValues) {
        this.filterValues = filterValues;
    }

    /**
     * Describes the possible values
     * 
    */
    public List<String> filterValues() {
        return this.filterValues == null ? List.of() : this.filterValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListFirewallPolicyIdpsSignaturesFilterValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filterValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ListFirewallPolicyIdpsSignaturesFilterValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterValues = defaults.filterValues;
        }

        public Builder filterValues(@Nullable List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public Builder filterValues(String... filterValues) {
            return filterValues(List.of(filterValues));
        }        public ListFirewallPolicyIdpsSignaturesFilterValueResult build() {
            return new ListFirewallPolicyIdpsSignaturesFilterValueResult(filterValues);
        }
    }
}
