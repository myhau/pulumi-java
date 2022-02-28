// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketReplicationConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationGetArgs Empty = new BucketReplicationConfigurationGetArgs();

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Specifies the rules managing the replication (documented below).
     * 
     */
    @InputImport(name="rules", required=true)
      private final Input<List<BucketReplicationConfigurationRuleGetArgs>> rules;

    public Input<List<BucketReplicationConfigurationRuleGetArgs>> getRules() {
        return this.rules;
    }

    public BucketReplicationConfigurationGetArgs(
        Input<String> role,
        Input<List<BucketReplicationConfigurationRuleGetArgs>> rules) {
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketReplicationConfigurationGetArgs() {
        this.role = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> role;
        private Input<List<BucketReplicationConfigurationRuleGetArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setRules(Input<List<BucketReplicationConfigurationRuleGetArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<BucketReplicationConfigurationRuleGetArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }
        public BucketReplicationConfigurationGetArgs build() {
            return new BucketReplicationConfigurationGetArgs(role, rules);
        }
    }
}
