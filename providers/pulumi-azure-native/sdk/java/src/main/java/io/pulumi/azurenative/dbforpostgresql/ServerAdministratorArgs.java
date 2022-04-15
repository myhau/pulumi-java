// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.dbforpostgresql.enums.AdministratorType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ServerAdministratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerAdministratorArgs Empty = new ServerAdministratorArgs();

    /**
     * The type of administrator.
     * 
     */
    @Import(name="administratorType", required=true)
      private final Output<Either<String,AdministratorType>> administratorType;

    public Output<Either<String,AdministratorType>> administratorType() {
        return this.administratorType;
    }

    /**
     * The server administrator login account name.
     * 
     */
    @Import(name="login", required=true)
      private final Output<String> login;

    public Output<String> login() {
        return this.login;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    @Import(name="sid", required=true)
      private final Output<String> sid;

    public Output<String> sid() {
        return this.sid;
    }

    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    @Import(name="tenantId", required=true)
      private final Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId;
    }

    public ServerAdministratorArgs(
        Output<Either<String,AdministratorType>> administratorType,
        Output<String> login,
        Output<String> resourceGroupName,
        Output<String> serverName,
        Output<String> sid,
        Output<String> tenantId) {
        this.administratorType = Objects.requireNonNull(administratorType, "expected parameter 'administratorType' to be non-null");
        this.login = Objects.requireNonNull(login, "expected parameter 'login' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.sid = Objects.requireNonNull(sid, "expected parameter 'sid' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private ServerAdministratorArgs() {
        this.administratorType = Codegen.empty();
        this.login = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.serverName = Codegen.empty();
        this.sid = Codegen.empty();
        this.tenantId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AdministratorType>> administratorType;
        private Output<String> login;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private Output<String> sid;
        private Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.login = defaults.login;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder administratorType(Output<Either<String,AdministratorType>> administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }
        public Builder administratorType(Either<String,AdministratorType> administratorType) {
            this.administratorType = Output.of(Objects.requireNonNull(administratorType));
            return this;
        }
        public Builder login(Output<String> login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        public Builder login(String login) {
            this.login = Output.of(Objects.requireNonNull(login));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder sid(Output<String> sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        public Builder sid(String sid) {
            this.sid = Output.of(Objects.requireNonNull(sid));
            return this;
        }
        public Builder tenantId(Output<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Output.of(Objects.requireNonNull(tenantId));
            return this;
        }        public ServerAdministratorArgs build() {
            return new ServerAdministratorArgs(administratorType, login, resourceGroupName, serverName, sid, tenantId);
        }
    }
}
