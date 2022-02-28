// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerInstance {
    private final String consoleUrl;
    private final List<String> endpoints;
    private final String ipAddress;

    @OutputCustomType.Constructor({"consoleUrl","endpoints","ipAddress"})
    private GetBrokerInstance(
        String consoleUrl,
        List<String> endpoints,
        String ipAddress) {
        this.consoleUrl = Objects.requireNonNull(consoleUrl);
        this.endpoints = Objects.requireNonNull(endpoints);
        this.ipAddress = Objects.requireNonNull(ipAddress);
    }

    public String getConsoleUrl() {
        return this.consoleUrl;
    }
    public List<String> getEndpoints() {
        return this.endpoints;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consoleUrl;
        private List<String> endpoints;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setConsoleUrl(String consoleUrl) {
            this.consoleUrl = Objects.requireNonNull(consoleUrl);
            return this;
        }

        public Builder setEndpoints(List<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public GetBrokerInstance build() {
            return new GetBrokerInstance(consoleUrl, endpoints, ipAddress);
        }
    }
}
