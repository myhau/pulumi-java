// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.runtimeconfig;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigIamPolicyArgs Empty = new ConfigIamPolicyArgs();

    @InputImport(name="config", required=true)
    private final Input<String> config;

    public Input<String> getConfig() {
        return this.config;
    }

    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ConfigIamPolicyArgs(
        Input<String> config,
        Input<String> policyData,
        @Nullable Input<String> project) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private ConfigIamPolicyArgs() {
        this.config = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> config;
        private Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder setConfig(Input<String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(String config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ConfigIamPolicyArgs build() {
            return new ConfigIamPolicyArgs(config, policyData, project);
        }
    }
}