// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagementLockAtResourceLevelResult {
    /**
     * The resource ID of the lock.
     * 
     */
    private final String id;
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    private final String level;
    /**
     * The name of the lock.
     * 
     */
    private final String name;
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    private final @Nullable String notes;
    /**
     * The owners of the lock.
     * 
     */
    private final @Nullable List<ManagementLockOwnerResponse> owners;
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","level","name","notes","owners","type"})
    private GetManagementLockAtResourceLevelResult(
        String id,
        String level,
        String name,
        @Nullable String notes,
        @Nullable List<ManagementLockOwnerResponse> owners,
        String type) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.notes = notes;
        this.owners = owners;
        this.type = type;
    }

    /**
     * The resource ID of the lock.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
    */
    public String getLevel() {
        return this.level;
    }
    /**
     * The name of the lock.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
    */
    public Optional<String> getNotes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * The owners of the lock.
     * 
    */
    public List<ManagementLockOwnerResponse> getOwners() {
        return this.owners == null ? List.of() : this.owners;
    }
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementLockAtResourceLevelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String level;
        private String name;
        private @Nullable String notes;
        private @Nullable List<ManagementLockOwnerResponse> owners;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementLockAtResourceLevelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.level = defaults.level;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.owners = defaults.owners;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder setOwners(@Nullable List<ManagementLockOwnerResponse> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetManagementLockAtResourceLevelResult build() {
            return new GetManagementLockAtResourceLevelResult(id, level, name, notes, owners, type);
        }
    }
}
