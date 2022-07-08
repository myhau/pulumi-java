// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigResponse {
    /**
     * @return The Customer Managed Encryption Key (CMEK) used for data encryption. The CMEK name should follow the format of `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`, where the `location` must match InstanceConfig.location.
     * 
     */
    private final String cmekKeyName;
    /**
     * @return The GCP location where the Instance resides.
     * 
     */
    private final String location;

    @CustomType.Constructor
    private ConfigResponse(
        @CustomType.Parameter("cmekKeyName") String cmekKeyName,
        @CustomType.Parameter("location") String location) {
        this.cmekKeyName = cmekKeyName;
        this.location = location;
    }

    /**
     * @return The Customer Managed Encryption Key (CMEK) used for data encryption. The CMEK name should follow the format of `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`, where the `location` must match InstanceConfig.location.
     * 
     */
    public String cmekKeyName() {
        return this.cmekKeyName;
    }
    /**
     * @return The GCP location where the Instance resides.
     * 
     */
    public String location() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cmekKeyName;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmekKeyName = defaults.cmekKeyName;
    	      this.location = defaults.location;
        }

        public Builder cmekKeyName(String cmekKeyName) {
            this.cmekKeyName = Objects.requireNonNull(cmekKeyName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }        public ConfigResponse build() {
            return new ConfigResponse(cmekKeyName, location);
        }
    }
}
