// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainClusterConfigGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsGetArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * IAM policy document specifying the access policies for the domain.
     * 
     */
    @InputImport(name="accessPolicies")
      private final @Nullable Input<String> accessPolicies;

    public Input<String> getAccessPolicies() {
        return this.accessPolicies == null ? Input.empty() : this.accessPolicies;
    }

    @InputImport(name="advancedOptions")
      private final @Nullable Input<Map<String,String>> advancedOptions;

    public Input<Map<String,String>> getAdvancedOptions() {
        return this.advancedOptions == null ? Input.empty() : this.advancedOptions;
    }

    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @InputImport(name="advancedSecurityOptions")
      private final @Nullable Input<DomainAdvancedSecurityOptionsGetArgs> advancedSecurityOptions;

    public Input<DomainAdvancedSecurityOptionsGetArgs> getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions == null ? Input.empty() : this.advancedSecurityOptions;
    }

    /**
     * ARN of the domain.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    @InputImport(name="autoTuneOptions")
      private final @Nullable Input<DomainAutoTuneOptionsGetArgs> autoTuneOptions;

    public Input<DomainAutoTuneOptionsGetArgs> getAutoTuneOptions() {
        return this.autoTuneOptions == null ? Input.empty() : this.autoTuneOptions;
    }

    /**
     * Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    @InputImport(name="clusterConfig")
      private final @Nullable Input<DomainClusterConfigGetArgs> clusterConfig;

    public Input<DomainClusterConfigGetArgs> getClusterConfig() {
        return this.clusterConfig == null ? Input.empty() : this.clusterConfig;
    }

    /**
     * Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    @InputImport(name="cognitoOptions")
      private final @Nullable Input<DomainCognitoOptionsGetArgs> cognitoOptions;

    public Input<DomainCognitoOptionsGetArgs> getCognitoOptions() {
        return this.cognitoOptions == null ? Input.empty() : this.cognitoOptions;
    }

    /**
     * Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    @InputImport(name="domainEndpointOptions")
      private final @Nullable Input<DomainDomainEndpointOptionsGetArgs> domainEndpointOptions;

    public Input<DomainDomainEndpointOptionsGetArgs> getDomainEndpointOptions() {
        return this.domainEndpointOptions == null ? Input.empty() : this.domainEndpointOptions;
    }

    /**
     * Unique identifier for the domain.
     * 
     */
    @InputImport(name="domainId")
      private final @Nullable Input<String> domainId;

    public Input<String> getDomainId() {
        return this.domainId == null ? Input.empty() : this.domainId;
    }

    /**
     * Name of the domain.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    @InputImport(name="ebsOptions")
      private final @Nullable Input<DomainEbsOptionsGetArgs> ebsOptions;

    public Input<DomainEbsOptionsGetArgs> getEbsOptions() {
        return this.ebsOptions == null ? Input.empty() : this.ebsOptions;
    }

    /**
     * Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    @InputImport(name="elasticsearchVersion")
      private final @Nullable Input<String> elasticsearchVersion;

    public Input<String> getElasticsearchVersion() {
        return this.elasticsearchVersion == null ? Input.empty() : this.elasticsearchVersion;
    }

    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * 
     */
    @InputImport(name="encryptAtRest")
      private final @Nullable Input<DomainEncryptAtRestGetArgs> encryptAtRest;

    public Input<DomainEncryptAtRestGetArgs> getEncryptAtRest() {
        return this.encryptAtRest == null ? Input.empty() : this.encryptAtRest;
    }

    /**
     * Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    @InputImport(name="endpoint")
      private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Domain-specific endpoint for kibana without https scheme.
     * 
     */
    @InputImport(name="kibanaEndpoint")
      private final @Nullable Input<String> kibanaEndpoint;

    public Input<String> getKibanaEndpoint() {
        return this.kibanaEndpoint == null ? Input.empty() : this.kibanaEndpoint;
    }

    /**
     * Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    @InputImport(name="logPublishingOptions")
      private final @Nullable Input<List<DomainLogPublishingOptionGetArgs>> logPublishingOptions;

    public Input<List<DomainLogPublishingOptionGetArgs>> getLogPublishingOptions() {
        return this.logPublishingOptions == null ? Input.empty() : this.logPublishingOptions;
    }

    /**
     * Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    @InputImport(name="nodeToNodeEncryption")
      private final @Nullable Input<DomainNodeToNodeEncryptionGetArgs> nodeToNodeEncryption;

    public Input<DomainNodeToNodeEncryptionGetArgs> getNodeToNodeEncryption() {
        return this.nodeToNodeEncryption == null ? Input.empty() : this.nodeToNodeEncryption;
    }

    /**
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    @InputImport(name="snapshotOptions")
      private final @Nullable Input<DomainSnapshotOptionsGetArgs> snapshotOptions;

    public Input<DomainSnapshotOptionsGetArgs> getSnapshotOptions() {
        return this.snapshotOptions == null ? Input.empty() : this.snapshotOptions;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * 
     */
    @InputImport(name="vpcOptions")
      private final @Nullable Input<DomainVpcOptionsGetArgs> vpcOptions;

    public Input<DomainVpcOptionsGetArgs> getVpcOptions() {
        return this.vpcOptions == null ? Input.empty() : this.vpcOptions;
    }

    public DomainState(
        @Nullable Input<String> accessPolicies,
        @Nullable Input<Map<String,String>> advancedOptions,
        @Nullable Input<DomainAdvancedSecurityOptionsGetArgs> advancedSecurityOptions,
        @Nullable Input<String> arn,
        @Nullable Input<DomainAutoTuneOptionsGetArgs> autoTuneOptions,
        @Nullable Input<DomainClusterConfigGetArgs> clusterConfig,
        @Nullable Input<DomainCognitoOptionsGetArgs> cognitoOptions,
        @Nullable Input<DomainDomainEndpointOptionsGetArgs> domainEndpointOptions,
        @Nullable Input<String> domainId,
        @Nullable Input<String> domainName,
        @Nullable Input<DomainEbsOptionsGetArgs> ebsOptions,
        @Nullable Input<String> elasticsearchVersion,
        @Nullable Input<DomainEncryptAtRestGetArgs> encryptAtRest,
        @Nullable Input<String> endpoint,
        @Nullable Input<String> kibanaEndpoint,
        @Nullable Input<List<DomainLogPublishingOptionGetArgs>> logPublishingOptions,
        @Nullable Input<DomainNodeToNodeEncryptionGetArgs> nodeToNodeEncryption,
        @Nullable Input<DomainSnapshotOptionsGetArgs> snapshotOptions,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<DomainVpcOptionsGetArgs> vpcOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.advancedSecurityOptions = advancedSecurityOptions;
        this.arn = arn;
        this.autoTuneOptions = autoTuneOptions;
        this.clusterConfig = clusterConfig;
        this.cognitoOptions = cognitoOptions;
        this.domainEndpointOptions = domainEndpointOptions;
        this.domainId = domainId;
        this.domainName = domainName;
        this.ebsOptions = ebsOptions;
        this.elasticsearchVersion = elasticsearchVersion;
        this.encryptAtRest = encryptAtRest;
        this.endpoint = endpoint;
        this.kibanaEndpoint = kibanaEndpoint;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryption = nodeToNodeEncryption;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcOptions = vpcOptions;
    }

    private DomainState() {
        this.accessPolicies = Input.empty();
        this.advancedOptions = Input.empty();
        this.advancedSecurityOptions = Input.empty();
        this.arn = Input.empty();
        this.autoTuneOptions = Input.empty();
        this.clusterConfig = Input.empty();
        this.cognitoOptions = Input.empty();
        this.domainEndpointOptions = Input.empty();
        this.domainId = Input.empty();
        this.domainName = Input.empty();
        this.ebsOptions = Input.empty();
        this.elasticsearchVersion = Input.empty();
        this.encryptAtRest = Input.empty();
        this.endpoint = Input.empty();
        this.kibanaEndpoint = Input.empty();
        this.logPublishingOptions = Input.empty();
        this.nodeToNodeEncryption = Input.empty();
        this.snapshotOptions = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPolicies;
        private @Nullable Input<Map<String,String>> advancedOptions;
        private @Nullable Input<DomainAdvancedSecurityOptionsGetArgs> advancedSecurityOptions;
        private @Nullable Input<String> arn;
        private @Nullable Input<DomainAutoTuneOptionsGetArgs> autoTuneOptions;
        private @Nullable Input<DomainClusterConfigGetArgs> clusterConfig;
        private @Nullable Input<DomainCognitoOptionsGetArgs> cognitoOptions;
        private @Nullable Input<DomainDomainEndpointOptionsGetArgs> domainEndpointOptions;
        private @Nullable Input<String> domainId;
        private @Nullable Input<String> domainName;
        private @Nullable Input<DomainEbsOptionsGetArgs> ebsOptions;
        private @Nullable Input<String> elasticsearchVersion;
        private @Nullable Input<DomainEncryptAtRestGetArgs> encryptAtRest;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> kibanaEndpoint;
        private @Nullable Input<List<DomainLogPublishingOptionGetArgs>> logPublishingOptions;
        private @Nullable Input<DomainNodeToNodeEncryptionGetArgs> nodeToNodeEncryption;
        private @Nullable Input<DomainSnapshotOptionsGetArgs> snapshotOptions;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<DomainVpcOptionsGetArgs> vpcOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.advancedSecurityOptions = defaults.advancedSecurityOptions;
    	      this.arn = defaults.arn;
    	      this.autoTuneOptions = defaults.autoTuneOptions;
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.domainEndpointOptions = defaults.domainEndpointOptions;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.ebsOptions = defaults.ebsOptions;
    	      this.elasticsearchVersion = defaults.elasticsearchVersion;
    	      this.encryptAtRest = defaults.encryptAtRest;
    	      this.endpoint = defaults.endpoint;
    	      this.kibanaEndpoint = defaults.kibanaEndpoint;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryption = defaults.nodeToNodeEncryption;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcOptions = defaults.vpcOptions;
        }

        public Builder setAccessPolicies(@Nullable Input<String> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAdvancedOptions(@Nullable Input<Map<String,String>> advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }

        public Builder setAdvancedOptions(@Nullable Map<String,String> advancedOptions) {
            this.advancedOptions = Input.ofNullable(advancedOptions);
            return this;
        }

        public Builder setAdvancedSecurityOptions(@Nullable Input<DomainAdvancedSecurityOptionsGetArgs> advancedSecurityOptions) {
            this.advancedSecurityOptions = advancedSecurityOptions;
            return this;
        }

        public Builder setAdvancedSecurityOptions(@Nullable DomainAdvancedSecurityOptionsGetArgs advancedSecurityOptions) {
            this.advancedSecurityOptions = Input.ofNullable(advancedSecurityOptions);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoTuneOptions(@Nullable Input<DomainAutoTuneOptionsGetArgs> autoTuneOptions) {
            this.autoTuneOptions = autoTuneOptions;
            return this;
        }

        public Builder setAutoTuneOptions(@Nullable DomainAutoTuneOptionsGetArgs autoTuneOptions) {
            this.autoTuneOptions = Input.ofNullable(autoTuneOptions);
            return this;
        }

        public Builder setClusterConfig(@Nullable Input<DomainClusterConfigGetArgs> clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }

        public Builder setClusterConfig(@Nullable DomainClusterConfigGetArgs clusterConfig) {
            this.clusterConfig = Input.ofNullable(clusterConfig);
            return this;
        }

        public Builder setCognitoOptions(@Nullable Input<DomainCognitoOptionsGetArgs> cognitoOptions) {
            this.cognitoOptions = cognitoOptions;
            return this;
        }

        public Builder setCognitoOptions(@Nullable DomainCognitoOptionsGetArgs cognitoOptions) {
            this.cognitoOptions = Input.ofNullable(cognitoOptions);
            return this;
        }

        public Builder setDomainEndpointOptions(@Nullable Input<DomainDomainEndpointOptionsGetArgs> domainEndpointOptions) {
            this.domainEndpointOptions = domainEndpointOptions;
            return this;
        }

        public Builder setDomainEndpointOptions(@Nullable DomainDomainEndpointOptionsGetArgs domainEndpointOptions) {
            this.domainEndpointOptions = Input.ofNullable(domainEndpointOptions);
            return this;
        }

        public Builder setDomainId(@Nullable Input<String> domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setDomainId(@Nullable String domainId) {
            this.domainId = Input.ofNullable(domainId);
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setEbsOptions(@Nullable Input<DomainEbsOptionsGetArgs> ebsOptions) {
            this.ebsOptions = ebsOptions;
            return this;
        }

        public Builder setEbsOptions(@Nullable DomainEbsOptionsGetArgs ebsOptions) {
            this.ebsOptions = Input.ofNullable(ebsOptions);
            return this;
        }

        public Builder setElasticsearchVersion(@Nullable Input<String> elasticsearchVersion) {
            this.elasticsearchVersion = elasticsearchVersion;
            return this;
        }

        public Builder setElasticsearchVersion(@Nullable String elasticsearchVersion) {
            this.elasticsearchVersion = Input.ofNullable(elasticsearchVersion);
            return this;
        }

        public Builder setEncryptAtRest(@Nullable Input<DomainEncryptAtRestGetArgs> encryptAtRest) {
            this.encryptAtRest = encryptAtRest;
            return this;
        }

        public Builder setEncryptAtRest(@Nullable DomainEncryptAtRestGetArgs encryptAtRest) {
            this.encryptAtRest = Input.ofNullable(encryptAtRest);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setKibanaEndpoint(@Nullable Input<String> kibanaEndpoint) {
            this.kibanaEndpoint = kibanaEndpoint;
            return this;
        }

        public Builder setKibanaEndpoint(@Nullable String kibanaEndpoint) {
            this.kibanaEndpoint = Input.ofNullable(kibanaEndpoint);
            return this;
        }

        public Builder setLogPublishingOptions(@Nullable Input<List<DomainLogPublishingOptionGetArgs>> logPublishingOptions) {
            this.logPublishingOptions = logPublishingOptions;
            return this;
        }

        public Builder setLogPublishingOptions(@Nullable List<DomainLogPublishingOptionGetArgs> logPublishingOptions) {
            this.logPublishingOptions = Input.ofNullable(logPublishingOptions);
            return this;
        }

        public Builder setNodeToNodeEncryption(@Nullable Input<DomainNodeToNodeEncryptionGetArgs> nodeToNodeEncryption) {
            this.nodeToNodeEncryption = nodeToNodeEncryption;
            return this;
        }

        public Builder setNodeToNodeEncryption(@Nullable DomainNodeToNodeEncryptionGetArgs nodeToNodeEncryption) {
            this.nodeToNodeEncryption = Input.ofNullable(nodeToNodeEncryption);
            return this;
        }

        public Builder setSnapshotOptions(@Nullable Input<DomainSnapshotOptionsGetArgs> snapshotOptions) {
            this.snapshotOptions = snapshotOptions;
            return this;
        }

        public Builder setSnapshotOptions(@Nullable DomainSnapshotOptionsGetArgs snapshotOptions) {
            this.snapshotOptions = Input.ofNullable(snapshotOptions);
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

        public Builder setVpcOptions(@Nullable Input<DomainVpcOptionsGetArgs> vpcOptions) {
            this.vpcOptions = vpcOptions;
            return this;
        }

        public Builder setVpcOptions(@Nullable DomainVpcOptionsGetArgs vpcOptions) {
            this.vpcOptions = Input.ofNullable(vpcOptions);
            return this;
        }
        public DomainState build() {
            return new DomainState(accessPolicies, advancedOptions, advancedSecurityOptions, arn, autoTuneOptions, clusterConfig, cognitoOptions, domainEndpointOptions, domainId, domainName, ebsOptions, elasticsearchVersion, encryptAtRest, endpoint, kibanaEndpoint, logPublishingOptions, nodeToNodeEncryption, snapshotOptions, tags, tagsAll, vpcOptions);
        }
    }
}
