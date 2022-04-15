// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration;

import io.pulumi.azurenative.kubernetesconfiguration.enums.OperatorScopeType;
import io.pulumi.azurenative.kubernetesconfiguration.enums.OperatorType;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.HelmOperatorPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceControlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceControlConfigurationArgs Empty = new SourceControlConfigurationArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
      private final Output<String> clusterResourceName;

    public Output<String> clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
      private final Output<String> clusterRp;

    public Output<String> clusterRp() {
        return this.clusterRp;
    }

    /**
     * Name-value pairs of protected configuration settings for the configuration
     * 
     */
    @Import(name="configurationProtectedSettings")
      private final @Nullable Output<Map<String,String>> configurationProtectedSettings;

    public Output<Map<String,String>> configurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Codegen.empty() : this.configurationProtectedSettings;
    }

    /**
     * Option to enable Helm Operator for this git configuration.
     * 
     */
    @Import(name="enableHelmOperator")
      private final @Nullable Output<Boolean> enableHelmOperator;

    public Output<Boolean> enableHelmOperator() {
        return this.enableHelmOperator == null ? Codegen.empty() : this.enableHelmOperator;
    }

    /**
     * Properties for Helm operator.
     * 
     */
    @Import(name="helmOperatorProperties")
      private final @Nullable Output<HelmOperatorPropertiesArgs> helmOperatorProperties;

    public Output<HelmOperatorPropertiesArgs> helmOperatorProperties() {
        return this.helmOperatorProperties == null ? Codegen.empty() : this.helmOperatorProperties;
    }

    /**
     * Instance name of the operator - identifying the specific configuration.
     * 
     */
    @Import(name="operatorInstanceName")
      private final @Nullable Output<String> operatorInstanceName;

    public Output<String> operatorInstanceName() {
        return this.operatorInstanceName == null ? Codegen.empty() : this.operatorInstanceName;
    }

    /**
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen and period only.
     * 
     */
    @Import(name="operatorNamespace")
      private final @Nullable Output<String> operatorNamespace;

    public Output<String> operatorNamespace() {
        return this.operatorNamespace == null ? Codegen.empty() : this.operatorNamespace;
    }

    /**
     * Any Parameters for the Operator instance in string format.
     * 
     */
    @Import(name="operatorParams")
      private final @Nullable Output<String> operatorParams;

    public Output<String> operatorParams() {
        return this.operatorParams == null ? Codegen.empty() : this.operatorParams;
    }

    /**
     * Scope at which the operator will be installed.
     * 
     */
    @Import(name="operatorScope")
      private final @Nullable Output<Either<String,OperatorScopeType>> operatorScope;

    public Output<Either<String,OperatorScopeType>> operatorScope() {
        return this.operatorScope == null ? Codegen.empty() : this.operatorScope;
    }

    /**
     * Type of the operator
     * 
     */
    @Import(name="operatorType")
      private final @Nullable Output<Either<String,OperatorType>> operatorType;

    public Output<Either<String,OperatorType>> operatorType() {
        return this.operatorType == null ? Codegen.empty() : this.operatorType;
    }

    /**
     * Url of the SourceControl Repository.
     * 
     */
    @Import(name="repositoryUrl")
      private final @Nullable Output<String> repositoryUrl;

    public Output<String> repositoryUrl() {
        return this.repositoryUrl == null ? Codegen.empty() : this.repositoryUrl;
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
     * Name of the Source Control Configuration.
     * 
     */
    @Import(name="sourceControlConfigurationName")
      private final @Nullable Output<String> sourceControlConfigurationName;

    public Output<String> sourceControlConfigurationName() {
        return this.sourceControlConfigurationName == null ? Codegen.empty() : this.sourceControlConfigurationName;
    }

    /**
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     * 
     */
    @Import(name="sshKnownHostsContents")
      private final @Nullable Output<String> sshKnownHostsContents;

    public Output<String> sshKnownHostsContents() {
        return this.sshKnownHostsContents == null ? Codegen.empty() : this.sshKnownHostsContents;
    }

    public SourceControlConfigurationArgs(
        Output<String> clusterName,
        Output<String> clusterResourceName,
        Output<String> clusterRp,
        @Nullable Output<Map<String,String>> configurationProtectedSettings,
        @Nullable Output<Boolean> enableHelmOperator,
        @Nullable Output<HelmOperatorPropertiesArgs> helmOperatorProperties,
        @Nullable Output<String> operatorInstanceName,
        @Nullable Output<String> operatorNamespace,
        @Nullable Output<String> operatorParams,
        @Nullable Output<Either<String,OperatorScopeType>> operatorScope,
        @Nullable Output<Either<String,OperatorType>> operatorType,
        @Nullable Output<String> repositoryUrl,
        Output<String> resourceGroupName,
        @Nullable Output<String> sourceControlConfigurationName,
        @Nullable Output<String> sshKnownHostsContents) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterResourceName = Objects.requireNonNull(clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
        this.clusterRp = Objects.requireNonNull(clusterRp, "expected parameter 'clusterRp' to be non-null");
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.enableHelmOperator = enableHelmOperator;
        this.helmOperatorProperties = helmOperatorProperties;
        this.operatorInstanceName = operatorInstanceName;
        this.operatorNamespace = operatorNamespace == null ? Codegen.ofNullable("default") : operatorNamespace;
        this.operatorParams = operatorParams;
        this.operatorScope = operatorScope;
        this.operatorType = operatorType;
        this.repositoryUrl = repositoryUrl;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceControlConfigurationName = sourceControlConfigurationName;
        this.sshKnownHostsContents = sshKnownHostsContents;
    }

    private SourceControlConfigurationArgs() {
        this.clusterName = Codegen.empty();
        this.clusterResourceName = Codegen.empty();
        this.clusterRp = Codegen.empty();
        this.configurationProtectedSettings = Codegen.empty();
        this.enableHelmOperator = Codegen.empty();
        this.helmOperatorProperties = Codegen.empty();
        this.operatorInstanceName = Codegen.empty();
        this.operatorNamespace = Codegen.empty();
        this.operatorParams = Codegen.empty();
        this.operatorScope = Codegen.empty();
        this.operatorType = Codegen.empty();
        this.repositoryUrl = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sourceControlConfigurationName = Codegen.empty();
        this.sshKnownHostsContents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceControlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private Output<String> clusterResourceName;
        private Output<String> clusterRp;
        private @Nullable Output<Map<String,String>> configurationProtectedSettings;
        private @Nullable Output<Boolean> enableHelmOperator;
        private @Nullable Output<HelmOperatorPropertiesArgs> helmOperatorProperties;
        private @Nullable Output<String> operatorInstanceName;
        private @Nullable Output<String> operatorNamespace;
        private @Nullable Output<String> operatorParams;
        private @Nullable Output<Either<String,OperatorScopeType>> operatorScope;
        private @Nullable Output<Either<String,OperatorType>> operatorType;
        private @Nullable Output<String> repositoryUrl;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sourceControlConfigurationName;
        private @Nullable Output<String> sshKnownHostsContents;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceControlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterResourceName = defaults.clusterResourceName;
    	      this.clusterRp = defaults.clusterRp;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.enableHelmOperator = defaults.enableHelmOperator;
    	      this.helmOperatorProperties = defaults.helmOperatorProperties;
    	      this.operatorInstanceName = defaults.operatorInstanceName;
    	      this.operatorNamespace = defaults.operatorNamespace;
    	      this.operatorParams = defaults.operatorParams;
    	      this.operatorScope = defaults.operatorScope;
    	      this.operatorType = defaults.operatorType;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceControlConfigurationName = defaults.sourceControlConfigurationName;
    	      this.sshKnownHostsContents = defaults.sshKnownHostsContents;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder clusterResourceName(Output<String> clusterResourceName) {
            this.clusterResourceName = Objects.requireNonNull(clusterResourceName);
            return this;
        }
        public Builder clusterResourceName(String clusterResourceName) {
            this.clusterResourceName = Output.of(Objects.requireNonNull(clusterResourceName));
            return this;
        }
        public Builder clusterRp(Output<String> clusterRp) {
            this.clusterRp = Objects.requireNonNull(clusterRp);
            return this;
        }
        public Builder clusterRp(String clusterRp) {
            this.clusterRp = Output.of(Objects.requireNonNull(clusterRp));
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Output<Map<String,String>> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }
        public Builder configurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = Codegen.ofNullable(configurationProtectedSettings);
            return this;
        }
        public Builder enableHelmOperator(@Nullable Output<Boolean> enableHelmOperator) {
            this.enableHelmOperator = enableHelmOperator;
            return this;
        }
        public Builder enableHelmOperator(@Nullable Boolean enableHelmOperator) {
            this.enableHelmOperator = Codegen.ofNullable(enableHelmOperator);
            return this;
        }
        public Builder helmOperatorProperties(@Nullable Output<HelmOperatorPropertiesArgs> helmOperatorProperties) {
            this.helmOperatorProperties = helmOperatorProperties;
            return this;
        }
        public Builder helmOperatorProperties(@Nullable HelmOperatorPropertiesArgs helmOperatorProperties) {
            this.helmOperatorProperties = Codegen.ofNullable(helmOperatorProperties);
            return this;
        }
        public Builder operatorInstanceName(@Nullable Output<String> operatorInstanceName) {
            this.operatorInstanceName = operatorInstanceName;
            return this;
        }
        public Builder operatorInstanceName(@Nullable String operatorInstanceName) {
            this.operatorInstanceName = Codegen.ofNullable(operatorInstanceName);
            return this;
        }
        public Builder operatorNamespace(@Nullable Output<String> operatorNamespace) {
            this.operatorNamespace = operatorNamespace;
            return this;
        }
        public Builder operatorNamespace(@Nullable String operatorNamespace) {
            this.operatorNamespace = Codegen.ofNullable(operatorNamespace);
            return this;
        }
        public Builder operatorParams(@Nullable Output<String> operatorParams) {
            this.operatorParams = operatorParams;
            return this;
        }
        public Builder operatorParams(@Nullable String operatorParams) {
            this.operatorParams = Codegen.ofNullable(operatorParams);
            return this;
        }
        public Builder operatorScope(@Nullable Output<Either<String,OperatorScopeType>> operatorScope) {
            this.operatorScope = operatorScope;
            return this;
        }
        public Builder operatorScope(@Nullable Either<String,OperatorScopeType> operatorScope) {
            this.operatorScope = Codegen.ofNullable(operatorScope);
            return this;
        }
        public Builder operatorType(@Nullable Output<Either<String,OperatorType>> operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Builder operatorType(@Nullable Either<String,OperatorType> operatorType) {
            this.operatorType = Codegen.ofNullable(operatorType);
            return this;
        }
        public Builder repositoryUrl(@Nullable Output<String> repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public Builder repositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = Codegen.ofNullable(repositoryUrl);
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
        public Builder sourceControlConfigurationName(@Nullable Output<String> sourceControlConfigurationName) {
            this.sourceControlConfigurationName = sourceControlConfigurationName;
            return this;
        }
        public Builder sourceControlConfigurationName(@Nullable String sourceControlConfigurationName) {
            this.sourceControlConfigurationName = Codegen.ofNullable(sourceControlConfigurationName);
            return this;
        }
        public Builder sshKnownHostsContents(@Nullable Output<String> sshKnownHostsContents) {
            this.sshKnownHostsContents = sshKnownHostsContents;
            return this;
        }
        public Builder sshKnownHostsContents(@Nullable String sshKnownHostsContents) {
            this.sshKnownHostsContents = Codegen.ofNullable(sshKnownHostsContents);
            return this;
        }        public SourceControlConfigurationArgs build() {
            return new SourceControlConfigurationArgs(clusterName, clusterResourceName, clusterRp, configurationProtectedSettings, enableHelmOperator, helmOperatorProperties, operatorInstanceName, operatorNamespace, operatorParams, operatorScope, operatorType, repositoryUrl, resourceGroupName, sourceControlConfigurationName, sshKnownHostsContents);
        }
    }
}
