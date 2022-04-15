// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Databricks Delta Lake export command settings.
 * 
 */
public final class AzureDatabricksDeltaLakeExportCommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksDeltaLakeExportCommandArgs Empty = new AzureDatabricksDeltaLakeExportCommandArgs();

    /**
     * Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dateFormat")
      private final @Nullable Output<Object> dateFormat;

    public Output<Object> dateFormat() {
        return this.dateFormat == null ? Codegen.empty() : this.dateFormat;
    }

    /**
     * Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="timestampFormat")
      private final @Nullable Output<Object> timestampFormat;

    public Output<Object> timestampFormat() {
        return this.timestampFormat == null ? Codegen.empty() : this.timestampFormat;
    }

    /**
     * The export setting type.
     * Expected value is 'AzureDatabricksDeltaLakeExportCommand'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureDatabricksDeltaLakeExportCommandArgs(
        @Nullable Output<Object> dateFormat,
        @Nullable Output<Object> timestampFormat,
        Output<String> type) {
        this.dateFormat = dateFormat;
        this.timestampFormat = timestampFormat;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDatabricksDeltaLakeExportCommandArgs() {
        this.dateFormat = Codegen.empty();
        this.timestampFormat = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeExportCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> dateFormat;
        private @Nullable Output<Object> timestampFormat;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeExportCommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.timestampFormat = defaults.timestampFormat;
    	      this.type = defaults.type;
        }

        public Builder dateFormat(@Nullable Output<Object> dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public Builder dateFormat(@Nullable Object dateFormat) {
            this.dateFormat = Codegen.ofNullable(dateFormat);
            return this;
        }
        public Builder timestampFormat(@Nullable Output<Object> timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }
        public Builder timestampFormat(@Nullable Object timestampFormat) {
            this.timestampFormat = Codegen.ofNullable(timestampFormat);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureDatabricksDeltaLakeExportCommandArgs build() {
            return new AzureDatabricksDeltaLakeExportCommandArgs(dateFormat, timestampFormat, type);
        }
    }
}
