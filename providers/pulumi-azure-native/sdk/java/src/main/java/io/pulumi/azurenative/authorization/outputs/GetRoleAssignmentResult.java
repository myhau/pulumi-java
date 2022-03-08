// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRoleAssignmentResult {
    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'
     * 
     */
    private final @Nullable String condition;
    /**
     * Version of the condition. Currently accepted value is '2.0'
     * 
     */
    private final @Nullable String conditionVersion;
    /**
     * Id of the user who created the assignment
     * 
     */
    private final String createdBy;
    /**
     * Time it was created
     * 
     */
    private final String createdOn;
    /**
     * Id of the delegated managed identity resource
     * 
     */
    private final @Nullable String delegatedManagedIdentityResourceId;
    /**
     * Description of role assignment
     * 
     */
    private final @Nullable String description;
    /**
     * The role assignment ID.
     * 
     */
    private final String id;
    /**
     * The role assignment name.
     * 
     */
    private final String name;
    /**
     * The principal ID.
     * 
     */
    private final String principalId;
    /**
     * The principal type of the assigned principal ID.
     * 
     */
    private final @Nullable String principalType;
    /**
     * The role definition ID.
     * 
     */
    private final String roleDefinitionId;
    /**
     * The role assignment scope.
     * 
     */
    private final String scope;
    /**
     * The role assignment type.
     * 
     */
    private final String type;
    /**
     * Id of the user who updated the assignment
     * 
     */
    private final String updatedBy;
    /**
     * Time it was updated
     * 
     */
    private final String updatedOn;

    @OutputCustomType.Constructor({"condition","conditionVersion","createdBy","createdOn","delegatedManagedIdentityResourceId","description","id","name","principalId","principalType","roleDefinitionId","scope","type","updatedBy","updatedOn"})
    private GetRoleAssignmentResult(
        @Nullable String condition,
        @Nullable String conditionVersion,
        String createdBy,
        String createdOn,
        @Nullable String delegatedManagedIdentityResourceId,
        @Nullable String description,
        String id,
        String name,
        String principalId,
        @Nullable String principalType,
        String roleDefinitionId,
        String scope,
        String type,
        String updatedBy,
        String updatedOn) {
        this.condition = condition;
        this.conditionVersion = conditionVersion;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
        this.description = description;
        this.id = id;
        this.name = name;
        this.principalId = principalId;
        this.principalType = principalType;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = type;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    /**
     * The conditions on the role assignment. This limits the resources it can be assigned to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'
     * 
    */
    public Optional<String> getCondition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * Version of the condition. Currently accepted value is '2.0'
     * 
    */
    public Optional<String> getConditionVersion() {
        return Optional.ofNullable(this.conditionVersion);
    }
    /**
     * Id of the user who created the assignment
     * 
    */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Time it was created
     * 
    */
    public String getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Id of the delegated managed identity resource
     * 
    */
    public Optional<String> getDelegatedManagedIdentityResourceId() {
        return Optional.ofNullable(this.delegatedManagedIdentityResourceId);
    }
    /**
     * Description of role assignment
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The role assignment ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The role assignment name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The principal ID.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The principal type of the assigned principal ID.
     * 
    */
    public Optional<String> getPrincipalType() {
        return Optional.ofNullable(this.principalType);
    }
    /**
     * The role definition ID.
     * 
    */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * The role assignment scope.
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * The role assignment type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Id of the user who updated the assignment
     * 
    */
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    /**
     * Time it was updated
     * 
    */
    public String getUpdatedOn() {
        return this.updatedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private @Nullable String conditionVersion;
        private String createdBy;
        private String createdOn;
        private @Nullable String delegatedManagedIdentityResourceId;
        private @Nullable String description;
        private String id;
        private String name;
        private String principalId;
        private @Nullable String principalType;
        private String roleDefinitionId;
        private String scope;
        private String type;
        private String updatedBy;
        private String updatedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.conditionVersion = defaults.conditionVersion;
    	      this.createdBy = defaults.createdBy;
    	      this.createdOn = defaults.createdOn;
    	      this.delegatedManagedIdentityResourceId = defaults.delegatedManagedIdentityResourceId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedOn = defaults.updatedOn;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setConditionVersion(@Nullable String conditionVersion) {
            this.conditionVersion = conditionVersion;
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setCreatedOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }

        public Builder setDelegatedManagedIdentityResourceId(@Nullable String delegatedManagedIdentityResourceId) {
            this.delegatedManagedIdentityResourceId = delegatedManagedIdentityResourceId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalType(@Nullable String principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedBy(String updatedBy) {
            this.updatedBy = Objects.requireNonNull(updatedBy);
            return this;
        }

        public Builder setUpdatedOn(String updatedOn) {
            this.updatedOn = Objects.requireNonNull(updatedOn);
            return this;
        }
        public GetRoleAssignmentResult build() {
            return new GetRoleAssignmentResult(condition, conditionVersion, createdBy, createdOn, delegatedManagedIdentityResourceId, description, id, name, principalId, principalType, roleDefinitionId, scope, type, updatedBy, updatedOn);
        }
    }
}
