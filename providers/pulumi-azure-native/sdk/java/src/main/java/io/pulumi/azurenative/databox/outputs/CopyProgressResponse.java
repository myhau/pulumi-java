// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CopyProgressResponse {
    /**
     * Id of the account where the data needs to be uploaded.
     * 
     */
    private final String accountId;
    /**
     * To indicate bytes transferred.
     * 
     */
    private final Double bytesProcessed;
    /**
     * Data Account Type.
     * 
     */
    private final String dataAccountType;
    /**
     * To indicate directories errored out in the job.
     * 
     */
    private final Double directoriesErroredOut;
    /**
     * Number of files which could not be copied
     * 
     */
    private final Double filesErroredOut;
    /**
     * Number of files processed
     * 
     */
    private final Double filesProcessed;
    /**
     * To indicate directories renamed
     * 
     */
    private final Double invalidDirectoriesProcessed;
    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double invalidFileBytesUploaded;
    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double invalidFilesProcessed;
    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
     */
    private final Boolean isEnumerationInProgress;
    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    private final Double renamedContainerCount;
    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
     */
    private final String storageAccountName;
    /**
     * Total amount of data to be processed by the job.
     * 
     */
    private final Double totalBytesToProcess;
    /**
     * Total files to process
     * 
     */
    private final Double totalFilesToProcess;
    /**
     * Transfer type of data
     * 
     */
    private final String transferType;

    @CustomType.Constructor
    private CopyProgressResponse(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("bytesProcessed") Double bytesProcessed,
        @CustomType.Parameter("dataAccountType") String dataAccountType,
        @CustomType.Parameter("directoriesErroredOut") Double directoriesErroredOut,
        @CustomType.Parameter("filesErroredOut") Double filesErroredOut,
        @CustomType.Parameter("filesProcessed") Double filesProcessed,
        @CustomType.Parameter("invalidDirectoriesProcessed") Double invalidDirectoriesProcessed,
        @CustomType.Parameter("invalidFileBytesUploaded") Double invalidFileBytesUploaded,
        @CustomType.Parameter("invalidFilesProcessed") Double invalidFilesProcessed,
        @CustomType.Parameter("isEnumerationInProgress") Boolean isEnumerationInProgress,
        @CustomType.Parameter("renamedContainerCount") Double renamedContainerCount,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("totalBytesToProcess") Double totalBytesToProcess,
        @CustomType.Parameter("totalFilesToProcess") Double totalFilesToProcess,
        @CustomType.Parameter("transferType") String transferType) {
        this.accountId = accountId;
        this.bytesProcessed = bytesProcessed;
        this.dataAccountType = dataAccountType;
        this.directoriesErroredOut = directoriesErroredOut;
        this.filesErroredOut = filesErroredOut;
        this.filesProcessed = filesProcessed;
        this.invalidDirectoriesProcessed = invalidDirectoriesProcessed;
        this.invalidFileBytesUploaded = invalidFileBytesUploaded;
        this.invalidFilesProcessed = invalidFilesProcessed;
        this.isEnumerationInProgress = isEnumerationInProgress;
        this.renamedContainerCount = renamedContainerCount;
        this.storageAccountName = storageAccountName;
        this.totalBytesToProcess = totalBytesToProcess;
        this.totalFilesToProcess = totalFilesToProcess;
        this.transferType = transferType;
    }

    /**
     * Id of the account where the data needs to be uploaded.
     * 
    */
    public String accountId() {
        return this.accountId;
    }
    /**
     * To indicate bytes transferred.
     * 
    */
    public Double bytesProcessed() {
        return this.bytesProcessed;
    }
    /**
     * Data Account Type.
     * 
    */
    public String dataAccountType() {
        return this.dataAccountType;
    }
    /**
     * To indicate directories errored out in the job.
     * 
    */
    public Double directoriesErroredOut() {
        return this.directoriesErroredOut;
    }
    /**
     * Number of files which could not be copied
     * 
    */
    public Double filesErroredOut() {
        return this.filesErroredOut;
    }
    /**
     * Number of files processed
     * 
    */
    public Double filesProcessed() {
        return this.filesProcessed;
    }
    /**
     * To indicate directories renamed
     * 
    */
    public Double invalidDirectoriesProcessed() {
        return this.invalidDirectoriesProcessed;
    }
    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double invalidFileBytesUploaded() {
        return this.invalidFileBytesUploaded;
    }
    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double invalidFilesProcessed() {
        return this.invalidFilesProcessed;
    }
    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
    */
    public Boolean isEnumerationInProgress() {
        return this.isEnumerationInProgress;
    }
    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
    */
    public Double renamedContainerCount() {
        return this.renamedContainerCount;
    }
    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
    */
    public String storageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Total amount of data to be processed by the job.
     * 
    */
    public Double totalBytesToProcess() {
        return this.totalBytesToProcess;
    }
    /**
     * Total files to process
     * 
    */
    public Double totalFilesToProcess() {
        return this.totalFilesToProcess;
    }
    /**
     * Transfer type of data
     * 
    */
    public String transferType() {
        return this.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private Double bytesProcessed;
        private String dataAccountType;
        private Double directoriesErroredOut;
        private Double filesErroredOut;
        private Double filesProcessed;
        private Double invalidDirectoriesProcessed;
        private Double invalidFileBytesUploaded;
        private Double invalidFilesProcessed;
        private Boolean isEnumerationInProgress;
        private Double renamedContainerCount;
        private String storageAccountName;
        private Double totalBytesToProcess;
        private Double totalFilesToProcess;
        private String transferType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bytesProcessed = defaults.bytesProcessed;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.directoriesErroredOut = defaults.directoriesErroredOut;
    	      this.filesErroredOut = defaults.filesErroredOut;
    	      this.filesProcessed = defaults.filesProcessed;
    	      this.invalidDirectoriesProcessed = defaults.invalidDirectoriesProcessed;
    	      this.invalidFileBytesUploaded = defaults.invalidFileBytesUploaded;
    	      this.invalidFilesProcessed = defaults.invalidFilesProcessed;
    	      this.isEnumerationInProgress = defaults.isEnumerationInProgress;
    	      this.renamedContainerCount = defaults.renamedContainerCount;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.totalBytesToProcess = defaults.totalBytesToProcess;
    	      this.totalFilesToProcess = defaults.totalFilesToProcess;
    	      this.transferType = defaults.transferType;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder bytesProcessed(Double bytesProcessed) {
            this.bytesProcessed = Objects.requireNonNull(bytesProcessed);
            return this;
        }
        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder directoriesErroredOut(Double directoriesErroredOut) {
            this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut);
            return this;
        }
        public Builder filesErroredOut(Double filesErroredOut) {
            this.filesErroredOut = Objects.requireNonNull(filesErroredOut);
            return this;
        }
        public Builder filesProcessed(Double filesProcessed) {
            this.filesProcessed = Objects.requireNonNull(filesProcessed);
            return this;
        }
        public Builder invalidDirectoriesProcessed(Double invalidDirectoriesProcessed) {
            this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed);
            return this;
        }
        public Builder invalidFileBytesUploaded(Double invalidFileBytesUploaded) {
            this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded);
            return this;
        }
        public Builder invalidFilesProcessed(Double invalidFilesProcessed) {
            this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed);
            return this;
        }
        public Builder isEnumerationInProgress(Boolean isEnumerationInProgress) {
            this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress);
            return this;
        }
        public Builder renamedContainerCount(Double renamedContainerCount) {
            this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder totalBytesToProcess(Double totalBytesToProcess) {
            this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess);
            return this;
        }
        public Builder totalFilesToProcess(Double totalFilesToProcess) {
            this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess);
            return this;
        }
        public Builder transferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }        public CopyProgressResponse build() {
            return new CopyProgressResponse(accountId, bytesProcessed, dataAccountType, directoriesErroredOut, filesErroredOut, filesProcessed, invalidDirectoriesProcessed, invalidFileBytesUploaded, invalidFilesProcessed, isEnumerationInProgress, renamedContainerCount, storageAccountName, totalBytesToProcess, totalFilesToProcess, transferType);
        }
    }
}
