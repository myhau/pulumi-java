// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResponsePolicyNetworkResponse {
    private final String kind;
    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    private final String networkUrl;

    @OutputCustomType.Constructor
    private ResponsePolicyNetworkResponse(
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("networkUrl") String networkUrl) {
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
    */
    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }
        public ResponsePolicyNetworkResponse build() {
            return new ResponsePolicyNetworkResponse(kind, networkUrl);
        }
    }
}
