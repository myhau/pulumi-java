// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.websecurityscanner.v1.outputs.AuthenticationResponse;
import com.pulumi.googlenative.websecurityscanner.v1.outputs.ScheduleResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetScanConfigResult {
    /**
     * @return The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    private final AuthenticationResponse authentication;
    /**
     * @return The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    private final List<String> blacklistPatterns;
    /**
     * @return The user provided display name of the ScanConfig.
     * 
     */
    private final String displayName;
    /**
     * @return Controls export of scan configurations and results to Security Command Center.
     * 
     */
    private final String exportToSecurityCommandCenter;
    /**
     * @return Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    private final Boolean ignoreHttpStatusErrors;
    /**
     * @return Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    private final Boolean managedScan;
    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    private final Integer maxQps;
    /**
     * @return The resource name of the ScanConfig. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}&#39;. The ScanConfig IDs are generated by the system.
     * 
     */
    private final String name;
    /**
     * @return The risk level selected for the scan
     * 
     */
    private final String riskLevel;
    /**
     * @return The schedule of the ScanConfig.
     * 
     */
    private final ScheduleResponse schedule;
    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    private final List<String> startingUrls;
    /**
     * @return Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    private final Boolean staticIpScan;
    /**
     * @return The user agent used during scanning.
     * 
     */
    private final String userAgent;

    @CustomType.Constructor
    private GetScanConfigResult(
        @CustomType.Parameter("authentication") AuthenticationResponse authentication,
        @CustomType.Parameter("blacklistPatterns") List<String> blacklistPatterns,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("exportToSecurityCommandCenter") String exportToSecurityCommandCenter,
        @CustomType.Parameter("ignoreHttpStatusErrors") Boolean ignoreHttpStatusErrors,
        @CustomType.Parameter("managedScan") Boolean managedScan,
        @CustomType.Parameter("maxQps") Integer maxQps,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("riskLevel") String riskLevel,
        @CustomType.Parameter("schedule") ScheduleResponse schedule,
        @CustomType.Parameter("startingUrls") List<String> startingUrls,
        @CustomType.Parameter("staticIpScan") Boolean staticIpScan,
        @CustomType.Parameter("userAgent") String userAgent) {
        this.authentication = authentication;
        this.blacklistPatterns = blacklistPatterns;
        this.displayName = displayName;
        this.exportToSecurityCommandCenter = exportToSecurityCommandCenter;
        this.ignoreHttpStatusErrors = ignoreHttpStatusErrors;
        this.managedScan = managedScan;
        this.maxQps = maxQps;
        this.name = name;
        this.riskLevel = riskLevel;
        this.schedule = schedule;
        this.startingUrls = startingUrls;
        this.staticIpScan = staticIpScan;
        this.userAgent = userAgent;
    }

    /**
     * @return The authentication configuration. If specified, service will use the authentication configuration during scanning.
     * 
     */
    public AuthenticationResponse authentication() {
        return this.authentication;
    }
    /**
     * @return The excluded URL patterns as described in https://cloud.google.com/security-command-center/docs/how-to-use-web-security-scanner#excluding_urls
     * 
     */
    public List<String> blacklistPatterns() {
        return this.blacklistPatterns;
    }
    /**
     * @return The user provided display name of the ScanConfig.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Controls export of scan configurations and results to Security Command Center.
     * 
     */
    public String exportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter;
    }
    /**
     * @return Whether to keep scanning even if most requests return HTTP error codes.
     * 
     */
    public Boolean ignoreHttpStatusErrors() {
        return this.ignoreHttpStatusErrors;
    }
    /**
     * @return Whether the scan config is managed by Web Security Scanner, output only.
     * 
     */
    public Boolean managedScan() {
        return this.managedScan;
    }
    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively. If the field is unspecified or its value is set 0, server will default to 15. Other values outside of [5, 20] range will be rejected with INVALID_ARGUMENT error.
     * 
     */
    public Integer maxQps() {
        return this.maxQps;
    }
    /**
     * @return The resource name of the ScanConfig. The name follows the format of &#39;projects/{projectId}/scanConfigs/{scanConfigId}&#39;. The ScanConfig IDs are generated by the system.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The risk level selected for the scan
     * 
     */
    public String riskLevel() {
        return this.riskLevel;
    }
    /**
     * @return The schedule of the ScanConfig.
     * 
     */
    public ScheduleResponse schedule() {
        return this.schedule;
    }
    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    public List<String> startingUrls() {
        return this.startingUrls;
    }
    /**
     * @return Whether the scan configuration has enabled static IP address scan feature. If enabled, the scanner will access applications from static IP addresses.
     * 
     */
    public Boolean staticIpScan() {
        return this.staticIpScan;
    }
    /**
     * @return The user agent used during scanning.
     * 
     */
    public String userAgent() {
        return this.userAgent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScanConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationResponse authentication;
        private List<String> blacklistPatterns;
        private String displayName;
        private String exportToSecurityCommandCenter;
        private Boolean ignoreHttpStatusErrors;
        private Boolean managedScan;
        private Integer maxQps;
        private String name;
        private String riskLevel;
        private ScheduleResponse schedule;
        private List<String> startingUrls;
        private Boolean staticIpScan;
        private String userAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScanConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.blacklistPatterns = defaults.blacklistPatterns;
    	      this.displayName = defaults.displayName;
    	      this.exportToSecurityCommandCenter = defaults.exportToSecurityCommandCenter;
    	      this.ignoreHttpStatusErrors = defaults.ignoreHttpStatusErrors;
    	      this.managedScan = defaults.managedScan;
    	      this.maxQps = defaults.maxQps;
    	      this.name = defaults.name;
    	      this.riskLevel = defaults.riskLevel;
    	      this.schedule = defaults.schedule;
    	      this.startingUrls = defaults.startingUrls;
    	      this.staticIpScan = defaults.staticIpScan;
    	      this.userAgent = defaults.userAgent;
        }

        public Builder authentication(AuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder blacklistPatterns(List<String> blacklistPatterns) {
            this.blacklistPatterns = Objects.requireNonNull(blacklistPatterns);
            return this;
        }
        public Builder blacklistPatterns(String... blacklistPatterns) {
            return blacklistPatterns(List.of(blacklistPatterns));
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder exportToSecurityCommandCenter(String exportToSecurityCommandCenter) {
            this.exportToSecurityCommandCenter = Objects.requireNonNull(exportToSecurityCommandCenter);
            return this;
        }
        public Builder ignoreHttpStatusErrors(Boolean ignoreHttpStatusErrors) {
            this.ignoreHttpStatusErrors = Objects.requireNonNull(ignoreHttpStatusErrors);
            return this;
        }
        public Builder managedScan(Boolean managedScan) {
            this.managedScan = Objects.requireNonNull(managedScan);
            return this;
        }
        public Builder maxQps(Integer maxQps) {
            this.maxQps = Objects.requireNonNull(maxQps);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = Objects.requireNonNull(riskLevel);
            return this;
        }
        public Builder schedule(ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder startingUrls(List<String> startingUrls) {
            this.startingUrls = Objects.requireNonNull(startingUrls);
            return this;
        }
        public Builder startingUrls(String... startingUrls) {
            return startingUrls(List.of(startingUrls));
        }
        public Builder staticIpScan(Boolean staticIpScan) {
            this.staticIpScan = Objects.requireNonNull(staticIpScan);
            return this;
        }
        public Builder userAgent(String userAgent) {
            this.userAgent = Objects.requireNonNull(userAgent);
            return this;
        }        public GetScanConfigResult build() {
            return new GetScanConfigResult(authentication, blacklistPatterns, displayName, exportToSecurityCommandCenter, ignoreHttpStatusErrors, managedScan, maxQps, name, riskLevel, schedule, startingUrls, staticIpScan, userAgent);
        }
    }
}
