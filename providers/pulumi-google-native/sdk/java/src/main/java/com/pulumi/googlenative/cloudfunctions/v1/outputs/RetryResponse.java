// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RetryResponse {
    @CustomType.Constructor
    private RetryResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RetryResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RetryResponse build() {
            return new RetryResponse();
        }
    }
}
