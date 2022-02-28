// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceHealthCheckConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckConfigGetArgs Empty = new ServiceHealthCheckConfigGetArgs();

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    @InputImport(name="failureThreshold")
      private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    /**
     * The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don't specify a value, the default value is /.
     * 
     */
    @InputImport(name="resourcePath")
      private final @Nullable Input<String> resourcePath;

    public Input<String> getResourcePath() {
        return this.resourcePath == null ? Input.empty() : this.resourcePath;
    }

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ServiceHealthCheckConfigGetArgs(
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<String> resourcePath,
        @Nullable Input<String> type) {
        this.failureThreshold = failureThreshold;
        this.resourcePath = resourcePath;
        this.type = type;
    }

    private ServiceHealthCheckConfigGetArgs() {
        this.failureThreshold = Input.empty();
        this.resourcePath = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<String> resourcePath;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.resourcePath = defaults.resourcePath;
    	      this.type = defaults.type;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setResourcePath(@Nullable Input<String> resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setResourcePath(@Nullable String resourcePath) {
            this.resourcePath = Input.ofNullable(resourcePath);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ServiceHealthCheckConfigGetArgs build() {
            return new ServiceHealthCheckConfigGetArgs(failureThreshold, resourcePath, type);
        }
    }
}
