// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CsvOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CsvOptionsArgs Empty = new CsvOptionsArgs();

    @InputImport(name="allowJaggedRows")
    private final @Nullable Input<Boolean> allowJaggedRows;

    public Input<Boolean> getAllowJaggedRows() {
        return this.allowJaggedRows == null ? Input.empty() : this.allowJaggedRows;
    }

    @InputImport(name="allowQuotedNewlines")
    private final @Nullable Input<Boolean> allowQuotedNewlines;

    public Input<Boolean> getAllowQuotedNewlines() {
        return this.allowQuotedNewlines == null ? Input.empty() : this.allowQuotedNewlines;
    }

    @InputImport(name="encoding")
    private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    @InputImport(name="fieldDelimiter")
    private final @Nullable Input<String> fieldDelimiter;

    public Input<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Input.empty() : this.fieldDelimiter;
    }

    @InputImport(name="nullMarker")
    private final @Nullable Input<String> nullMarker;

    public Input<String> getNullMarker() {
        return this.nullMarker == null ? Input.empty() : this.nullMarker;
    }

    @InputImport(name="quote")
    private final @Nullable Input<String> quote;

    public Input<String> getQuote() {
        return this.quote == null ? Input.empty() : this.quote;
    }

    @InputImport(name="skipLeadingRows")
    private final @Nullable Input<String> skipLeadingRows;

    public Input<String> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Input.empty() : this.skipLeadingRows;
    }

    public CsvOptionsArgs(
        @Nullable Input<Boolean> allowJaggedRows,
        @Nullable Input<Boolean> allowQuotedNewlines,
        @Nullable Input<String> encoding,
        @Nullable Input<String> fieldDelimiter,
        @Nullable Input<String> nullMarker,
        @Nullable Input<String> quote,
        @Nullable Input<String> skipLeadingRows) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.nullMarker = nullMarker;
        this.quote = quote;
        this.skipLeadingRows = skipLeadingRows;
    }

    private CsvOptionsArgs() {
        this.allowJaggedRows = Input.empty();
        this.allowQuotedNewlines = Input.empty();
        this.encoding = Input.empty();
        this.fieldDelimiter = Input.empty();
        this.nullMarker = Input.empty();
        this.quote = Input.empty();
        this.skipLeadingRows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowJaggedRows;
        private @Nullable Input<Boolean> allowQuotedNewlines;
        private @Nullable Input<String> encoding;
        private @Nullable Input<String> fieldDelimiter;
        private @Nullable Input<String> nullMarker;
        private @Nullable Input<String> quote;
        private @Nullable Input<String> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.nullMarker = defaults.nullMarker;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setAllowJaggedRows(@Nullable Input<Boolean> allowJaggedRows) {
            this.allowJaggedRows = allowJaggedRows;
            return this;
        }

        public Builder setAllowJaggedRows(@Nullable Boolean allowJaggedRows) {
            this.allowJaggedRows = Input.ofNullable(allowJaggedRows);
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Input<Boolean> allowQuotedNewlines) {
            this.allowQuotedNewlines = allowQuotedNewlines;
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Input.ofNullable(allowQuotedNewlines);
            return this;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setFieldDelimiter(@Nullable Input<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder setFieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Input.ofNullable(fieldDelimiter);
            return this;
        }

        public Builder setNullMarker(@Nullable Input<String> nullMarker) {
            this.nullMarker = nullMarker;
            return this;
        }

        public Builder setNullMarker(@Nullable String nullMarker) {
            this.nullMarker = Input.ofNullable(nullMarker);
            return this;
        }

        public Builder setQuote(@Nullable Input<String> quote) {
            this.quote = quote;
            return this;
        }

        public Builder setQuote(@Nullable String quote) {
            this.quote = Input.ofNullable(quote);
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Input<String> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable String skipLeadingRows) {
            this.skipLeadingRows = Input.ofNullable(skipLeadingRows);
            return this;
        }

        public CsvOptionsArgs build() {
            return new CsvOptionsArgs(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, nullMarker, quote, skipLeadingRows);
        }
    }
}