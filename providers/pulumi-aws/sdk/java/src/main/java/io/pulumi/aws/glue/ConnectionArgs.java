// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.ConnectionPhysicalConnectionRequirementsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    /**
     * A map of key-value pairs used as parameters for this connection.
     * 
     */
    @InputImport(name="connectionProperties")
      private final @Nullable Input<Map<String,String>> connectionProperties;

    public Input<Map<String,String>> getConnectionProperties() {
        return this.connectionProperties == null ? Input.empty() : this.connectionProperties;
    }

    /**
     * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`, and `NETWORK`. Defaults to `JBDC`.
     * 
     */
    @InputImport(name="connectionType")
      private final @Nullable Input<String> connectionType;

    public Input<String> getConnectionType() {
        return this.connectionType == null ? Input.empty() : this.connectionType;
    }

    /**
     * Description of the connection.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A list of criteria that can be used in selecting this connection.
     * 
     */
    @InputImport(name="matchCriterias")
      private final @Nullable Input<List<String>> matchCriterias;

    public Input<List<String>> getMatchCriterias() {
        return this.matchCriterias == null ? Input.empty() : this.matchCriterias;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
     * 
     */
    @InputImport(name="physicalConnectionRequirements")
      private final @Nullable Input<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements;

    public Input<ConnectionPhysicalConnectionRequirementsArgs> getPhysicalConnectionRequirements() {
        return this.physicalConnectionRequirements == null ? Input.empty() : this.physicalConnectionRequirements;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConnectionArgs(
        @Nullable Input<String> catalogId,
        @Nullable Input<Map<String,String>> connectionProperties,
        @Nullable Input<String> connectionType,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> matchCriterias,
        @Nullable Input<String> name,
        @Nullable Input<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements,
        @Nullable Input<Map<String,String>> tags) {
        this.catalogId = catalogId;
        this.connectionProperties = connectionProperties;
        this.connectionType = connectionType;
        this.description = description;
        this.matchCriterias = matchCriterias;
        this.name = name;
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.catalogId = Input.empty();
        this.connectionProperties = Input.empty();
        this.connectionType = Input.empty();
        this.description = Input.empty();
        this.matchCriterias = Input.empty();
        this.name = Input.empty();
        this.physicalConnectionRequirements = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> catalogId;
        private @Nullable Input<Map<String,String>> connectionProperties;
        private @Nullable Input<String> connectionType;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> matchCriterias;
        private @Nullable Input<String> name;
        private @Nullable Input<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.connectionType = defaults.connectionType;
    	      this.description = defaults.description;
    	      this.matchCriterias = defaults.matchCriterias;
    	      this.name = defaults.name;
    	      this.physicalConnectionRequirements = defaults.physicalConnectionRequirements;
    	      this.tags = defaults.tags;
        }

        public Builder setCatalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder setConnectionProperties(@Nullable Input<Map<String,String>> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Map<String,String> connectionProperties) {
            this.connectionProperties = Input.ofNullable(connectionProperties);
            return this;
        }

        public Builder setConnectionType(@Nullable Input<String> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder setConnectionType(@Nullable String connectionType) {
            this.connectionType = Input.ofNullable(connectionType);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMatchCriterias(@Nullable Input<List<String>> matchCriterias) {
            this.matchCriterias = matchCriterias;
            return this;
        }

        public Builder setMatchCriterias(@Nullable List<String> matchCriterias) {
            this.matchCriterias = Input.ofNullable(matchCriterias);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPhysicalConnectionRequirements(@Nullable Input<ConnectionPhysicalConnectionRequirementsArgs> physicalConnectionRequirements) {
            this.physicalConnectionRequirements = physicalConnectionRequirements;
            return this;
        }

        public Builder setPhysicalConnectionRequirements(@Nullable ConnectionPhysicalConnectionRequirementsArgs physicalConnectionRequirements) {
            this.physicalConnectionRequirements = Input.ofNullable(physicalConnectionRequirements);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ConnectionArgs build() {
            return new ConnectionArgs(catalogId, connectionProperties, connectionType, description, matchCriterias, name, physicalConnectionRequirements, tags);
        }
    }
}
