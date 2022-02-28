// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.WebAclLoggingConfigurationRedactedFields;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclLoggingConfiguration {
    /**
     * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    private final String logDestination;
    /**
     * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    private final @Nullable WebAclLoggingConfigurationRedactedFields redactedFields;

    @OutputCustomType.Constructor({"logDestination","redactedFields"})
    private WebAclLoggingConfiguration(
        String logDestination,
        @Nullable WebAclLoggingConfigurationRedactedFields redactedFields) {
        this.logDestination = Objects.requireNonNull(logDestination);
        this.redactedFields = redactedFields;
    }

    /**
     * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    public String getLogDestination() {
        return this.logDestination;
    }
    /**
     * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    public Optional<WebAclLoggingConfigurationRedactedFields> getRedactedFields() {
        return Optional.ofNullable(this.redactedFields);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logDestination;
        private @Nullable WebAclLoggingConfigurationRedactedFields redactedFields;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.redactedFields = defaults.redactedFields;
        }

        public Builder setLogDestination(String logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }

        public Builder setRedactedFields(@Nullable WebAclLoggingConfigurationRedactedFields redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }
        public WebAclLoggingConfiguration build() {
            return new WebAclLoggingConfiguration(logDestination, redactedFields);
        }
    }
}
