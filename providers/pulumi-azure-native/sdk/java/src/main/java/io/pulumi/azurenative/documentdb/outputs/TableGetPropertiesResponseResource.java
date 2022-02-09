// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TableGetPropertiesResponseResource {
    private final String etag;
    private final String id;
    private final String rid;
    private final Double ts;

    @OutputCustomType.Constructor({"etag","id","rid","ts"})
    private TableGetPropertiesResponseResource(
        String etag,
        String id,
        String rid,
        Double ts) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.rid = Objects.requireNonNull(rid);
        this.ts = Objects.requireNonNull(ts);
    }

    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getRid() {
        return this.rid;
    }
    public Double getTs() {
        return this.ts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String rid;
        private Double ts;

        public Builder() {
    	      // Empty
        }

        public Builder(TableGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public TableGetPropertiesResponseResource build() {
            return new TableGetPropertiesResponseResource(etag, id, rid, ts);
        }
    }
}