// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IngestionConnectionStringResponse {
    /**
     * The region where ingested logs and data resides
     * 
     */
    private final String location;
    /**
     * Connection string value
     * 
     */
    private final String value;

    @CustomType.Constructor
    private IngestionConnectionStringResponse(
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("value") String value) {
        this.location = location;
        this.value = value;
    }

    /**
     * The region where ingested logs and data resides
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Connection string value
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngestionConnectionStringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IngestionConnectionStringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.value = defaults.value;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public IngestionConnectionStringResponse build() {
            return new IngestionConnectionStringResponse(location, value);
        }
    }
}
