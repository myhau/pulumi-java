// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MeshIstioResponse {
    /**
     * Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
     * 
     */
    private final String meshUid;
    /**
     * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    private final String serviceName;
    /**
     * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    private final String serviceNamespace;

    @OutputCustomType.Constructor({"meshUid","serviceName","serviceNamespace"})
    private MeshIstioResponse(
        String meshUid,
        String serviceName,
        String serviceNamespace) {
        this.meshUid = meshUid;
        this.serviceName = serviceName;
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
     * 
    */
    public String getMeshUid() {
        return this.meshUid;
    }
    /**
     * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
    */
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshIstioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String meshUid;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshIstioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshUid = defaults.meshUid;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder setMeshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }
        public MeshIstioResponse build() {
            return new MeshIstioResponse(meshUid, serviceName, serviceNamespace);
        }
    }
}
