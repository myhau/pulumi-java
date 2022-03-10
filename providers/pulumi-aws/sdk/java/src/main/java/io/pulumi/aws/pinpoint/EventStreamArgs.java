// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EventStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventStreamArgs Empty = new EventStreamArgs();

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId", required=true)
      private final Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    @InputImport(name="destinationStreamArn", required=true)
      private final Input<String> destinationStreamArn;

    public Input<String> getDestinationStreamArn() {
        return this.destinationStreamArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public EventStreamArgs(
        Input<String> applicationId,
        Input<String> destinationStreamArn,
        Input<String> roleArn) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.destinationStreamArn = Objects.requireNonNull(destinationStreamArn, "expected parameter 'destinationStreamArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private EventStreamArgs() {
        this.applicationId = Input.empty();
        this.destinationStreamArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationId;
        private Input<String> destinationStreamArn;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.destinationStreamArn = defaults.destinationStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setApplicationId(Input<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Input.of(Objects.requireNonNull(applicationId));
            return this;
        }

        public Builder setDestinationStreamArn(Input<String> destinationStreamArn) {
            this.destinationStreamArn = Objects.requireNonNull(destinationStreamArn);
            return this;
        }

        public Builder setDestinationStreamArn(String destinationStreamArn) {
            this.destinationStreamArn = Input.of(Objects.requireNonNull(destinationStreamArn));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public EventStreamArgs build() {
            return new EventStreamArgs(applicationId, destinationStreamArn, roleArn);
        }
    }
}