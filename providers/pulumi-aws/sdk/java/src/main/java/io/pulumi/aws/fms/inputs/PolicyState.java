// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fms.inputs;

import io.pulumi.aws.fms.inputs.PolicyExcludeMapGetArgs;
import io.pulumi.aws.fms.inputs.PolicyIncludeMapGetArgs;
import io.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * If true, the request will also perform a clean-up process. Defaults to `true`. More information can be found here [AWS Firewall Manager delete policy](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_DeletePolicy.html)
     * 
     */
    @InputImport(name="deleteAllPolicyResources")
      private final @Nullable Input<Boolean> deleteAllPolicyResources;

    public Input<Boolean> getDeleteAllPolicyResources() {
        return this.deleteAllPolicyResources == null ? Input.empty() : this.deleteAllPolicyResources;
    }

    /**
     * A map of lists of accounts and OU's to exclude from the policy.
     * 
     */
    @InputImport(name="excludeMap")
      private final @Nullable Input<PolicyExcludeMapGetArgs> excludeMap;

    public Input<PolicyExcludeMapGetArgs> getExcludeMap() {
        return this.excludeMap == null ? Input.empty() : this.excludeMap;
    }

    /**
     * A boolean value, if true the tags that are specified in the `resource_tags` are not protected by this policy. If set to false and resource_tags are populated, resources that contain tags will be protected by this policy.
     * 
     */
    @InputImport(name="excludeResourceTags")
      private final @Nullable Input<Boolean> excludeResourceTags;

    public Input<Boolean> getExcludeResourceTags() {
        return this.excludeResourceTags == null ? Input.empty() : this.excludeResourceTags;
    }

    /**
     * A map of lists of accounts and OU's to include in the policy.
     * 
     */
    @InputImport(name="includeMap")
      private final @Nullable Input<PolicyIncludeMapGetArgs> includeMap;

    public Input<PolicyIncludeMapGetArgs> getIncludeMap() {
        return this.includeMap == null ? Input.empty() : this.includeMap;
    }

    /**
     * The friendly name of the AWS Firewall Manager Policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A unique identifier for each update to the policy.
     * 
     */
    @InputImport(name="policyUpdateToken")
      private final @Nullable Input<String> policyUpdateToken;

    public Input<String> getPolicyUpdateToken() {
        return this.policyUpdateToken == null ? Input.empty() : this.policyUpdateToken;
    }

    /**
     * A boolean value, indicates if the policy should automatically applied to resources that already exist in the account.
     * 
     */
    @InputImport(name="remediationEnabled")
      private final @Nullable Input<Boolean> remediationEnabled;

    public Input<Boolean> getRemediationEnabled() {
        return this.remediationEnabled == null ? Input.empty() : this.remediationEnabled;
    }

    /**
     * A map of resource tags, that if present will filter protections on resources based on the exclude_resource_tags.
     * 
     */
    @InputImport(name="resourceTags")
      private final @Nullable Input<Map<String,String>> resourceTags;

    public Input<Map<String,String>> getResourceTags() {
        return this.resourceTags == null ? Input.empty() : this.resourceTags;
    }

    /**
     * A resource type to protect. Conflicts with `resource_type_list`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    /**
     * A list of resource types to protect. Conflicts with `resource_type`. See the [FMS API Reference](https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_Policy.html#fms-Type-Policy-ResourceType) for more information about supported values.
     * 
     */
    @InputImport(name="resourceTypeLists")
      private final @Nullable Input<List<String>> resourceTypeLists;

    public Input<List<String>> getResourceTypeLists() {
        return this.resourceTypeLists == null ? Input.empty() : this.resourceTypeLists;
    }

    /**
     * The objects to include in Security Service Policy Data. Documented below.
     * 
     */
    @InputImport(name="securityServicePolicyData")
      private final @Nullable Input<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData;

    public Input<PolicySecurityServicePolicyDataGetArgs> getSecurityServicePolicyData() {
        return this.securityServicePolicyData == null ? Input.empty() : this.securityServicePolicyData;
    }

    public PolicyState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> deleteAllPolicyResources,
        @Nullable Input<PolicyExcludeMapGetArgs> excludeMap,
        @Nullable Input<Boolean> excludeResourceTags,
        @Nullable Input<PolicyIncludeMapGetArgs> includeMap,
        @Nullable Input<String> name,
        @Nullable Input<String> policyUpdateToken,
        @Nullable Input<Boolean> remediationEnabled,
        @Nullable Input<Map<String,String>> resourceTags,
        @Nullable Input<String> resourceType,
        @Nullable Input<List<String>> resourceTypeLists,
        @Nullable Input<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData) {
        this.arn = arn;
        this.deleteAllPolicyResources = deleteAllPolicyResources;
        this.excludeMap = excludeMap;
        this.excludeResourceTags = excludeResourceTags;
        this.includeMap = includeMap;
        this.name = name;
        this.policyUpdateToken = policyUpdateToken;
        this.remediationEnabled = remediationEnabled;
        this.resourceTags = resourceTags;
        this.resourceType = resourceType;
        this.resourceTypeLists = resourceTypeLists;
        this.securityServicePolicyData = securityServicePolicyData;
    }

    private PolicyState() {
        this.arn = Input.empty();
        this.deleteAllPolicyResources = Input.empty();
        this.excludeMap = Input.empty();
        this.excludeResourceTags = Input.empty();
        this.includeMap = Input.empty();
        this.name = Input.empty();
        this.policyUpdateToken = Input.empty();
        this.remediationEnabled = Input.empty();
        this.resourceTags = Input.empty();
        this.resourceType = Input.empty();
        this.resourceTypeLists = Input.empty();
        this.securityServicePolicyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> deleteAllPolicyResources;
        private @Nullable Input<PolicyExcludeMapGetArgs> excludeMap;
        private @Nullable Input<Boolean> excludeResourceTags;
        private @Nullable Input<PolicyIncludeMapGetArgs> includeMap;
        private @Nullable Input<String> name;
        private @Nullable Input<String> policyUpdateToken;
        private @Nullable Input<Boolean> remediationEnabled;
        private @Nullable Input<Map<String,String>> resourceTags;
        private @Nullable Input<String> resourceType;
        private @Nullable Input<List<String>> resourceTypeLists;
        private @Nullable Input<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deleteAllPolicyResources = defaults.deleteAllPolicyResources;
    	      this.excludeMap = defaults.excludeMap;
    	      this.excludeResourceTags = defaults.excludeResourceTags;
    	      this.includeMap = defaults.includeMap;
    	      this.name = defaults.name;
    	      this.policyUpdateToken = defaults.policyUpdateToken;
    	      this.remediationEnabled = defaults.remediationEnabled;
    	      this.resourceTags = defaults.resourceTags;
    	      this.resourceType = defaults.resourceType;
    	      this.resourceTypeLists = defaults.resourceTypeLists;
    	      this.securityServicePolicyData = defaults.securityServicePolicyData;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDeleteAllPolicyResources(@Nullable Input<Boolean> deleteAllPolicyResources) {
            this.deleteAllPolicyResources = deleteAllPolicyResources;
            return this;
        }

        public Builder setDeleteAllPolicyResources(@Nullable Boolean deleteAllPolicyResources) {
            this.deleteAllPolicyResources = Input.ofNullable(deleteAllPolicyResources);
            return this;
        }

        public Builder setExcludeMap(@Nullable Input<PolicyExcludeMapGetArgs> excludeMap) {
            this.excludeMap = excludeMap;
            return this;
        }

        public Builder setExcludeMap(@Nullable PolicyExcludeMapGetArgs excludeMap) {
            this.excludeMap = Input.ofNullable(excludeMap);
            return this;
        }

        public Builder setExcludeResourceTags(@Nullable Input<Boolean> excludeResourceTags) {
            this.excludeResourceTags = excludeResourceTags;
            return this;
        }

        public Builder setExcludeResourceTags(@Nullable Boolean excludeResourceTags) {
            this.excludeResourceTags = Input.ofNullable(excludeResourceTags);
            return this;
        }

        public Builder setIncludeMap(@Nullable Input<PolicyIncludeMapGetArgs> includeMap) {
            this.includeMap = includeMap;
            return this;
        }

        public Builder setIncludeMap(@Nullable PolicyIncludeMapGetArgs includeMap) {
            this.includeMap = Input.ofNullable(includeMap);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicyUpdateToken(@Nullable Input<String> policyUpdateToken) {
            this.policyUpdateToken = policyUpdateToken;
            return this;
        }

        public Builder setPolicyUpdateToken(@Nullable String policyUpdateToken) {
            this.policyUpdateToken = Input.ofNullable(policyUpdateToken);
            return this;
        }

        public Builder setRemediationEnabled(@Nullable Input<Boolean> remediationEnabled) {
            this.remediationEnabled = remediationEnabled;
            return this;
        }

        public Builder setRemediationEnabled(@Nullable Boolean remediationEnabled) {
            this.remediationEnabled = Input.ofNullable(remediationEnabled);
            return this;
        }

        public Builder setResourceTags(@Nullable Input<Map<String,String>> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder setResourceTags(@Nullable Map<String,String> resourceTags) {
            this.resourceTags = Input.ofNullable(resourceTags);
            return this;
        }

        public Builder setResourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public Builder setResourceTypeLists(@Nullable Input<List<String>> resourceTypeLists) {
            this.resourceTypeLists = resourceTypeLists;
            return this;
        }

        public Builder setResourceTypeLists(@Nullable List<String> resourceTypeLists) {
            this.resourceTypeLists = Input.ofNullable(resourceTypeLists);
            return this;
        }

        public Builder setSecurityServicePolicyData(@Nullable Input<PolicySecurityServicePolicyDataGetArgs> securityServicePolicyData) {
            this.securityServicePolicyData = securityServicePolicyData;
            return this;
        }

        public Builder setSecurityServicePolicyData(@Nullable PolicySecurityServicePolicyDataGetArgs securityServicePolicyData) {
            this.securityServicePolicyData = Input.ofNullable(securityServicePolicyData);
            return this;
        }
        public PolicyState build() {
            return new PolicyState(arn, deleteAllPolicyResources, excludeMap, excludeResourceTags, includeMap, name, policyUpdateToken, remediationEnabled, resourceTags, resourceType, resourceTypeLists, securityServicePolicyData);
        }
    }
}
