// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PivotPropertiesResponse {
    /**
     * Data field to show in view.
     * 
     */
    private final @Nullable String name;
    /**
     * Data type to show in view.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private PivotPropertiesResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Data field to show in view.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Data type to show in view.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PivotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PivotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PivotPropertiesResponse build() {
            return new PivotPropertiesResponse(name, type);
        }
    }
}
