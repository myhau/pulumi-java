// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceReservationAffinity {
    /**
     * The type of Compute Reservation.
     * Possible values are `NO_RESERVATION`, `ANY_RESERVATION`, and `SPECIFIC_RESERVATION`.
     * 
     */
    private final String consumeReservationType;
    /**
     * Corresponds to the label key of reservation resource.
     * 
     */
    private final @Nullable String key;
    /**
     * Corresponds to the label values of reservation resource.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"consumeReservationType","key","values"})
    private InstanceReservationAffinity(
        String consumeReservationType,
        @Nullable String key,
        @Nullable List<String> values) {
        this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
        this.key = key;
        this.values = values;
    }

    /**
     * The type of Compute Reservation.
     * Possible values are `NO_RESERVATION`, `ANY_RESERVATION`, and `SPECIFIC_RESERVATION`.
     * 
     */
    public String getConsumeReservationType() {
        return this.consumeReservationType;
    }
    /**
     * Corresponds to the label key of reservation resource.
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Corresponds to the label values of reservation resource.
     * 
     */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumeReservationType;
        private @Nullable String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }

        public InstanceReservationAffinity build() {
            return new InstanceReservationAffinity(consumeReservationType, key, values);
        }
    }
}
