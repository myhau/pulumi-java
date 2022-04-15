// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ContactDetailsResponse;
import io.pulumi.azurenative.databox.inputs.CopyProgressResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxDiskCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataExportDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataImportDetailsResponse;
import io.pulumi.azurenative.databox.inputs.JobStagesResponse;
import io.pulumi.azurenative.databox.inputs.KeyEncryptionKeyResponse;
import io.pulumi.azurenative.databox.inputs.PackageShippingDetailsResponse;
import io.pulumi.azurenative.databox.inputs.PreferencesResponse;
import io.pulumi.azurenative.databox.inputs.ShippingAddressResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Databox Job Details
 * 
 */
public final class DataBoxJobDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxJobDetailsResponse Empty = new DataBoxJobDetailsResponse();

    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    @Import(name="chainOfCustodySasKey", required=true)
      private final String chainOfCustodySasKey;

    public String chainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }

    /**
     * Contact details for notification and shipping.
     * 
     */
    @Import(name="contactDetails", required=true)
      private final ContactDetailsResponse contactDetails;

    public ContactDetailsResponse contactDetails() {
        return this.contactDetails;
    }

    /**
     * List of copy log details.
     * 
     */
    @Import(name="copyLogDetails", required=true)
      private final List<Object> copyLogDetails;

    public List<Object> copyLogDetails() {
        return this.copyLogDetails;
    }

    /**
     * Copy progress per storage account.
     * 
     */
    @Import(name="copyProgress", required=true)
      private final List<CopyProgressResponse> copyProgress;

    public List<CopyProgressResponse> copyProgress() {
        return this.copyProgress;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @Import(name="dataExportDetails")
      private final @Nullable List<DataExportDetailsResponse> dataExportDetails;

    public List<DataExportDetailsResponse> dataExportDetails() {
        return this.dataExportDetails == null ? List.of() : this.dataExportDetails;
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @Import(name="dataImportDetails")
      private final @Nullable List<DataImportDetailsResponse> dataImportDetails;

    public List<DataImportDetailsResponse> dataImportDetails() {
        return this.dataImportDetails == null ? List.of() : this.dataImportDetails;
    }

    /**
     * Delivery package shipping details.
     * 
     */
    @Import(name="deliveryPackage", required=true)
      private final PackageShippingDetailsResponse deliveryPackage;

    public PackageShippingDetailsResponse deliveryPackage() {
        return this.deliveryPackage;
    }

    /**
     * Set Device password for unlocking Databox. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="devicePassword")
      private final @Nullable String devicePassword;

    public Optional<String> devicePassword() {
        return this.devicePassword == null ? Optional.empty() : Optional.ofNullable(this.devicePassword);
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @Import(name="expectedDataSizeInTeraBytes")
      private final @Nullable Integer expectedDataSizeInTeraBytes;

    public Optional<Integer> expectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes == null ? Optional.empty() : Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBox'.
     * 
     */
    @Import(name="jobDetailsType", required=true)
      private final String jobDetailsType;

    public String jobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * List of stages that run in the job.
     * 
     */
    @Import(name="jobStages", required=true)
      private final List<JobStagesResponse> jobStages;

    public List<JobStagesResponse> jobStages() {
        return this.jobStages;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @Import(name="keyEncryptionKey")
      private final @Nullable KeyEncryptionKeyResponse keyEncryptionKey;

    public Optional<KeyEncryptionKeyResponse> keyEncryptionKey() {
        return this.keyEncryptionKey == null ? Optional.empty() : Optional.ofNullable(this.keyEncryptionKey);
    }

    /**
     * Preferences for the order.
     * 
     */
    @Import(name="preferences")
      private final @Nullable PreferencesResponse preferences;

    public Optional<PreferencesResponse> preferences() {
        return this.preferences == null ? Optional.empty() : Optional.ofNullable(this.preferences);
    }

    /**
     * Return package shipping details.
     * 
     */
    @Import(name="returnPackage", required=true)
      private final PackageShippingDetailsResponse returnPackage;

    public PackageShippingDetailsResponse returnPackage() {
        return this.returnPackage;
    }

    /**
     * Shared access key to download the return shipment label
     * 
     */
    @Import(name="reverseShipmentLabelSasKey", required=true)
      private final String reverseShipmentLabelSasKey;

    public String reverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable ShippingAddressResponse shippingAddress;

    public Optional<ShippingAddressResponse> shippingAddress() {
        return this.shippingAddress == null ? Optional.empty() : Optional.ofNullable(this.shippingAddress);
    }

    public DataBoxJobDetailsResponse(
        String chainOfCustodySasKey,
        ContactDetailsResponse contactDetails,
        List<Object> copyLogDetails,
        List<CopyProgressResponse> copyProgress,
        @Nullable List<DataExportDetailsResponse> dataExportDetails,
        @Nullable List<DataImportDetailsResponse> dataImportDetails,
        PackageShippingDetailsResponse deliveryPackage,
        @Nullable String devicePassword,
        @Nullable Integer expectedDataSizeInTeraBytes,
        String jobDetailsType,
        List<JobStagesResponse> jobStages,
        @Nullable KeyEncryptionKeyResponse keyEncryptionKey,
        @Nullable PreferencesResponse preferences,
        PackageShippingDetailsResponse returnPackage,
        String reverseShipmentLabelSasKey,
        @Nullable ShippingAddressResponse shippingAddress) {
        this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey, "expected parameter 'chainOfCustodySasKey' to be non-null");
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.copyLogDetails = Objects.requireNonNull(copyLogDetails, "expected parameter 'copyLogDetails' to be non-null");
        this.copyProgress = Objects.requireNonNull(copyProgress, "expected parameter 'copyProgress' to be non-null");
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.deliveryPackage = Objects.requireNonNull(deliveryPackage, "expected parameter 'deliveryPackage' to be non-null");
        this.devicePassword = devicePassword;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = Objects.requireNonNull(jobDetailsType, "expected parameter 'jobDetailsType' to be non-null");
        this.jobStages = Objects.requireNonNull(jobStages, "expected parameter 'jobStages' to be non-null");
        this.keyEncryptionKey = keyEncryptionKey;
        this.preferences = preferences;
        this.returnPackage = Objects.requireNonNull(returnPackage, "expected parameter 'returnPackage' to be non-null");
        this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey, "expected parameter 'reverseShipmentLabelSasKey' to be non-null");
        this.shippingAddress = shippingAddress;
    }

    private DataBoxJobDetailsResponse() {
        this.chainOfCustodySasKey = null;
        this.contactDetails = null;
        this.copyLogDetails = List.of();
        this.copyProgress = List.of();
        this.dataExportDetails = List.of();
        this.dataImportDetails = List.of();
        this.deliveryPackage = null;
        this.devicePassword = null;
        this.expectedDataSizeInTeraBytes = null;
        this.jobDetailsType = null;
        this.jobStages = List.of();
        this.keyEncryptionKey = null;
        this.preferences = null;
        this.returnPackage = null;
        this.reverseShipmentLabelSasKey = null;
        this.shippingAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainOfCustodySasKey;
        private ContactDetailsResponse contactDetails;
        private List<Object> copyLogDetails;
        private List<CopyProgressResponse> copyProgress;
        private @Nullable List<DataExportDetailsResponse> dataExportDetails;
        private @Nullable List<DataImportDetailsResponse> dataImportDetails;
        private PackageShippingDetailsResponse deliveryPackage;
        private @Nullable String devicePassword;
        private @Nullable Integer expectedDataSizeInTeraBytes;
        private String jobDetailsType;
        private List<JobStagesResponse> jobStages;
        private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
        private @Nullable PreferencesResponse preferences;
        private PackageShippingDetailsResponse returnPackage;
        private String reverseShipmentLabelSasKey;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainOfCustodySasKey = defaults.chainOfCustodySasKey;
    	      this.contactDetails = defaults.contactDetails;
    	      this.copyLogDetails = defaults.copyLogDetails;
    	      this.copyProgress = defaults.copyProgress;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.devicePassword = defaults.devicePassword;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.jobStages = defaults.jobStages;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.preferences = defaults.preferences;
    	      this.returnPackage = defaults.returnPackage;
    	      this.reverseShipmentLabelSasKey = defaults.reverseShipmentLabelSasKey;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder chainOfCustodySasKey(String chainOfCustodySasKey) {
            this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey);
            return this;
        }
        public Builder contactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder copyLogDetails(List<Object> copyLogDetails) {
            this.copyLogDetails = Objects.requireNonNull(copyLogDetails);
            return this;
        }
        public Builder copyLogDetails(Object... copyLogDetails) {
            return copyLogDetails(List.of(copyLogDetails));
        }
        public Builder copyProgress(List<CopyProgressResponse> copyProgress) {
            this.copyProgress = Objects.requireNonNull(copyProgress);
            return this;
        }
        public Builder copyProgress(CopyProgressResponse... copyProgress) {
            return copyProgress(List.of(copyProgress));
        }
        public Builder dataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }
        public Builder dataExportDetails(DataExportDetailsResponse... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }
        public Builder dataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }
        public Builder dataImportDetails(DataImportDetailsResponse... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }
        public Builder deliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            this.deliveryPackage = Objects.requireNonNull(deliveryPackage);
            return this;
        }
        public Builder devicePassword(@Nullable String devicePassword) {
            this.devicePassword = devicePassword;
            return this;
        }
        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }
        public Builder jobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }
        public Builder jobStages(List<JobStagesResponse> jobStages) {
            this.jobStages = Objects.requireNonNull(jobStages);
            return this;
        }
        public Builder jobStages(JobStagesResponse... jobStages) {
            return jobStages(List.of(jobStages));
        }
        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public Builder preferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder returnPackage(PackageShippingDetailsResponse returnPackage) {
            this.returnPackage = Objects.requireNonNull(returnPackage);
            return this;
        }
        public Builder reverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey);
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }        public DataBoxJobDetailsResponse build() {
            return new DataBoxJobDetailsResponse(chainOfCustodySasKey, contactDetails, copyLogDetails, copyProgress, dataExportDetails, dataImportDetails, deliveryPackage, devicePassword, expectedDataSizeInTeraBytes, jobDetailsType, jobStages, keyEncryptionKey, preferences, returnPackage, reverseShipmentLabelSasKey, shippingAddress);
        }
    }
}
