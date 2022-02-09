// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataStoreInfoBaseResponse {
    private final String dataStoreType;
    private final String objectType;

    @OutputCustomType.Constructor({"dataStoreType","objectType"})
    private DataStoreInfoBaseResponse(
        String dataStoreType,
        String objectType) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType);
        this.objectType = Objects.requireNonNull(objectType);
    }

    public String getDataStoreType() {
        return this.dataStoreType;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreInfoBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreInfoBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public DataStoreInfoBaseResponse build() {
            return new DataStoreInfoBaseResponse(dataStoreType, objectType);
        }
    }
}