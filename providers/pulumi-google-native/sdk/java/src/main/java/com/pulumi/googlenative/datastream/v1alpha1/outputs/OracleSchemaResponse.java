// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream.v1alpha1.outputs.OracleTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OracleSchemaResponse {
    /**
     * @return Tables in the schema.
     * 
     */
    private final List<OracleTableResponse> oracleTables;
    /**
     * @return Schema name.
     * 
     */
    private final String schemaName;

    @CustomType.Constructor
    private OracleSchemaResponse(
        @CustomType.Parameter("oracleTables") List<OracleTableResponse> oracleTables,
        @CustomType.Parameter("schemaName") String schemaName) {
        this.oracleTables = oracleTables;
        this.schemaName = schemaName;
    }

    /**
     * @return Tables in the schema.
     * 
     */
    public List<OracleTableResponse> oracleTables() {
        return this.oracleTables;
    }
    /**
     * @return Schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleTableResponse> oracleTables;
        private String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleTables = defaults.oracleTables;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder oracleTables(List<OracleTableResponse> oracleTables) {
            this.oracleTables = Objects.requireNonNull(oracleTables);
            return this;
        }
        public Builder oracleTables(OracleTableResponse... oracleTables) {
            return oracleTables(List.of(oracleTables));
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }        public OracleSchemaResponse build() {
            return new OracleSchemaResponse(oracleTables, schemaName);
        }
    }
}
