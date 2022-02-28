// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationGetArgs Empty = new WebAclLoggingConfigurationGetArgs();

    /**
     * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
     * 
     */
    @InputImport(name="logDestination", required=true)
      private final Input<String> logDestination;

    public Input<String> getLogDestination() {
        return this.logDestination;
    }

    /**
     * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * 
     */
    @InputImport(name="redactedFields")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldsGetArgs> redactedFields;

    public Input<WebAclLoggingConfigurationRedactedFieldsGetArgs> getRedactedFields() {
        return this.redactedFields == null ? Input.empty() : this.redactedFields;
    }

    public WebAclLoggingConfigurationGetArgs(
        Input<String> logDestination,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldsGetArgs> redactedFields) {
        this.logDestination = Objects.requireNonNull(logDestination, "expected parameter 'logDestination' to be non-null");
        this.redactedFields = redactedFields;
    }

    private WebAclLoggingConfigurationGetArgs() {
        this.logDestination = Input.empty();
        this.redactedFields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logDestination;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldsGetArgs> redactedFields;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.redactedFields = defaults.redactedFields;
        }

        public Builder setLogDestination(Input<String> logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }

        public Builder setLogDestination(String logDestination) {
            this.logDestination = Input.of(Objects.requireNonNull(logDestination));
            return this;
        }

        public Builder setRedactedFields(@Nullable Input<WebAclLoggingConfigurationRedactedFieldsGetArgs> redactedFields) {
            this.redactedFields = redactedFields;
            return this;
        }

        public Builder setRedactedFields(@Nullable WebAclLoggingConfigurationRedactedFieldsGetArgs redactedFields) {
            this.redactedFields = Input.ofNullable(redactedFields);
            return this;
        }
        public WebAclLoggingConfigurationGetArgs build() {
            return new WebAclLoggingConfigurationGetArgs(logDestination, redactedFields);
        }
    }
}
