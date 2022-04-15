// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStorageInfoValueResponse {
    /**
     * Access key for the storage account.
     * 
     */
    private final @Nullable String accessKey;
    /**
     * Name of the storage account.
     * 
     */
    private final @Nullable String accountName;
    /**
     * Path to mount the storage within the site's runtime environment.
     * 
     */
    private final @Nullable String mountPath;
    /**
     * Name of the file share (container name, for Blob storage).
     * 
     */
    private final @Nullable String shareName;
    /**
     * State of the storage account.
     * 
     */
    private final String state;
    /**
     * Type of storage.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private AzureStorageInfoValueResponse(
        @CustomType.Parameter("accessKey") @Nullable String accessKey,
        @CustomType.Parameter("accountName") @Nullable String accountName,
        @CustomType.Parameter("mountPath") @Nullable String mountPath,
        @CustomType.Parameter("shareName") @Nullable String shareName,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") @Nullable String type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.mountPath = mountPath;
        this.shareName = shareName;
        this.state = state;
        this.type = type;
    }

    /**
     * Access key for the storage account.
     * 
    */
    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    /**
     * Name of the storage account.
     * 
    */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    /**
     * Path to mount the storage within the site's runtime environment.
     * 
    */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * Name of the file share (container name, for Blob storage).
     * 
    */
    public Optional<String> shareName() {
        return Optional.ofNullable(this.shareName);
    }
    /**
     * State of the storage account.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Type of storage.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageInfoValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String accountName;
        private @Nullable String mountPath;
        private @Nullable String shareName;
        private String state;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageInfoValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.shareName = defaults.shareName;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder shareName(@Nullable String shareName) {
            this.shareName = shareName;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public AzureStorageInfoValueResponse build() {
            return new AzureStorageInfoValueResponse(accessKey, accountName, mountPath, shareName, state, type);
        }
    }
}
