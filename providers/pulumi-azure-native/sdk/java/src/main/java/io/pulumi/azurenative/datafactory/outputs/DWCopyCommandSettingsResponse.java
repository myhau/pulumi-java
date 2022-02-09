// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DWCopyCommandDefaultValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DWCopyCommandSettingsResponse {
    private final @Nullable Map<String,String> additionalOptions;
    private final @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues;

    @OutputCustomType.Constructor({"additionalOptions","defaultValues"})
    private DWCopyCommandSettingsResponse(
        @Nullable Map<String,String> additionalOptions,
        @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues) {
        this.additionalOptions = additionalOptions;
        this.defaultValues = defaultValues;
    }

    public Map<String,String> getAdditionalOptions() {
        return this.additionalOptions == null ? Map.of() : this.additionalOptions;
    }
    public List<DWCopyCommandDefaultValueResponse> getDefaultValues() {
        return this.defaultValues == null ? List.of() : this.defaultValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DWCopyCommandSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> additionalOptions;
        private @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues;

        public Builder() {
    	      // Empty
        }

        public Builder(DWCopyCommandSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalOptions = defaults.additionalOptions;
    	      this.defaultValues = defaults.defaultValues;
        }

        public Builder setAdditionalOptions(@Nullable Map<String,String> additionalOptions) {
            this.additionalOptions = additionalOptions;
            return this;
        }

        public Builder setDefaultValues(@Nullable List<DWCopyCommandDefaultValueResponse> defaultValues) {
            this.defaultValues = defaultValues;
            return this;
        }

        public DWCopyCommandSettingsResponse build() {
            return new DWCopyCommandSettingsResponse(additionalOptions, defaultValues);
        }
    }
}