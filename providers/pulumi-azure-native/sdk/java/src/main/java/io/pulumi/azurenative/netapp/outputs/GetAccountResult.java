// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.AccountEncryptionResponse;
import io.pulumi.azurenative.netapp.outputs.ActiveDirectoryResponse;
import io.pulumi.azurenative.netapp.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountResult {
    /**
     * Active Directories
     * 
     */
    private final @Nullable List<ActiveDirectoryResponse> activeDirectories;
    /**
     * Encryption settings
     * 
     */
    private final @Nullable AccountEncryptionResponse encryption;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"activeDirectories","encryption","id","location","name","provisioningState","systemData","tags","type"})
    private GetAccountResult(
        @Nullable List<ActiveDirectoryResponse> activeDirectories,
        @Nullable AccountEncryptionResponse encryption,
        String id,
        String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.activeDirectories = activeDirectories;
        this.encryption = encryption;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Active Directories
     * 
    */
    public List<ActiveDirectoryResponse> getActiveDirectories() {
        return this.activeDirectories == null ? List.of() : this.activeDirectories;
    }
    /**
     * Encryption settings
     * 
    */
    public Optional<AccountEncryptionResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActiveDirectoryResponse> activeDirectories;
        private @Nullable AccountEncryptionResponse encryption;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectories = defaults.activeDirectories;
    	      this.encryption = defaults.encryption;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setActiveDirectories(@Nullable List<ActiveDirectoryResponse> activeDirectories) {
            this.activeDirectories = activeDirectories;
            return this;
        }

        public Builder setEncryption(@Nullable AccountEncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(activeDirectories, encryption, id, location, name, provisioningState, systemData, tags, type);
        }
    }
}
