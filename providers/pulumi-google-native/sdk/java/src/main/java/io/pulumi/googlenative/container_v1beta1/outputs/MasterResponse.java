// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class MasterResponse {
    @OutputCustomType.Constructor
    private MasterResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(MasterResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public MasterResponse build() {
            return new MasterResponse();
        }
    }
}
