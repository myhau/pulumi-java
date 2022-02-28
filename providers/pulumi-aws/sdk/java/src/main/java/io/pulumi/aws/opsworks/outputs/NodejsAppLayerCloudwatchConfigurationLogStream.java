// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodejsAppLayerCloudwatchConfigurationLogStream {
    private final @Nullable Integer batchCount;
    private final @Nullable Integer batchSize;
    private final @Nullable Integer bufferDuration;
    private final @Nullable String datetimeFormat;
    private final @Nullable String encoding;
    private final String file;
    private final @Nullable String fileFingerprintLines;
    private final @Nullable String initialPosition;
    private final String logGroupName;
    private final @Nullable String multilineStartPattern;
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"batchCount","batchSize","bufferDuration","datetimeFormat","encoding","file","fileFingerprintLines","initialPosition","logGroupName","multilineStartPattern","timeZone"})
    private NodejsAppLayerCloudwatchConfigurationLogStream(
        @Nullable Integer batchCount,
        @Nullable Integer batchSize,
        @Nullable Integer bufferDuration,
        @Nullable String datetimeFormat,
        @Nullable String encoding,
        String file,
        @Nullable String fileFingerprintLines,
        @Nullable String initialPosition,
        String logGroupName,
        @Nullable String multilineStartPattern,
        @Nullable String timeZone) {
        this.batchCount = batchCount;
        this.batchSize = batchSize;
        this.bufferDuration = bufferDuration;
        this.datetimeFormat = datetimeFormat;
        this.encoding = encoding;
        this.file = Objects.requireNonNull(file);
        this.fileFingerprintLines = fileFingerprintLines;
        this.initialPosition = initialPosition;
        this.logGroupName = Objects.requireNonNull(logGroupName);
        this.multilineStartPattern = multilineStartPattern;
        this.timeZone = timeZone;
    }

    public Optional<Integer> getBatchCount() {
        return Optional.ofNullable(this.batchCount);
    }
    public Optional<Integer> getBatchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    public Optional<Integer> getBufferDuration() {
        return Optional.ofNullable(this.bufferDuration);
    }
    public Optional<String> getDatetimeFormat() {
        return Optional.ofNullable(this.datetimeFormat);
    }
    public Optional<String> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    public String getFile() {
        return this.file;
    }
    public Optional<String> getFileFingerprintLines() {
        return Optional.ofNullable(this.fileFingerprintLines);
    }
    public Optional<String> getInitialPosition() {
        return Optional.ofNullable(this.initialPosition);
    }
    public String getLogGroupName() {
        return this.logGroupName;
    }
    public Optional<String> getMultilineStartPattern() {
        return Optional.ofNullable(this.multilineStartPattern);
    }
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodejsAppLayerCloudwatchConfigurationLogStream defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchCount;
        private @Nullable Integer batchSize;
        private @Nullable Integer bufferDuration;
        private @Nullable String datetimeFormat;
        private @Nullable String encoding;
        private String file;
        private @Nullable String fileFingerprintLines;
        private @Nullable String initialPosition;
        private String logGroupName;
        private @Nullable String multilineStartPattern;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodejsAppLayerCloudwatchConfigurationLogStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchCount = defaults.batchCount;
    	      this.batchSize = defaults.batchSize;
    	      this.bufferDuration = defaults.bufferDuration;
    	      this.datetimeFormat = defaults.datetimeFormat;
    	      this.encoding = defaults.encoding;
    	      this.file = defaults.file;
    	      this.fileFingerprintLines = defaults.fileFingerprintLines;
    	      this.initialPosition = defaults.initialPosition;
    	      this.logGroupName = defaults.logGroupName;
    	      this.multilineStartPattern = defaults.multilineStartPattern;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setBatchCount(@Nullable Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBufferDuration(@Nullable Integer bufferDuration) {
            this.bufferDuration = bufferDuration;
            return this;
        }

        public Builder setDatetimeFormat(@Nullable String datetimeFormat) {
            this.datetimeFormat = datetimeFormat;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setFile(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setFileFingerprintLines(@Nullable String fileFingerprintLines) {
            this.fileFingerprintLines = fileFingerprintLines;
            return this;
        }

        public Builder setInitialPosition(@Nullable String initialPosition) {
            this.initialPosition = initialPosition;
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setMultilineStartPattern(@Nullable String multilineStartPattern) {
            this.multilineStartPattern = multilineStartPattern;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public NodejsAppLayerCloudwatchConfigurationLogStream build() {
            return new NodejsAppLayerCloudwatchConfigurationLogStream(batchCount, batchSize, bufferDuration, datetimeFormat, encoding, file, fileFingerprintLines, initialPosition, logGroupName, multilineStartPattern, timeZone);
        }
    }
}
