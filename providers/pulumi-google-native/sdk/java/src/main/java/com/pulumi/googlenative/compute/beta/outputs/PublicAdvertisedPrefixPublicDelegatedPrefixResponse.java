// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PublicAdvertisedPrefixPublicDelegatedPrefixResponse {
    /**
     * @return The IP address range of the public delegated prefix
     * 
     */
    private final String ipRange;
    /**
     * @return The name of the public delegated prefix
     * 
     */
    private final String name;
    /**
     * @return The project number of the public delegated prefix
     * 
     */
    private final String project;
    /**
     * @return The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    private final String region;
    /**
     * @return The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private PublicAdvertisedPrefixPublicDelegatedPrefixResponse(
        @CustomType.Parameter("ipRange") String ipRange,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("status") String status) {
        this.ipRange = ipRange;
        this.name = name;
        this.project = project;
        this.region = region;
        this.status = status;
    }

    /**
     * @return The IP address range of the public delegated prefix
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }
    /**
     * @return The name of the public delegated prefix
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The project number of the public delegated prefix
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The region of the public delegated prefix if it is regional. If absent, the prefix is global.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The status of the public delegated prefix. Possible values are: INITIALIZING: The public delegated prefix is being initialized and addresses cannot be created yet. ANNOUNCED: The public delegated prefix is active.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String name;
        private String project;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicAdvertisedPrefixPublicDelegatedPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public PublicAdvertisedPrefixPublicDelegatedPrefixResponse build() {
            return new PublicAdvertisedPrefixPublicDelegatedPrefixResponse(ipRange, name, project, region, status);
        }
    }
}
