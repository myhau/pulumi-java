// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssetHierarchy {
    /**
     * The ID of the child asset to be associated.
     * 
     */
    private final String childAssetId;
    /**
     * The LogicalID of a hierarchy in the parent asset's model.
     * 
     */
    private final String logicalId;

    @OutputCustomType.Constructor({"childAssetId","logicalId"})
    private AssetHierarchy(
        String childAssetId,
        String logicalId) {
        this.childAssetId = childAssetId;
        this.logicalId = logicalId;
    }

    /**
     * The ID of the child asset to be associated.
     * 
    */
    public String getChildAssetId() {
        return this.childAssetId;
    }
    /**
     * The LogicalID of a hierarchy in the parent asset's model.
     * 
    */
    public String getLogicalId() {
        return this.logicalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetHierarchy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String childAssetId;
        private String logicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetHierarchy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childAssetId = defaults.childAssetId;
    	      this.logicalId = defaults.logicalId;
        }

        public Builder setChildAssetId(String childAssetId) {
            this.childAssetId = Objects.requireNonNull(childAssetId);
            return this;
        }

        public Builder setLogicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }
        public AssetHierarchy build() {
            return new AssetHierarchy(childAssetId, logicalId);
        }
    }
}
