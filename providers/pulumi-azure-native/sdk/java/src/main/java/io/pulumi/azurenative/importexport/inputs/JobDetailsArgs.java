// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.azurenative.importexport.inputs.DeliveryPackageInformationArgs;
import io.pulumi.azurenative.importexport.inputs.DriveStatusArgs;
import io.pulumi.azurenative.importexport.inputs.EncryptionKeyDetailsArgs;
import io.pulumi.azurenative.importexport.inputs.ExportArgs;
import io.pulumi.azurenative.importexport.inputs.PackageInformationArgs;
import io.pulumi.azurenative.importexport.inputs.ReturnAddressArgs;
import io.pulumi.azurenative.importexport.inputs.ReturnShippingArgs;
import io.pulumi.azurenative.importexport.inputs.ShippingInformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the job properties
 * 
 */
public final class JobDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDetailsArgs Empty = new JobDetailsArgs();

    /**
     * Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    @Import(name="backupDriveManifest")
      private final @Nullable Output<Boolean> backupDriveManifest;

    public Output<Boolean> backupDriveManifest() {
        return this.backupDriveManifest == null ? Codegen.empty() : this.backupDriveManifest;
    }

    /**
     * Indicates whether a request has been submitted to cancel the job.
     * 
     */
    @Import(name="cancelRequested")
      private final @Nullable Output<Boolean> cancelRequested;

    public Output<Boolean> cancelRequested() {
        return this.cancelRequested == null ? Codegen.empty() : this.cancelRequested;
    }

    /**
     * Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    @Import(name="deliveryPackage")
      private final @Nullable Output<DeliveryPackageInformationArgs> deliveryPackage;

    public Output<DeliveryPackageInformationArgs> deliveryPackage() {
        return this.deliveryPackage == null ? Codegen.empty() : this.deliveryPackage;
    }

    /**
     * The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    @Import(name="diagnosticsPath")
      private final @Nullable Output<String> diagnosticsPath;

    public Output<String> diagnosticsPath() {
        return this.diagnosticsPath == null ? Codegen.empty() : this.diagnosticsPath;
    }

    /**
     * List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    @Import(name="driveList")
      private final @Nullable Output<List<DriveStatusArgs>> driveList;

    public Output<List<DriveStatusArgs>> driveList() {
        return this.driveList == null ? Codegen.empty() : this.driveList;
    }

    /**
     * Contains information about the encryption key.
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<EncryptionKeyDetailsArgs> encryptionKey;

    public Output<EncryptionKeyDetailsArgs> encryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    @Import(name="export")
      private final @Nullable Output<ExportArgs> export;

    public Output<ExportArgs> export() {
        return this.export == null ? Codegen.empty() : this.export;
    }

    /**
     * A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    @Import(name="incompleteBlobListUri")
      private final @Nullable Output<String> incompleteBlobListUri;

    public Output<String> incompleteBlobListUri() {
        return this.incompleteBlobListUri == null ? Codegen.empty() : this.incompleteBlobListUri;
    }

    /**
     * The type of job
     * 
     */
    @Import(name="jobType")
      private final @Nullable Output<String> jobType;

    public Output<String> jobType() {
        return this.jobType == null ? Codegen.empty() : this.jobType;
    }

    /**
     * Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> logLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * Overall percentage completed for the job.
     * 
     */
    @Import(name="percentComplete")
      private final @Nullable Output<Integer> percentComplete;

    public Output<Integer> percentComplete() {
        return this.percentComplete == null ? Codegen.empty() : this.percentComplete;
    }

    /**
     * Specifies the provisioning state of the job.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * Specifies the return address information for the job.
     * 
     */
    @Import(name="returnAddress")
      private final @Nullable Output<ReturnAddressArgs> returnAddress;

    public Output<ReturnAddressArgs> returnAddress() {
        return this.returnAddress == null ? Codegen.empty() : this.returnAddress;
    }

    /**
     * Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    @Import(name="returnPackage")
      private final @Nullable Output<PackageInformationArgs> returnPackage;

    public Output<PackageInformationArgs> returnPackage() {
        return this.returnPackage == null ? Codegen.empty() : this.returnPackage;
    }

    /**
     * Specifies the return carrier and customer's account with the carrier.
     * 
     */
    @Import(name="returnShipping")
      private final @Nullable Output<ReturnShippingArgs> returnShipping;

    public Output<ReturnShippingArgs> returnShipping() {
        return this.returnShipping == null ? Codegen.empty() : this.returnShipping;
    }

    /**
     * Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    @Import(name="shippingInformation")
      private final @Nullable Output<ShippingInformationArgs> shippingInformation;

    public Output<ShippingInformationArgs> shippingInformation() {
        return this.shippingInformation == null ? Codegen.empty() : this.shippingInformation;
    }

    /**
     * Current state of the job.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> storageAccountId() {
        return this.storageAccountId == null ? Codegen.empty() : this.storageAccountId;
    }

    public JobDetailsArgs(
        @Nullable Output<Boolean> backupDriveManifest,
        @Nullable Output<Boolean> cancelRequested,
        @Nullable Output<DeliveryPackageInformationArgs> deliveryPackage,
        @Nullable Output<String> diagnosticsPath,
        @Nullable Output<List<DriveStatusArgs>> driveList,
        @Nullable Output<EncryptionKeyDetailsArgs> encryptionKey,
        @Nullable Output<ExportArgs> export,
        @Nullable Output<String> incompleteBlobListUri,
        @Nullable Output<String> jobType,
        @Nullable Output<String> logLevel,
        @Nullable Output<Integer> percentComplete,
        @Nullable Output<String> provisioningState,
        @Nullable Output<ReturnAddressArgs> returnAddress,
        @Nullable Output<PackageInformationArgs> returnPackage,
        @Nullable Output<ReturnShippingArgs> returnShipping,
        @Nullable Output<ShippingInformationArgs> shippingInformation,
        @Nullable Output<String> state,
        @Nullable Output<String> storageAccountId) {
        this.backupDriveManifest = backupDriveManifest == null ? Codegen.ofNullable(false) : backupDriveManifest;
        this.cancelRequested = cancelRequested == null ? Codegen.ofNullable(false) : cancelRequested;
        this.deliveryPackage = deliveryPackage;
        this.diagnosticsPath = diagnosticsPath;
        this.driveList = driveList;
        this.encryptionKey = encryptionKey;
        this.export = export;
        this.incompleteBlobListUri = incompleteBlobListUri;
        this.jobType = jobType;
        this.logLevel = logLevel;
        this.percentComplete = percentComplete;
        this.provisioningState = provisioningState;
        this.returnAddress = returnAddress;
        this.returnPackage = returnPackage;
        this.returnShipping = returnShipping;
        this.shippingInformation = shippingInformation;
        this.state = state == null ? Codegen.ofNullable("Creating") : state;
        this.storageAccountId = storageAccountId;
    }

    private JobDetailsArgs() {
        this.backupDriveManifest = Codegen.empty();
        this.cancelRequested = Codegen.empty();
        this.deliveryPackage = Codegen.empty();
        this.diagnosticsPath = Codegen.empty();
        this.driveList = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.export = Codegen.empty();
        this.incompleteBlobListUri = Codegen.empty();
        this.jobType = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.percentComplete = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.returnAddress = Codegen.empty();
        this.returnPackage = Codegen.empty();
        this.returnShipping = Codegen.empty();
        this.shippingInformation = Codegen.empty();
        this.state = Codegen.empty();
        this.storageAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> backupDriveManifest;
        private @Nullable Output<Boolean> cancelRequested;
        private @Nullable Output<DeliveryPackageInformationArgs> deliveryPackage;
        private @Nullable Output<String> diagnosticsPath;
        private @Nullable Output<List<DriveStatusArgs>> driveList;
        private @Nullable Output<EncryptionKeyDetailsArgs> encryptionKey;
        private @Nullable Output<ExportArgs> export;
        private @Nullable Output<String> incompleteBlobListUri;
        private @Nullable Output<String> jobType;
        private @Nullable Output<String> logLevel;
        private @Nullable Output<Integer> percentComplete;
        private @Nullable Output<String> provisioningState;
        private @Nullable Output<ReturnAddressArgs> returnAddress;
        private @Nullable Output<PackageInformationArgs> returnPackage;
        private @Nullable Output<ReturnShippingArgs> returnShipping;
        private @Nullable Output<ShippingInformationArgs> shippingInformation;
        private @Nullable Output<String> state;
        private @Nullable Output<String> storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupDriveManifest = defaults.backupDriveManifest;
    	      this.cancelRequested = defaults.cancelRequested;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.diagnosticsPath = defaults.diagnosticsPath;
    	      this.driveList = defaults.driveList;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.export = defaults.export;
    	      this.incompleteBlobListUri = defaults.incompleteBlobListUri;
    	      this.jobType = defaults.jobType;
    	      this.logLevel = defaults.logLevel;
    	      this.percentComplete = defaults.percentComplete;
    	      this.provisioningState = defaults.provisioningState;
    	      this.returnAddress = defaults.returnAddress;
    	      this.returnPackage = defaults.returnPackage;
    	      this.returnShipping = defaults.returnShipping;
    	      this.shippingInformation = defaults.shippingInformation;
    	      this.state = defaults.state;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder backupDriveManifest(@Nullable Output<Boolean> backupDriveManifest) {
            this.backupDriveManifest = backupDriveManifest;
            return this;
        }
        public Builder backupDriveManifest(@Nullable Boolean backupDriveManifest) {
            this.backupDriveManifest = Codegen.ofNullable(backupDriveManifest);
            return this;
        }
        public Builder cancelRequested(@Nullable Output<Boolean> cancelRequested) {
            this.cancelRequested = cancelRequested;
            return this;
        }
        public Builder cancelRequested(@Nullable Boolean cancelRequested) {
            this.cancelRequested = Codegen.ofNullable(cancelRequested);
            return this;
        }
        public Builder deliveryPackage(@Nullable Output<DeliveryPackageInformationArgs> deliveryPackage) {
            this.deliveryPackage = deliveryPackage;
            return this;
        }
        public Builder deliveryPackage(@Nullable DeliveryPackageInformationArgs deliveryPackage) {
            this.deliveryPackage = Codegen.ofNullable(deliveryPackage);
            return this;
        }
        public Builder diagnosticsPath(@Nullable Output<String> diagnosticsPath) {
            this.diagnosticsPath = diagnosticsPath;
            return this;
        }
        public Builder diagnosticsPath(@Nullable String diagnosticsPath) {
            this.diagnosticsPath = Codegen.ofNullable(diagnosticsPath);
            return this;
        }
        public Builder driveList(@Nullable Output<List<DriveStatusArgs>> driveList) {
            this.driveList = driveList;
            return this;
        }
        public Builder driveList(@Nullable List<DriveStatusArgs> driveList) {
            this.driveList = Codegen.ofNullable(driveList);
            return this;
        }
        public Builder driveList(DriveStatusArgs... driveList) {
            return driveList(List.of(driveList));
        }
        public Builder encryptionKey(@Nullable Output<EncryptionKeyDetailsArgs> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable EncryptionKeyDetailsArgs encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder export(@Nullable Output<ExportArgs> export) {
            this.export = export;
            return this;
        }
        public Builder export(@Nullable ExportArgs export) {
            this.export = Codegen.ofNullable(export);
            return this;
        }
        public Builder incompleteBlobListUri(@Nullable Output<String> incompleteBlobListUri) {
            this.incompleteBlobListUri = incompleteBlobListUri;
            return this;
        }
        public Builder incompleteBlobListUri(@Nullable String incompleteBlobListUri) {
            this.incompleteBlobListUri = Codegen.ofNullable(incompleteBlobListUri);
            return this;
        }
        public Builder jobType(@Nullable Output<String> jobType) {
            this.jobType = jobType;
            return this;
        }
        public Builder jobType(@Nullable String jobType) {
            this.jobType = Codegen.ofNullable(jobType);
            return this;
        }
        public Builder logLevel(@Nullable Output<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Codegen.ofNullable(logLevel);
            return this;
        }
        public Builder percentComplete(@Nullable Output<Integer> percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }
        public Builder percentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = Codegen.ofNullable(percentComplete);
            return this;
        }
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder returnAddress(@Nullable Output<ReturnAddressArgs> returnAddress) {
            this.returnAddress = returnAddress;
            return this;
        }
        public Builder returnAddress(@Nullable ReturnAddressArgs returnAddress) {
            this.returnAddress = Codegen.ofNullable(returnAddress);
            return this;
        }
        public Builder returnPackage(@Nullable Output<PackageInformationArgs> returnPackage) {
            this.returnPackage = returnPackage;
            return this;
        }
        public Builder returnPackage(@Nullable PackageInformationArgs returnPackage) {
            this.returnPackage = Codegen.ofNullable(returnPackage);
            return this;
        }
        public Builder returnShipping(@Nullable Output<ReturnShippingArgs> returnShipping) {
            this.returnShipping = returnShipping;
            return this;
        }
        public Builder returnShipping(@Nullable ReturnShippingArgs returnShipping) {
            this.returnShipping = Codegen.ofNullable(returnShipping);
            return this;
        }
        public Builder shippingInformation(@Nullable Output<ShippingInformationArgs> shippingInformation) {
            this.shippingInformation = shippingInformation;
            return this;
        }
        public Builder shippingInformation(@Nullable ShippingInformationArgs shippingInformation) {
            this.shippingInformation = Codegen.ofNullable(shippingInformation);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Codegen.ofNullable(storageAccountId);
            return this;
        }        public JobDetailsArgs build() {
            return new JobDetailsArgs(backupDriveManifest, cancelRequested, deliveryPackage, diagnosticsPath, driveList, encryptionKey, export, incompleteBlobListUri, jobType, logLevel, percentComplete, provisioningState, returnAddress, returnPackage, returnShipping, shippingInformation, state, storageAccountId);
        }
    }
}
