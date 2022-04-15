// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * LogAnalytics output properties
 * 
 */
public final class LogAnalyticsOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogAnalyticsOutputResponse Empty = new LogAnalyticsOutputResponse();

    /**
     * Output file Uri path to blob container.
     * 
     */
    @Import(name="output", required=true)
      private final String output;

    public String output() {
        return this.output;
    }

    public LogAnalyticsOutputResponse(String output) {
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
    }

    private LogAnalyticsOutputResponse() {
        this.output = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String output;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.output = defaults.output;
        }

        public Builder output(String output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }        public LogAnalyticsOutputResponse build() {
            return new LogAnalyticsOutputResponse(output);
        }
    }
}
