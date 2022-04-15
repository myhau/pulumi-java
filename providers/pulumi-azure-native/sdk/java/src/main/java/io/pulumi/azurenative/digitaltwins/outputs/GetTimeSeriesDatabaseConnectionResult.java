// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins.outputs;

import io.pulumi.azurenative.digitaltwins.outputs.AzureDataExplorerConnectionPropertiesResponse;
import io.pulumi.azurenative.digitaltwins.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTimeSeriesDatabaseConnectionResult {
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * Extension resource name.
     * 
     */
    private final String name;
    /**
     * Properties of a specific time series database connection.
     * 
     */
    private final AzureDataExplorerConnectionPropertiesResponse properties;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTimeSeriesDatabaseConnectionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") AzureDataExplorerConnectionPropertiesResponse properties,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Extension resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Properties of a specific time series database connection.
     * 
    */
    public AzureDataExplorerConnectionPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTimeSeriesDatabaseConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private AzureDataExplorerConnectionPropertiesResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTimeSeriesDatabaseConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(AzureDataExplorerConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTimeSeriesDatabaseConnectionResult build() {
            return new GetTimeSeriesDatabaseConnectionResult(id, name, properties, systemData, type);
        }
    }
}
