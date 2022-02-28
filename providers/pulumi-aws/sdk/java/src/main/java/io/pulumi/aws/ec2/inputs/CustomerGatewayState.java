// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayState Empty = new CustomerGatewayState();

    /**
     * The ARN of the customer gateway.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @InputImport(name="bgpAsn")
      private final @Nullable Input<String> bgpAsn;

    public Input<String> getBgpAsn() {
        return this.bgpAsn == null ? Input.empty() : this.bgpAsn;
    }

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * A name for the customer gateway device.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public CustomerGatewayState(
        @Nullable Input<String> arn,
        @Nullable Input<String> bgpAsn,
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> deviceName,
        @Nullable Input<String> ipAddress,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> type) {
        this.arn = arn;
        this.bgpAsn = bgpAsn;
        this.certificateArn = certificateArn;
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private CustomerGatewayState() {
        this.arn = Input.empty();
        this.bgpAsn = Input.empty();
        this.certificateArn = Input.empty();
        this.deviceName = Input.empty();
        this.ipAddress = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> bgpAsn;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.deviceName = defaults.deviceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setBgpAsn(@Nullable Input<String> bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }

        public Builder setBgpAsn(@Nullable String bgpAsn) {
            this.bgpAsn = Input.ofNullable(bgpAsn);
            return this;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public CustomerGatewayState build() {
            return new CustomerGatewayState(arn, bgpAsn, certificateArn, deviceName, ipAddress, tags, tagsAll, type);
        }
    }
}
