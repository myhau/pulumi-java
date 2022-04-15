// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TriggerReferenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TriggerDependencyReferenceResponse {
    /**
     * Referenced trigger.
     * 
     */
    private final TriggerReferenceResponse referenceTrigger;
    /**
     * The type of dependency reference.
     * Expected value is 'TriggerDependencyReference'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private TriggerDependencyReferenceResponse(
        @CustomType.Parameter("referenceTrigger") TriggerReferenceResponse referenceTrigger,
        @CustomType.Parameter("type") String type) {
        this.referenceTrigger = referenceTrigger;
        this.type = type;
    }

    /**
     * Referenced trigger.
     * 
    */
    public TriggerReferenceResponse referenceTrigger() {
        return this.referenceTrigger;
    }
    /**
     * The type of dependency reference.
     * Expected value is 'TriggerDependencyReference'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDependencyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerReferenceResponse referenceTrigger;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDependencyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.type = defaults.type;
        }

        public Builder referenceTrigger(TriggerReferenceResponse referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TriggerDependencyReferenceResponse build() {
            return new TriggerDependencyReferenceResponse(referenceTrigger, type);
        }
    }
}
