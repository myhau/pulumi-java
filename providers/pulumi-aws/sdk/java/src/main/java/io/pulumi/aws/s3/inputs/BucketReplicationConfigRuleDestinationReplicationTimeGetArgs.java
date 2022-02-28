// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationReplicationTimeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationReplicationTimeGetArgs Empty = new BucketReplicationConfigRuleDestinationReplicationTimeGetArgs();

    /**
     * The status of the Replication Time Control. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    /**
     * A configuration block specifying the time by which replication should be complete for all objects and operations on objects documented below.
     * 
     */
    @InputImport(name="time", required=true)
      private final Input<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time;

    public Input<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> getTime() {
        return this.time;
    }

    public BucketReplicationConfigRuleDestinationReplicationTimeGetArgs(
        Input<String> status,
        Input<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationReplicationTimeGetArgs() {
        this.status = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> status;
        private Input<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationReplicationTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.time = defaults.time;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }

        public Builder setTime(Input<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }

        public Builder setTime(BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs time) {
            this.time = Input.of(Objects.requireNonNull(time));
            return this;
        }
        public BucketReplicationConfigRuleDestinationReplicationTimeGetArgs build() {
            return new BucketReplicationConfigRuleDestinationReplicationTimeGetArgs(status, time);
        }
    }
}
