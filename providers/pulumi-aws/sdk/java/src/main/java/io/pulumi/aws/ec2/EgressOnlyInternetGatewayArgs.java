// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EgressOnlyInternetGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final EgressOnlyInternetGatewayArgs Empty = new EgressOnlyInternetGatewayArgs();

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The VPC ID to create in.
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public EgressOnlyInternetGatewayArgs(
        @Nullable Input<Map<String,String>> tags,
        Input<String> vpcId) {
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private EgressOnlyInternetGatewayArgs() {
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressOnlyInternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressOnlyInternetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public EgressOnlyInternetGatewayArgs build() {
            return new EgressOnlyInternetGatewayArgs(tags, vpcId);
        }
    }
}
