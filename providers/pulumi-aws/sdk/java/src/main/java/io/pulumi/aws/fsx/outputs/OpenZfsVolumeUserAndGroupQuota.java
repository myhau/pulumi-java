// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OpenZfsVolumeUserAndGroupQuota {
    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
     */
    private final Integer id;
    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
     */
    private final Integer storageCapacityQuotaGib;
    private final String type;

    @OutputCustomType.Constructor({"id","storageCapacityQuotaGib","type"})
    private OpenZfsVolumeUserAndGroupQuota(
        Integer id,
        Integer storageCapacityQuotaGib,
        String type) {
        this.id = id;
        this.storageCapacityQuotaGib = storageCapacityQuotaGib;
        this.type = type;
    }

    /**
     * - The ID of the user or group. Valid values between `0` and `2147483647`
     * 
    */
    public Integer getId() {
        return this.id;
    }
    /**
     * - The amount of storage that the user or group can use in gibibytes (GiB). Valid values between `0` and `2147483647`
     * 
    */
    public Integer getStorageCapacityQuotaGib() {
        return this.storageCapacityQuotaGib;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeUserAndGroupQuota defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer id;
        private Integer storageCapacityQuotaGib;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeUserAndGroupQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.storageCapacityQuotaGib = defaults.storageCapacityQuotaGib;
    	      this.type = defaults.type;
        }

        public Builder setId(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setStorageCapacityQuotaGib(Integer storageCapacityQuotaGib) {
            this.storageCapacityQuotaGib = Objects.requireNonNull(storageCapacityQuotaGib);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OpenZfsVolumeUserAndGroupQuota build() {
            return new OpenZfsVolumeUserAndGroupQuota(id, storageCapacityQuotaGib, type);
        }
    }
}
