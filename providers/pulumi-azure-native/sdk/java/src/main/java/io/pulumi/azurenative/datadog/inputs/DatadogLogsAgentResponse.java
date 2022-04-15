// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatadogLogsAgentResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatadogLogsAgentResponse Empty = new DatadogLogsAgentResponse();

    /**
     * The transport.
     * 
     */
    @Import(name="transport")
      private final @Nullable String transport;

    public Optional<String> transport() {
        return this.transport == null ? Optional.empty() : Optional.ofNullable(this.transport);
    }

    public DatadogLogsAgentResponse(@Nullable String transport) {
        this.transport = transport;
    }

    private DatadogLogsAgentResponse() {
        this.transport = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogLogsAgentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String transport;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogLogsAgentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transport = defaults.transport;
        }

        public Builder transport(@Nullable String transport) {
            this.transport = transport;
            return this;
        }        public DatadogLogsAgentResponse build() {
            return new DatadogLogsAgentResponse(transport);
        }
    }
}
