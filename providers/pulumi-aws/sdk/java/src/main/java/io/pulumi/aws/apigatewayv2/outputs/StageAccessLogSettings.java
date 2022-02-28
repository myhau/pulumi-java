// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StageAccessLogSettings {
    /**
     * The ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
     * 
     */
    private final String destinationArn;
    /**
     * A single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
     * 
     */
    private final String format;

    @OutputCustomType.Constructor({"destinationArn","format"})
    private StageAccessLogSettings(
        String destinationArn,
        String format) {
        this.destinationArn = Objects.requireNonNull(destinationArn);
        this.format = Objects.requireNonNull(format);
    }

    /**
     * The ARN of the CloudWatch Logs log group to receive access logs. Any trailing `:*` is trimmed from the ARN.
     * 
     */
    public String getDestinationArn() {
        return this.destinationArn;
    }
    /**
     * A single line [format](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#apigateway-cloudwatch-log-formats) of the access logs of data, as specified by [selected $context variables](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-logging.html).
     * 
     */
    public String getFormat() {
        return this.format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageAccessLogSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationArn;
        private String format;

        public Builder() {
    	      // Empty
        }

        public Builder(StageAccessLogSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public StageAccessLogSettings build() {
            return new StageAccessLogSettings(destinationArn, format);
        }
    }
}
