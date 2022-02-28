// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnConnectionVgwTelemetryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnConnectionVgwTelemetryGetArgs Empty = new VpnConnectionVgwTelemetryGetArgs();

    /**
     * The number of accepted routes.
     * 
     */
    @InputImport(name="acceptedRouteCount")
      private final @Nullable Input<Integer> acceptedRouteCount;

    public Input<Integer> getAcceptedRouteCount() {
        return this.acceptedRouteCount == null ? Input.empty() : this.acceptedRouteCount;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * The date and time of the last change in status.
     * 
     */
    @InputImport(name="lastStatusChange")
      private final @Nullable Input<String> lastStatusChange;

    public Input<String> getLastStatusChange() {
        return this.lastStatusChange == null ? Input.empty() : this.lastStatusChange;
    }

    /**
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * 
     */
    @InputImport(name="outsideIpAddress")
      private final @Nullable Input<String> outsideIpAddress;

    public Input<String> getOutsideIpAddress() {
        return this.outsideIpAddress == null ? Input.empty() : this.outsideIpAddress;
    }

    /**
     * The status of the VPN tunnel.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * If an error occurs, a description of the error.
     * 
     */
    @InputImport(name="statusMessage")
      private final @Nullable Input<String> statusMessage;

    public Input<String> getStatusMessage() {
        return this.statusMessage == null ? Input.empty() : this.statusMessage;
    }

    public VpnConnectionVgwTelemetryGetArgs(
        @Nullable Input<Integer> acceptedRouteCount,
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> lastStatusChange,
        @Nullable Input<String> outsideIpAddress,
        @Nullable Input<String> status,
        @Nullable Input<String> statusMessage) {
        this.acceptedRouteCount = acceptedRouteCount;
        this.certificateArn = certificateArn;
        this.lastStatusChange = lastStatusChange;
        this.outsideIpAddress = outsideIpAddress;
        this.status = status;
        this.statusMessage = statusMessage;
    }

    private VpnConnectionVgwTelemetryGetArgs() {
        this.acceptedRouteCount = Input.empty();
        this.certificateArn = Input.empty();
        this.lastStatusChange = Input.empty();
        this.outsideIpAddress = Input.empty();
        this.status = Input.empty();
        this.statusMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionVgwTelemetryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> acceptedRouteCount;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> lastStatusChange;
        private @Nullable Input<String> outsideIpAddress;
        private @Nullable Input<String> status;
        private @Nullable Input<String> statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionVgwTelemetryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedRouteCount = defaults.acceptedRouteCount;
    	      this.certificateArn = defaults.certificateArn;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.outsideIpAddress = defaults.outsideIpAddress;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder setAcceptedRouteCount(@Nullable Input<Integer> acceptedRouteCount) {
            this.acceptedRouteCount = acceptedRouteCount;
            return this;
        }

        public Builder setAcceptedRouteCount(@Nullable Integer acceptedRouteCount) {
            this.acceptedRouteCount = Input.ofNullable(acceptedRouteCount);
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

        public Builder setLastStatusChange(@Nullable Input<String> lastStatusChange) {
            this.lastStatusChange = lastStatusChange;
            return this;
        }

        public Builder setLastStatusChange(@Nullable String lastStatusChange) {
            this.lastStatusChange = Input.ofNullable(lastStatusChange);
            return this;
        }

        public Builder setOutsideIpAddress(@Nullable Input<String> outsideIpAddress) {
            this.outsideIpAddress = outsideIpAddress;
            return this;
        }

        public Builder setOutsideIpAddress(@Nullable String outsideIpAddress) {
            this.outsideIpAddress = Input.ofNullable(outsideIpAddress);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setStatusMessage(@Nullable Input<String> statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder setStatusMessage(@Nullable String statusMessage) {
            this.statusMessage = Input.ofNullable(statusMessage);
            return this;
        }
        public VpnConnectionVgwTelemetryGetArgs build() {
            return new VpnConnectionVgwTelemetryGetArgs(acceptedRouteCount, certificateArn, lastStatusChange, outsideIpAddress, status, statusMessage);
        }
    }
}
