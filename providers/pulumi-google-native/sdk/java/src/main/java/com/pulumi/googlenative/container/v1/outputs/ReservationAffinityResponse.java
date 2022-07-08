// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReservationAffinityResponse {
    /**
     * @return Corresponds to the type of reservation consumption.
     * 
     */
    private final String consumeReservationType;
    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    private final String key;
    /**
     * @return Corresponds to the label value(s) of reservation resource(s).
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
     * @return Corresponds to the type of reservation consumption.
     * 
     */
    public String consumeReservationType() {
        return this.consumeReservationType;
    }
    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify &#34;googleapis.com/reservation-name&#34; as the key and specify the name of your reservation as its value.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Corresponds to the label value(s) of reservation resource(s).
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
