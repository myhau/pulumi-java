// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceSourceConfigurationCodeRepositoryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositoryGetArgs Empty = new ServiceSourceConfigurationCodeRepositoryGetArgs();

    /**
     * Configuration for building and running the service from a source code repository. See Code Configuration below for more details.
     * 
     */
    @InputImport(name="codeConfiguration")
      private final @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs> codeConfiguration;

    public Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs> getCodeConfiguration() {
        return this.codeConfiguration == null ? Input.empty() : this.codeConfiguration;
    }

    /**
     * The location of the repository that contains the source code.
     * 
     */
    @InputImport(name="repositoryUrl", required=true)
      private final Input<String> repositoryUrl;

    public Input<String> getRepositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The version that should be used within the source code repository. See Source Code Version below for more details.
     * 
     */
    @InputImport(name="sourceCodeVersion", required=true)
      private final Input<ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs> sourceCodeVersion;

    public Input<ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs> getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public ServiceSourceConfigurationCodeRepositoryGetArgs(
        @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs> codeConfiguration,
        Input<String> repositoryUrl,
        Input<ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs> sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion, "expected parameter 'sourceCodeVersion' to be non-null");
    }

    private ServiceSourceConfigurationCodeRepositoryGetArgs() {
        this.codeConfiguration = Input.empty();
        this.repositoryUrl = Input.empty();
        this.sourceCodeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs> codeConfiguration;
        private Input<String> repositoryUrl;
        private Input<ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs> sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder setCodeConfiguration(@Nullable Input<ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs> codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder setCodeConfiguration(@Nullable ServiceSourceConfigurationCodeRepositoryCodeConfigurationGetArgs codeConfiguration) {
            this.codeConfiguration = Input.ofNullable(codeConfiguration);
            return this;
        }

        public Builder setRepositoryUrl(Input<String> repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Input.of(Objects.requireNonNull(repositoryUrl));
            return this;
        }

        public Builder setSourceCodeVersion(Input<ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs> sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }

        public Builder setSourceCodeVersion(ServiceSourceConfigurationCodeRepositorySourceCodeVersionGetArgs sourceCodeVersion) {
            this.sourceCodeVersion = Input.of(Objects.requireNonNull(sourceCodeVersion));
            return this;
        }
        public ServiceSourceConfigurationCodeRepositoryGetArgs build() {
            return new ServiceSourceConfigurationCodeRepositoryGetArgs(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
