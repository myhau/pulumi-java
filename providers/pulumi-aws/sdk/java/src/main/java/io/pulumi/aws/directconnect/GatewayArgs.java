// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    @InputImport(name="amazonSideAsn", required=true)
      private final Input<String> amazonSideAsn;

    public Input<String> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GatewayArgs(
        Input<String> amazonSideAsn,
        @Nullable Input<String> name) {
        this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn, "expected parameter 'amazonSideAsn' to be non-null");
        this.name = name;
    }

    private GatewayArgs() {
        this.amazonSideAsn = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> amazonSideAsn;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.name = defaults.name;
        }

        public Builder setAmazonSideAsn(Input<String> amazonSideAsn) {
            this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
            return this;
        }

        public Builder setAmazonSideAsn(String amazonSideAsn) {
            this.amazonSideAsn = Input.of(Objects.requireNonNull(amazonSideAsn));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public GatewayArgs build() {
            return new GatewayArgs(amazonSideAsn, name);
        }
    }
}
