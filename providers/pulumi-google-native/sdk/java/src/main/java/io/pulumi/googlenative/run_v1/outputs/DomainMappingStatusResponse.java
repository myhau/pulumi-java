// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1.outputs.GoogleCloudRunV1ConditionResponse;
import io.pulumi.googlenative.run_v1.outputs.ResourceRecordResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DomainMappingStatusResponse {
    /**
     * Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
     */
    private final List<GoogleCloudRunV1ConditionResponse> conditions;
    /**
     * The name of the route that the mapping currently points to.
     * 
     */
    private final String mappedRouteName;
    /**
     * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
     */
    private final Integer observedGeneration;
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    private final List<ResourceRecordResponse> resourceRecords;
    /**
     * Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor
    private DomainMappingStatusResponse(
        @OutputCustomType.Parameter("conditions") List<GoogleCloudRunV1ConditionResponse> conditions,
        @OutputCustomType.Parameter("mappedRouteName") String mappedRouteName,
        @OutputCustomType.Parameter("observedGeneration") Integer observedGeneration,
        @OutputCustomType.Parameter("resourceRecords") List<ResourceRecordResponse> resourceRecords,
        @OutputCustomType.Parameter("url") String url) {
        this.conditions = conditions;
        this.mappedRouteName = mappedRouteName;
        this.observedGeneration = observedGeneration;
        this.resourceRecords = resourceRecords;
        this.url = url;
    }

    /**
     * Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
    */
    public List<GoogleCloudRunV1ConditionResponse> getConditions() {
        return this.conditions;
    }
    /**
     * The name of the route that the mapping currently points to.
     * 
    */
    public String getMappedRouteName() {
        return this.mappedRouteName;
    }
    /**
     * ObservedGeneration is the 'Generation' of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition's status is True or False.
     * 
    */
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }
    /**
     * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.
     * 
    */
    public List<ResourceRecordResponse> getResourceRecords() {
        return this.resourceRecords;
    }
    /**
     * Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRunV1ConditionResponse> conditions;
        private String mappedRouteName;
        private Integer observedGeneration;
        private List<ResourceRecordResponse> resourceRecords;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.mappedRouteName = defaults.mappedRouteName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.url = defaults.url;
        }

        public Builder setConditions(List<GoogleCloudRunV1ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setMappedRouteName(String mappedRouteName) {
            this.mappedRouteName = Objects.requireNonNull(mappedRouteName);
            return this;
        }

        public Builder setObservedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }

        public Builder setResourceRecords(List<ResourceRecordResponse> resourceRecords) {
            this.resourceRecords = Objects.requireNonNull(resourceRecords);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public DomainMappingStatusResponse build() {
            return new DomainMappingStatusResponse(conditions, mappedRouteName, observedGeneration, resourceRecords, url);
        }
    }
}
