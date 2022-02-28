// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTableLocalSecondaryIndex {
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String name;
    private final List<String> nonKeyAttributes;
    private final String projectionType;
    private final String rangeKey;

    @OutputCustomType.Constructor({"name","nonKeyAttributes","projectionType","rangeKey"})
    private GetTableLocalSecondaryIndex(
        String name,
        List<String> nonKeyAttributes,
        String projectionType,
        String rangeKey) {
        this.name = Objects.requireNonNull(name);
        this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
        this.projectionType = Objects.requireNonNull(projectionType);
        this.rangeKey = Objects.requireNonNull(rangeKey);
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    public String getName() {
        return this.name;
    }
    public List<String> getNonKeyAttributes() {
        return this.nonKeyAttributes;
    }
    public String getProjectionType() {
        return this.projectionType;
    }
    public String getRangeKey() {
        return this.rangeKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableLocalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableLocalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNonKeyAttributes(List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
            return this;
        }

        public Builder setProjectionType(String projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }

        public Builder setRangeKey(String rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }
        public GetTableLocalSecondaryIndex build() {
            return new GetTableLocalSecondaryIndex(name, nonKeyAttributes, projectionType, rangeKey);
        }
    }
}
