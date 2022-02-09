// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SqlOutOfDiskReportResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlOutOfDiskReportResponse Empty = new SqlOutOfDiskReportResponse();

    @InputImport(name="sqlMinRecommendedIncreaseSizeGb", required=true)
    private final Integer sqlMinRecommendedIncreaseSizeGb;

    public Integer getSqlMinRecommendedIncreaseSizeGb() {
        return this.sqlMinRecommendedIncreaseSizeGb;
    }

    @InputImport(name="sqlOutOfDiskState", required=true)
    private final String sqlOutOfDiskState;

    public String getSqlOutOfDiskState() {
        return this.sqlOutOfDiskState;
    }

    public SqlOutOfDiskReportResponse(
        Integer sqlMinRecommendedIncreaseSizeGb,
        String sqlOutOfDiskState) {
        this.sqlMinRecommendedIncreaseSizeGb = Objects.requireNonNull(sqlMinRecommendedIncreaseSizeGb, "expected parameter 'sqlMinRecommendedIncreaseSizeGb' to be non-null");
        this.sqlOutOfDiskState = Objects.requireNonNull(sqlOutOfDiskState, "expected parameter 'sqlOutOfDiskState' to be non-null");
    }

    private SqlOutOfDiskReportResponse() {
        this.sqlMinRecommendedIncreaseSizeGb = null;
        this.sqlOutOfDiskState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlOutOfDiskReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer sqlMinRecommendedIncreaseSizeGb;
        private String sqlOutOfDiskState;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlOutOfDiskReportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlMinRecommendedIncreaseSizeGb = defaults.sqlMinRecommendedIncreaseSizeGb;
    	      this.sqlOutOfDiskState = defaults.sqlOutOfDiskState;
        }

        public Builder setSqlMinRecommendedIncreaseSizeGb(Integer sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = Objects.requireNonNull(sqlMinRecommendedIncreaseSizeGb);
            return this;
        }

        public Builder setSqlOutOfDiskState(String sqlOutOfDiskState) {
            this.sqlOutOfDiskState = Objects.requireNonNull(sqlOutOfDiskState);
            return this;
        }

        public SqlOutOfDiskReportResponse build() {
            return new SqlOutOfDiskReportResponse(sqlMinRecommendedIncreaseSizeGb, sqlOutOfDiskState);
        }
    }
}