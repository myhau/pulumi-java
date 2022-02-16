// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.DatasetCsvOptions;
import io.pulumi.awsnative.databrew.outputs.DatasetExcelOptions;
import io.pulumi.awsnative.databrew.outputs.DatasetJsonOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetFormatOptions {
    private final @Nullable DatasetCsvOptions csv;
    private final @Nullable DatasetExcelOptions excel;
    private final @Nullable DatasetJsonOptions json;

    @OutputCustomType.Constructor({"csv","excel","json"})
    private DatasetFormatOptions(
        @Nullable DatasetCsvOptions csv,
        @Nullable DatasetExcelOptions excel,
        @Nullable DatasetJsonOptions json) {
        this.csv = csv;
        this.excel = excel;
        this.json = json;
    }

    public Optional<DatasetCsvOptions> getCsv() {
        return Optional.ofNullable(this.csv);
    }
    public Optional<DatasetExcelOptions> getExcel() {
        return Optional.ofNullable(this.excel);
    }
    public Optional<DatasetJsonOptions> getJson() {
        return Optional.ofNullable(this.json);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFormatOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetCsvOptions csv;
        private @Nullable DatasetExcelOptions excel;
        private @Nullable DatasetJsonOptions json;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFormatOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.excel = defaults.excel;
    	      this.json = defaults.json;
        }

        public Builder setCsv(@Nullable DatasetCsvOptions csv) {
            this.csv = csv;
            return this;
        }

        public Builder setExcel(@Nullable DatasetExcelOptions excel) {
            this.excel = excel;
            return this;
        }

        public Builder setJson(@Nullable DatasetJsonOptions json) {
            this.json = json;
            return this;
        }

        public DatasetFormatOptions build() {
            return new DatasetFormatOptions(csv, excel, json);
        }
    }
}