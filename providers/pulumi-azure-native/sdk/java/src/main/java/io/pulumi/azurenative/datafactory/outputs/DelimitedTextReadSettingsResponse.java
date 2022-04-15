// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TarGZipReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.TarReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.ZipDeflateReadSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DelimitedTextReadSettingsResponse {
    /**
     * Compression settings.
     * 
     */
    private final @Nullable Object compressionProperties;
    /**
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object skipLineCount;
    /**
     * The read setting type.
     * Expected value is 'DelimitedTextReadSettings'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DelimitedTextReadSettingsResponse(
        @CustomType.Parameter("compressionProperties") @Nullable Object compressionProperties,
        @CustomType.Parameter("skipLineCount") @Nullable Object skipLineCount,
        @CustomType.Parameter("type") String type) {
        this.compressionProperties = compressionProperties;
        this.skipLineCount = skipLineCount;
        this.type = type;
    }

    /**
     * Compression settings.
     * 
    */
    public Optional<Object> compressionProperties() {
        return Optional.ofNullable(this.compressionProperties);
    }
    /**
     * Indicates the number of non-empty rows to skip when reading data from input files. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> skipLineCount() {
        return Optional.ofNullable(this.skipLineCount);
    }
    /**
     * The read setting type.
     * Expected value is 'DelimitedTextReadSettings'.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compressionProperties;
        private @Nullable Object skipLineCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.skipLineCount = defaults.skipLineCount;
    	      this.type = defaults.type;
        }

        public Builder compressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }
        public Builder skipLineCount(@Nullable Object skipLineCount) {
            this.skipLineCount = skipLineCount;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DelimitedTextReadSettingsResponse build() {
            return new DelimitedTextReadSettingsResponse(compressionProperties, skipLineCount, type);
        }
    }
}
