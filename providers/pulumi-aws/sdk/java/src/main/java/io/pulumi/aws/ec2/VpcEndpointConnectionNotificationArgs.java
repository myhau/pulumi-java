// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointConnectionNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointConnectionNotificationArgs Empty = new VpcEndpointConnectionNotificationArgs();

    /**
     * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     */
    @InputImport(name="connectionEvents", required=true)
      private final Input<List<String>> connectionEvents;

    public Input<List<String>> getConnectionEvents() {
        return this.connectionEvents;
    }

    /**
     * The ARN of the SNS topic for the notifications.
     * 
     */
    @InputImport(name="connectionNotificationArn", required=true)
      private final Input<String> connectionNotificationArn;

    public Input<String> getConnectionNotificationArn() {
        return this.connectionNotificationArn;
    }

    /**
     * The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    @InputImport(name="vpcEndpointId")
      private final @Nullable Input<String> vpcEndpointId;

    public Input<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Input.empty() : this.vpcEndpointId;
    }

    /**
     * The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    @InputImport(name="vpcEndpointServiceId")
      private final @Nullable Input<String> vpcEndpointServiceId;

    public Input<String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId == null ? Input.empty() : this.vpcEndpointServiceId;
    }

    public VpcEndpointConnectionNotificationArgs(
        Input<List<String>> connectionEvents,
        Input<String> connectionNotificationArn,
        @Nullable Input<String> vpcEndpointId,
        @Nullable Input<String> vpcEndpointServiceId) {
        this.connectionEvents = Objects.requireNonNull(connectionEvents, "expected parameter 'connectionEvents' to be non-null");
        this.connectionNotificationArn = Objects.requireNonNull(connectionNotificationArn, "expected parameter 'connectionNotificationArn' to be non-null");
        this.vpcEndpointId = vpcEndpointId;
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    private VpcEndpointConnectionNotificationArgs() {
        this.connectionEvents = Input.empty();
        this.connectionNotificationArn = Input.empty();
        this.vpcEndpointId = Input.empty();
        this.vpcEndpointServiceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointConnectionNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> connectionEvents;
        private Input<String> connectionNotificationArn;
        private @Nullable Input<String> vpcEndpointId;
        private @Nullable Input<String> vpcEndpointServiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointConnectionNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionEvents = defaults.connectionEvents;
    	      this.connectionNotificationArn = defaults.connectionNotificationArn;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcEndpointServiceId = defaults.vpcEndpointServiceId;
        }

        public Builder setConnectionEvents(Input<List<String>> connectionEvents) {
            this.connectionEvents = Objects.requireNonNull(connectionEvents);
            return this;
        }

        public Builder setConnectionEvents(List<String> connectionEvents) {
            this.connectionEvents = Input.of(Objects.requireNonNull(connectionEvents));
            return this;
        }

        public Builder setConnectionNotificationArn(Input<String> connectionNotificationArn) {
            this.connectionNotificationArn = Objects.requireNonNull(connectionNotificationArn);
            return this;
        }

        public Builder setConnectionNotificationArn(String connectionNotificationArn) {
            this.connectionNotificationArn = Input.of(Objects.requireNonNull(connectionNotificationArn));
            return this;
        }

        public Builder setVpcEndpointId(@Nullable Input<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder setVpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Input.ofNullable(vpcEndpointId);
            return this;
        }

        public Builder setVpcEndpointServiceId(@Nullable Input<String> vpcEndpointServiceId) {
            this.vpcEndpointServiceId = vpcEndpointServiceId;
            return this;
        }

        public Builder setVpcEndpointServiceId(@Nullable String vpcEndpointServiceId) {
            this.vpcEndpointServiceId = Input.ofNullable(vpcEndpointServiceId);
            return this;
        }
        public VpcEndpointConnectionNotificationArgs build() {
            return new VpcEndpointConnectionNotificationArgs(connectionEvents, connectionNotificationArn, vpcEndpointId, vpcEndpointServiceId);
        }
    }
}