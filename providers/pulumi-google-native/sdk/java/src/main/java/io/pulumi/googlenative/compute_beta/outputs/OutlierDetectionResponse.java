// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.DurationResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class OutlierDetectionResponse {
    /**
     * The base time that a host is ejected for. The real ejection time is equal to the base ejection time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
     * 
     */
    private final DurationResponse baseEjectionTime;
    /**
     * Number of errors before a host is ejected from the connection pool. When the backend host is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
     * 
     */
    private final Integer consecutiveErrors;
    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
     * 
     */
    private final Integer consecutiveGatewayFailure;
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    private final Integer enforcingConsecutiveErrors;
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    private final Integer enforcingConsecutiveGatewayFailure;
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    private final Integer enforcingSuccessRate;
    /**
     * Time interval between ejection analysis sweeps. This can result in both new ejections as well as hosts being returned to service. Defaults to 1 second.
     * 
     */
    private final DurationResponse interval;
    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service that can be ejected. Defaults to 50%.
     * 
     */
    private final Integer maxEjectionPercent;
    /**
     * The number of hosts in a cluster that must have enough request volume to detect success rate outliers. If the number of hosts is less than this setting, outlier detection via success rate statistics is not performed for any host in the cluster. Defaults to 5.
     * 
     */
    private final Integer successRateMinimumHosts;
    /**
     * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this host in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that host. Defaults to 100.
     * 
     */
    private final Integer successRateRequestVolume;
    /**
     * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
     * 
     */
    private final Integer successRateStdevFactor;

    @OutputCustomType.Constructor
    private OutlierDetectionResponse(
        @OutputCustomType.Parameter("baseEjectionTime") DurationResponse baseEjectionTime,
        @OutputCustomType.Parameter("consecutiveErrors") Integer consecutiveErrors,
        @OutputCustomType.Parameter("consecutiveGatewayFailure") Integer consecutiveGatewayFailure,
        @OutputCustomType.Parameter("enforcingConsecutiveErrors") Integer enforcingConsecutiveErrors,
        @OutputCustomType.Parameter("enforcingConsecutiveGatewayFailure") Integer enforcingConsecutiveGatewayFailure,
        @OutputCustomType.Parameter("enforcingSuccessRate") Integer enforcingSuccessRate,
        @OutputCustomType.Parameter("interval") DurationResponse interval,
        @OutputCustomType.Parameter("maxEjectionPercent") Integer maxEjectionPercent,
        @OutputCustomType.Parameter("successRateMinimumHosts") Integer successRateMinimumHosts,
        @OutputCustomType.Parameter("successRateRequestVolume") Integer successRateRequestVolume,
        @OutputCustomType.Parameter("successRateStdevFactor") Integer successRateStdevFactor) {
        this.baseEjectionTime = baseEjectionTime;
        this.consecutiveErrors = consecutiveErrors;
        this.consecutiveGatewayFailure = consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = enforcingSuccessRate;
        this.interval = interval;
        this.maxEjectionPercent = maxEjectionPercent;
        this.successRateMinimumHosts = successRateMinimumHosts;
        this.successRateRequestVolume = successRateRequestVolume;
        this.successRateStdevFactor = successRateStdevFactor;
    }

    /**
     * The base time that a host is ejected for. The real ejection time is equal to the base ejection time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
     * 
    */
    public DurationResponse getBaseEjectionTime() {
        return this.baseEjectionTime;
    }
    /**
     * Number of errors before a host is ejected from the connection pool. When the backend host is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
     * 
    */
    public Integer getConsecutiveErrors() {
        return this.consecutiveErrors;
    }
    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
     * 
    */
    public Integer getConsecutiveGatewayFailure() {
        return this.consecutiveGatewayFailure;
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
    */
    public Integer getEnforcingConsecutiveErrors() {
        return this.enforcingConsecutiveErrors;
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
    */
    public Integer getEnforcingConsecutiveGatewayFailure() {
        return this.enforcingConsecutiveGatewayFailure;
    }
    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
    */
    public Integer getEnforcingSuccessRate() {
        return this.enforcingSuccessRate;
    }
    /**
     * Time interval between ejection analysis sweeps. This can result in both new ejections as well as hosts being returned to service. Defaults to 1 second.
     * 
    */
    public DurationResponse getInterval() {
        return this.interval;
    }
    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service that can be ejected. Defaults to 50%.
     * 
    */
    public Integer getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }
    /**
     * The number of hosts in a cluster that must have enough request volume to detect success rate outliers. If the number of hosts is less than this setting, outlier detection via success rate statistics is not performed for any host in the cluster. Defaults to 5.
     * 
    */
    public Integer getSuccessRateMinimumHosts() {
        return this.successRateMinimumHosts;
    }
    /**
     * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this host in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that host. Defaults to 100.
     * 
    */
    public Integer getSuccessRateRequestVolume() {
        return this.successRateRequestVolume;
    }
    /**
     * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
     * 
    */
    public Integer getSuccessRateStdevFactor() {
        return this.successRateStdevFactor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutlierDetectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse baseEjectionTime;
        private Integer consecutiveErrors;
        private Integer consecutiveGatewayFailure;
        private Integer enforcingConsecutiveErrors;
        private Integer enforcingConsecutiveGatewayFailure;
        private Integer enforcingSuccessRate;
        private DurationResponse interval;
        private Integer maxEjectionPercent;
        private Integer successRateMinimumHosts;
        private Integer successRateRequestVolume;
        private Integer successRateStdevFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(OutlierDetectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionTime = defaults.baseEjectionTime;
    	      this.consecutiveErrors = defaults.consecutiveErrors;
    	      this.consecutiveGatewayFailure = defaults.consecutiveGatewayFailure;
    	      this.enforcingConsecutiveErrors = defaults.enforcingConsecutiveErrors;
    	      this.enforcingConsecutiveGatewayFailure = defaults.enforcingConsecutiveGatewayFailure;
    	      this.enforcingSuccessRate = defaults.enforcingSuccessRate;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.successRateMinimumHosts = defaults.successRateMinimumHosts;
    	      this.successRateRequestVolume = defaults.successRateRequestVolume;
    	      this.successRateStdevFactor = defaults.successRateStdevFactor;
        }

        public Builder setBaseEjectionTime(DurationResponse baseEjectionTime) {
            this.baseEjectionTime = Objects.requireNonNull(baseEjectionTime);
            return this;
        }

        public Builder setConsecutiveErrors(Integer consecutiveErrors) {
            this.consecutiveErrors = Objects.requireNonNull(consecutiveErrors);
            return this;
        }

        public Builder setConsecutiveGatewayFailure(Integer consecutiveGatewayFailure) {
            this.consecutiveGatewayFailure = Objects.requireNonNull(consecutiveGatewayFailure);
            return this;
        }

        public Builder setEnforcingConsecutiveErrors(Integer enforcingConsecutiveErrors) {
            this.enforcingConsecutiveErrors = Objects.requireNonNull(enforcingConsecutiveErrors);
            return this;
        }

        public Builder setEnforcingConsecutiveGatewayFailure(Integer enforcingConsecutiveGatewayFailure) {
            this.enforcingConsecutiveGatewayFailure = Objects.requireNonNull(enforcingConsecutiveGatewayFailure);
            return this;
        }

        public Builder setEnforcingSuccessRate(Integer enforcingSuccessRate) {
            this.enforcingSuccessRate = Objects.requireNonNull(enforcingSuccessRate);
            return this;
        }

        public Builder setInterval(DurationResponse interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setMaxEjectionPercent(Integer maxEjectionPercent) {
            this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent);
            return this;
        }

        public Builder setSuccessRateMinimumHosts(Integer successRateMinimumHosts) {
            this.successRateMinimumHosts = Objects.requireNonNull(successRateMinimumHosts);
            return this;
        }

        public Builder setSuccessRateRequestVolume(Integer successRateRequestVolume) {
            this.successRateRequestVolume = Objects.requireNonNull(successRateRequestVolume);
            return this;
        }

        public Builder setSuccessRateStdevFactor(Integer successRateStdevFactor) {
            this.successRateStdevFactor = Objects.requireNonNull(successRateStdevFactor);
            return this;
        }
        public OutlierDetectionResponse build() {
            return new OutlierDetectionResponse(baseEjectionTime, consecutiveErrors, consecutiveGatewayFailure, enforcingConsecutiveErrors, enforcingConsecutiveGatewayFailure, enforcingSuccessRate, interval, maxEjectionPercent, successRateMinimumHosts, successRateRequestVolume, successRateStdevFactor);
        }
    }
}
