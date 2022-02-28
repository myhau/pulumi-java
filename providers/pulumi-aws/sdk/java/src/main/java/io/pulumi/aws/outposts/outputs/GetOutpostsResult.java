// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOutpostsResult {
    /**
     * Set of Amazon Resource Names (ARNs).
     * 
     */
    private final List<String> arns;
    private final String availabilityZone;
    private final String availabilityZoneId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of identifiers.
     * 
     */
    private final List<String> ids;
    private final String ownerId;
    private final String siteId;

    @OutputCustomType.Constructor({"arns","availabilityZone","availabilityZoneId","id","ids","ownerId","siteId"})
    private GetOutpostsResult(
        List<String> arns,
        String availabilityZone,
        String availabilityZoneId,
        String id,
        List<String> ids,
        String ownerId,
        String siteId) {
        this.arns = Objects.requireNonNull(arns);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
        this.id = Objects.requireNonNull(id);
        this.ids = Objects.requireNonNull(ids);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.siteId = Objects.requireNonNull(siteId);
    }

    /**
     * Set of Amazon Resource Names (ARNs).
     * 
     */
    public List<String> getArns() {
        return this.arns;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Set of identifiers.
     * 
     */
    public List<String> getIds() {
        return this.ids;
    }
    public String getOwnerId() {
        return this.ownerId;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String availabilityZone;
        private String availabilityZoneId;
        private String id;
        private List<String> ids;
        private String ownerId;
        private String siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.ownerId = defaults.ownerId;
    	      this.siteId = defaults.siteId;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setAvailabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIds(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }
        public GetOutpostsResult build() {
            return new GetOutpostsResult(arns, availabilityZone, availabilityZoneId, id, ids, ownerId, siteId);
        }
    }
}
