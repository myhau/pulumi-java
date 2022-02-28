// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceAttachmentState Empty = new NetworkInterfaceAttachmentState();

    /**
     * The ENI Attachment ID.
     * 
     */
    @InputImport(name="attachmentId")
      private final @Nullable Input<String> attachmentId;

    public Input<String> getAttachmentId() {
        return this.attachmentId == null ? Input.empty() : this.attachmentId;
    }

    /**
     * Network interface index (int).
     * 
     */
    @InputImport(name="deviceIndex")
      private final @Nullable Input<Integer> deviceIndex;

    public Input<Integer> getDeviceIndex() {
        return this.deviceIndex == null ? Input.empty() : this.deviceIndex;
    }

    /**
     * Instance ID to attach.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * ENI ID to attach.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * The status of the Network Interface Attachment.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public NetworkInterfaceAttachmentState(
        @Nullable Input<String> attachmentId,
        @Nullable Input<Integer> deviceIndex,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<String> status) {
        this.attachmentId = attachmentId;
        this.deviceIndex = deviceIndex;
        this.instanceId = instanceId;
        this.networkInterfaceId = networkInterfaceId;
        this.status = status;
    }

    private NetworkInterfaceAttachmentState() {
        this.attachmentId = Input.empty();
        this.deviceIndex = Input.empty();
        this.instanceId = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachmentId;
        private @Nullable Input<Integer> deviceIndex;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.instanceId = defaults.instanceId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.status = defaults.status;
        }

        public Builder setAttachmentId(@Nullable Input<String> attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }

        public Builder setAttachmentId(@Nullable String attachmentId) {
            this.attachmentId = Input.ofNullable(attachmentId);
            return this;
        }

        public Builder setDeviceIndex(@Nullable Input<Integer> deviceIndex) {
            this.deviceIndex = deviceIndex;
            return this;
        }

        public Builder setDeviceIndex(@Nullable Integer deviceIndex) {
            this.deviceIndex = Input.ofNullable(deviceIndex);
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public NetworkInterfaceAttachmentState build() {
            return new NetworkInterfaceAttachmentState(attachmentId, deviceIndex, instanceId, networkInterfaceId, status);
        }
    }
}
