// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ResourceRequirementsResponse {
    /**
     * @return (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final Map<String,String> limits;
    /**
     * @return (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    private final Map<String,String> requests;

    @CustomType.Constructor
    private ResourceRequirementsResponse(
        @CustomType.Parameter("limits") Map<String,String> limits,
        @CustomType.Parameter("requests") Map<String,String> requests) {
        this.limits = limits;
        this.requests = requests;
    }

    /**
     * @return (Optional) Only memory and CPU are supported. Limits describes the maximum amount of compute resources allowed. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    public Map<String,String> limits() {
        return this.limits;
    }
    /**
     * @return (Optional) Only memory and CPU are supported. Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. The values of the map is string form of the &#39;quantity&#39; k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * 
     */
    public Map<String,String> requests() {
        return this.requests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> limits;
        private Map<String,String> requests;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.requests = defaults.requests;
        }

        public Builder limits(Map<String,String> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder requests(Map<String,String> requests) {
            this.requests = Objects.requireNonNull(requests);
            return this;
        }        public ResourceRequirementsResponse build() {
            return new ResourceRequirementsResponse(limits, requests);
        }
    }
}
