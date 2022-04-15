// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managementpartner;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartnerArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartnerArgs Empty = new PartnerArgs();

    /**
     * Id of the Partner
     * 
     */
    @Import(name="partnerId")
      private final @Nullable Output<String> partnerId;

    public Output<String> partnerId() {
        return this.partnerId == null ? Codegen.empty() : this.partnerId;
    }

    public PartnerArgs(@Nullable Output<String> partnerId) {
        this.partnerId = partnerId;
    }

    private PartnerArgs() {
        this.partnerId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> partnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerId = defaults.partnerId;
        }

        public Builder partnerId(@Nullable Output<String> partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Builder partnerId(@Nullable String partnerId) {
            this.partnerId = Codegen.ofNullable(partnerId);
            return this;
        }        public PartnerArgs build() {
            return new PartnerArgs(partnerId);
        }
    }
}
