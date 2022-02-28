// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceAttachmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceAttachmentGetArgs Empty = new NetworkInterfaceAttachmentGetArgs();

    @InputImport(name="attachmentId")
      private final @Nullable Input<String> attachmentId;

    public Input<String> getAttachmentId() {
        return this.attachmentId == null ? Input.empty() : this.attachmentId;
    }

    /**
     * Integer to define the devices index.
     * 
     */
    @InputImport(name="deviceIndex", required=true)
      private final Input<Integer> deviceIndex;

    public Input<Integer> getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * ID of the instance to attach to.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    public NetworkInterfaceAttachmentGetArgs(
        @Nullable Input<String> attachmentId,
        Input<Integer> deviceIndex,
        Input<String> instance) {
        this.attachmentId = attachmentId;
        this.deviceIndex = Objects.requireNonNull(deviceIndex, "expected parameter 'deviceIndex' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
    }

    private NetworkInterfaceAttachmentGetArgs() {
        this.attachmentId = Input.empty();
        this.deviceIndex = Input.empty();
        this.instance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceAttachmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachmentId;
        private Input<Integer> deviceIndex;
        private Input<String> instance;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceAttachmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.instance = defaults.instance;
        }

        public Builder setAttachmentId(@Nullable Input<String> attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }

        public Builder setAttachmentId(@Nullable String attachmentId) {
            this.attachmentId = Input.ofNullable(attachmentId);
            return this;
        }

        public Builder setDeviceIndex(Input<Integer> deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }

        public Builder setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = Input.of(Objects.requireNonNull(deviceIndex));
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }
        public NetworkInterfaceAttachmentGetArgs build() {
            return new NetworkInterfaceAttachmentGetArgs(attachmentId, deviceIndex, instance);
        }
    }
}
