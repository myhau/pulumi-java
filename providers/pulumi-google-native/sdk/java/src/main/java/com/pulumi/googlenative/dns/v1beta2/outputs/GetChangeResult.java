// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns.v1beta2.outputs.ResourceRecordSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetChangeResult {
    /**
     * @return Which ResourceRecordSets to add?
     * 
     */
    private final List<ResourceRecordSetResponse> additions;
    /**
     * @return Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    private final List<ResourceRecordSetResponse> deletions;
    /**
     * @return If the DNS queries for the zone will be served.
     * 
     */
    private final Boolean isServing;
    private final String kind;
    /**
     * @return The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    private final String startTime;
    /**
     * @return Status of the operation (output only). A status of &#34;done&#34; means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetChangeResult(
        @CustomType.Parameter("additions") List<ResourceRecordSetResponse> additions,
        @CustomType.Parameter("deletions") List<ResourceRecordSetResponse> deletions,
        @CustomType.Parameter("isServing") Boolean isServing,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status) {
        this.additions = additions;
        this.deletions = deletions;
        this.isServing = isServing;
        this.kind = kind;
        this.startTime = startTime;
        this.status = status;
    }

    /**
     * @return Which ResourceRecordSets to add?
     * 
     */
    public List<ResourceRecordSetResponse> additions() {
        return this.additions;
    }
    /**
     * @return Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    public List<ResourceRecordSetResponse> deletions() {
        return this.deletions;
    }
    /**
     * @return If the DNS queries for the zone will be served.
     * 
     */
    public Boolean isServing() {
        return this.isServing;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Status of the operation (output only). A status of &#34;done&#34; means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChangeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceRecordSetResponse> additions;
        private List<ResourceRecordSetResponse> deletions;
        private Boolean isServing;
        private String kind;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChangeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additions = defaults.additions;
    	      this.deletions = defaults.deletions;
    	      this.isServing = defaults.isServing;
    	      this.kind = defaults.kind;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder additions(List<ResourceRecordSetResponse> additions) {
            this.additions = Objects.requireNonNull(additions);
            return this;
        }
        public Builder additions(ResourceRecordSetResponse... additions) {
            return additions(List.of(additions));
        }
        public Builder deletions(List<ResourceRecordSetResponse> deletions) {
            this.deletions = Objects.requireNonNull(deletions);
            return this;
        }
        public Builder deletions(ResourceRecordSetResponse... deletions) {
            return deletions(List.of(deletions));
        }
        public Builder isServing(Boolean isServing) {
            this.isServing = Objects.requireNonNull(isServing);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetChangeResult build() {
            return new GetChangeResult(additions, deletions, isServing, kind, startTime, status);
        }
    }
}
