// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandDefaultValueResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DW Copy Command settings.
 * 
 */
public final class DWCopyCommandSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DWCopyCommandSettingsResponse Empty = new DWCopyCommandSettingsResponse();

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalOptions": { "MAXERRORS": "1000", "DATEFORMAT": "'ymd'" }
     * 
     */
    @Import(name="additionalOptions")
      private final @Nullable Map<String,String> additionalOptions;

    public Map<String,String> additionalOptions() {
        return this.additionalOptions == null ? Map.of() : this.additionalOptions;
    }

    /**
     * Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="defaultValues")
      private final @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues;

    public List<DWCopyCommandDefaultValueResponse> defaultValues() {
        return this.defaultValues == null ? List.of() : this.defaultValues;
    }

    public DWCopyCommandSettingsResponse(
        @Nullable Map<String,String> additionalOptions,
        @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues) {
        this.additionalOptions = additionalOptions;
        this.defaultValues = defaultValues;
    }

    private DWCopyCommandSettingsResponse() {
        this.additionalOptions = Map.of();
        this.defaultValues = List.of();
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

        public Builder additionalOptions(@Nullable Map<String,String> additionalOptions) {
            this.additionalOptions = additionalOptions;
            return this;
        }
        public Builder defaultValues(@Nullable List<DWCopyCommandDefaultValueResponse> defaultValues) {
            this.defaultValues = defaultValues;
            return this;
        }
        public Builder defaultValues(DWCopyCommandDefaultValueResponse... defaultValues) {
            return defaultValues(List.of(defaultValues));
        }        public DWCopyCommandSettingsResponse build() {
            return new DWCopyCommandSettingsResponse(additionalOptions, defaultValues);
        }
    }
}
