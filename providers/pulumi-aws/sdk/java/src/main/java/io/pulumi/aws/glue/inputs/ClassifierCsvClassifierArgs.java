// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierCsvClassifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierCsvClassifierArgs Empty = new ClassifierCsvClassifierArgs();

    /**
     * Enables the processing of files that contain only one column.
     * 
     */
    @InputImport(name="allowSingleColumn")
      private final @Nullable Input<Boolean> allowSingleColumn;

    public Input<Boolean> getAllowSingleColumn() {
        return this.allowSingleColumn == null ? Input.empty() : this.allowSingleColumn;
    }

    /**
     * Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
     * 
     */
    @InputImport(name="containsHeader")
      private final @Nullable Input<String> containsHeader;

    public Input<String> getContainsHeader() {
        return this.containsHeader == null ? Input.empty() : this.containsHeader;
    }

    /**
     * The delimiter used in the Csv to separate columns.
     * 
     */
    @InputImport(name="delimiter")
      private final @Nullable Input<String> delimiter;

    public Input<String> getDelimiter() {
        return this.delimiter == null ? Input.empty() : this.delimiter;
    }

    /**
     * Specifies whether to trim column values.
     * 
     */
    @InputImport(name="disableValueTrimming")
      private final @Nullable Input<Boolean> disableValueTrimming;

    public Input<Boolean> getDisableValueTrimming() {
        return this.disableValueTrimming == null ? Input.empty() : this.disableValueTrimming;
    }

    /**
     * A list of strings representing column names.
     * 
     */
    @InputImport(name="headers")
      private final @Nullable Input<List<String>> headers;

    public Input<List<String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
     * 
     */
    @InputImport(name="quoteSymbol")
      private final @Nullable Input<String> quoteSymbol;

    public Input<String> getQuoteSymbol() {
        return this.quoteSymbol == null ? Input.empty() : this.quoteSymbol;
    }

    public ClassifierCsvClassifierArgs(
        @Nullable Input<Boolean> allowSingleColumn,
        @Nullable Input<String> containsHeader,
        @Nullable Input<String> delimiter,
        @Nullable Input<Boolean> disableValueTrimming,
        @Nullable Input<List<String>> headers,
        @Nullable Input<String> quoteSymbol) {
        this.allowSingleColumn = allowSingleColumn;
        this.containsHeader = containsHeader;
        this.delimiter = delimiter;
        this.disableValueTrimming = disableValueTrimming;
        this.headers = headers;
        this.quoteSymbol = quoteSymbol;
    }

    private ClassifierCsvClassifierArgs() {
        this.allowSingleColumn = Input.empty();
        this.containsHeader = Input.empty();
        this.delimiter = Input.empty();
        this.disableValueTrimming = Input.empty();
        this.headers = Input.empty();
        this.quoteSymbol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierCsvClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowSingleColumn;
        private @Nullable Input<String> containsHeader;
        private @Nullable Input<String> delimiter;
        private @Nullable Input<Boolean> disableValueTrimming;
        private @Nullable Input<List<String>> headers;
        private @Nullable Input<String> quoteSymbol;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierCsvClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSingleColumn = defaults.allowSingleColumn;
    	      this.containsHeader = defaults.containsHeader;
    	      this.delimiter = defaults.delimiter;
    	      this.disableValueTrimming = defaults.disableValueTrimming;
    	      this.headers = defaults.headers;
    	      this.quoteSymbol = defaults.quoteSymbol;
        }

        public Builder setAllowSingleColumn(@Nullable Input<Boolean> allowSingleColumn) {
            this.allowSingleColumn = allowSingleColumn;
            return this;
        }

        public Builder setAllowSingleColumn(@Nullable Boolean allowSingleColumn) {
            this.allowSingleColumn = Input.ofNullable(allowSingleColumn);
            return this;
        }

        public Builder setContainsHeader(@Nullable Input<String> containsHeader) {
            this.containsHeader = containsHeader;
            return this;
        }

        public Builder setContainsHeader(@Nullable String containsHeader) {
            this.containsHeader = Input.ofNullable(containsHeader);
            return this;
        }

        public Builder setDelimiter(@Nullable Input<String> delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder setDelimiter(@Nullable String delimiter) {
            this.delimiter = Input.ofNullable(delimiter);
            return this;
        }

        public Builder setDisableValueTrimming(@Nullable Input<Boolean> disableValueTrimming) {
            this.disableValueTrimming = disableValueTrimming;
            return this;
        }

        public Builder setDisableValueTrimming(@Nullable Boolean disableValueTrimming) {
            this.disableValueTrimming = Input.ofNullable(disableValueTrimming);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setQuoteSymbol(@Nullable Input<String> quoteSymbol) {
            this.quoteSymbol = quoteSymbol;
            return this;
        }

        public Builder setQuoteSymbol(@Nullable String quoteSymbol) {
            this.quoteSymbol = Input.ofNullable(quoteSymbol);
            return this;
        }
        public ClassifierCsvClassifierArgs build() {
            return new ClassifierCsvClassifierArgs(allowSingleColumn, containsHeader, delimiter, disableValueTrimming, headers, quoteSymbol);
        }
    }
}
