// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse {
    /**
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * 
     */
    private final GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql;
    /**
     * The type of the BigQuery connection.
     * 
     */
    private final String connectionType;
    /**
     * True if there are credentials attached to the BigQuery connection; false otherwise.
     * 
     */
    private final Boolean hasCredential;

    @OutputCustomType.Constructor
    private GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse(
        @OutputCustomType.Parameter("cloudSql") GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql,
        @OutputCustomType.Parameter("connectionType") String connectionType,
        @OutputCustomType.Parameter("hasCredential") Boolean hasCredential) {
        this.cloudSql = cloudSql;
        this.connectionType = connectionType;
        this.hasCredential = hasCredential;
    }

    /**
     * Specification for the BigQuery connection to a Cloud SQL instance.
     * 
    */
    public GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse getCloudSql() {
        return this.cloudSql;
    }
    /**
     * The type of the BigQuery connection.
     * 
    */
    public String getConnectionType() {
        return this.connectionType;
    }
    /**
     * True if there are credentials attached to the BigQuery connection; false otherwise.
     * 
    */
    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql;
        private String connectionType;
        private Boolean hasCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSql = defaults.cloudSql;
    	      this.connectionType = defaults.connectionType;
    	      this.hasCredential = defaults.hasCredential;
        }

        public Builder setCloudSql(GoogleCloudDatacatalogV1CloudSqlBigQueryConnectionSpecResponse cloudSql) {
            this.cloudSql = Objects.requireNonNull(cloudSql);
            return this;
        }

        public Builder setConnectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder setHasCredential(Boolean hasCredential) {
            this.hasCredential = Objects.requireNonNull(hasCredential);
            return this;
        }
        public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse(cloudSql, connectionType, hasCredential);
        }
    }
}
