// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.AutoscaleSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoDBCollectionGetPropertiesResponseOptions {
    /**
     * Specifies the Autoscale settings.
     * 
     */
    private final @Nullable AutoscaleSettingsResponse autoscaleSettings;
    /**
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
     */
    private final @Nullable Integer throughput;

    @CustomType.Constructor
    private MongoDBCollectionGetPropertiesResponseOptions(
        @CustomType.Parameter("autoscaleSettings") @Nullable AutoscaleSettingsResponse autoscaleSettings,
        @CustomType.Parameter("throughput") @Nullable Integer throughput) {
        this.autoscaleSettings = autoscaleSettings;
        this.throughput = throughput;
    }

    /**
     * Specifies the Autoscale settings.
     * 
    */
    public Optional<AutoscaleSettingsResponse> autoscaleSettings() {
        return Optional.ofNullable(this.autoscaleSettings);
    }
    /**
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     * 
    */
    public Optional<Integer> throughput() {
        return Optional.ofNullable(this.throughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBCollectionGetPropertiesResponseOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleSettingsResponse autoscaleSettings;
        private @Nullable Integer throughput;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBCollectionGetPropertiesResponseOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettings = defaults.autoscaleSettings;
    	      this.throughput = defaults.throughput;
        }

        public Builder autoscaleSettings(@Nullable AutoscaleSettingsResponse autoscaleSettings) {
            this.autoscaleSettings = autoscaleSettings;
            return this;
        }
        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }        public MongoDBCollectionGetPropertiesResponseOptions build() {
            return new MongoDBCollectionGetPropertiesResponseOptions(autoscaleSettings, throughput);
        }
    }
}
