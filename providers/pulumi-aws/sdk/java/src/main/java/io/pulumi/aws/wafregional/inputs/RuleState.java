// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RulePredicateGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleState extends io.pulumi.resources.ResourceArgs {

    public static final RuleState Empty = new RuleState();

    /**
     * The ARN of the WAF Regional Rule.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @InputImport(name="metricName")
      private final @Nullable Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName == null ? Input.empty() : this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @InputImport(name="predicates")
      private final @Nullable Input<List<RulePredicateGetArgs>> predicates;

    public Input<List<RulePredicateGetArgs>> getPredicates() {
        return this.predicates == null ? Input.empty() : this.predicates;
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public RuleState(
        @Nullable Input<String> arn,
        @Nullable Input<String> metricName,
        @Nullable Input<String> name,
        @Nullable Input<List<RulePredicateGetArgs>> predicates,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.metricName = metricName;
        this.name = name;
        this.predicates = predicates;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RuleState() {
        this.arn = Input.empty();
        this.metricName = Input.empty();
        this.name = Input.empty();
        this.predicates = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> metricName;
        private @Nullable Input<String> name;
        private @Nullable Input<List<RulePredicateGetArgs>> predicates;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
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

        public Builder setMetricName(@Nullable Input<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder setMetricName(@Nullable String metricName) {
            this.metricName = Input.ofNullable(metricName);
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

        public Builder setPredicates(@Nullable Input<List<RulePredicateGetArgs>> predicates) {
            this.predicates = predicates;
            return this;
        }

        public Builder setPredicates(@Nullable List<RulePredicateGetArgs> predicates) {
            this.predicates = Input.ofNullable(predicates);
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
        public RuleState build() {
            return new RuleState(arn, metricName, name, predicates, tags, tagsAll);
        }
    }
}
