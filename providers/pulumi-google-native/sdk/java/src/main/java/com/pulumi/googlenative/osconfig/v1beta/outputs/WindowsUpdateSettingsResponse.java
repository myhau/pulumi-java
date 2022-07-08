// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WindowsUpdateSettingsResponse {
    /**
     * @return Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    private final List<String> classifications;
    /**
     * @return List of KBs to exclude from update.
     * 
     */
    private final List<String> excludes;
    /**
     * @return An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    private final List<String> exclusivePatches;

    @CustomType.Constructor
    private WindowsUpdateSettingsResponse(
        @CustomType.Parameter("classifications") List<String> classifications,
        @CustomType.Parameter("excludes") List<String> excludes,
        @CustomType.Parameter("exclusivePatches") List<String> exclusivePatches) {
        this.classifications = classifications;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
    }

    /**
     * @return Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    public List<String> classifications() {
        return this.classifications;
    }
    /**
     * @return List of KBs to exclude from update.
     * 
     */
    public List<String> excludes() {
        return this.excludes;
    }
    /**
     * @return An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    public List<String> exclusivePatches() {
        return this.exclusivePatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> classifications;
        private List<String> excludes;
        private List<String> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder classifications(List<String> classifications) {
            this.classifications = Objects.requireNonNull(classifications);
            return this;
        }
        public Builder classifications(String... classifications) {
            return classifications(List.of(classifications));
        }
        public Builder excludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        public Builder exclusivePatches(List<String> exclusivePatches) {
            this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
            return this;
        }
        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }        public WindowsUpdateSettingsResponse build() {
            return new WindowsUpdateSettingsResponse(classifications, excludes, exclusivePatches);
        }
    }
}
