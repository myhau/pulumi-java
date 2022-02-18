// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerVolumeMount extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerVolumeMount Empty = new GetServiceTemplateSpecContainerVolumeMount();

    @InputImport(name="mountPath", required=true)
    private final String mountPath;

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public GetServiceTemplateSpecContainerVolumeMount(
        String mountPath,
        String name) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetServiceTemplateSpecContainerVolumeMount() {
        this.mountPath = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerVolumeMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerVolumeMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetServiceTemplateSpecContainerVolumeMount build() {
            return new GetServiceTemplateSpecContainerVolumeMount(mountPath, name);
        }
    }
}
