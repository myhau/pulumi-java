// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetTagsItemResponse {
    private final String tagKey;
    private final String tagValue;

    @OutputCustomType.Constructor({"tagKey","tagValue"})
    private DatasetTagsItemResponse(
        String tagKey,
        String tagValue) {
        this.tagKey = Objects.requireNonNull(tagKey);
        this.tagValue = Objects.requireNonNull(tagValue);
    }

    public String getTagKey() {
        return this.tagKey;
    }
    public String getTagValue() {
        return this.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTagsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagKey;
        private String tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTagsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder setTagKey(String tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }

        public Builder setTagValue(String tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }

        public DatasetTagsItemResponse build() {
            return new DatasetTagsItemResponse(tagKey, tagValue);
        }
    }
}