// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MysqlColumnResponse {
    /**
     * Column collation.
     * 
     */
    private final String collation;
    /**
     * Column name.
     * 
     */
    private final String column;
    /**
     * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    private final String dataType;
    /**
     * Column length.
     * 
     */
    private final Integer length;
    /**
     * Whether or not the column can accept a null value.
     * 
     */
    private final Boolean nullable;
    /**
     * The ordinal position of the column in the table.
     * 
     */
    private final Integer ordinalPosition;
    /**
     * Whether or not the column represents a primary key.
     * 
     */
    private final Boolean primaryKey;

    @OutputCustomType.Constructor
    private MysqlColumnResponse(
        @OutputCustomType.Parameter("collation") String collation,
        @OutputCustomType.Parameter("column") String column,
        @OutputCustomType.Parameter("dataType") String dataType,
        @OutputCustomType.Parameter("length") Integer length,
        @OutputCustomType.Parameter("nullable") Boolean nullable,
        @OutputCustomType.Parameter("ordinalPosition") Integer ordinalPosition,
        @OutputCustomType.Parameter("primaryKey") Boolean primaryKey) {
        this.collation = collation;
        this.column = column;
        this.dataType = dataType;
        this.length = length;
        this.nullable = nullable;
        this.ordinalPosition = ordinalPosition;
        this.primaryKey = primaryKey;
    }

    /**
     * Column collation.
     * 
    */
    public String getCollation() {
        return this.collation;
    }
    /**
     * Column name.
     * 
    */
    public String getColumn() {
        return this.column;
    }
    /**
     * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
    */
    public String getDataType() {
        return this.dataType;
    }
    /**
     * Column length.
     * 
    */
    public Integer getLength() {
        return this.length;
    }
    /**
     * Whether or not the column can accept a null value.
     * 
    */
    public Boolean getNullable() {
        return this.nullable;
    }
    /**
     * The ordinal position of the column in the table.
     * 
    */
    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }
    /**
     * Whether or not the column represents a primary key.
     * 
    */
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collation;
        private String column;
        private String dataType;
        private Integer length;
        private Boolean nullable;
        private Integer ordinalPosition;
        private Boolean primaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.column = defaults.column;
    	      this.dataType = defaults.dataType;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.primaryKey = defaults.primaryKey;
        }

        public Builder setCollation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }

        public Builder setColumn(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder setDataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setLength(Integer length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }

        public Builder setNullable(Boolean nullable) {
            this.nullable = Objects.requireNonNull(nullable);
            return this;
        }

        public Builder setOrdinalPosition(Integer ordinalPosition) {
            this.ordinalPosition = Objects.requireNonNull(ordinalPosition);
            return this;
        }

        public Builder setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public MysqlColumnResponse build() {
            return new MysqlColumnResponse(collation, column, dataType, length, nullable, ordinalPosition, primaryKey);
        }
    }
}
