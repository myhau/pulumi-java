// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1.outputs.DsRecordResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleDomainsDnsResponse {
    /**
     * The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
     * 
     */
    private final List<DsRecordResponse> dsRecords;
    /**
     * The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    private final String dsState;
    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
     * 
     */
    private final List<String> nameServers;

    @OutputCustomType.Constructor
    private GoogleDomainsDnsResponse(
        @OutputCustomType.Parameter("dsRecords") List<DsRecordResponse> dsRecords,
        @OutputCustomType.Parameter("dsState") String dsState,
        @OutputCustomType.Parameter("nameServers") List<String> nameServers) {
        this.dsRecords = dsRecords;
        this.dsState = dsState;
        this.nameServers = nameServers;
    }

    /**
     * The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty.
     * 
    */
    public List<DsRecordResponse> getDsRecords() {
        return this.dsRecords;
    }
    /**
     * The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
    */
    public String getDsState() {
        return this.dsState;
    }
    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is automatically populated with the name servers assigned to the Google Domains DNS zone.
     * 
    */
    public List<String> getNameServers() {
        return this.nameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDomainsDnsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DsRecordResponse> dsRecords;
        private String dsState;
        private List<String> nameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDomainsDnsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsRecords = defaults.dsRecords;
    	      this.dsState = defaults.dsState;
    	      this.nameServers = defaults.nameServers;
        }

        public Builder setDsRecords(List<DsRecordResponse> dsRecords) {
            this.dsRecords = Objects.requireNonNull(dsRecords);
            return this;
        }

        public Builder setDsState(String dsState) {
            this.dsState = Objects.requireNonNull(dsState);
            return this;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public GoogleDomainsDnsResponse build() {
            return new GoogleDomainsDnsResponse(dsRecords, dsState, nameServers);
        }
    }
}
