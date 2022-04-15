// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location of Oracle Cloud Storage dataset.
 * 
 */
public final class OracleCloudStorageLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleCloudStorageLocationArgs Empty = new OracleCloudStorageLocationArgs();

    /**
     * Specify the bucketName of Oracle Cloud Storage. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<Object> bucketName;

    public Output<Object> bucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Output<Object> fileName;

    public Output<Object> fileName() {
        return this.fileName == null ? Codegen.empty() : this.fileName;
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Output<Object> folderPath;

    public Output<Object> folderPath() {
        return this.folderPath == null ? Codegen.empty() : this.folderPath;
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'OracleCloudStorageLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specify the version of Oracle Cloud Storage. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Object> version;

    public Output<Object> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public OracleCloudStorageLocationArgs(
        @Nullable Output<Object> bucketName,
        @Nullable Output<Object> fileName,
        @Nullable Output<Object> folderPath,
        Output<String> type,
        @Nullable Output<Object> version) {
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private OracleCloudStorageLocationArgs() {
        this.bucketName = Codegen.empty();
        this.fileName = Codegen.empty();
        this.folderPath = Codegen.empty();
        this.type = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleCloudStorageLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> bucketName;
        private @Nullable Output<Object> fileName;
        private @Nullable Output<Object> folderPath;
        private Output<String> type;
        private @Nullable Output<Object> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleCloudStorageLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder bucketName(@Nullable Output<Object> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable Object bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder fileName(@Nullable Output<Object> fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = Codegen.ofNullable(fileName);
            return this;
        }
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = Codegen.ofNullable(folderPath);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder version(@Nullable Output<Object> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Object version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public OracleCloudStorageLocationArgs build() {
            return new OracleCloudStorageLocationArgs(bucketName, fileName, folderPath, type, version);
        }
    }
}
