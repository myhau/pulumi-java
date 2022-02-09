// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorMappingFormatResponse {
    private final @Nullable String acceptLanguage;
    private final @Nullable String arraySeparator;
    private final @Nullable String columnDelimiter;
    private final String formatType;
    private final @Nullable String quoteCharacter;
    private final @Nullable String quoteEscapeCharacter;

    @OutputCustomType.Constructor({"acceptLanguage","arraySeparator","columnDelimiter","formatType","quoteCharacter","quoteEscapeCharacter"})
    private ConnectorMappingFormatResponse(
        @Nullable String acceptLanguage,
        @Nullable String arraySeparator,
        @Nullable String columnDelimiter,
        String formatType,
        @Nullable String quoteCharacter,
        @Nullable String quoteEscapeCharacter) {
        this.acceptLanguage = acceptLanguage;
        this.arraySeparator = arraySeparator;
        this.columnDelimiter = columnDelimiter;
        this.formatType = Objects.requireNonNull(formatType);
        this.quoteCharacter = quoteCharacter;
        this.quoteEscapeCharacter = quoteEscapeCharacter;
    }

    public Optional<String> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    public Optional<String> getArraySeparator() {
        return Optional.ofNullable(this.arraySeparator);
    }
    public Optional<String> getColumnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }
    public String getFormatType() {
        return this.formatType;
    }
    public Optional<String> getQuoteCharacter() {
        return Optional.ofNullable(this.quoteCharacter);
    }
    public Optional<String> getQuoteEscapeCharacter() {
        return Optional.ofNullable(this.quoteEscapeCharacter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private @Nullable String arraySeparator;
        private @Nullable String columnDelimiter;
        private String formatType;
        private @Nullable String quoteCharacter;
        private @Nullable String quoteEscapeCharacter;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arraySeparator = defaults.arraySeparator;
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.formatType = defaults.formatType;
    	      this.quoteCharacter = defaults.quoteCharacter;
    	      this.quoteEscapeCharacter = defaults.quoteEscapeCharacter;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setArraySeparator(@Nullable String arraySeparator) {
            this.arraySeparator = arraySeparator;
            return this;
        }

        public Builder setColumnDelimiter(@Nullable String columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }

        public Builder setFormatType(String formatType) {
            this.formatType = Objects.requireNonNull(formatType);
            return this;
        }

        public Builder setQuoteCharacter(@Nullable String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            return this;
        }

        public Builder setQuoteEscapeCharacter(@Nullable String quoteEscapeCharacter) {
            this.quoteEscapeCharacter = quoteEscapeCharacter;
            return this;
        }

        public ConnectorMappingFormatResponse build() {
            return new ConnectorMappingFormatResponse(acceptLanguage, arraySeparator, columnDelimiter, formatType, quoteCharacter, quoteEscapeCharacter);
        }
    }
}