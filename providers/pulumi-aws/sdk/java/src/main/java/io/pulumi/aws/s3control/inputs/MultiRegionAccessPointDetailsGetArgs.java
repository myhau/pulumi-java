// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockGetArgs;
import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointDetailsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsGetArgs Empty = new MultiRegionAccessPointDetailsGetArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
     * 
     */
    @InputImport(name="publicAccessBlock")
      private final @Nullable Input<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock;

    public Input<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> getPublicAccessBlock() {
        return this.publicAccessBlock == null ? Input.empty() : this.publicAccessBlock;
    }

    /**
     * The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
     * 
     */
    @InputImport(name="regions", required=true)
      private final Input<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions;

    public Input<List<MultiRegionAccessPointDetailsRegionGetArgs>> getRegions() {
        return this.regions;
    }

    public MultiRegionAccessPointDetailsGetArgs(
        Input<String> name,
        @Nullable Input<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock,
        Input<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicAccessBlock = publicAccessBlock;
        this.regions = Objects.requireNonNull(regions, "expected parameter 'regions' to be non-null");
    }

    private MultiRegionAccessPointDetailsGetArgs() {
        this.name = Input.empty();
        this.publicAccessBlock = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock;
        private Input<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicAccessBlock = defaults.publicAccessBlock;
    	      this.regions = defaults.regions;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPublicAccessBlock(@Nullable Input<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock) {
            this.publicAccessBlock = publicAccessBlock;
            return this;
        }

        public Builder setPublicAccessBlock(@Nullable MultiRegionAccessPointDetailsPublicAccessBlockGetArgs publicAccessBlock) {
            this.publicAccessBlock = Input.ofNullable(publicAccessBlock);
            return this;
        }

        public Builder setRegions(Input<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }

        public Builder setRegions(List<MultiRegionAccessPointDetailsRegionGetArgs> regions) {
            this.regions = Input.of(Objects.requireNonNull(regions));
            return this;
        }
        public MultiRegionAccessPointDetailsGetArgs build() {
            return new MultiRegionAccessPointDetailsGetArgs(name, publicAccessBlock, regions);
        }
    }
}
