// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IpMappingResponse {
    private final String ipAddress;
    private final String timeToRetire;
    private final String type;

    @OutputCustomType.Constructor({"ipAddress","timeToRetire","type"})
    private IpMappingResponse(
        String ipAddress,
        String timeToRetire,
        String type) {
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.timeToRetire = Objects.requireNonNull(timeToRetire);
        this.type = Objects.requireNonNull(type);
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getTimeToRetire() {
        return this.timeToRetire;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String timeToRetire;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setTimeToRetire(String timeToRetire) {
            this.timeToRetire = Objects.requireNonNull(timeToRetire);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public IpMappingResponse build() {
            return new IpMappingResponse(ipAddress, timeToRetire, type);
        }
    }
}