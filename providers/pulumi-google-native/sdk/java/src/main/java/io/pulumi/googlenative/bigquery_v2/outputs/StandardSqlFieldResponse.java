// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.StandardSqlDataTypeResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StandardSqlFieldResponse {
    /**
     * Optional. The name of this field. Can be absent for struct fields.
     * 
     */
    private final String name;
    /**
     * Optional. The type of this parameter. Absent if not explicitly specified (e.g., CREATE FUNCTION statement can omit the return type; in this case the output parameter does not have this "type" field).
     * 
     */
    private final StandardSqlDataTypeResponse type;

    @OutputCustomType.Constructor({"name","type"})
    private StandardSqlFieldResponse(
        String name,
        StandardSqlDataTypeResponse type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Optional. The name of this field. Can be absent for struct fields.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. The type of this parameter. Absent if not explicitly specified (e.g., CREATE FUNCTION statement can omit the return type; in this case the output parameter does not have this "type" field).
     * 
    */
    public StandardSqlDataTypeResponse getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private StandardSqlDataTypeResponse type;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(StandardSqlDataTypeResponse type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public StandardSqlFieldResponse build() {
            return new StandardSqlFieldResponse(name, type);
        }
    }
}
