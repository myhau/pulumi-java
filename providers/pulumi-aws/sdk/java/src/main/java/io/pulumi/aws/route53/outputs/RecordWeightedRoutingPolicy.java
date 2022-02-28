// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RecordWeightedRoutingPolicy {
    /**
     * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
     * 
     */
    private final Integer weight;

    @OutputCustomType.Constructor({"weight"})
    private RecordWeightedRoutingPolicy(Integer weight) {
        this.weight = Objects.requireNonNull(weight);
    }

    /**
     * A numeric value indicating the relative weight of the record. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted.
     * 
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordWeightedRoutingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordWeightedRoutingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public RecordWeightedRoutingPolicy build() {
            return new RecordWeightedRoutingPolicy(weight);
        }
    }
}
