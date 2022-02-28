// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingGetArgs Empty = new VirtualGatewaySpecLoggingGetArgs();

    /**
     * The access log configuration for a virtual gateway.
     * 
     */
    @InputImport(name="accessLog")
      private final @Nullable Input<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog;

    public Input<VirtualGatewaySpecLoggingAccessLogGetArgs> getAccessLog() {
        return this.accessLog == null ? Input.empty() : this.accessLog;
    }

    public VirtualGatewaySpecLoggingGetArgs(@Nullable Input<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualGatewaySpecLoggingGetArgs() {
        this.accessLog = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder setAccessLog(@Nullable Input<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }

        public Builder setAccessLog(@Nullable VirtualGatewaySpecLoggingAccessLogGetArgs accessLog) {
            this.accessLog = Input.ofNullable(accessLog);
            return this;
        }
        public VirtualGatewaySpecLoggingGetArgs build() {
            return new VirtualGatewaySpecLoggingGetArgs(accessLog);
        }
    }
}
