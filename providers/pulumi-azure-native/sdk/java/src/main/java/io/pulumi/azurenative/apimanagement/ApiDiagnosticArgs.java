// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.AlwaysLog;
import io.pulumi.azurenative.apimanagement.enums.HttpCorrelationProtocol;
import io.pulumi.azurenative.apimanagement.enums.OperationNameFormat;
import io.pulumi.azurenative.apimanagement.enums.Verbosity;
import io.pulumi.azurenative.apimanagement.inputs.PipelineDiagnosticSettingsArgs;
import io.pulumi.azurenative.apimanagement.inputs.SamplingSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiDiagnosticArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticArgs Empty = new ApiDiagnosticArgs();

    /**
     * Specifies for what type of messages sampling settings should not apply.
     * 
     */
    @Import(name="alwaysLog")
      private final @Nullable Output<Either<String,AlwaysLog>> alwaysLog;

    public Output<Either<String,AlwaysLog>> alwaysLog() {
        return this.alwaysLog == null ? Codegen.empty() : this.alwaysLog;
    }

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    @Import(name="backend")
      private final @Nullable Output<PipelineDiagnosticSettingsArgs> backend;

    public Output<PipelineDiagnosticSettingsArgs> backend() {
        return this.backend == null ? Codegen.empty() : this.backend;
    }

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="diagnosticId")
      private final @Nullable Output<String> diagnosticId;

    public Output<String> diagnosticId() {
        return this.diagnosticId == null ? Codegen.empty() : this.diagnosticId;
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    @Import(name="frontend")
      private final @Nullable Output<PipelineDiagnosticSettingsArgs> frontend;

    public Output<PipelineDiagnosticSettingsArgs> frontend() {
        return this.frontend == null ? Codegen.empty() : this.frontend;
    }

    /**
     * Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    @Import(name="httpCorrelationProtocol")
      private final @Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol;

    public Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol() {
        return this.httpCorrelationProtocol == null ? Codegen.empty() : this.httpCorrelationProtocol;
    }

    /**
     * Log the ClientIP. Default is false.
     * 
     */
    @Import(name="logClientIp")
      private final @Nullable Output<Boolean> logClientIp;

    public Output<Boolean> logClientIp() {
        return this.logClientIp == null ? Codegen.empty() : this.logClientIp;
    }

    /**
     * Resource Id of a target logger.
     * 
     */
    @Import(name="loggerId", required=true)
      private final Output<String> loggerId;

    public Output<String> loggerId() {
        return this.loggerId;
    }

    /**
     * The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    @Import(name="operationNameFormat")
      private final @Nullable Output<Either<String,OperationNameFormat>> operationNameFormat;

    public Output<Either<String,OperationNameFormat>> operationNameFormat() {
        return this.operationNameFormat == null ? Codegen.empty() : this.operationNameFormat;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sampling settings for Diagnostic.
     * 
     */
    @Import(name="sampling")
      private final @Nullable Output<SamplingSettingsArgs> sampling;

    public Output<SamplingSettingsArgs> sampling() {
        return this.sampling == null ? Codegen.empty() : this.sampling;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * The verbosity level applied to traces emitted by trace policies.
     * 
     */
    @Import(name="verbosity")
      private final @Nullable Output<Either<String,Verbosity>> verbosity;

    public Output<Either<String,Verbosity>> verbosity() {
        return this.verbosity == null ? Codegen.empty() : this.verbosity;
    }

    public ApiDiagnosticArgs(
        @Nullable Output<Either<String,AlwaysLog>> alwaysLog,
        Output<String> apiId,
        @Nullable Output<PipelineDiagnosticSettingsArgs> backend,
        @Nullable Output<String> diagnosticId,
        @Nullable Output<PipelineDiagnosticSettingsArgs> frontend,
        @Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol,
        @Nullable Output<Boolean> logClientIp,
        Output<String> loggerId,
        @Nullable Output<Either<String,OperationNameFormat>> operationNameFormat,
        Output<String> resourceGroupName,
        @Nullable Output<SamplingSettingsArgs> sampling,
        Output<String> serviceName,
        @Nullable Output<Either<String,Verbosity>> verbosity) {
        this.alwaysLog = alwaysLog;
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.backend = backend;
        this.diagnosticId = diagnosticId;
        this.frontend = frontend;
        this.httpCorrelationProtocol = httpCorrelationProtocol;
        this.logClientIp = logClientIp;
        this.loggerId = Objects.requireNonNull(loggerId, "expected parameter 'loggerId' to be non-null");
        this.operationNameFormat = operationNameFormat;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sampling = sampling;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.verbosity = verbosity;
    }

    private ApiDiagnosticArgs() {
        this.alwaysLog = Codegen.empty();
        this.apiId = Codegen.empty();
        this.backend = Codegen.empty();
        this.diagnosticId = Codegen.empty();
        this.frontend = Codegen.empty();
        this.httpCorrelationProtocol = Codegen.empty();
        this.logClientIp = Codegen.empty();
        this.loggerId = Codegen.empty();
        this.operationNameFormat = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sampling = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.verbosity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,AlwaysLog>> alwaysLog;
        private Output<String> apiId;
        private @Nullable Output<PipelineDiagnosticSettingsArgs> backend;
        private @Nullable Output<String> diagnosticId;
        private @Nullable Output<PipelineDiagnosticSettingsArgs> frontend;
        private @Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol;
        private @Nullable Output<Boolean> logClientIp;
        private Output<String> loggerId;
        private @Nullable Output<Either<String,OperationNameFormat>> operationNameFormat;
        private Output<String> resourceGroupName;
        private @Nullable Output<SamplingSettingsArgs> sampling;
        private Output<String> serviceName;
        private @Nullable Output<Either<String,Verbosity>> verbosity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysLog = defaults.alwaysLog;
    	      this.apiId = defaults.apiId;
    	      this.backend = defaults.backend;
    	      this.diagnosticId = defaults.diagnosticId;
    	      this.frontend = defaults.frontend;
    	      this.httpCorrelationProtocol = defaults.httpCorrelationProtocol;
    	      this.logClientIp = defaults.logClientIp;
    	      this.loggerId = defaults.loggerId;
    	      this.operationNameFormat = defaults.operationNameFormat;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sampling = defaults.sampling;
    	      this.serviceName = defaults.serviceName;
    	      this.verbosity = defaults.verbosity;
        }

        public Builder alwaysLog(@Nullable Output<Either<String,AlwaysLog>> alwaysLog) {
            this.alwaysLog = alwaysLog;
            return this;
        }
        public Builder alwaysLog(@Nullable Either<String,AlwaysLog> alwaysLog) {
            this.alwaysLog = Codegen.ofNullable(alwaysLog);
            return this;
        }
        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder backend(@Nullable Output<PipelineDiagnosticSettingsArgs> backend) {
            this.backend = backend;
            return this;
        }
        public Builder backend(@Nullable PipelineDiagnosticSettingsArgs backend) {
            this.backend = Codegen.ofNullable(backend);
            return this;
        }
        public Builder diagnosticId(@Nullable Output<String> diagnosticId) {
            this.diagnosticId = diagnosticId;
            return this;
        }
        public Builder diagnosticId(@Nullable String diagnosticId) {
            this.diagnosticId = Codegen.ofNullable(diagnosticId);
            return this;
        }
        public Builder frontend(@Nullable Output<PipelineDiagnosticSettingsArgs> frontend) {
            this.frontend = frontend;
            return this;
        }
        public Builder frontend(@Nullable PipelineDiagnosticSettingsArgs frontend) {
            this.frontend = Codegen.ofNullable(frontend);
            return this;
        }
        public Builder httpCorrelationProtocol(@Nullable Output<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol) {
            this.httpCorrelationProtocol = httpCorrelationProtocol;
            return this;
        }
        public Builder httpCorrelationProtocol(@Nullable Either<String,HttpCorrelationProtocol> httpCorrelationProtocol) {
            this.httpCorrelationProtocol = Codegen.ofNullable(httpCorrelationProtocol);
            return this;
        }
        public Builder logClientIp(@Nullable Output<Boolean> logClientIp) {
            this.logClientIp = logClientIp;
            return this;
        }
        public Builder logClientIp(@Nullable Boolean logClientIp) {
            this.logClientIp = Codegen.ofNullable(logClientIp);
            return this;
        }
        public Builder loggerId(Output<String> loggerId) {
            this.loggerId = Objects.requireNonNull(loggerId);
            return this;
        }
        public Builder loggerId(String loggerId) {
            this.loggerId = Output.of(Objects.requireNonNull(loggerId));
            return this;
        }
        public Builder operationNameFormat(@Nullable Output<Either<String,OperationNameFormat>> operationNameFormat) {
            this.operationNameFormat = operationNameFormat;
            return this;
        }
        public Builder operationNameFormat(@Nullable Either<String,OperationNameFormat> operationNameFormat) {
            this.operationNameFormat = Codegen.ofNullable(operationNameFormat);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sampling(@Nullable Output<SamplingSettingsArgs> sampling) {
            this.sampling = sampling;
            return this;
        }
        public Builder sampling(@Nullable SamplingSettingsArgs sampling) {
            this.sampling = Codegen.ofNullable(sampling);
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder verbosity(@Nullable Output<Either<String,Verbosity>> verbosity) {
            this.verbosity = verbosity;
            return this;
        }
        public Builder verbosity(@Nullable Either<String,Verbosity> verbosity) {
            this.verbosity = Codegen.ofNullable(verbosity);
            return this;
        }        public ApiDiagnosticArgs build() {
            return new ApiDiagnosticArgs(alwaysLog, apiId, backend, diagnosticId, frontend, httpCorrelationProtocol, logClientIp, loggerId, operationNameFormat, resourceGroupName, sampling, serviceName, verbosity);
        }
    }
}
