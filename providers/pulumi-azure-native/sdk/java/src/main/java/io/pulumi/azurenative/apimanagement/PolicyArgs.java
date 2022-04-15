// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.PolicyContentFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Format of the policyContent.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<Either<String,PolicyContentFormat>> format;

    public Output<Either<String,PolicyContentFormat>> format() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> policyId() {
        return this.policyId == null ? Codegen.empty() : this.policyId;
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
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Contents of the Policy as defined by the format.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public PolicyArgs(
        @Nullable Output<Either<String,PolicyContentFormat>> format,
        @Nullable Output<String> policyId,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        Output<String> value) {
        this.format = format == null ? Output.ofLeft("xml") : format;
        this.policyId = policyId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PolicyArgs() {
        this.format = Codegen.empty();
        this.policyId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PolicyContentFormat>> format;
        private @Nullable Output<String> policyId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.policyId = defaults.policyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder format(@Nullable Output<Either<String,PolicyContentFormat>> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable Either<String,PolicyContentFormat> format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = Codegen.ofNullable(policyId);
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
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public PolicyArgs build() {
            return new PolicyArgs(format, policyId, resourceGroupName, serviceName, value);
        }
    }
}
