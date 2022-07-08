// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.MetadataItemsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetadataResponse {
    /**
     * @return Specifies a fingerprint for this request, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
     */
    private final String fingerprint;
    /**
     * @return Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
     */
    private final List<MetadataItemsItemResponse> items;
    /**
     * @return Type of the resource. Always compute#metadata for metadata.
     * 
     */
    private final String kind;

    @CustomType.Constructor
    private MetadataResponse(
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("items") List<MetadataItemsItemResponse> items,
        @CustomType.Parameter("kind") String kind) {
        this.fingerprint = fingerprint;
        this.items = items;
        this.kind = kind;
    }

    /**
     * @return Specifies a fingerprint for this request, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
     */
    public List<MetadataItemsItemResponse> items() {
        return this.items;
    }
    /**
     * @return Type of the resource. Always compute#metadata for metadata.
     * 
     */
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fingerprint;
        private List<MetadataItemsItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder items(List<MetadataItemsItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(MetadataItemsItemResponse... items) {
            return items(List.of(items));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public MetadataResponse build() {
            return new MetadataResponse(fingerprint, items, kind);
        }
    }
}
