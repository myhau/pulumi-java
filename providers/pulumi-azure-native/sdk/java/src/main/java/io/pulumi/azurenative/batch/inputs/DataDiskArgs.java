// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.CachingType;
import io.pulumi.azurenative.batch.enums.StorageAccountType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataDiskArgs Empty = new DataDiskArgs();

    @InputImport(name="caching")
    private final @Nullable Input<CachingType> caching;

    public Input<CachingType> getCaching() {
        return this.caching == null ? Input.empty() : this.caching;
    }

    @InputImport(name="diskSizeGB", required=true)
    private final Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB;
    }

    @InputImport(name="lun", required=true)
    private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    @InputImport(name="storageAccountType")
    private final @Nullable Input<StorageAccountType> storageAccountType;

    public Input<StorageAccountType> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    public DataDiskArgs(
        @Nullable Input<CachingType> caching,
        Input<Integer> diskSizeGB,
        Input<Integer> lun,
        @Nullable Input<StorageAccountType> storageAccountType) {
        this.caching = caching;
        this.diskSizeGB = Objects.requireNonNull(diskSizeGB, "expected parameter 'diskSizeGB' to be non-null");
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.storageAccountType = storageAccountType;
    }

    private DataDiskArgs() {
        this.caching = Input.empty();
        this.diskSizeGB = Input.empty();
        this.lun = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CachingType> caching;
        private Input<Integer> diskSizeGB;
        private Input<Integer> lun;
        private @Nullable Input<StorageAccountType> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setCaching(@Nullable Input<CachingType> caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCaching(@Nullable CachingType caching) {
            this.caching = Input.ofNullable(caching);
            return this;
        }

        public Builder setDiskSizeGB(Input<Integer> diskSizeGB) {
            this.diskSizeGB = Objects.requireNonNull(diskSizeGB);
            return this;
        }

        public Builder setDiskSizeGB(Integer diskSizeGB) {
            this.diskSizeGB = Input.of(Objects.requireNonNull(diskSizeGB));
            return this;
        }

        public Builder setLun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<StorageAccountType> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable StorageAccountType storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public DataDiskArgs build() {
            return new DataDiskArgs(caching, diskSizeGB, lun, storageAccountType);
        }
    }
}