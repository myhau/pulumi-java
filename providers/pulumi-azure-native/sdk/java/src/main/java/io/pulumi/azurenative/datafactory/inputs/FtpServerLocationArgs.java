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
 * The location of ftp server dataset.
 * 
 */
public final class FtpServerLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FtpServerLocationArgs Empty = new FtpServerLocationArgs();

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
     * Expected value is 'FtpServerLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public FtpServerLocationArgs(
        @Nullable Output<Object> fileName,
        @Nullable Output<Object> folderPath,
        Output<String> type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FtpServerLocationArgs() {
        this.fileName = Codegen.empty();
        this.folderPath = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FtpServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> fileName;
        private @Nullable Output<Object> folderPath;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FtpServerLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
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
        }        public FtpServerLocationArgs build() {
            return new FtpServerLocationArgs(fileName, folderPath, type);
        }
    }
}
