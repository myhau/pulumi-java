// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TerminalSettingsResponse {
    /**
     * Size of terminal font.
     * 
     */
    private final @Nullable String fontSize;
    /**
     * Style of terminal font.
     * 
     */
    private final @Nullable String fontStyle;

    @CustomType.Constructor
    private TerminalSettingsResponse(
        @CustomType.Parameter("fontSize") @Nullable String fontSize,
        @CustomType.Parameter("fontStyle") @Nullable String fontStyle) {
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
    }

    /**
     * Size of terminal font.
     * 
    */
    public Optional<String> fontSize() {
        return Optional.ofNullable(this.fontSize);
    }
    /**
     * Style of terminal font.
     * 
    */
    public Optional<String> fontStyle() {
        return Optional.ofNullable(this.fontStyle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TerminalSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fontSize;
        private @Nullable String fontStyle;

        public Builder() {
    	      // Empty
        }

        public Builder(TerminalSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontSize = defaults.fontSize;
    	      this.fontStyle = defaults.fontStyle;
        }

        public Builder fontSize(@Nullable String fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Builder fontStyle(@Nullable String fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }        public TerminalSettingsResponse build() {
            return new TerminalSettingsResponse(fontSize, fontStyle);
        }
    }
}
