// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerAccessLogs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerAccessLogs Empty = new GetLoadBalancerAccessLogs();

    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="bucketPrefix", required=true)
      private final String bucketPrefix;

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @InputImport(name="interval", required=true)
      private final Integer interval;

    public Integer getInterval() {
        return this.interval;
    }

    public GetLoadBalancerAccessLogs(
        String bucket,
        String bucketPrefix,
        Boolean enabled,
        Integer interval) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketPrefix = Objects.requireNonNull(bucketPrefix, "expected parameter 'bucketPrefix' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
    }

    private GetLoadBalancerAccessLogs() {
        this.bucket = null;
        this.bucketPrefix = null;
        this.enabled = null;
        this.interval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String bucketPrefix;
        private Boolean enabled;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
