// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.enums.FontSize;
import io.pulumi.azurenative.portal.enums.FontStyle;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for terminal appearance.
 * 
 */
public final class TerminalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TerminalSettingsArgs Empty = new TerminalSettingsArgs();

    /**
     * Size of terminal font.
     * 
     */
    @Import(name="fontSize")
      private final @Nullable Output<Either<String,FontSize>> fontSize;

    public Output<Either<String,FontSize>> fontSize() {
        return this.fontSize == null ? Codegen.empty() : this.fontSize;
    }

    /**
     * Style of terminal font.
     * 
     */
    @Import(name="fontStyle")
      private final @Nullable Output<Either<String,FontStyle>> fontStyle;

    public Output<Either<String,FontStyle>> fontStyle() {
        return this.fontStyle == null ? Codegen.empty() : this.fontStyle;
    }

    public TerminalSettingsArgs(
        @Nullable Output<Either<String,FontSize>> fontSize,
        @Nullable Output<Either<String,FontStyle>> fontStyle) {
        this.fontSize = fontSize;
        this.fontStyle = fontStyle;
    }

    private TerminalSettingsArgs() {
        this.fontSize = Codegen.empty();
        this.fontStyle = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TerminalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,FontSize>> fontSize;
        private @Nullable Output<Either<String,FontStyle>> fontStyle;

        public Builder() {
    	      // Empty
        }

        public Builder(TerminalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fontSize = defaults.fontSize;
    	      this.fontStyle = defaults.fontStyle;
        }

        public Builder fontSize(@Nullable Output<Either<String,FontSize>> fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Builder fontSize(@Nullable Either<String,FontSize> fontSize) {
            this.fontSize = Codegen.ofNullable(fontSize);
            return this;
        }
        public Builder fontStyle(@Nullable Output<Either<String,FontStyle>> fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }
        public Builder fontStyle(@Nullable Either<String,FontStyle> fontStyle) {
            this.fontStyle = Codegen.ofNullable(fontStyle);
            return this;
        }        public TerminalSettingsArgs build() {
            return new TerminalSettingsArgs(fontSize, fontStyle);
        }
    }
}
