// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetCustomerGatewayFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCustomerGatewayResult {
    /**
     * The ARN of the customer gateway.
     * 
     */
    private final String arn;
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    private final Integer bgpAsn;
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    private final String certificateArn;
    /**
     * A name for the customer gateway device.
     * 
     */
    private final String deviceName;
    private final @Nullable List<GetCustomerGatewayFilter> filters;
    private final String id;
    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    private final String ipAddress;
    /**
     * Map of key-value pairs assigned to the gateway.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"arn","bgpAsn","certificateArn","deviceName","filters","id","ipAddress","tags","type"})
    private GetCustomerGatewayResult(
        String arn,
        Integer bgpAsn,
        String certificateArn,
        String deviceName,
        @Nullable List<GetCustomerGatewayFilter> filters,
        String id,
        String ipAddress,
        Map<String,String> tags,
        String type) {
        this.arn = Objects.requireNonNull(arn);
        this.bgpAsn = Objects.requireNonNull(bgpAsn);
        this.certificateArn = Objects.requireNonNull(certificateArn);
        this.deviceName = Objects.requireNonNull(deviceName);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.tags = Objects.requireNonNull(tags);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The ARN of the customer gateway.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    public Integer getBgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    public String getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * A name for the customer gateway device.
     * 
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    public List<GetCustomerGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Map of key-value pairs assigned to the gateway.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer bgpAsn;
        private String certificateArn;
        private String deviceName;
        private @Nullable List<GetCustomerGatewayFilter> filters;
        private String id;
        private String ipAddress;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.deviceName = defaults.deviceName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setBgpAsn(Integer bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }

        public Builder setCertificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setFilters(@Nullable List<GetCustomerGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCustomerGatewayResult build() {
            return new GetCustomerGatewayResult(arn, bgpAsn, certificateArn, deviceName, filters, id, ipAddress, tags, type);
        }
    }
}
