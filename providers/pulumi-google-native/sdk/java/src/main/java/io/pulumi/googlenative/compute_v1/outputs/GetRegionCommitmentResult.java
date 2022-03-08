// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.LicenseResourceCommitmentResponse;
import io.pulumi.googlenative.compute_v1.outputs.ReservationResponse;
import io.pulumi.googlenative.compute_v1.outputs.ResourceCommitmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionCommitmentResult {
    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
     */
    private final Boolean autoRenew;
    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
     */
    private final String category;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Commitment end time in RFC3339 text format.
     * 
     */
    private final String endTimestamp;
    /**
     * Type of the resource. Always compute#commitment for commitments.
     * 
     */
    private final String kind;
    /**
     * The license specification required as part of a license commitment.
     * 
     */
    private final LicenseResourceCommitmentResponse licenseResource;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
     */
    private final String plan;
    /**
     * URL of the region where this commitment may be used.
     * 
     */
    private final String region;
    /**
     * List of reservations in this commitment.
     * 
     */
    private final List<ReservationResponse> reservations;
    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
     */
    private final List<ResourceCommitmentResponse> resources;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Commitment start time in RFC3339 text format.
     * 
     */
    private final String startTimestamp;
    /**
     * Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
     * 
     */
    private final String status;
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    private final String statusMessage;
    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoRenew","category","creationTimestamp","description","endTimestamp","kind","licenseResource","name","plan","region","reservations","resources","selfLink","startTimestamp","status","statusMessage","type"})
    private GetRegionCommitmentResult(
        Boolean autoRenew,
        String category,
        String creationTimestamp,
        String description,
        String endTimestamp,
        String kind,
        LicenseResourceCommitmentResponse licenseResource,
        String name,
        String plan,
        String region,
        List<ReservationResponse> reservations,
        List<ResourceCommitmentResponse> resources,
        String selfLink,
        String startTimestamp,
        String status,
        String statusMessage,
        String type) {
        this.autoRenew = autoRenew;
        this.category = category;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.endTimestamp = endTimestamp;
        this.kind = kind;
        this.licenseResource = licenseResource;
        this.name = name;
        this.plan = plan;
        this.region = region;
        this.reservations = reservations;
        this.resources = resources;
        this.selfLink = selfLink;
        this.startTimestamp = startTimestamp;
        this.status = status;
        this.statusMessage = statusMessage;
        this.type = type;
    }

    /**
     * Specifies whether to enable automatic renewal for the commitment. The default value is false if not specified. The field can be updated until the day of the commitment expiration at 12:00am PST. If the field is set to true, the commitment will be automatically renewed for either one or three years according to the terms of the existing commitment.
     * 
    */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }
    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments composed of software licenses, listed in licenseResources. Note that only MACHINE commitments should have a Type specified.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Commitment end time in RFC3339 text format.
     * 
    */
    public String getEndTimestamp() {
        return this.endTimestamp;
    }
    /**
     * Type of the resource. Always compute#commitment for commitments.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The license specification required as part of a license commitment.
     * 
    */
    public LicenseResourceCommitmentResponse getLicenseResource() {
        return this.licenseResource;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The plan for this commitment, which determines duration and discount rate. The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * 
    */
    public String getPlan() {
        return this.plan;
    }
    /**
     * URL of the region where this commitment may be used.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * List of reservations in this commitment.
     * 
    */
    public List<ReservationResponse> getReservations() {
        return this.reservations;
    }
    /**
     * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource commitments must occur together.
     * 
    */
    public List<ResourceCommitmentResponse> getResources() {
        return this.resources;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Commitment start time in RFC3339 text format.
     * 
    */
    public String getStartTimestamp() {
        return this.startTimestamp;
    }
    /**
     * Status of the commitment with regards to eventual expiration (each commitment has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The type of commitment, which affects the discount rate and the eligible resources. Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized machines.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionCommitmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoRenew;
        private String category;
        private String creationTimestamp;
        private String description;
        private String endTimestamp;
        private String kind;
        private LicenseResourceCommitmentResponse licenseResource;
        private String name;
        private String plan;
        private String region;
        private List<ReservationResponse> reservations;
        private List<ResourceCommitmentResponse> resources;
        private String selfLink;
        private String startTimestamp;
        private String status;
        private String statusMessage;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionCommitmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.category = defaults.category;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.endTimestamp = defaults.endTimestamp;
    	      this.kind = defaults.kind;
    	      this.licenseResource = defaults.licenseResource;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.region = defaults.region;
    	      this.reservations = defaults.reservations;
    	      this.resources = defaults.resources;
    	      this.selfLink = defaults.selfLink;
    	      this.startTimestamp = defaults.startTimestamp;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.type = defaults.type;
        }

        public Builder setAutoRenew(Boolean autoRenew) {
            this.autoRenew = Objects.requireNonNull(autoRenew);
            return this;
        }

        public Builder setCategory(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndTimestamp(String endTimestamp) {
            this.endTimestamp = Objects.requireNonNull(endTimestamp);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenseResource(LicenseResourceCommitmentResponse licenseResource) {
            this.licenseResource = Objects.requireNonNull(licenseResource);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setReservations(List<ReservationResponse> reservations) {
            this.reservations = Objects.requireNonNull(reservations);
            return this;
        }

        public Builder setResources(List<ResourceCommitmentResponse> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStartTimestamp(String startTimestamp) {
            this.startTimestamp = Objects.requireNonNull(startTimestamp);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRegionCommitmentResult build() {
            return new GetRegionCommitmentResult(autoRenew, category, creationTimestamp, description, endTimestamp, kind, licenseResource, name, plan, region, reservations, resources, selfLink, startTimestamp, status, statusMessage, type);
        }
    }
}
