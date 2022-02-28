// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingAggregatorState extends io.pulumi.resources.ResourceArgs {

    public static final FindingAggregatorState Empty = new FindingAggregatorState();

    /**
     * Indicates whether to aggregate findings from all of the available Regions or from a specified list. The options are `ALL_REGIONS`, `ALL_REGIONS_EXCEPT_SPECIFIED` or `SPECIFIED_REGIONS`. When `ALL_REGIONS` or `ALL_REGIONS_EXCEPT_SPECIFIED` are used, Security Hub will automatically aggregate findings from new Regions as Security Hub supports them and you opt into them.
     * 
     */
    @InputImport(name="linkingMode")
      private final @Nullable Input<String> linkingMode;

    public Input<String> getLinkingMode() {
        return this.linkingMode == null ? Input.empty() : this.linkingMode;
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

    public FindingAggregatorState(
        @Nullable Input<String> linkingMode,
        @Nullable Input<List<String>> specifiedRegions) {
        this.linkingMode = linkingMode;
        this.specifiedRegions = specifiedRegions;
    }

    private FindingAggregatorState() {
        this.linkingMode = Input.empty();
        this.specifiedRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingAggregatorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> linkingMode;
        private @Nullable Input<List<String>> specifiedRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingAggregatorState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkingMode = defaults.linkingMode;
    	      this.specifiedRegions = defaults.specifiedRegions;
        }

        public Builder setLinkingMode(@Nullable Input<String> linkingMode) {
            this.linkingMode = linkingMode;
            return this;
        }

        public Builder setLinkingMode(@Nullable String linkingMode) {
            this.linkingMode = Input.ofNullable(linkingMode);
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
        public FindingAggregatorState build() {
            return new FindingAggregatorState(linkingMode, specifiedRegions);
        }
    }
}
