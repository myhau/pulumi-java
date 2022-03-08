// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.RetentionDurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SimpleRetentionPolicyResponse {
    /**
     * Retention duration of the protection policy.
     * 
     */
    private final @Nullable RetentionDurationResponse retentionDuration;
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleRetentionPolicy'.
     * 
     */
    private final String retentionPolicyType;

    @OutputCustomType.Constructor({"retentionDuration","retentionPolicyType"})
    private SimpleRetentionPolicyResponse(
        @Nullable RetentionDurationResponse retentionDuration,
        String retentionPolicyType) {
        this.retentionDuration = retentionDuration;
        this.retentionPolicyType = retentionPolicyType;
    }

    /**
     * Retention duration of the protection policy.
     * 
    */
    public Optional<RetentionDurationResponse> getRetentionDuration() {
        return Optional.ofNullable(this.retentionDuration);
    }
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleRetentionPolicy'.
     * 
    */
    public String getRetentionPolicyType() {
        return this.retentionPolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RetentionDurationResponse retentionDuration;
        private String retentionPolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
        }

        public Builder setRetentionDuration(@Nullable RetentionDurationResponse retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }

        public Builder setRetentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }
        public SimpleRetentionPolicyResponse build() {
            return new SimpleRetentionPolicyResponse(retentionDuration, retentionPolicyType);
        }
    }
}
