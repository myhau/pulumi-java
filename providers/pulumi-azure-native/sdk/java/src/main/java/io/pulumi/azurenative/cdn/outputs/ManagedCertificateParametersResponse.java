// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedCertificateParametersResponse {
    /**
     * The type of the Secret to create.
     * Expected value is 'ManagedCertificate'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private ManagedCertificateParametersResponse(String type) {
        this.type = type;
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'ManagedCertificate'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedCertificateParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedCertificateParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedCertificateParametersResponse build() {
            return new ManagedCertificateParametersResponse(type);
        }
    }
}
