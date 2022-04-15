// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.DataCenterResourceResponseProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCassandraDataCenterResult {
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
     * Properties of a managed Cassandra data center.
     * 
     */
    private final DataCenterResourceResponseProperties properties;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCassandraDataCenterResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") DataCenterResourceResponseProperties properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * The unique resource identifier of the database account.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the database account.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Properties of a managed Cassandra data center.
     * 
    */
    public DataCenterResourceResponseProperties properties() {
        return this.properties;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCassandraDataCenterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private DataCenterResourceResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCassandraDataCenterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
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
        public Builder properties(DataCenterResourceResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCassandraDataCenterResult build() {
            return new GetCassandraDataCenterResult(id, name, properties, type);
        }
    }
}
