// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions {
    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    private final @Nullable Integer bytesLimitPerFile;
    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    private final @Nullable Integer bytesLimitPerFilePercent;
    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet;
    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    private final @Nullable List<String> fileTypes;
    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    private final @Nullable Integer filesLimitPercent;
    /**
     * How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    private final @Nullable String sampleMethod;

    @OutputCustomType.Constructor({"bytesLimitPerFile","bytesLimitPerFilePercent","fileSet","fileTypes","filesLimitPercent","sampleMethod"})
    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions(
        @Nullable Integer bytesLimitPerFile,
        @Nullable Integer bytesLimitPerFilePercent,
        PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet,
        @Nullable List<String> fileTypes,
        @Nullable Integer filesLimitPercent,
        @Nullable String sampleMethod) {
        this.bytesLimitPerFile = bytesLimitPerFile;
        this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
        this.fileSet = Objects.requireNonNull(fileSet);
        this.fileTypes = fileTypes;
        this.filesLimitPercent = filesLimitPercent;
        this.sampleMethod = sampleMethod;
    }

    /**
     * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    public Optional<Integer> getBytesLimitPerFile() {
        return Optional.ofNullable(this.bytesLimitPerFile);
    }
    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Integer> getBytesLimitPerFilePercent() {
        return Optional.ofNullable(this.bytesLimitPerFilePercent);
    }
    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet getFileSet() {
        return this.fileSet;
    }
    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    public List<String> getFileTypes() {
        return this.fileTypes == null ? List.of() : this.fileTypes;
    }
    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Integer> getFilesLimitPercent() {
        return Optional.ofNullable(this.filesLimitPercent);
    }
    /**
     * How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    public Optional<String> getSampleMethod() {
        return Optional.ofNullable(this.sampleMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesLimitPerFile;
        private @Nullable Integer bytesLimitPerFilePercent;
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet;
        private @Nullable List<String> fileTypes;
        private @Nullable Integer filesLimitPercent;
        private @Nullable String sampleMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesLimitPerFile = defaults.bytesLimitPerFile;
    	      this.bytesLimitPerFilePercent = defaults.bytesLimitPerFilePercent;
    	      this.fileSet = defaults.fileSet;
    	      this.fileTypes = defaults.fileTypes;
    	      this.filesLimitPercent = defaults.filesLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
        }

        public Builder setBytesLimitPerFile(@Nullable Integer bytesLimitPerFile) {
            this.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }

        public Builder setBytesLimitPerFilePercent(@Nullable Integer bytesLimitPerFilePercent) {
            this.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }

        public Builder setFileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSet fileSet) {
            this.fileSet = Objects.requireNonNull(fileSet);
            return this;
        }

        public Builder setFileTypes(@Nullable List<String> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }

        public Builder setFilesLimitPercent(@Nullable Integer filesLimitPercent) {
            this.filesLimitPercent = filesLimitPercent;
            return this;
        }

        public Builder setSampleMethod(@Nullable String sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions build() {
            return new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions(bytesLimitPerFile, bytesLimitPerFilePercent, fileSet, fileTypes, filesLimitPercent, sampleMethod);
        }
    }
}
