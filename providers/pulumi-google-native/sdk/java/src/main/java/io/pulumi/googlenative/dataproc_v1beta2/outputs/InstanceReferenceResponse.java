// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceReferenceResponse {
    private final String instanceId;
    private final String instanceName;
    private final String publicKey;

    @OutputCustomType.Constructor({"instanceId","instanceName","publicKey"})
    private InstanceReferenceResponse(
        String instanceId,
        String instanceName,
        String publicKey) {
        this.instanceId = Objects.requireNonNull(instanceId);
        this.instanceName = Objects.requireNonNull(instanceName);
        this.publicKey = Objects.requireNonNull(publicKey);
    }

    public String getInstanceId() {
        return this.instanceId;
    }
    public String getInstanceName() {
        return this.instanceName;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String instanceName;
        private String publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public InstanceReferenceResponse build() {
            return new InstanceReferenceResponse(instanceId, instanceName, publicKey);
        }
    }
}