// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.v1.outputs.PublicDelegatedPrefixPublicDelegatedSubPrefixResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPublicDelegatedPrefixResult {
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
     * 
     */
    private final String fingerprint;
    /**
     * @return The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    private final String ipCidrRange;
    /**
     * @return If true, the prefix will be live migrated.
     * 
     */
    private final Boolean isLiveMigration;
    /**
     * @return Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
     * 
     */
    private final String kind;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    private final String parentPrefix;
    /**
     * @return The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    private final List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs;
    /**
     * @return URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetPublicDelegatedPrefixResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("isLiveMigration") Boolean isLiveMigration,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parentPrefix") String parentPrefix,
        @CustomType.Parameter("publicDelegatedSubPrefixs") List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("status") String status) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.ipCidrRange = ipCidrRange;
        this.isLiveMigration = isLiveMigration;
        this.kind = kind;
        this.name = name;
        this.parentPrefix = parentPrefix;
        this.publicDelegatedSubPrefixs = publicDelegatedSubPrefixs;
        this.region = region;
        this.selfLink = selfLink;
        this.status = status;
    }

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicDelegatedPrefix. An up-to-date fingerprint must be provided in order to update the PublicDelegatedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicDelegatedPrefix.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The IPv4 address range, in CIDR format, represented by this public delegated prefix.
     * 
     */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * @return If true, the prefix will be live migrated.
     * 
     */
    public Boolean isLiveMigration() {
        return this.isLiveMigration;
    }
    /**
     * @return Type of the resource. Always compute#publicDelegatedPrefix for public delegated prefixes.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The URL of parent prefix. Either PublicAdvertisedPrefix or PublicDelegatedPrefix.
     * 
     */
    public String parentPrefix() {
        return this.parentPrefix;
    }
    /**
     * @return The list of sub public delegated prefixes that exist for this public delegated prefix.
     * 
     */
    public List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs() {
        return this.publicDelegatedSubPrefixs;
    }
    /**
     * @return URL of the region where the public delegated prefix resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The status of the public delegated prefix, which can be one of following values: - `INITIALIZING` The public delegated prefix is being initialized and addresses cannot be created yet. - `READY_TO_ANNOUNCE` The public delegated prefix is a live migration prefix and is active. - `ANNOUNCED` The public delegated prefix is active. - `DELETING` The public delegated prefix is being deprovsioned.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicDelegatedPrefixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String ipCidrRange;
        private Boolean isLiveMigration;
        private String kind;
        private String name;
        private String parentPrefix;
        private List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs;
        private String region;
        private String selfLink;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicDelegatedPrefixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isLiveMigration = defaults.isLiveMigration;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parentPrefix = defaults.parentPrefix;
    	      this.publicDelegatedSubPrefixs = defaults.publicDelegatedSubPrefixs;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder isLiveMigration(Boolean isLiveMigration) {
            this.isLiveMigration = Objects.requireNonNull(isLiveMigration);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parentPrefix(String parentPrefix) {
            this.parentPrefix = Objects.requireNonNull(parentPrefix);
            return this;
        }
        public Builder publicDelegatedSubPrefixs(List<PublicDelegatedPrefixPublicDelegatedSubPrefixResponse> publicDelegatedSubPrefixs) {
            this.publicDelegatedSubPrefixs = Objects.requireNonNull(publicDelegatedSubPrefixs);
            return this;
        }
        public Builder publicDelegatedSubPrefixs(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse... publicDelegatedSubPrefixs) {
            return publicDelegatedSubPrefixs(List.of(publicDelegatedSubPrefixs));
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetPublicDelegatedPrefixResult build() {
            return new GetPublicDelegatedPrefixResult(creationTimestamp, description, fingerprint, ipCidrRange, isLiveMigration, kind, name, parentPrefix, publicDelegatedSubPrefixs, region, selfLink, status);
        }
    }
}
