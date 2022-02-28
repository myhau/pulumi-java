// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableAttribute {
    /**
     * The name of the index
     * 
     */
    private final String name;
    /**
     * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"name","type"})
    private TableAttribute(
        String name,
        String type) {
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The name of the index
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TableAttribute build() {
            return new TableAttribute(name, type);
        }
    }
}
