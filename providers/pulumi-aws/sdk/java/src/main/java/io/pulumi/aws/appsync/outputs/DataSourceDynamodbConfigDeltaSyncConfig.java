// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceDynamodbConfigDeltaSyncConfig {
    private final @Nullable Integer baseTableTtl;
    private final String deltaSyncTableName;
    private final @Nullable Integer deltaSyncTableTtl;

    @OutputCustomType.Constructor({"baseTableTtl","deltaSyncTableName","deltaSyncTableTtl"})
    private DataSourceDynamodbConfigDeltaSyncConfig(
        @Nullable Integer baseTableTtl,
        String deltaSyncTableName,
        @Nullable Integer deltaSyncTableTtl) {
        this.baseTableTtl = baseTableTtl;
        this.deltaSyncTableName = Objects.requireNonNull(deltaSyncTableName);
        this.deltaSyncTableTtl = deltaSyncTableTtl;
    }

    public Optional<Integer> getBaseTableTtl() {
        return Optional.ofNullable(this.baseTableTtl);
    }
    public String getDeltaSyncTableName() {
        return this.deltaSyncTableName;
    }
    public Optional<Integer> getDeltaSyncTableTtl() {
        return Optional.ofNullable(this.deltaSyncTableTtl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfigDeltaSyncConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer baseTableTtl;
        private String deltaSyncTableName;
        private @Nullable Integer deltaSyncTableTtl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfigDeltaSyncConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseTableTtl = defaults.baseTableTtl;
    	      this.deltaSyncTableName = defaults.deltaSyncTableName;
    	      this.deltaSyncTableTtl = defaults.deltaSyncTableTtl;
        }

        public Builder setBaseTableTtl(@Nullable Integer baseTableTtl) {
            this.baseTableTtl = baseTableTtl;
            return this;
        }

        public Builder setDeltaSyncTableName(String deltaSyncTableName) {
            this.deltaSyncTableName = Objects.requireNonNull(deltaSyncTableName);
            return this;
        }

        public Builder setDeltaSyncTableTtl(@Nullable Integer deltaSyncTableTtl) {
            this.deltaSyncTableTtl = deltaSyncTableTtl;
            return this;
        }
        public DataSourceDynamodbConfigDeltaSyncConfig build() {
            return new DataSourceDynamodbConfigDeltaSyncConfig(baseTableTtl, deltaSyncTableName, deltaSyncTableTtl);
        }
    }
}
