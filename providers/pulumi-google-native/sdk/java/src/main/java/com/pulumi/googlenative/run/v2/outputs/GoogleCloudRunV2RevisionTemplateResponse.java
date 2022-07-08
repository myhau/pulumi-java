// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2ContainerResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2RevisionScalingResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2VolumeResponse;
import com.pulumi.googlenative.run.v2.outputs.GoogleCloudRunV2VpcAccessResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunV2RevisionTemplateResponse {
    /**
     * @return KRM-style annotations for the resource.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    private final List<GoogleCloudRunV2ContainerResponse> containers;
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private final String encryptionKey;
    /**
     * @return The sandbox environment to host this Revision.
     * 
     */
    private final String executionEnvironment;
    /**
     * @return KRM-style labels for the resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    private final Integer maxInstanceRequestConcurrency;
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    private final String revision;
    /**
     * @return Scaling settings for this Revision.
     * 
     */
    private final GoogleCloudRunV2RevisionScalingResponse scaling;
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    private final String serviceAccount;
    /**
     * @return Max allowed time for an instance to respond to a request.
     * 
     */
    private final String timeout;
    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    private final List<GoogleCloudRunV2VolumeResponse> volumes;
    /**
     * @return VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    private final GoogleCloudRunV2VpcAccessResponse vpcAccess;

    @CustomType.Constructor
    private GoogleCloudRunV2RevisionTemplateResponse(
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("containers") List<GoogleCloudRunV2ContainerResponse> containers,
        @CustomType.Parameter("encryptionKey") String encryptionKey,
        @CustomType.Parameter("executionEnvironment") String executionEnvironment,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("maxInstanceRequestConcurrency") Integer maxInstanceRequestConcurrency,
        @CustomType.Parameter("revision") String revision,
        @CustomType.Parameter("scaling") GoogleCloudRunV2RevisionScalingResponse scaling,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("volumes") List<GoogleCloudRunV2VolumeResponse> volumes,
        @CustomType.Parameter("vpcAccess") GoogleCloudRunV2VpcAccessResponse vpcAccess) {
        this.annotations = annotations;
        this.containers = containers;
        this.encryptionKey = encryptionKey;
        this.executionEnvironment = executionEnvironment;
        this.labels = labels;
        this.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
        this.revision = revision;
        this.scaling = scaling;
        this.serviceAccount = serviceAccount;
        this.timeout = timeout;
        this.volumes = volumes;
        this.vpcAccess = vpcAccess;
    }

    /**
     * @return KRM-style annotations for the resource.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return Holds the single container that defines the unit of execution for this Revision.
     * 
     */
    public List<GoogleCloudRunV2ContainerResponse> containers() {
        return this.containers;
    }
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * @return The sandbox environment to host this Revision.
     * 
     */
    public String executionEnvironment() {
        return this.executionEnvironment;
    }
    /**
     * @return KRM-style labels for the resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * 
     */
    public Integer maxInstanceRequestConcurrency() {
        return this.maxInstanceRequestConcurrency;
    }
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    public String revision() {
        return this.revision;
    }
    /**
     * @return Scaling settings for this Revision.
     * 
     */
    public GoogleCloudRunV2RevisionScalingResponse scaling() {
        return this.scaling;
    }
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Max allowed time for an instance to respond to a request.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    public List<GoogleCloudRunV2VolumeResponse> volumes() {
        return this.volumes;
    }
    /**
     * @return VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    public GoogleCloudRunV2VpcAccessResponse vpcAccess() {
        return this.vpcAccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV2RevisionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private List<GoogleCloudRunV2ContainerResponse> containers;
        private String encryptionKey;
        private String executionEnvironment;
        private Map<String,String> labels;
        private Integer maxInstanceRequestConcurrency;
        private String revision;
        private GoogleCloudRunV2RevisionScalingResponse scaling;
        private String serviceAccount;
        private String timeout;
        private List<GoogleCloudRunV2VolumeResponse> volumes;
        private GoogleCloudRunV2VpcAccessResponse vpcAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunV2RevisionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.labels = defaults.labels;
    	      this.maxInstanceRequestConcurrency = defaults.maxInstanceRequestConcurrency;
    	      this.revision = defaults.revision;
    	      this.scaling = defaults.scaling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder containers(List<GoogleCloudRunV2ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(GoogleCloudRunV2ContainerResponse... containers) {
            return containers(List.of(containers));
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public Builder executionEnvironment(String executionEnvironment) {
            this.executionEnvironment = Objects.requireNonNull(executionEnvironment);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder maxInstanceRequestConcurrency(Integer maxInstanceRequestConcurrency) {
            this.maxInstanceRequestConcurrency = Objects.requireNonNull(maxInstanceRequestConcurrency);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder scaling(GoogleCloudRunV2RevisionScalingResponse scaling) {
            this.scaling = Objects.requireNonNull(scaling);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder volumes(List<GoogleCloudRunV2VolumeResponse> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(GoogleCloudRunV2VolumeResponse... volumes) {
            return volumes(List.of(volumes));
        }
        public Builder vpcAccess(GoogleCloudRunV2VpcAccessResponse vpcAccess) {
            this.vpcAccess = Objects.requireNonNull(vpcAccess);
            return this;
        }        public GoogleCloudRunV2RevisionTemplateResponse build() {
            return new GoogleCloudRunV2RevisionTemplateResponse(annotations, containers, encryptionKey, executionEnvironment, labels, maxInstanceRequestConcurrency, revision, scaling, serviceAccount, timeout, volumes, vpcAccess);
        }
    }
}
