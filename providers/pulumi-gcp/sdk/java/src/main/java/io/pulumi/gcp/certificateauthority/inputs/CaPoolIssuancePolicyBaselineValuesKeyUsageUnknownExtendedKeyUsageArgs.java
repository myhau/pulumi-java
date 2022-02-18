// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs Empty = new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @InputImport(name="objectIdPaths", required=true)
    private final Input<List<Integer>> objectIdPaths;

    public Input<List<Integer>> getObjectIdPaths() {
        return this.objectIdPaths;
    }

    public CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs(Input<List<Integer>> objectIdPaths) {
        this.objectIdPaths = Objects.requireNonNull(objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
    }

    private CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs() {
        this.objectIdPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Integer>> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(Input<List<Integer>> objectIdPaths) {
            this.objectIdPaths = Objects.requireNonNull(objectIdPaths);
            return this;
        }

        public Builder setObjectIdPaths(List<Integer> objectIdPaths) {
            this.objectIdPaths = Input.of(Objects.requireNonNull(objectIdPaths));
            return this;
        }

        public CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs build() {
            return new CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs(objectIdPaths);
        }
    }
}
