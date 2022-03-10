// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleColumnResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OracleTableResponse {
    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    private final List<OracleColumnResponse> oracleColumns;
    /**
     * Table name.
     * 
     */
    private final String tableName;

    @OutputCustomType.Constructor
    private OracleTableResponse(
        @OutputCustomType.Parameter("oracleColumns") List<OracleColumnResponse> oracleColumns,
        @OutputCustomType.Parameter("tableName") String tableName) {
        this.oracleColumns = oracleColumns;
        this.tableName = tableName;
    }

    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
    */
    public List<OracleColumnResponse> getOracleColumns() {
        return this.oracleColumns;
    }
    /**
     * Table name.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleColumnResponse> oracleColumns;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleColumns = defaults.oracleColumns;
    	      this.tableName = defaults.tableName;
        }

        public Builder setOracleColumns(List<OracleColumnResponse> oracleColumns) {
            this.oracleColumns = Objects.requireNonNull(oracleColumns);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public OracleTableResponse build() {
            return new OracleTableResponse(oracleColumns, tableName);
        }
    }
}
