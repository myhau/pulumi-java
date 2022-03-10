// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.aws.route53.inputs.ResolverRuleTargetIpGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleState Empty = new ResolverRuleState();

    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @InputImport(name="resolverEndpointId")
      private final @Nullable Input<String> resolverEndpointId;

    public Input<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Input.empty() : this.resolverEndpointId;
    }

    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @InputImport(name="ruleType")
      private final @Nullable Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType == null ? Input.empty() : this.ruleType;
    }

    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @InputImport(name="shareStatus")
      private final @Nullable Input<String> shareStatus;

    public Input<String> getShareStatus() {
        return this.shareStatus == null ? Input.empty() : this.shareStatus;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @InputImport(name="targetIps")
      private final @Nullable Input<List<ResolverRuleTargetIpGetArgs>> targetIps;

    public Input<List<ResolverRuleTargetIpGetArgs>> getTargetIps() {
        return this.targetIps == null ? Input.empty() : this.targetIps;
    }

    public ResolverRuleState(
        @Nullable Input<String> arn,
        @Nullable Input<String> domainName,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> resolverEndpointId,
        @Nullable Input<String> ruleType,
        @Nullable Input<String> shareStatus,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<ResolverRuleTargetIpGetArgs>> targetIps) {
        this.arn = arn;
        this.domainName = domainName;
        this.name = name;
        this.ownerId = ownerId;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = ruleType;
        this.shareStatus = shareStatus;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetIps = targetIps;
    }

    private ResolverRuleState() {
        this.arn = Input.empty();
        this.domainName = Input.empty();
        this.name = Input.empty();
        this.ownerId = Input.empty();
        this.resolverEndpointId = Input.empty();
        this.ruleType = Input.empty();
        this.shareStatus = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.targetIps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> resolverEndpointId;
        private @Nullable Input<String> ruleType;
        private @Nullable Input<String> shareStatus;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<ResolverRuleTargetIpGetArgs>> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.ruleType = defaults.ruleType;
    	      this.shareStatus = defaults.shareStatus;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setResolverEndpointId(@Nullable Input<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public Builder setResolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Input.ofNullable(resolverEndpointId);
            return this;
        }

        public Builder setRuleType(@Nullable Input<String> ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public Builder setRuleType(@Nullable String ruleType) {
            this.ruleType = Input.ofNullable(ruleType);
            return this;
        }

        public Builder setShareStatus(@Nullable Input<String> shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        public Builder setShareStatus(@Nullable String shareStatus) {
            this.shareStatus = Input.ofNullable(shareStatus);
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

        public Builder setTargetIps(@Nullable Input<List<ResolverRuleTargetIpGetArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }

        public Builder setTargetIps(@Nullable List<ResolverRuleTargetIpGetArgs> targetIps) {
            this.targetIps = Input.ofNullable(targetIps);
            return this;
        }
        public ResolverRuleState build() {
            return new ResolverRuleState(arn, domainName, name, ownerId, resolverEndpointId, ruleType, shareStatus, tags, tagsAll, targetIps);
        }
    }
}