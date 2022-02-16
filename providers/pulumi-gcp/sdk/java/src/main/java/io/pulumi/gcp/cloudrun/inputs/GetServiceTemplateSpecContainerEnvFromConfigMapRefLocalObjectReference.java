// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference Empty = new GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference build() {
            return new GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference(name);
        }
    }
}