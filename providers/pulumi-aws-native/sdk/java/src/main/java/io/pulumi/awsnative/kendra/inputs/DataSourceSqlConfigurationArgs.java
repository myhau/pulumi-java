// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceQueryIdentifiersEnclosingOption;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceSqlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSqlConfigurationArgs Empty = new DataSourceSqlConfigurationArgs();

    @InputImport(name="queryIdentifiersEnclosingOption")
    private final @Nullable Input<DataSourceQueryIdentifiersEnclosingOption> queryIdentifiersEnclosingOption;

    public Input<DataSourceQueryIdentifiersEnclosingOption> getQueryIdentifiersEnclosingOption() {
        return this.queryIdentifiersEnclosingOption == null ? Input.empty() : this.queryIdentifiersEnclosingOption;
    }

    public DataSourceSqlConfigurationArgs(@Nullable Input<DataSourceQueryIdentifiersEnclosingOption> queryIdentifiersEnclosingOption) {
        this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
    }

    private DataSourceSqlConfigurationArgs() {
        this.queryIdentifiersEnclosingOption = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceQueryIdentifiersEnclosingOption> queryIdentifiersEnclosingOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryIdentifiersEnclosingOption = defaults.queryIdentifiersEnclosingOption;
        }

        public Builder setQueryIdentifiersEnclosingOption(@Nullable Input<DataSourceQueryIdentifiersEnclosingOption> queryIdentifiersEnclosingOption) {
            this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
            return this;
        }

        public Builder setQueryIdentifiersEnclosingOption(@Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
            this.queryIdentifiersEnclosingOption = Input.ofNullable(queryIdentifiersEnclosingOption);
            return this;
        }

        public DataSourceSqlConfigurationArgs build() {
            return new DataSourceSqlConfigurationArgs(queryIdentifiersEnclosingOption);
        }
    }
}