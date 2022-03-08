// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerAccessLogs {
    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    private final String bucket;
    /**
     * Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    private final @Nullable String prefix;

    @OutputCustomType.Constructor({"bucket","enabled","prefix"})
    private LoadBalancerAccessLogs(
        String bucket,
        @Nullable Boolean enabled,
        @Nullable String prefix) {
        this.bucket = bucket;
        this.enabled = enabled;
        this.prefix = prefix;
    }

    /**
     * The S3 bucket name to store the logs in.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * Boolean to enable / disable `access_logs`. Defaults to `false`, even when `bucket` is specified.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Boolean enabled;
        private @Nullable String prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.enabled = defaults.enabled;
    	      this.prefix = defaults.prefix;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public LoadBalancerAccessLogs build() {
            return new LoadBalancerAccessLogs(bucket, enabled, prefix);
        }
    }
}
