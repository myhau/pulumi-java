// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.HttpMessageDiagnosticArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
 * 
 */
public final class PipelineDiagnosticSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDiagnosticSettingsArgs Empty = new PipelineDiagnosticSettingsArgs();

    /**
     * Diagnostic settings for request.
     * 
     */
    @Import(name="request")
      private final @Nullable Output<HttpMessageDiagnosticArgs> request;

    public Output<HttpMessageDiagnosticArgs> request() {
        return this.request == null ? Codegen.empty() : this.request;
    }

    /**
     * Diagnostic settings for response.
     * 
     */
    @Import(name="response")
      private final @Nullable Output<HttpMessageDiagnosticArgs> response;

    public Output<HttpMessageDiagnosticArgs> response() {
        return this.response == null ? Codegen.empty() : this.response;
    }

    public PipelineDiagnosticSettingsArgs(
        @Nullable Output<HttpMessageDiagnosticArgs> request,
        @Nullable Output<HttpMessageDiagnosticArgs> response) {
        this.request = request;
        this.response = response;
    }

    private PipelineDiagnosticSettingsArgs() {
        this.request = Codegen.empty();
        this.response = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDiagnosticSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HttpMessageDiagnosticArgs> request;
        private @Nullable Output<HttpMessageDiagnosticArgs> response;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDiagnosticSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder request(@Nullable Output<HttpMessageDiagnosticArgs> request) {
            this.request = request;
            return this;
        }
        public Builder request(@Nullable HttpMessageDiagnosticArgs request) {
            this.request = Codegen.ofNullable(request);
            return this;
        }
        public Builder response(@Nullable Output<HttpMessageDiagnosticArgs> response) {
            this.response = response;
            return this;
        }
        public Builder response(@Nullable HttpMessageDiagnosticArgs response) {
            this.response = Codegen.ofNullable(response);
            return this;
        }        public PipelineDiagnosticSettingsArgs build() {
            return new PipelineDiagnosticSettingsArgs(request, response);
        }
    }
}
