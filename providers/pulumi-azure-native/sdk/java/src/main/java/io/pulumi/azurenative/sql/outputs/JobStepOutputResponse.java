// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobStepOutputResponse {
    /**
     * The resource ID of the credential to use to connect to the output destination.
     * 
     */
    private final String credential;
    /**
     * The output destination database.
     * 
     */
    private final String databaseName;
    /**
     * The output destination resource group.
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * The output destination schema.
     * 
     */
    private final @Nullable String schemaName;
    /**
     * The output destination server name.
     * 
     */
    private final String serverName;
    /**
     * The output destination subscription id.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * The output destination table.
     * 
     */
    private final String tableName;
    /**
     * The output destination type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private JobStepOutputResponse(
        @CustomType.Parameter("credential") String credential,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("schemaName") @Nullable String schemaName,
        @CustomType.Parameter("serverName") String serverName,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tableName") String tableName,
        @CustomType.Parameter("type") @Nullable String type) {
        this.credential = credential;
        this.databaseName = databaseName;
        this.resourceGroupName = resourceGroupName;
        this.schemaName = schemaName;
        this.serverName = serverName;
        this.subscriptionId = subscriptionId;
        this.tableName = tableName;
        this.type = type;
    }

    /**
     * The resource ID of the credential to use to connect to the output destination.
     * 
    */
    public String credential() {
        return this.credential;
    }
    /**
     * The output destination database.
     * 
    */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * The output destination resource group.
     * 
    */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * The output destination schema.
     * 
    */
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    /**
     * The output destination server name.
     * 
    */
    public String serverName() {
        return this.serverName;
    }
    /**
     * The output destination subscription id.
     * 
    */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * The output destination table.
     * 
    */
    public String tableName() {
        return this.tableName;
    }
    /**
     * The output destination type.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String credential;
        private String databaseName;
        private @Nullable String resourceGroupName;
        private @Nullable String schemaName;
        private String serverName;
        private @Nullable String subscriptionId;
        private String tableName;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStepOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.serverName = defaults.serverName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder credential(String credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public JobStepOutputResponse build() {
            return new JobStepOutputResponse(credential, databaseName, resourceGroupName, schemaName, serverName, subscriptionId, tableName, type);
        }
    }
}
