// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransitGatewayResult {
    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
     */
    private final Integer amazonSideAsn;
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    private final String arn;
    /**
     * Identifier of the default association route table
     * 
     */
    private final String associationDefaultRouteTableId;
    /**
     * Whether resource attachment requests are automatically accepted.
     * 
     */
    private final String autoAcceptSharedAttachments;
    /**
     * Whether resource attachments are automatically associated with the default association route table.
     * 
     */
    private final String defaultRouteTableAssociation;
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table.
     * 
     */
    private final String defaultRouteTablePropagation;
    /**
     * Description of the EC2 Transit Gateway
     * 
     */
    private final String description;
    /**
     * Whether DNS support is enabled.
     * 
     */
    private final String dnsSupport;
    private final @Nullable List<GetTransitGatewayFilter> filters;
    /**
     * EC2 Transit Gateway identifier
     * 
     */
    private final String id;
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    private final String ownerId;
    /**
     * Identifier of the default propagation route table.
     * 
     */
    private final String propagationDefaultRouteTableId;
    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
     */
    private final Map<String,String> tags;
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled.
     * 
     */
    private final String vpnEcmpSupport;

    @OutputCustomType.Constructor({"amazonSideAsn","arn","associationDefaultRouteTableId","autoAcceptSharedAttachments","defaultRouteTableAssociation","defaultRouteTablePropagation","description","dnsSupport","filters","id","ownerId","propagationDefaultRouteTableId","tags","vpnEcmpSupport"})
    private GetTransitGatewayResult(
        Integer amazonSideAsn,
        String arn,
        String associationDefaultRouteTableId,
        String autoAcceptSharedAttachments,
        String defaultRouteTableAssociation,
        String defaultRouteTablePropagation,
        String description,
        String dnsSupport,
        @Nullable List<GetTransitGatewayFilter> filters,
        String id,
        String ownerId,
        String propagationDefaultRouteTableId,
        Map<String,String> tags,
        String vpnEcmpSupport) {
        this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
        this.arn = Objects.requireNonNull(arn);
        this.associationDefaultRouteTableId = Objects.requireNonNull(associationDefaultRouteTableId);
        this.autoAcceptSharedAttachments = Objects.requireNonNull(autoAcceptSharedAttachments);
        this.defaultRouteTableAssociation = Objects.requireNonNull(defaultRouteTableAssociation);
        this.defaultRouteTablePropagation = Objects.requireNonNull(defaultRouteTablePropagation);
        this.description = Objects.requireNonNull(description);
        this.dnsSupport = Objects.requireNonNull(dnsSupport);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.propagationDefaultRouteTableId = Objects.requireNonNull(propagationDefaultRouteTableId);
        this.tags = Objects.requireNonNull(tags);
        this.vpnEcmpSupport = Objects.requireNonNull(vpnEcmpSupport);
    }

    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
     */
    public Integer getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Identifier of the default association route table
     * 
     */
    public String getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    /**
     * Whether resource attachment requests are automatically accepted.
     * 
     */
    public String getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }
    /**
     * Whether resource attachments are automatically associated with the default association route table.
     * 
     */
    public String getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table.
     * 
     */
    public String getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }
    /**
     * Description of the EC2 Transit Gateway
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether DNS support is enabled.
     * 
     */
    public String getDnsSupport() {
        return this.dnsSupport;
    }
    public List<GetTransitGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * EC2 Transit Gateway identifier
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * Identifier of the default propagation route table.
     * 
     */
    public String getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled.
     * 
     */
    public String getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer amazonSideAsn;
        private String arn;
        private String associationDefaultRouteTableId;
        private String autoAcceptSharedAttachments;
        private String defaultRouteTableAssociation;
        private String defaultRouteTablePropagation;
        private String description;
        private String dnsSupport;
        private @Nullable List<GetTransitGatewayFilter> filters;
        private String id;
        private String ownerId;
        private String propagationDefaultRouteTableId;
        private Map<String,String> tags;
        private String vpnEcmpSupport;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        public Builder setAmazonSideAsn(Integer amazonSideAsn) {
            this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAssociationDefaultRouteTableId(String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Objects.requireNonNull(associationDefaultRouteTableId);
            return this;
        }

        public Builder setAutoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Objects.requireNonNull(autoAcceptSharedAttachments);
            return this;
        }

        public Builder setDefaultRouteTableAssociation(String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Objects.requireNonNull(defaultRouteTableAssociation);
            return this;
        }

        public Builder setDefaultRouteTablePropagation(String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Objects.requireNonNull(defaultRouteTablePropagation);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDnsSupport(String dnsSupport) {
            this.dnsSupport = Objects.requireNonNull(dnsSupport);
            return this;
        }

        public Builder setFilters(@Nullable List<GetTransitGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setPropagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Objects.requireNonNull(propagationDefaultRouteTableId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpnEcmpSupport(String vpnEcmpSupport) {
            this.vpnEcmpSupport = Objects.requireNonNull(vpnEcmpSupport);
            return this;
        }
        public GetTransitGatewayResult build() {
            return new GetTransitGatewayResult(amazonSideAsn, arn, associationDefaultRouteTableId, autoAcceptSharedAttachments, defaultRouteTableAssociation, defaultRouteTablePropagation, description, dnsSupport, filters, id, ownerId, propagationDefaultRouteTableId, tags, vpnEcmpSupport);
        }
    }
}
