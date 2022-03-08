// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.PrivilegeResponse;
import io.pulumi.azurenative.documentdb.outputs.RoleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMongoDBResourceMongoRoleDefinitionResult {
    /**
     * The database name for which access is being granted for this Role Definition.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * The unique resource identifier of the database account.
     * 
     */
    private final String id;
    /**
     * The name of the database account.
     * 
     */
    private final String name;
    /**
     * A set of privileges contained by the Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than Database are not enforceable as privilege.
     * 
     */
    private final @Nullable List<PrivilegeResponse> privileges;
    /**
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     */
    private final @Nullable String roleName;
    /**
     * The set of roles inherited by this Role Definition.
     * 
     */
    private final @Nullable List<RoleResponse> roles;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"databaseName","id","name","privileges","roleName","roles","type"})
    private GetMongoDBResourceMongoRoleDefinitionResult(
        @Nullable String databaseName,
        String id,
        String name,
        @Nullable List<PrivilegeResponse> privileges,
        @Nullable String roleName,
        @Nullable List<RoleResponse> roles,
        String type) {
        this.databaseName = databaseName;
        this.id = id;
        this.name = name;
        this.privileges = privileges;
        this.roleName = roleName;
        this.roles = roles;
        this.type = type;
    }

    /**
     * The database name for which access is being granted for this Role Definition.
     * 
    */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * The unique resource identifier of the database account.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the database account.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A set of privileges contained by the Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than Database are not enforceable as privilege.
     * 
    */
    public List<PrivilegeResponse> getPrivileges() {
        return this.privileges == null ? List.of() : this.privileges;
    }
    /**
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
    */
    public Optional<String> getRoleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * The set of roles inherited by this Role Definition.
     * 
    */
    public List<RoleResponse> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoDBResourceMongoRoleDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private String id;
        private String name;
        private @Nullable List<PrivilegeResponse> privileges;
        private @Nullable String roleName;
        private @Nullable List<RoleResponse> roles;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoDBResourceMongoRoleDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privileges = defaults.privileges;
    	      this.roleName = defaults.roleName;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
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

        public Builder setPrivileges(@Nullable List<PrivilegeResponse> privileges) {
            this.privileges = privileges;
            return this;
        }

        public Builder setRoleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }

        public Builder setRoles(@Nullable List<RoleResponse> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMongoDBResourceMongoRoleDefinitionResult build() {
            return new GetMongoDBResourceMongoRoleDefinitionResult(databaseName, id, name, privileges, roleName, roles, type);
        }
    }
}
