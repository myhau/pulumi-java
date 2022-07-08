// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2EntityIdResponse;
import com.pulumi.googlenative.dlp.v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2KAnonymityConfigResponse {
    /**
     * @return Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    private final GooglePrivacyDlpV2EntityIdResponse entityId;
    /**
     * @return Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    private final List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;

    @CustomType.Constructor
    private GooglePrivacyDlpV2KAnonymityConfigResponse(
        @CustomType.Parameter("entityId") GooglePrivacyDlpV2EntityIdResponse entityId,
        @CustomType.Parameter("quasiIds") List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
        this.entityId = entityId;
        this.quasiIds = quasiIds;
    }

    /**
     * @return Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    public GooglePrivacyDlpV2EntityIdResponse entityId() {
        return this.entityId;
    }
    /**
     * @return Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    public List<GooglePrivacyDlpV2FieldIdResponse> quasiIds() {
        return this.quasiIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2EntityIdResponse entityId;
        private List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.quasiIds = defaults.quasiIds;
        }

        public Builder entityId(GooglePrivacyDlpV2EntityIdResponse entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }
        public Builder quasiIds(List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2FieldIdResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }        public GooglePrivacyDlpV2KAnonymityConfigResponse build() {
            return new GooglePrivacyDlpV2KAnonymityConfigResponse(entityId, quasiIds);
        }
    }
}
