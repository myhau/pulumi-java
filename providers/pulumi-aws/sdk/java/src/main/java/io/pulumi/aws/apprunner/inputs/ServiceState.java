// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.ServiceEncryptionConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceHealthCheckConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceInstanceConfigurationGetArgs;
import io.pulumi.aws.apprunner.inputs.ServiceSourceConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * ARN of the App Runner service.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * ARN of an App Runner automatic scaling configuration resource that you want to associate with your service. If not provided, App Runner associates the latest revision of a default auto scaling configuration.
     * 
     */
    @InputImport(name="autoScalingConfigurationArn")
      private final @Nullable Input<String> autoScalingConfigurationArn;

    public Input<String> getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn == null ? Input.empty() : this.autoScalingConfigurationArn;
    }

    /**
     * An optional custom encryption key that App Runner uses to encrypt the copy of your source repository that it maintains and your service logs. By default, App Runner uses an AWS managed CMK. See Encryption Configuration below for more details.
     * 
     */
    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Input<ServiceEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * Settings of the health check that AWS App Runner performs to monitor the health of your service. See Health Check Configuration below for more details.
     * 
     */
    @InputImport(name="healthCheckConfiguration")
      private final @Nullable Input<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration;

    public Input<ServiceHealthCheckConfigurationGetArgs> getHealthCheckConfiguration() {
        return this.healthCheckConfiguration == null ? Input.empty() : this.healthCheckConfiguration;
    }

    /**
     * The runtime configuration of instances (scaling units) of the App Runner service. See Instance Configuration below for more details.
     * 
     */
    @InputImport(name="instanceConfiguration")
      private final @Nullable Input<ServiceInstanceConfigurationGetArgs> instanceConfiguration;

    public Input<ServiceInstanceConfigurationGetArgs> getInstanceConfiguration() {
        return this.instanceConfiguration == null ? Input.empty() : this.instanceConfiguration;
    }

    /**
     * An alphanumeric ID that App Runner generated for this service. Unique within the AWS Region.
     * 
     */
    @InputImport(name="serviceId")
      private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    /**
     * Name of the service.
     * 
     */
    @InputImport(name="serviceName")
      private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * A subdomain URL that App Runner generated for this service. You can use this URL to access your service web application.
     * 
     */
    @InputImport(name="serviceUrl")
      private final @Nullable Input<String> serviceUrl;

    public Input<String> getServiceUrl() {
        return this.serviceUrl == null ? Input.empty() : this.serviceUrl;
    }

    /**
     * The source to deploy to the App Runner service. Can be a code or an image repository. See Source Configuration below for more details.
     * 
     */
    @InputImport(name="sourceConfiguration")
      private final @Nullable Input<ServiceSourceConfigurationGetArgs> sourceConfiguration;

    public Input<ServiceSourceConfigurationGetArgs> getSourceConfiguration() {
        return this.sourceConfiguration == null ? Input.empty() : this.sourceConfiguration;
    }

    /**
     * The current state of the App Runner service.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ServiceState(
        @Nullable Input<String> arn,
        @Nullable Input<String> autoScalingConfigurationArn,
        @Nullable Input<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Input<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration,
        @Nullable Input<ServiceInstanceConfigurationGetArgs> instanceConfiguration,
        @Nullable Input<String> serviceId,
        @Nullable Input<String> serviceName,
        @Nullable Input<String> serviceUrl,
        @Nullable Input<ServiceSourceConfigurationGetArgs> sourceConfiguration,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.autoScalingConfigurationArn = autoScalingConfigurationArn;
        this.encryptionConfiguration = encryptionConfiguration;
        this.healthCheckConfiguration = healthCheckConfiguration;
        this.instanceConfiguration = instanceConfiguration;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceUrl = serviceUrl;
        this.sourceConfiguration = sourceConfiguration;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ServiceState() {
        this.arn = Input.empty();
        this.autoScalingConfigurationArn = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.healthCheckConfiguration = Input.empty();
        this.instanceConfiguration = Input.empty();
        this.serviceId = Input.empty();
        this.serviceName = Input.empty();
        this.serviceUrl = Input.empty();
        this.sourceConfiguration = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> autoScalingConfigurationArn;
        private @Nullable Input<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Input<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration;
        private @Nullable Input<ServiceInstanceConfigurationGetArgs> instanceConfiguration;
        private @Nullable Input<String> serviceId;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<String> serviceUrl;
        private @Nullable Input<ServiceSourceConfigurationGetArgs> sourceConfiguration;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoScalingConfigurationArn = defaults.autoScalingConfigurationArn;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.healthCheckConfiguration = defaults.healthCheckConfiguration;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoScalingConfigurationArn(@Nullable Input<String> autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = autoScalingConfigurationArn;
            return this;
        }

        public Builder setAutoScalingConfigurationArn(@Nullable String autoScalingConfigurationArn) {
            this.autoScalingConfigurationArn = Input.ofNullable(autoScalingConfigurationArn);
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<ServiceEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable ServiceEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setHealthCheckConfiguration(@Nullable Input<ServiceHealthCheckConfigurationGetArgs> healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }

        public Builder setHealthCheckConfiguration(@Nullable ServiceHealthCheckConfigurationGetArgs healthCheckConfiguration) {
            this.healthCheckConfiguration = Input.ofNullable(healthCheckConfiguration);
            return this;
        }

        public Builder setInstanceConfiguration(@Nullable Input<ServiceInstanceConfigurationGetArgs> instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }

        public Builder setInstanceConfiguration(@Nullable ServiceInstanceConfigurationGetArgs instanceConfiguration) {
            this.instanceConfiguration = Input.ofNullable(instanceConfiguration);
            return this;
        }

        public Builder setServiceId(@Nullable Input<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setServiceId(@Nullable String serviceId) {
            this.serviceId = Input.ofNullable(serviceId);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setServiceUrl(@Nullable Input<String> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder setServiceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = Input.ofNullable(serviceUrl);
            return this;
        }

        public Builder setSourceConfiguration(@Nullable Input<ServiceSourceConfigurationGetArgs> sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }

        public Builder setSourceConfiguration(@Nullable ServiceSourceConfigurationGetArgs sourceConfiguration) {
            this.sourceConfiguration = Input.ofNullable(sourceConfiguration);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ServiceState build() {
            return new ServiceState(arn, autoScalingConfigurationArn, encryptionConfiguration, healthCheckConfiguration, instanceConfiguration, serviceId, serviceName, serviceUrl, sourceConfiguration, status, tags, tagsAll);
        }
    }
}
