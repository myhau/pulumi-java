// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionDefaultCacheBehaviorForwardedValuesCookies {
    /**
     * Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    private final String forward;
    /**
     * If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    private final @Nullable List<String> whitelistedNames;

    @OutputCustomType.Constructor({"forward","whitelistedNames"})
    private DistributionDefaultCacheBehaviorForwardedValuesCookies(
        String forward,
        @Nullable List<String> whitelistedNames) {
        this.forward = Objects.requireNonNull(forward);
        this.whitelistedNames = whitelistedNames;
    }

    /**
     * Specifies whether you want CloudFront to forward
     * cookies to the origin that is associated with this cache behavior. You can
     * specify `all`, `none` or `whitelist`. If `whitelist`, you must include the
     * subsequent `whitelisted_names`
     * 
     */
    public String getForward() {
        return this.forward;
    }
    /**
     * If you have specified `whitelist` to
     * `forward`, the whitelisted cookies that you want CloudFront to forward to
     * your origin.
     * 
     */
    public List<String> getWhitelistedNames() {
        return this.whitelistedNames == null ? List.of() : this.whitelistedNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehaviorForwardedValuesCookies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forward;
        private @Nullable List<String> whitelistedNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionDefaultCacheBehaviorForwardedValuesCookies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forward = defaults.forward;
    	      this.whitelistedNames = defaults.whitelistedNames;
        }

        public Builder setForward(String forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }

        public Builder setWhitelistedNames(@Nullable List<String> whitelistedNames) {
            this.whitelistedNames = whitelistedNames;
            return this;
        }
        public DistributionDefaultCacheBehaviorForwardedValuesCookies build() {
            return new DistributionDefaultCacheBehaviorForwardedValuesCookies(forward, whitelistedNames);
        }
    }
}
