// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabelClassResponse {
    /**
     * Display name of the label class.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Dictionary of subclasses of the label class.
     * 
     */
    private final @Nullable Map<String,LabelClassResponse> subclasses;

    @CustomType.Constructor
    private LabelClassResponse(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("subclasses") @Nullable Map<String,LabelClassResponse> subclasses) {
        this.displayName = displayName;
        this.subclasses = subclasses;
    }

    /**
     * Display name of the label class.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Dictionary of subclasses of the label class.
     * 
    */
    public Map<String,LabelClassResponse> subclasses() {
        return this.subclasses == null ? Map.of() : this.subclasses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelClassResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable Map<String,LabelClassResponse> subclasses;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelClassResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.subclasses = defaults.subclasses;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder subclasses(@Nullable Map<String,LabelClassResponse> subclasses) {
            this.subclasses = subclasses;
            return this;
        }        public LabelClassResponse build() {
            return new LabelClassResponse(displayName, subclasses);
        }
    }
}
