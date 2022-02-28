// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceMetadataOption {
    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    private final String httpEndpoint;
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    private final Integer httpPutResponseHopLimit;
    /**
     * If session tokens are required: `optional`, `required`.
     * 
     */
    private final String httpTokens;
    /**
     * If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
     * 
     */
    private final String instanceMetadataTags;

    @OutputCustomType.Constructor({"httpEndpoint","httpPutResponseHopLimit","httpTokens","instanceMetadataTags"})
    private GetInstanceMetadataOption(
        String httpEndpoint,
        Integer httpPutResponseHopLimit,
        String httpTokens,
        String instanceMetadataTags) {
        this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
        this.httpPutResponseHopLimit = Objects.requireNonNull(httpPutResponseHopLimit);
        this.httpTokens = Objects.requireNonNull(httpTokens);
        this.instanceMetadataTags = Objects.requireNonNull(instanceMetadataTags);
    }

    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }
    /**
     * If session tokens are required: `optional`, `required`.
     * 
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }
    /**
     * If access to instance tags is allowed from the metadata service: `enabled`, `disabled`.
     * 
     */
    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMetadataOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpEndpoint;
        private Integer httpPutResponseHopLimit;
        private String httpTokens;
        private String instanceMetadataTags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMetadataOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
    	      this.instanceMetadataTags = defaults.instanceMetadataTags;
        }

        public Builder setHttpEndpoint(String httpEndpoint) {
            this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
            return this;
        }

        public Builder setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Objects.requireNonNull(httpPutResponseHopLimit);
            return this;
        }

        public Builder setHttpTokens(String httpTokens) {
            this.httpTokens = Objects.requireNonNull(httpTokens);
            return this;
        }

        public Builder setInstanceMetadataTags(String instanceMetadataTags) {
            this.instanceMetadataTags = Objects.requireNonNull(instanceMetadataTags);
            return this;
        }
        public GetInstanceMetadataOption build() {
            return new GetInstanceMetadataOption(httpEndpoint, httpPutResponseHopLimit, httpTokens, instanceMetadataTags);
        }
    }
}
