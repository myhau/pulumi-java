// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlServerDatabaseDetailsResponse {
    /**
     * The version of SQL Server with which the database is to be made compatible
     * 
     */
    private final Integer compatibilityLevel;
    /**
     * The recovery model of a SQL Server database
     * 
     */
    private final String recoveryModel;

    @OutputCustomType.Constructor({"compatibilityLevel","recoveryModel"})
    private SqlServerDatabaseDetailsResponse(
        Integer compatibilityLevel,
        String recoveryModel) {
        this.compatibilityLevel = compatibilityLevel;
        this.recoveryModel = recoveryModel;
    }

    /**
     * The version of SQL Server with which the database is to be made compatible
     * 
    */
    public Integer getCompatibilityLevel() {
        return this.compatibilityLevel;
    }
    /**
     * The recovery model of a SQL Server database
     * 
    */
    public String getRecoveryModel() {
        return this.recoveryModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerDatabaseDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer compatibilityLevel;
        private String recoveryModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerDatabaseDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.recoveryModel = defaults.recoveryModel;
        }

        public Builder setCompatibilityLevel(Integer compatibilityLevel) {
            this.compatibilityLevel = Objects.requireNonNull(compatibilityLevel);
            return this;
        }

        public Builder setRecoveryModel(String recoveryModel) {
            this.recoveryModel = Objects.requireNonNull(recoveryModel);
            return this;
        }
        public SqlServerDatabaseDetailsResponse build() {
            return new SqlServerDatabaseDetailsResponse(compatibilityLevel, recoveryModel);
        }
    }
}
