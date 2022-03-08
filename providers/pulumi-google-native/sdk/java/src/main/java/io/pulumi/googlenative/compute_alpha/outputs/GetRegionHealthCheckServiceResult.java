// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionHealthCheckServiceResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-to-date fingerprint must be provided in order to patch/update the HealthCheckService; Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the HealthCheckService.
     * 
     */
    private final String fingerprint;
    /**
     * A list of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT or portSpecification=USE_FIXED_PORT. For regional HealthCheckService, the HealthCheck must be regional and in the same region. For global HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks must belong to the same region as zones of NEGs.
     * 
     */
    private final List<String> healthChecks;
    /**
     * Optional. Policy for how the results from multiple health checks for the same endpoint are aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth message is returned for each pair in the health check service. - AND. If any health check of an endpoint reports UNHEALTHY, then UNHEALTHY is the HealthState of the endpoint. If all health checks report HEALTHY, the HealthState of the endpoint is HEALTHY. .
     * 
     */
    private final String healthStatusAggregationPolicy;
    /**
     * [Output only] Type of the resource. Always compute#healthCheckServicefor health check services.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * A list of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
     * 
     */
    private final List<String> networkEndpointGroups;
    /**
     * A list of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of endpoints for receiving notifications of change in health status. For regional HealthCheckService, NotificationEndpoint must be regional and in the same region. For global HealthCheckService, NotificationEndpoint must be global.
     * 
     */
    private final List<String> notificationEndpoints;
    /**
     * URL of the region where the health check service resides. This field is not applicable to global health check services. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL with id for the resource.
     * 
     */
    private final String selfLinkWithId;

    @OutputCustomType.Constructor({"creationTimestamp","description","fingerprint","healthChecks","healthStatusAggregationPolicy","kind","name","networkEndpointGroups","notificationEndpoints","region","selfLink","selfLinkWithId"})
    private GetRegionHealthCheckServiceResult(
        String creationTimestamp,
        String description,
        String fingerprint,
        List<String> healthChecks,
        String healthStatusAggregationPolicy,
        String kind,
        String name,
        List<String> networkEndpointGroups,
        List<String> notificationEndpoints,
        String region,
        String selfLink,
        String selfLinkWithId) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.healthChecks = healthChecks;
        this.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
        this.kind = kind;
        this.name = name;
        this.networkEndpointGroups = networkEndpointGroups;
        this.notificationEndpoints = notificationEndpoints;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-to-date fingerprint must be provided in order to patch/update the HealthCheckService; Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the HealthCheckService.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * A list of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT or portSpecification=USE_FIXED_PORT. For regional HealthCheckService, the HealthCheck must be regional and in the same region. For global HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks must belong to the same region as zones of NEGs.
     * 
    */
    public List<String> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * Optional. Policy for how the results from multiple health checks for the same endpoint are aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth message is returned for each pair in the health check service. - AND. If any health check of an endpoint reports UNHEALTHY, then UNHEALTHY is the HealthState of the endpoint. If all health checks report HEALTHY, the HealthState of the endpoint is HEALTHY. .
     * 
    */
    public String getHealthStatusAggregationPolicy() {
        return this.healthStatusAggregationPolicy;
    }
    /**
     * [Output only] Type of the resource. Always compute#healthCheckServicefor health check services.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
     * 
    */
    public List<String> getNetworkEndpointGroups() {
        return this.networkEndpointGroups;
    }
    /**
     * A list of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of endpoints for receiving notifications of change in health status. For regional HealthCheckService, NotificationEndpoint must be regional and in the same region. For global HealthCheckService, NotificationEndpoint must be global.
     * 
    */
    public List<String> getNotificationEndpoints() {
        return this.notificationEndpoints;
    }
    /**
     * URL of the region where the health check service resides. This field is not applicable to global health check services. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL with id for the resource.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionHealthCheckServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private List<String> healthChecks;
        private String healthStatusAggregationPolicy;
        private String kind;
        private String name;
        private List<String> networkEndpointGroups;
        private List<String> notificationEndpoints;
        private String region;
        private String selfLink;
        private String selfLinkWithId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionHealthCheckServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthStatusAggregationPolicy = defaults.healthStatusAggregationPolicy;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.networkEndpointGroups = defaults.networkEndpointGroups;
    	      this.notificationEndpoints = defaults.notificationEndpoints;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setHealthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setHealthStatusAggregationPolicy(String healthStatusAggregationPolicy) {
            this.healthStatusAggregationPolicy = Objects.requireNonNull(healthStatusAggregationPolicy);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkEndpointGroups(List<String> networkEndpointGroups) {
            this.networkEndpointGroups = Objects.requireNonNull(networkEndpointGroups);
            return this;
        }

        public Builder setNotificationEndpoints(List<String> notificationEndpoints) {
            this.notificationEndpoints = Objects.requireNonNull(notificationEndpoints);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public GetRegionHealthCheckServiceResult build() {
            return new GetRegionHealthCheckServiceResult(creationTimestamp, description, fingerprint, healthChecks, healthStatusAggregationPolicy, kind, name, networkEndpointGroups, notificationEndpoints, region, selfLink, selfLinkWithId);
        }
    }
}
