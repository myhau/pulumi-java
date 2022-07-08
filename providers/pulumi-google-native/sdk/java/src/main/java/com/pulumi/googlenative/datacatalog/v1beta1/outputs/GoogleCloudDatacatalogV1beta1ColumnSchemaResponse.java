// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1beta1ColumnSchemaResponse {
    /**
     * @return Name of the column.
     * 
     */
    private final String column;
    /**
     * @return Optional. Description of the column. Default value is an empty string.
     * 
     */
    private final String description;
    /**
     * @return Optional. A column&#39;s mode indicates whether the values in this column are required, nullable, etc. Only `NULLABLE`, `REQUIRED` and `REPEATED` are supported. Default mode is `NULLABLE`.
     * 
     */
    private final String mode;
    /**
     * @return Optional. Schema of sub-columns. A column can have zero or more sub-columns.
     * 
     */
    private final List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns;
    /**
     * @return Type of the column.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1beta1ColumnSchemaResponse(
        @CustomType.Parameter("column") String column,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("subcolumns") List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns,
        @CustomType.Parameter("type") String type) {
        this.column = column;
        this.description = description;
        this.mode = mode;
        this.subcolumns = subcolumns;
        this.type = type;
    }

    /**
     * @return Name of the column.
     * 
     */
    public String column() {
        return this.column;
    }
    /**
     * @return Optional. Description of the column. Default value is an empty string.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. A column&#39;s mode indicates whether the values in this column are required, nullable, etc. Only `NULLABLE`, `REQUIRED` and `REPEATED` are supported. Default mode is `NULLABLE`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Optional. Schema of sub-columns. A column can have zero or more sub-columns.
     * 
     */
    public List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns() {
        return this.subcolumns;
    }
    /**
     * @return Type of the column.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1ColumnSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String column;
        private String description;
        private String mode;
        private List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1ColumnSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.description = defaults.description;
    	      this.mode = defaults.mode;
    	      this.subcolumns = defaults.subcolumns;
    	      this.type = defaults.type;
        }

        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder subcolumns(List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> subcolumns) {
            this.subcolumns = Objects.requireNonNull(subcolumns);
            return this;
        }
        public Builder subcolumns(GoogleCloudDatacatalogV1beta1ColumnSchemaResponse... subcolumns) {
            return subcolumns(List.of(subcolumns));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDatacatalogV1beta1ColumnSchemaResponse build() {
            return new GoogleCloudDatacatalogV1beta1ColumnSchemaResponse(column, description, mode, subcolumns, type);
        }
    }
}
