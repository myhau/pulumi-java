// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__AcceleratorConfigResponse {
    /**
     * @return The number of accelerators to attach to each machine running the job.
     * 
     */
    private final String count;
    /**
     * @return The type of accelerator to use.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudMlV1__AcceleratorConfigResponse(
        @CustomType.Parameter("count") String count,
        @CustomType.Parameter("type") String type) {
        this.count = count;
        this.type = type;
    }

    /**
     * @return The number of accelerators to attach to each machine running the job.
     * 
     */
    public String count() {
        return this.count;
    }
    /**
     * @return The type of accelerator to use.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudMlV1__AcceleratorConfigResponse build() {
            return new GoogleCloudMlV1__AcceleratorConfigResponse(count, type);
        }
    }
}
