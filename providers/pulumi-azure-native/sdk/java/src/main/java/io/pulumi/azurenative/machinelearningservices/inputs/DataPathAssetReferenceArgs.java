// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Reference to an asset via its path in a datastore.
 * 
 */
public final class DataPathAssetReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataPathAssetReferenceArgs Empty = new DataPathAssetReferenceArgs();

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    @Import(name="datastoreId")
      private final @Nullable Output<String> datastoreId;

    public Output<String> datastoreId() {
        return this.datastoreId == null ? Codegen.empty() : this.datastoreId;
    }

    /**
     * The path of the file/directory in the datastore.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'DataPath'.
     * 
     */
    @Import(name="referenceType", required=true)
      private final Output<String> referenceType;

    public Output<String> referenceType() {
        return this.referenceType;
    }

    public DataPathAssetReferenceArgs(
        @Nullable Output<String> datastoreId,
        @Nullable Output<String> path,
        Output<String> referenceType) {
        this.datastoreId = datastoreId;
        this.path = path;
        this.referenceType = Objects.requireNonNull(referenceType, "expected parameter 'referenceType' to be non-null");
    }

    private DataPathAssetReferenceArgs() {
        this.datastoreId = Codegen.empty();
        this.path = Codegen.empty();
        this.referenceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPathAssetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datastoreId;
        private @Nullable Output<String> path;
        private Output<String> referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPathAssetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.path = defaults.path;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }
        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = Codegen.ofNullable(datastoreId);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder referenceType(Output<String> referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public Builder referenceType(String referenceType) {
            this.referenceType = Output.of(Objects.requireNonNull(referenceType));
            return this;
        }        public DataPathAssetReferenceArgs build() {
            return new DataPathAssetReferenceArgs(datastoreId, path, referenceType);
        }
    }
}
