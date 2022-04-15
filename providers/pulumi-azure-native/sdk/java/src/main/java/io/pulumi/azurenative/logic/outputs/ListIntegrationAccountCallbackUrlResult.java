// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListIntegrationAccountCallbackUrlResult {
    /**
     * The URL value.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ListIntegrationAccountCallbackUrlResult(@CustomType.Parameter("value") @Nullable String value) {
        this.value = value;
    }

    /**
     * The URL value.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationAccountCallbackUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationAccountCallbackUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ListIntegrationAccountCallbackUrlResult build() {
            return new ListIntegrationAccountCallbackUrlResult(value);
        }
    }
}
