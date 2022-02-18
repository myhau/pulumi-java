// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DicomStoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamPolicyArgs Empty = new DicomStoreIamPolicyArgs();

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="dicomStoreId", required=true)
    private final Input<String> dicomStoreId;

    public Input<String> getDicomStoreId() {
        return this.dicomStoreId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public DicomStoreIamPolicyArgs(
        Input<String> dicomStoreId,
        Input<String> policyData) {
        this.dicomStoreId = Objects.requireNonNull(dicomStoreId, "expected parameter 'dicomStoreId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private DicomStoreIamPolicyArgs() {
        this.dicomStoreId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dicomStoreId;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setDicomStoreId(Input<String> dicomStoreId) {
            this.dicomStoreId = Objects.requireNonNull(dicomStoreId);
            return this;
        }

        public Builder setDicomStoreId(String dicomStoreId) {
            this.dicomStoreId = Input.of(Objects.requireNonNull(dicomStoreId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public DicomStoreIamPolicyArgs build() {
            return new DicomStoreIamPolicyArgs(dicomStoreId, policyData);
        }
    }
}
