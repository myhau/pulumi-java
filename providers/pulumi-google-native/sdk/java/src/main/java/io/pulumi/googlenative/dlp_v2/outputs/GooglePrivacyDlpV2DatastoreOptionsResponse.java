// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KindExpressionResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PartitionIdResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2DatastoreOptionsResponse {
    /**
     * The kind to process.
     * 
     */
    private final GooglePrivacyDlpV2KindExpressionResponse kind;
    /**
     * A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty.
     * 
     */
    private final GooglePrivacyDlpV2PartitionIdResponse partitionId;

    @OutputCustomType.Constructor({"kind","partitionId"})
    private GooglePrivacyDlpV2DatastoreOptionsResponse(
        GooglePrivacyDlpV2KindExpressionResponse kind,
        GooglePrivacyDlpV2PartitionIdResponse partitionId) {
        this.kind = kind;
        this.partitionId = partitionId;
    }

    /**
     * The kind to process.
     * 
    */
    public GooglePrivacyDlpV2KindExpressionResponse getKind() {
        return this.kind;
    }
    /**
     * A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty.
     * 
    */
    public GooglePrivacyDlpV2PartitionIdResponse getPartitionId() {
        return this.partitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DatastoreOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2KindExpressionResponse kind;
        private GooglePrivacyDlpV2PartitionIdResponse partitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DatastoreOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.partitionId = defaults.partitionId;
        }

        public Builder setKind(GooglePrivacyDlpV2KindExpressionResponse kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setPartitionId(GooglePrivacyDlpV2PartitionIdResponse partitionId) {
            this.partitionId = Objects.requireNonNull(partitionId);
            return this;
        }
        public GooglePrivacyDlpV2DatastoreOptionsResponse build() {
            return new GooglePrivacyDlpV2DatastoreOptionsResponse(kind, partitionId);
        }
    }
}
