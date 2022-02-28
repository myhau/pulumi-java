// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPermissionsTable {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;
    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean wildcard;

    @OutputCustomType.Constructor({"catalogId","databaseName","name","wildcard"})
    private GetPermissionsTable(
        String catalogId,
        String databaseName,
        String name,
        @Nullable Boolean wildcard) {
        this.catalogId = Objects.requireNonNull(catalogId);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.name = Objects.requireNonNull(name);
        this.wildcard = wildcard;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Name of the table resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    public Optional<Boolean> getWildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String databaseName;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setWildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }
        public GetPermissionsTable build() {
            return new GetPermissionsTable(catalogId, databaseName, name, wildcard);
        }
    }
}
