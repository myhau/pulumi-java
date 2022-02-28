// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class OpenZfsVolumeUserAndGroupQuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsVolumeUserAndGroupQuotaArgs Empty = new OpenZfsVolumeUserAndGroupQuotaArgs();

    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<Integer> id;

    public Input<Integer> getId() {
        return this.id;
    }

    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    @InputImport(name="storageCapacityQuotaGib", required=true)
      private final Input<Integer> storageCapacityQuotaGib;

    public Input<Integer> getStorageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }

    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public OpenZfsVolumeUserAndGroupQuotaArgs(
        Input<Integer> id,
        Input<Integer> storageCapacityQuotaGib,
        Input<String> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib, "expected parameter 'storageCapacityQuotaGib' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OpenZfsVolumeUserAndGroupQuotaArgs() {
        this.id = Input.empty();
        this.storageCapacityQuotaGib = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeUserAndGroupQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> id;
        private Input<Integer> storageCapacityQuotaGib;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeUserAndGroupQuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storageCapacityQuotaGib = defaults.storageCapacityQuotaGib;
    	      this.type = defaults.type;
        }

        public Builder setId(Input<Integer> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(Integer id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setStorageCapacityQuotaGib(Input<Integer> storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib);
            return this;
        }

        public Builder setStorageCapacityQuotaGib(Integer storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Input.of(Objects.requireNonNull(storageCapacityQuotaGib));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public OpenZfsVolumeUserAndGroupQuotaArgs build() {
            return new OpenZfsVolumeUserAndGroupQuotaArgs(id, storageCapacityQuotaGib, type);
        }
    }
}
