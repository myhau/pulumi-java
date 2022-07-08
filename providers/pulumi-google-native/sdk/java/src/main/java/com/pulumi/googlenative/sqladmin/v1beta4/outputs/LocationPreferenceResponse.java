// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationPreferenceResponse {
    /**
     * @return The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
     */
    private final String followGaeApplication;
    /**
     * @return This is always `sql#locationPreference`.
     * 
     */
    private final String kind;
    /**
     * @return The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.).
     * 
     */
    private final String secondaryZone;
    /**
     * @return The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private LocationPreferenceResponse(
        @CustomType.Parameter("followGaeApplication") String followGaeApplication,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("secondaryZone") String secondaryZone,
        @CustomType.Parameter("zone") String zone) {
        this.followGaeApplication = followGaeApplication;
        this.kind = kind;
        this.secondaryZone = secondaryZone;
        this.zone = zone;
    }

    /**
     * @return The App Engine application to follow, it must be in the same region as the Cloud SQL instance. WARNING: Changing this might restart the instance.
     * 
     */
    public String followGaeApplication() {
        return this.followGaeApplication;
    }
    /**
     * @return This is always `sql#locationPreference`.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The preferred Compute Engine zone for the secondary/failover (for example: us-central1-a, us-central1-b, etc.).
     * 
     */
    public String secondaryZone() {
        return this.secondaryZone;
    }
    /**
     * @return The preferred Compute Engine zone (for example: us-central1-a, us-central1-b, etc.). WARNING: Changing this might restart the instance.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationPreferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String followGaeApplication;
        private String kind;
        private String secondaryZone;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationPreferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.followGaeApplication = defaults.followGaeApplication;
    	      this.kind = defaults.kind;
    	      this.secondaryZone = defaults.secondaryZone;
    	      this.zone = defaults.zone;
        }

        public Builder followGaeApplication(String followGaeApplication) {
            this.followGaeApplication = Objects.requireNonNull(followGaeApplication);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder secondaryZone(String secondaryZone) {
            this.secondaryZone = Objects.requireNonNull(secondaryZone);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public LocationPreferenceResponse build() {
            return new LocationPreferenceResponse(followGaeApplication, kind, secondaryZone, zone);
        }
    }
}
