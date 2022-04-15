// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.LogLevel;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application logs to file system configuration.
 * 
 */
public final class FileSystemApplicationLogsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemApplicationLogsConfigArgs Empty = new FileSystemApplicationLogsConfigArgs();

    /**
     * Log level.
     * 
     */
    @Import(name="level")
      private final @Nullable Output<LogLevel> level;

    public Output<LogLevel> level() {
        return this.level == null ? Codegen.empty() : this.level;
    }

    public FileSystemApplicationLogsConfigArgs(@Nullable Output<LogLevel> level) {
        this.level = level == null ? Codegen.ofNullable(io.pulumi.azurenative.web.enums.LogLevel.Off) : level;
    }

    private FileSystemApplicationLogsConfigArgs() {
        this.level = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LogLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemApplicationLogsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        public Builder level(@Nullable Output<LogLevel> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable LogLevel level) {
            this.level = Codegen.ofNullable(level);
            return this;
        }        public FileSystemApplicationLogsConfigArgs build() {
            return new FileSystemApplicationLogsConfigArgs(level);
        }
    }
}
