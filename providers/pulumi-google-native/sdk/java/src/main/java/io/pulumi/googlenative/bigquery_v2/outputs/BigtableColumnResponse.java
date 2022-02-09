// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BigtableColumnResponse {
    private final String encoding;
    private final String fieldName;
    private final Boolean onlyReadLatest;
    private final String qualifierEncoded;
    private final String qualifierString;
    private final String type;

    @OutputCustomType.Constructor({"encoding","fieldName","onlyReadLatest","qualifierEncoded","qualifierString","type"})
    private BigtableColumnResponse(
        String encoding,
        String fieldName,
        Boolean onlyReadLatest,
        String qualifierEncoded,
        String qualifierString,
        String type) {
        this.encoding = Objects.requireNonNull(encoding);
        this.fieldName = Objects.requireNonNull(fieldName);
        this.onlyReadLatest = Objects.requireNonNull(onlyReadLatest);
        this.qualifierEncoded = Objects.requireNonNull(qualifierEncoded);
        this.qualifierString = Objects.requireNonNull(qualifierString);
        this.type = Objects.requireNonNull(type);
    }

    public String getEncoding() {
        return this.encoding;
    }
    public String getFieldName() {
        return this.fieldName;
    }
    public Boolean getOnlyReadLatest() {
        return this.onlyReadLatest;
    }
    public String getQualifierEncoded() {
        return this.qualifierEncoded;
    }
    public String getQualifierString() {
        return this.qualifierString;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigtableColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String fieldName;
        private Boolean onlyReadLatest;
        private String qualifierEncoded;
        private String qualifierString;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BigtableColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldName = defaults.fieldName;
    	      this.onlyReadLatest = defaults.onlyReadLatest;
    	      this.qualifierEncoded = defaults.qualifierEncoded;
    	      this.qualifierString = defaults.qualifierString;
    	      this.type = defaults.type;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setFieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }

        public Builder setOnlyReadLatest(Boolean onlyReadLatest) {
            this.onlyReadLatest = Objects.requireNonNull(onlyReadLatest);
            return this;
        }

        public Builder setQualifierEncoded(String qualifierEncoded) {
            this.qualifierEncoded = Objects.requireNonNull(qualifierEncoded);
            return this;
        }

        public Builder setQualifierString(String qualifierString) {
            this.qualifierString = Objects.requireNonNull(qualifierString);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BigtableColumnResponse build() {
            return new BigtableColumnResponse(encoding, fieldName, onlyReadLatest, qualifierEncoded, qualifierString, type);
        }
    }
}