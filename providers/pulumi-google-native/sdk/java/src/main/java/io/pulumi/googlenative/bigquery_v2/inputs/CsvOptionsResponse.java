// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class CsvOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CsvOptionsResponse Empty = new CsvOptionsResponse();

    @InputImport(name="allowJaggedRows", required=true)
    private final Boolean allowJaggedRows;

    public Boolean getAllowJaggedRows() {
        return this.allowJaggedRows;
    }

    @InputImport(name="allowQuotedNewlines", required=true)
    private final Boolean allowQuotedNewlines;

    public Boolean getAllowQuotedNewlines() {
        return this.allowQuotedNewlines;
    }

    @InputImport(name="encoding", required=true)
    private final String encoding;

    public String getEncoding() {
        return this.encoding;
    }

    @InputImport(name="fieldDelimiter", required=true)
    private final String fieldDelimiter;

    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    @InputImport(name="nullMarker", required=true)
    private final String nullMarker;

    public String getNullMarker() {
        return this.nullMarker;
    }

    @InputImport(name="quote", required=true)
    private final String quote;

    public String getQuote() {
        return this.quote;
    }

    @InputImport(name="skipLeadingRows", required=true)
    private final String skipLeadingRows;

    public String getSkipLeadingRows() {
        return this.skipLeadingRows;
    }

    public CsvOptionsResponse(
        Boolean allowJaggedRows,
        Boolean allowQuotedNewlines,
        String encoding,
        String fieldDelimiter,
        String nullMarker,
        String quote,
        String skipLeadingRows) {
        this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows, "expected parameter 'allowJaggedRows' to be non-null");
        this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines, "expected parameter 'allowQuotedNewlines' to be non-null");
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter, "expected parameter 'fieldDelimiter' to be non-null");
        this.nullMarker = Objects.requireNonNull(nullMarker, "expected parameter 'nullMarker' to be non-null");
        this.quote = Objects.requireNonNull(quote, "expected parameter 'quote' to be non-null");
        this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows, "expected parameter 'skipLeadingRows' to be non-null");
    }

    private CsvOptionsResponse() {
        this.allowJaggedRows = null;
        this.allowQuotedNewlines = null;
        this.encoding = null;
        this.fieldDelimiter = null;
        this.nullMarker = null;
        this.quote = null;
        this.skipLeadingRows = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowJaggedRows;
        private Boolean allowQuotedNewlines;
        private String encoding;
        private String fieldDelimiter;
        private String nullMarker;
        private String quote;
        private String skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.nullMarker = defaults.nullMarker;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setAllowJaggedRows(Boolean allowJaggedRows) {
            this.allowJaggedRows = Objects.requireNonNull(allowJaggedRows);
            return this;
        }

        public Builder setAllowQuotedNewlines(Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Objects.requireNonNull(allowQuotedNewlines);
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setFieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }

        public Builder setNullMarker(String nullMarker) {
            this.nullMarker = Objects.requireNonNull(nullMarker);
            return this;
        }

        public Builder setQuote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder setSkipLeadingRows(String skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }

        public CsvOptionsResponse build() {
            return new CsvOptionsResponse(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, nullMarker, quote, skipLeadingRows);
        }
    }
}