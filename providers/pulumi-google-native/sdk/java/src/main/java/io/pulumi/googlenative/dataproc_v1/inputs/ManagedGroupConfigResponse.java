// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedGroupConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedGroupConfigResponse Empty = new ManagedGroupConfigResponse();

    @InputImport(name="instanceGroupManagerName", required=true)
    private final String instanceGroupManagerName;

    public String getInstanceGroupManagerName() {
        return this.instanceGroupManagerName;
    }

    @InputImport(name="instanceTemplateName", required=true)
    private final String instanceTemplateName;

    public String getInstanceTemplateName() {
        return this.instanceTemplateName;
    }

    public ManagedGroupConfigResponse(
        String instanceGroupManagerName,
        String instanceTemplateName) {
        this.instanceGroupManagerName = Objects.requireNonNull(instanceGroupManagerName, "expected parameter 'instanceGroupManagerName' to be non-null");
        this.instanceTemplateName = Objects.requireNonNull(instanceTemplateName, "expected parameter 'instanceTemplateName' to be non-null");
    }

    private ManagedGroupConfigResponse() {
        this.instanceGroupManagerName = null;
        this.instanceTemplateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedGroupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceGroupManagerName;
        private String instanceTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        public Builder setInstanceGroupManagerName(String instanceGroupManagerName) {
            this.instanceGroupManagerName = Objects.requireNonNull(instanceGroupManagerName);
            return this;
        }

        public Builder setInstanceTemplateName(String instanceTemplateName) {
            this.instanceTemplateName = Objects.requireNonNull(instanceTemplateName);
            return this;
        }

        public ManagedGroupConfigResponse build() {
            return new ManagedGroupConfigResponse(instanceGroupManagerName, instanceTemplateName);
        }
    }
}