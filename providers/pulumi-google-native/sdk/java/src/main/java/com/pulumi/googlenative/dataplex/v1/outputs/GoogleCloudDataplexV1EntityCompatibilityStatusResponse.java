// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1EntityCompatibilityStatusResponse {
    /**
     * @return Whether this entity is compatible with BigQuery.
     * 
     */
    private final GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse bigquery;
    /**
     * @return Whether this entity is compatible with Hive Metastore.
     * 
     */
    private final GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse hiveMetastore;

    @CustomType.Constructor
    private GoogleCloudDataplexV1EntityCompatibilityStatusResponse(
        @CustomType.Parameter("bigquery") GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse bigquery,
        @CustomType.Parameter("hiveMetastore") GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse hiveMetastore) {
        this.bigquery = bigquery;
        this.hiveMetastore = hiveMetastore;
    }

    /**
     * @return Whether this entity is compatible with BigQuery.
     * 
     */
    public GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse bigquery() {
        return this.bigquery;
    }
    /**
     * @return Whether this entity is compatible with Hive Metastore.
     * 
     */
    public GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse hiveMetastore() {
        return this.hiveMetastore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1EntityCompatibilityStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse bigquery;
        private GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse hiveMetastore;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1EntityCompatibilityStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigquery = defaults.bigquery;
    	      this.hiveMetastore = defaults.hiveMetastore;
        }

        public Builder bigquery(GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse bigquery) {
            this.bigquery = Objects.requireNonNull(bigquery);
            return this;
        }
        public Builder hiveMetastore(GoogleCloudDataplexV1EntityCompatibilityStatusCompatibilityResponse hiveMetastore) {
            this.hiveMetastore = Objects.requireNonNull(hiveMetastore);
            return this;
        }        public GoogleCloudDataplexV1EntityCompatibilityStatusResponse build() {
            return new GoogleCloudDataplexV1EntityCompatibilityStatusResponse(bigquery, hiveMetastore);
        }
    }
}
