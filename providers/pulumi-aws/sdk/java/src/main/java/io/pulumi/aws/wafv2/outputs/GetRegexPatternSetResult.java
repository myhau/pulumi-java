// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.GetRegexPatternSetRegularExpression;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegexPatternSetResult {
    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
     */
    private final String arn;
    /**
     * The description of the set that helps with identification.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
     * 
     */
    private final List<GetRegexPatternSetRegularExpression> regularExpressions;
    private final String scope;

    @OutputCustomType.Constructor({"arn","description","id","name","regularExpressions","scope"})
    private GetRegexPatternSetResult(
        String arn,
        String description,
        String id,
        String name,
        List<GetRegexPatternSetRegularExpression> regularExpressions,
        String scope) {
        this.arn = Objects.requireNonNull(arn);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.regularExpressions = Objects.requireNonNull(regularExpressions);
        this.scope = Objects.requireNonNull(scope);
    }

    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The description of the set that helps with identification.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
     * 
     */
    public List<GetRegexPatternSetRegularExpression> getRegularExpressions() {
        return this.regularExpressions;
    }
    public String getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegexPatternSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private List<GetRegexPatternSetRegularExpression> regularExpressions;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegexPatternSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.regularExpressions = defaults.regularExpressions;
    	      this.scope = defaults.scope;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegularExpressions(List<GetRegexPatternSetRegularExpression> regularExpressions) {
            this.regularExpressions = Objects.requireNonNull(regularExpressions);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetRegexPatternSetResult build() {
            return new GetRegexPatternSetResult(arn, description, id, name, regularExpressions, scope);
        }
    }
}
