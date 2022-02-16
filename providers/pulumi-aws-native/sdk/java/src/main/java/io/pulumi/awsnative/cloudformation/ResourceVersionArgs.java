// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.cloudformation.inputs.ResourceVersionLoggingConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceVersionArgs Empty = new ResourceVersionArgs();

    @InputImport(name="executionRoleArn")
    private final @Nullable Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Input.empty() : this.executionRoleArn;
    }

    @InputImport(name="loggingConfig")
    private final @Nullable Input<ResourceVersionLoggingConfigArgs> loggingConfig;

    public Input<ResourceVersionLoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    @InputImport(name="schemaHandlerPackage", required=true)
    private final Input<String> schemaHandlerPackage;

    public Input<String> getSchemaHandlerPackage() {
        return this.schemaHandlerPackage;
    }

    @InputImport(name="typeName", required=true)
    private final Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName;
    }

    public ResourceVersionArgs(
        @Nullable Input<String> executionRoleArn,
        @Nullable Input<ResourceVersionLoggingConfigArgs> loggingConfig,
        Input<String> schemaHandlerPackage,
        Input<String> typeName) {
        this.executionRoleArn = executionRoleArn;
        this.loggingConfig = loggingConfig;
        this.schemaHandlerPackage = Objects.requireNonNull(schemaHandlerPackage, "expected parameter 'schemaHandlerPackage' to be non-null");
        this.typeName = Objects.requireNonNull(typeName, "expected parameter 'typeName' to be non-null");
    }

    private ResourceVersionArgs() {
        this.executionRoleArn = Input.empty();
        this.loggingConfig = Input.empty();
        this.schemaHandlerPackage = Input.empty();
        this.typeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> executionRoleArn;
        private @Nullable Input<ResourceVersionLoggingConfigArgs> loggingConfig;
        private Input<String> schemaHandlerPackage;
        private Input<String> typeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.schemaHandlerPackage = defaults.schemaHandlerPackage;
    	      this.typeName = defaults.typeName;
        }

        public Builder setExecutionRoleArn(@Nullable Input<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Input.ofNullable(executionRoleArn);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<ResourceVersionLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable ResourceVersionLoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setSchemaHandlerPackage(Input<String> schemaHandlerPackage) {
            this.schemaHandlerPackage = Objects.requireNonNull(schemaHandlerPackage);
            return this;
        }

        public Builder setSchemaHandlerPackage(String schemaHandlerPackage) {
            this.schemaHandlerPackage = Input.of(Objects.requireNonNull(schemaHandlerPackage));
            return this;
        }

        public Builder setTypeName(Input<String> typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = Input.of(Objects.requireNonNull(typeName));
            return this;
        }

        public ResourceVersionArgs build() {
            return new ResourceVersionArgs(executionRoleArn, loggingConfig, schemaHandlerPackage, typeName);
        }
    }
}