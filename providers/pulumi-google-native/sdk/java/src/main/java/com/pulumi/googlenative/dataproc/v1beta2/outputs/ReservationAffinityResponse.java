// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReservationAffinityResponse {
    /**
     * @return Optional. Type of reservation to consume
     * 
     */
    private final String consumeReservationType;
    /**
     * @return Optional. Corresponds to the label key of reservation resource.
     * 
     */
    private final String key;
    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private ReservationAffinityResponse(
        @CustomType.Parameter("consumeReservationType") String consumeReservationType,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    /**
     * @return Optional. Type of reservation to consume
     * 
     */
    public String consumeReservationType() {
        return this.consumeReservationType;
    }
    /**
     * @return Optional. Corresponds to the label key of reservation resource.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumeReservationType;
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ReservationAffinityResponse build() {
            return new ReservationAffinityResponse(consumeReservationType, key, values);
        }
    }
}
