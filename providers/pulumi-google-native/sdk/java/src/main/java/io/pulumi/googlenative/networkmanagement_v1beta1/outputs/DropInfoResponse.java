// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DropInfoResponse {
    /**
     * Cause that the packet is dropped.
     * 
     */
    private final String cause;
    /**
     * URI of the resource that caused the drop.
     * 
     */
    private final String resourceUri;

    @OutputCustomType.Constructor
    private DropInfoResponse(
        @OutputCustomType.Parameter("cause") String cause,
        @OutputCustomType.Parameter("resourceUri") String resourceUri) {
        this.cause = cause;
        this.resourceUri = resourceUri;
    }

    /**
     * Cause that the packet is dropped.
     * 
    */
    public String getCause() {
        return this.cause;
    }
    /**
     * URI of the resource that caused the drop.
     * 
    */
    public String getResourceUri() {
        return this.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DropInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cause;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DropInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setCause(String cause) {
            this.cause = Objects.requireNonNull(cause);
            return this;
        }

        public Builder setResourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public DropInfoResponse build() {
            return new DropInfoResponse(cause, resourceUri);
        }
    }
}
