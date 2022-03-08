// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ServiceAttachmentConnectedEndpointResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ServiceAttachmentConsumerProjectLimitResponse;
import io.pulumi.googlenative.compute_alpha.outputs.Uint128Response;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceAttachmentResult {
    /**
     * An array of connections for all the consumers connected to this service attachment.
     * 
     */
    private final List<ServiceAttachmentConnectedEndpointResponse> connectedEndpoints;
    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    private final String connectionPreference;
    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    private final List<ServiceAttachmentConsumerProjectLimitResponse> consumerAcceptLists;
    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    private final List<String> consumerRejectLists;
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
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
     */
    private final List<String> domainNames;
    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    private final Boolean enableProxyProtocol;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
     */
    private final String fingerprint;
    /**
     * Type of the resource. Always compute#serviceAttachment for service attachments.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    private final List<String> natSubnets;
    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    private final String producerForwardingRule;
    /**
     * An 128-bit global unique ID of the PSC service attachment.
     * 
     */
    private final Uint128Response pscServiceAttachmentId;
    /**
     * URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    private final String targetService;

    @OutputCustomType.Constructor({"connectedEndpoints","connectionPreference","consumerAcceptLists","consumerRejectLists","creationTimestamp","description","domainNames","enableProxyProtocol","fingerprint","kind","name","natSubnets","producerForwardingRule","pscServiceAttachmentId","region","selfLink","targetService"})
    private GetServiceAttachmentResult(
        List<ServiceAttachmentConnectedEndpointResponse> connectedEndpoints,
        String connectionPreference,
        List<ServiceAttachmentConsumerProjectLimitResponse> consumerAcceptLists,
        List<String> consumerRejectLists,
        String creationTimestamp,
        String description,
        List<String> domainNames,
        Boolean enableProxyProtocol,
        String fingerprint,
        String kind,
        String name,
        List<String> natSubnets,
        String producerForwardingRule,
        Uint128Response pscServiceAttachmentId,
        String region,
        String selfLink,
        String targetService) {
        this.connectedEndpoints = connectedEndpoints;
        this.connectionPreference = connectionPreference;
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.domainNames = domainNames;
        this.enableProxyProtocol = enableProxyProtocol;
        this.fingerprint = fingerprint;
        this.kind = kind;
        this.name = name;
        this.natSubnets = natSubnets;
        this.producerForwardingRule = producerForwardingRule;
        this.pscServiceAttachmentId = pscServiceAttachmentId;
        this.region = region;
        this.selfLink = selfLink;
        this.targetService = targetService;
    }

    /**
     * An array of connections for all the consumers connected to this service attachment.
     * 
    */
    public List<ServiceAttachmentConnectedEndpointResponse> getConnectedEndpoints() {
        return this.connectedEndpoints;
    }
    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
    */
    public String getConnectionPreference() {
        return this.connectionPreference;
    }
    /**
     * Projects that are allowed to connect to this service attachment.
     * 
    */
    public List<ServiceAttachmentConsumerProjectLimitResponse> getConsumerAcceptLists() {
        return this.consumerAcceptLists;
    }
    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
    */
    public List<String> getConsumerRejectLists() {
        return this.consumerRejectLists;
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
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
    */
    public List<String> getDomainNames() {
        return this.domainNames;
    }
    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
    */
    public Boolean getEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Type of the resource. Always compute#serviceAttachment for service attachments.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
    */
    public List<String> getNatSubnets() {
        return this.natSubnets;
    }
    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
    */
    public String getProducerForwardingRule() {
        return this.producerForwardingRule;
    }
    /**
     * An 128-bit global unique ID of the PSC service attachment.
     * 
    */
    public Uint128Response getPscServiceAttachmentId() {
        return this.pscServiceAttachmentId;
    }
    /**
     * URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
    */
    public String getTargetService() {
        return this.targetService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServiceAttachmentConnectedEndpointResponse> connectedEndpoints;
        private String connectionPreference;
        private List<ServiceAttachmentConsumerProjectLimitResponse> consumerAcceptLists;
        private List<String> consumerRejectLists;
        private String creationTimestamp;
        private String description;
        private List<String> domainNames;
        private Boolean enableProxyProtocol;
        private String fingerprint;
        private String kind;
        private String name;
        private List<String> natSubnets;
        private String producerForwardingRule;
        private Uint128Response pscServiceAttachmentId;
        private String region;
        private String selfLink;
        private String targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedEndpoints = defaults.connectedEndpoints;
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.domainNames = defaults.domainNames;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.producerForwardingRule = defaults.producerForwardingRule;
    	      this.pscServiceAttachmentId = defaults.pscServiceAttachmentId;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.targetService = defaults.targetService;
        }

        public Builder setConnectedEndpoints(List<ServiceAttachmentConnectedEndpointResponse> connectedEndpoints) {
            this.connectedEndpoints = Objects.requireNonNull(connectedEndpoints);
            return this;
        }

        public Builder setConnectionPreference(String connectionPreference) {
            this.connectionPreference = Objects.requireNonNull(connectionPreference);
            return this;
        }

        public Builder setConsumerAcceptLists(List<ServiceAttachmentConsumerProjectLimitResponse> consumerAcceptLists) {
            this.consumerAcceptLists = Objects.requireNonNull(consumerAcceptLists);
            return this;
        }

        public Builder setConsumerRejectLists(List<String> consumerRejectLists) {
            this.consumerRejectLists = Objects.requireNonNull(consumerRejectLists);
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

        public Builder setDomainNames(List<String> domainNames) {
            this.domainNames = Objects.requireNonNull(domainNames);
            return this;
        }

        public Builder setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Objects.requireNonNull(enableProxyProtocol);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNatSubnets(List<String> natSubnets) {
            this.natSubnets = Objects.requireNonNull(natSubnets);
            return this;
        }

        public Builder setProducerForwardingRule(String producerForwardingRule) {
            this.producerForwardingRule = Objects.requireNonNull(producerForwardingRule);
            return this;
        }

        public Builder setPscServiceAttachmentId(Uint128Response pscServiceAttachmentId) {
            this.pscServiceAttachmentId = Objects.requireNonNull(pscServiceAttachmentId);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTargetService(String targetService) {
            this.targetService = Objects.requireNonNull(targetService);
            return this;
        }
        public GetServiceAttachmentResult build() {
            return new GetServiceAttachmentResult(connectedEndpoints, connectionPreference, consumerAcceptLists, consumerRejectLists, creationTimestamp, description, domainNames, enableProxyProtocol, fingerprint, kind, name, natSubnets, producerForwardingRule, pscServiceAttachmentId, region, selfLink, targetService);
        }
    }
}
