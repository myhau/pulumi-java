// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingAggregatorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingAggregatorArgs Empty = new FindingAggregatorArgs();

    /**
     * Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    @InputImport(name="linkingMode", required=true)
      private final Input<String> linkingMode;

    public Input<String> getLinkingMode() {
        return this.linkingMode;
    }

    /**
     * List of regions to include or exclude (required if `linking_mode` is set to `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`)
     * 
     */
    @InputImport(name="specifiedRegions")
      private final @Nullable Input<List<String>> specifiedRegions;

    public Input<List<String>> getSpecifiedRegions() {
        return this.specifiedRegions == null ? Input.empty() : this.specifiedRegions;
    }

    public FindingAggregatorArgs(
        Input<String> linkingMode,
        @Nullable Input<List<String>> specifiedRegions) {
        this.linkingMode = Objects.requireNonNull(linkingMode, "expected parameter 'linkingMode' to be non-null");
        this.specifiedRegions = specifiedRegions;
    }

    private FindingAggregatorArgs() {
        this.linkingMode = Input.empty();
        this.specifiedRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingAggregatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> linkingMode;
        private @Nullable Input<List<String>> specifiedRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingAggregatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkingMode = defaults.linkingMode;
    	      this.specifiedRegions = defaults.specifiedRegions;
        }

        public Builder setLinkingMode(Input<String> linkingMode) {
            this.linkingMode = Objects.requireNonNull(linkingMode);
            return this;
        }

        public Builder setLinkingMode(String linkingMode) {
            this.linkingMode = Input.of(Objects.requireNonNull(linkingMode));
            return this;
        }

        public Builder setSpecifiedRegions(@Nullable Input<List<String>> specifiedRegions) {
            this.specifiedRegions = specifiedRegions;
            return this;
        }

        public Builder setSpecifiedRegions(@Nullable List<String> specifiedRegions) {
            this.specifiedRegions = Input.ofNullable(specifiedRegions);
            return this;
        }
        public FindingAggregatorArgs build() {
            return new FindingAggregatorArgs(linkingMode, specifiedRegions);
        }
    }
}
