// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ARecordResponse;
import io.pulumi.azurenative.network.outputs.AaaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CaaRecordResponse;
import io.pulumi.azurenative.network.outputs.CnameRecordResponse;
import io.pulumi.azurenative.network.outputs.MxRecordResponse;
import io.pulumi.azurenative.network.outputs.NsRecordResponse;
import io.pulumi.azurenative.network.outputs.PtrRecordResponse;
import io.pulumi.azurenative.network.outputs.SoaRecordResponse;
import io.pulumi.azurenative.network.outputs.SrvRecordResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TxtRecordResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecordSetResult {
    /**
     * The list of A records in the record set.
     * 
     */
    private final @Nullable List<ARecordResponse> aRecords;
    /**
     * The list of AAAA records in the record set.
     * 
     */
    private final @Nullable List<AaaaRecordResponse> aaaaRecords;
    /**
     * The list of CAA records in the record set.
     * 
     */
    private final @Nullable List<CaaRecordResponse> caaRecords;
    /**
     * The CNAME record in the  record set.
     * 
     */
    private final @Nullable CnameRecordResponse cnameRecord;
    /**
     * The etag of the record set.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified domain name of the record set.
     * 
     */
    private final String fqdn;
    /**
     * The ID of the record set.
     * 
     */
    private final String id;
    /**
     * The metadata attached to the record set.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * The list of MX records in the record set.
     * 
     */
    private final @Nullable List<MxRecordResponse> mxRecords;
    /**
     * The name of the record set.
     * 
     */
    private final String name;
    /**
     * The list of NS records in the record set.
     * 
     */
    private final @Nullable List<NsRecordResponse> nsRecords;
    /**
     * provisioning State of the record set.
     * 
     */
    private final String provisioningState;
    /**
     * The list of PTR records in the record set.
     * 
     */
    private final @Nullable List<PtrRecordResponse> ptrRecords;
    /**
     * The SOA record in the record set.
     * 
     */
    private final @Nullable SoaRecordResponse soaRecord;
    /**
     * The list of SRV records in the record set.
     * 
     */
    private final @Nullable List<SrvRecordResponse> srvRecords;
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
     */
    private final @Nullable SubResourceResponse targetResource;
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    private final @Nullable Double ttl;
    /**
     * The list of TXT records in the record set.
     * 
     */
    private final @Nullable List<TxtRecordResponse> txtRecords;
    /**
     * The type of the record set.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRecordSetResult(
        @CustomType.Parameter("aRecords") @Nullable List<ARecordResponse> aRecords,
        @CustomType.Parameter("aaaaRecords") @Nullable List<AaaaRecordResponse> aaaaRecords,
        @CustomType.Parameter("caaRecords") @Nullable List<CaaRecordResponse> caaRecords,
        @CustomType.Parameter("cnameRecord") @Nullable CnameRecordResponse cnameRecord,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("mxRecords") @Nullable List<MxRecordResponse> mxRecords,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nsRecords") @Nullable List<NsRecordResponse> nsRecords,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("ptrRecords") @Nullable List<PtrRecordResponse> ptrRecords,
        @CustomType.Parameter("soaRecord") @Nullable SoaRecordResponse soaRecord,
        @CustomType.Parameter("srvRecords") @Nullable List<SrvRecordResponse> srvRecords,
        @CustomType.Parameter("targetResource") @Nullable SubResourceResponse targetResource,
        @CustomType.Parameter("ttl") @Nullable Double ttl,
        @CustomType.Parameter("txtRecords") @Nullable List<TxtRecordResponse> txtRecords,
        @CustomType.Parameter("type") String type) {
        this.aRecords = aRecords;
        this.aaaaRecords = aaaaRecords;
        this.caaRecords = caaRecords;
        this.cnameRecord = cnameRecord;
        this.etag = etag;
        this.fqdn = fqdn;
        this.id = id;
        this.metadata = metadata;
        this.mxRecords = mxRecords;
        this.name = name;
        this.nsRecords = nsRecords;
        this.provisioningState = provisioningState;
        this.ptrRecords = ptrRecords;
        this.soaRecord = soaRecord;
        this.srvRecords = srvRecords;
        this.targetResource = targetResource;
        this.ttl = ttl;
        this.txtRecords = txtRecords;
        this.type = type;
    }

    /**
     * The list of A records in the record set.
     * 
    */
    public List<ARecordResponse> aRecords() {
        return this.aRecords == null ? List.of() : this.aRecords;
    }
    /**
     * The list of AAAA records in the record set.
     * 
    */
    public List<AaaaRecordResponse> aaaaRecords() {
        return this.aaaaRecords == null ? List.of() : this.aaaaRecords;
    }
    /**
     * The list of CAA records in the record set.
     * 
    */
    public List<CaaRecordResponse> caaRecords() {
        return this.caaRecords == null ? List.of() : this.caaRecords;
    }
    /**
     * The CNAME record in the  record set.
     * 
    */
    public Optional<CnameRecordResponse> cnameRecord() {
        return Optional.ofNullable(this.cnameRecord);
    }
    /**
     * The etag of the record set.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified domain name of the record set.
     * 
    */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * The ID of the record set.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The metadata attached to the record set.
     * 
    */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The list of MX records in the record set.
     * 
    */
    public List<MxRecordResponse> mxRecords() {
        return this.mxRecords == null ? List.of() : this.mxRecords;
    }
    /**
     * The name of the record set.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The list of NS records in the record set.
     * 
    */
    public List<NsRecordResponse> nsRecords() {
        return this.nsRecords == null ? List.of() : this.nsRecords;
    }
    /**
     * provisioning State of the record set.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of PTR records in the record set.
     * 
    */
    public List<PtrRecordResponse> ptrRecords() {
        return this.ptrRecords == null ? List.of() : this.ptrRecords;
    }
    /**
     * The SOA record in the record set.
     * 
    */
    public Optional<SoaRecordResponse> soaRecord() {
        return Optional.ofNullable(this.soaRecord);
    }
    /**
     * The list of SRV records in the record set.
     * 
    */
    public List<SrvRecordResponse> srvRecords() {
        return this.srvRecords == null ? List.of() : this.srvRecords;
    }
    /**
     * A reference to an azure resource from where the dns resource value is taken.
     * 
    */
    public Optional<SubResourceResponse> targetResource() {
        return Optional.ofNullable(this.targetResource);
    }
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
    */
    public Optional<Double> ttl() {
        return Optional.ofNullable(this.ttl);
    }
    /**
     * The list of TXT records in the record set.
     * 
    */
    public List<TxtRecordResponse> txtRecords() {
        return this.txtRecords == null ? List.of() : this.txtRecords;
    }
    /**
     * The type of the record set.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ARecordResponse> aRecords;
        private @Nullable List<AaaaRecordResponse> aaaaRecords;
        private @Nullable List<CaaRecordResponse> caaRecords;
        private @Nullable CnameRecordResponse cnameRecord;
        private @Nullable String etag;
        private String fqdn;
        private String id;
        private @Nullable Map<String,String> metadata;
        private @Nullable List<MxRecordResponse> mxRecords;
        private String name;
        private @Nullable List<NsRecordResponse> nsRecords;
        private String provisioningState;
        private @Nullable List<PtrRecordResponse> ptrRecords;
        private @Nullable SoaRecordResponse soaRecord;
        private @Nullable List<SrvRecordResponse> srvRecords;
        private @Nullable SubResourceResponse targetResource;
        private @Nullable Double ttl;
        private @Nullable List<TxtRecordResponse> txtRecords;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aRecords = defaults.aRecords;
    	      this.aaaaRecords = defaults.aaaaRecords;
    	      this.caaRecords = defaults.caaRecords;
    	      this.cnameRecord = defaults.cnameRecord;
    	      this.etag = defaults.etag;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.mxRecords = defaults.mxRecords;
    	      this.name = defaults.name;
    	      this.nsRecords = defaults.nsRecords;
    	      this.provisioningState = defaults.provisioningState;
    	      this.ptrRecords = defaults.ptrRecords;
    	      this.soaRecord = defaults.soaRecord;
    	      this.srvRecords = defaults.srvRecords;
    	      this.targetResource = defaults.targetResource;
    	      this.ttl = defaults.ttl;
    	      this.txtRecords = defaults.txtRecords;
    	      this.type = defaults.type;
        }

        public Builder aRecords(@Nullable List<ARecordResponse> aRecords) {
            this.aRecords = aRecords;
            return this;
        }
        public Builder aRecords(ARecordResponse... aRecords) {
            return aRecords(List.of(aRecords));
        }
        public Builder aaaaRecords(@Nullable List<AaaaRecordResponse> aaaaRecords) {
            this.aaaaRecords = aaaaRecords;
            return this;
        }
        public Builder aaaaRecords(AaaaRecordResponse... aaaaRecords) {
            return aaaaRecords(List.of(aaaaRecords));
        }
        public Builder caaRecords(@Nullable List<CaaRecordResponse> caaRecords) {
            this.caaRecords = caaRecords;
            return this;
        }
        public Builder caaRecords(CaaRecordResponse... caaRecords) {
            return caaRecords(List.of(caaRecords));
        }
        public Builder cnameRecord(@Nullable CnameRecordResponse cnameRecord) {
            this.cnameRecord = cnameRecord;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder mxRecords(@Nullable List<MxRecordResponse> mxRecords) {
            this.mxRecords = mxRecords;
            return this;
        }
        public Builder mxRecords(MxRecordResponse... mxRecords) {
            return mxRecords(List.of(mxRecords));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nsRecords(@Nullable List<NsRecordResponse> nsRecords) {
            this.nsRecords = nsRecords;
            return this;
        }
        public Builder nsRecords(NsRecordResponse... nsRecords) {
            return nsRecords(List.of(nsRecords));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder ptrRecords(@Nullable List<PtrRecordResponse> ptrRecords) {
            this.ptrRecords = ptrRecords;
            return this;
        }
        public Builder ptrRecords(PtrRecordResponse... ptrRecords) {
            return ptrRecords(List.of(ptrRecords));
        }
        public Builder soaRecord(@Nullable SoaRecordResponse soaRecord) {
            this.soaRecord = soaRecord;
            return this;
        }
        public Builder srvRecords(@Nullable List<SrvRecordResponse> srvRecords) {
            this.srvRecords = srvRecords;
            return this;
        }
        public Builder srvRecords(SrvRecordResponse... srvRecords) {
            return srvRecords(List.of(srvRecords));
        }
        public Builder targetResource(@Nullable SubResourceResponse targetResource) {
            this.targetResource = targetResource;
            return this;
        }
        public Builder ttl(@Nullable Double ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder txtRecords(@Nullable List<TxtRecordResponse> txtRecords) {
            this.txtRecords = txtRecords;
            return this;
        }
        public Builder txtRecords(TxtRecordResponse... txtRecords) {
            return txtRecords(List.of(txtRecords));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRecordSetResult build() {
            return new GetRecordSetResult(aRecords, aaaaRecords, caaRecords, cnameRecord, etag, fqdn, id, metadata, mxRecords, name, nsRecords, provisioningState, ptrRecords, soaRecord, srvRecords, targetResource, ttl, txtRecords, type);
        }
    }
}
