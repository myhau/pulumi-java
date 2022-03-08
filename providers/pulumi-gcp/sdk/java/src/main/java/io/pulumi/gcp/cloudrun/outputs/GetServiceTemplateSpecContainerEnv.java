// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnvValueFrom;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServiceTemplateSpecContainerEnv {
    /**
     * The name of the Cloud Run Service.
     * 
     */
    private final String name;
    private final String value;
    private final List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms;

    @OutputCustomType.Constructor({"name","value","valueFroms"})
    private GetServiceTemplateSpecContainerEnv(
        String name,
        String value,
        List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms) {
        this.name = name;
        this.value = value;
        this.valueFroms = valueFroms;
    }

    /**
     * The name of the Cloud Run Service.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getValue() {
        return this.value;
    }
    public List<GetServiceTemplateSpecContainerEnvValueFrom> getValueFroms() {
        return this.valueFroms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;
        private List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFroms = defaults.valueFroms;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValueFroms(List<GetServiceTemplateSpecContainerEnvValueFrom> valueFroms) {
            this.valueFroms = Objects.requireNonNull(valueFroms);
            return this;
        }
        public GetServiceTemplateSpecContainerEnv build() {
            return new GetServiceTemplateSpecContainerEnv(name, value, valueFroms);
        }
    }
}
