// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.InterconnectCircuitInfoResponse;
import com.pulumi.googlenative.compute.beta.outputs.InterconnectOutageNotificationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInterconnectResult {
    /**
     * @return Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    private final Boolean adminEnabled;
    /**
     * @return A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    private final List<InterconnectCircuitInfoResponse> circuitInfos;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    private final String customerName;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return A list of outages expected for this Interconnect.
     * 
     */
    private final List<InterconnectOutageNotificationResponse> expectedOutages;
    /**
     * @return IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    private final String googleIpAddress;
    /**
     * @return Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    private final String googleReferenceId;
    /**
     * @return A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    private final List<String> interconnectAttachments;
    /**
     * @return Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    private final String interconnectType;
    /**
     * @return Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this Interconnect, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Interconnect.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    private final String linkType;
    /**
     * @return URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    private final String location;
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * @return Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    private final String nocContactEmail;
    /**
     * @return The current status of this Interconnect&#39;s functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    private final String operationalStatus;
    /**
     * @return IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    private final String peerIpAddress;
    /**
     * @return Number of links actually provisioned in this interconnect.
     * 
     */
    private final Integer provisionedLinkCount;
    /**
     * @return Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    private final Integer requestedLinkCount;
    /**
     * @return Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetInterconnectResult(
        @CustomType.Parameter("adminEnabled") Boolean adminEnabled,
        @CustomType.Parameter("circuitInfos") List<InterconnectCircuitInfoResponse> circuitInfos,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("customerName") String customerName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expectedOutages") List<InterconnectOutageNotificationResponse> expectedOutages,
        @CustomType.Parameter("googleIpAddress") String googleIpAddress,
        @CustomType.Parameter("googleReferenceId") String googleReferenceId,
        @CustomType.Parameter("interconnectAttachments") List<String> interconnectAttachments,
        @CustomType.Parameter("interconnectType") String interconnectType,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("linkType") String linkType,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nocContactEmail") String nocContactEmail,
        @CustomType.Parameter("operationalStatus") String operationalStatus,
        @CustomType.Parameter("peerIpAddress") String peerIpAddress,
        @CustomType.Parameter("provisionedLinkCount") Integer provisionedLinkCount,
        @CustomType.Parameter("requestedLinkCount") Integer requestedLinkCount,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("state") String state) {
        this.adminEnabled = adminEnabled;
        this.circuitInfos = circuitInfos;
        this.creationTimestamp = creationTimestamp;
        this.customerName = customerName;
        this.description = description;
        this.expectedOutages = expectedOutages;
        this.googleIpAddress = googleIpAddress;
        this.googleReferenceId = googleReferenceId;
        this.interconnectAttachments = interconnectAttachments;
        this.interconnectType = interconnectType;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.linkType = linkType;
        this.location = location;
        this.name = name;
        this.nocContactEmail = nocContactEmail;
        this.operationalStatus = operationalStatus;
        this.peerIpAddress = peerIpAddress;
        this.provisionedLinkCount = provisionedLinkCount;
        this.requestedLinkCount = requestedLinkCount;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.state = state;
    }

    /**
     * @return Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    public Boolean adminEnabled() {
        return this.adminEnabled;
    }
    /**
     * @return A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    public List<InterconnectCircuitInfoResponse> circuitInfos() {
        return this.circuitInfos;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    public String customerName() {
        return this.customerName;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A list of outages expected for this Interconnect.
     * 
     */
    public List<InterconnectOutageNotificationResponse> expectedOutages() {
        return this.expectedOutages;
    }
    /**
     * @return IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    public String googleIpAddress() {
        return this.googleIpAddress;
    }
    /**
     * @return Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    public String googleReferenceId() {
        return this.googleReferenceId;
    }
    /**
     * @return A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    public List<String> interconnectAttachments() {
        return this.interconnectAttachments;
    }
    /**
     * @return Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    public String interconnectType() {
        return this.interconnectType;
    }
    /**
     * @return Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this Interconnect, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Interconnect.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    public String linkType() {
        return this.linkType;
    }
    /**
     * @return URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    public String nocContactEmail() {
        return this.nocContactEmail;
    }
    /**
     * @return The current status of this Interconnect&#39;s functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public String operationalStatus() {
        return this.operationalStatus;
    }
    /**
     * @return IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    public String peerIpAddress() {
        return this.peerIpAddress;
    }
    /**
     * @return Number of links actually provisioned in this interconnect.
     * 
     */
    public Integer provisionedLinkCount() {
        return this.provisionedLinkCount;
    }
    /**
     * @return Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    public Integer requestedLinkCount() {
        return this.requestedLinkCount;
    }
    /**
     * @return Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterconnectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean adminEnabled;
        private List<InterconnectCircuitInfoResponse> circuitInfos;
        private String creationTimestamp;
        private String customerName;
        private String description;
        private List<InterconnectOutageNotificationResponse> expectedOutages;
        private String googleIpAddress;
        private String googleReferenceId;
        private List<String> interconnectAttachments;
        private String interconnectType;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String linkType;
        private String location;
        private String name;
        private String nocContactEmail;
        private String operationalStatus;
        private String peerIpAddress;
        private Integer provisionedLinkCount;
        private Integer requestedLinkCount;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInterconnectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEnabled = defaults.adminEnabled;
    	      this.circuitInfos = defaults.circuitInfos;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.expectedOutages = defaults.expectedOutages;
    	      this.googleIpAddress = defaults.googleIpAddress;
    	      this.googleReferenceId = defaults.googleReferenceId;
    	      this.interconnectAttachments = defaults.interconnectAttachments;
    	      this.interconnectType = defaults.interconnectType;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.linkType = defaults.linkType;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nocContactEmail = defaults.nocContactEmail;
    	      this.operationalStatus = defaults.operationalStatus;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.provisionedLinkCount = defaults.provisionedLinkCount;
    	      this.requestedLinkCount = defaults.requestedLinkCount;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.state = defaults.state;
        }

        public Builder adminEnabled(Boolean adminEnabled) {
            this.adminEnabled = Objects.requireNonNull(adminEnabled);
            return this;
        }
        public Builder circuitInfos(List<InterconnectCircuitInfoResponse> circuitInfos) {
            this.circuitInfos = Objects.requireNonNull(circuitInfos);
            return this;
        }
        public Builder circuitInfos(InterconnectCircuitInfoResponse... circuitInfos) {
            return circuitInfos(List.of(circuitInfos));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder customerName(String customerName) {
            this.customerName = Objects.requireNonNull(customerName);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expectedOutages(List<InterconnectOutageNotificationResponse> expectedOutages) {
            this.expectedOutages = Objects.requireNonNull(expectedOutages);
            return this;
        }
        public Builder expectedOutages(InterconnectOutageNotificationResponse... expectedOutages) {
            return expectedOutages(List.of(expectedOutages));
        }
        public Builder googleIpAddress(String googleIpAddress) {
            this.googleIpAddress = Objects.requireNonNull(googleIpAddress);
            return this;
        }
        public Builder googleReferenceId(String googleReferenceId) {
            this.googleReferenceId = Objects.requireNonNull(googleReferenceId);
            return this;
        }
        public Builder interconnectAttachments(List<String> interconnectAttachments) {
            this.interconnectAttachments = Objects.requireNonNull(interconnectAttachments);
            return this;
        }
        public Builder interconnectAttachments(String... interconnectAttachments) {
            return interconnectAttachments(List.of(interconnectAttachments));
        }
        public Builder interconnectType(String interconnectType) {
            this.interconnectType = Objects.requireNonNull(interconnectType);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder linkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nocContactEmail(String nocContactEmail) {
            this.nocContactEmail = Objects.requireNonNull(nocContactEmail);
            return this;
        }
        public Builder operationalStatus(String operationalStatus) {
            this.operationalStatus = Objects.requireNonNull(operationalStatus);
            return this;
        }
        public Builder peerIpAddress(String peerIpAddress) {
            this.peerIpAddress = Objects.requireNonNull(peerIpAddress);
            return this;
        }
        public Builder provisionedLinkCount(Integer provisionedLinkCount) {
            this.provisionedLinkCount = Objects.requireNonNull(provisionedLinkCount);
            return this;
        }
        public Builder requestedLinkCount(Integer requestedLinkCount) {
            this.requestedLinkCount = Objects.requireNonNull(requestedLinkCount);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetInterconnectResult build() {
            return new GetInterconnectResult(adminEnabled, circuitInfos, creationTimestamp, customerName, description, expectedOutages, googleIpAddress, googleReferenceId, interconnectAttachments, interconnectType, kind, labelFingerprint, labels, linkType, location, name, nocContactEmail, operationalStatus, peerIpAddress, provisionedLinkCount, requestedLinkCount, satisfiesPzs, selfLink, state);
        }
    }
}
