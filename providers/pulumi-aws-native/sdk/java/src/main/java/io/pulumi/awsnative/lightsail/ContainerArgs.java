// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.lightsail.inputs.ContainerPublicDomainNameArgs;
import io.pulumi.awsnative.lightsail.inputs.ContainerServiceDeploymentArgs;
import io.pulumi.awsnative.lightsail.inputs.ContainerTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    @InputImport(name="containerServiceDeployment")
    private final @Nullable Input<ContainerServiceDeploymentArgs> containerServiceDeployment;

    public Input<ContainerServiceDeploymentArgs> getContainerServiceDeployment() {
        return this.containerServiceDeployment == null ? Input.empty() : this.containerServiceDeployment;
    }

    @InputImport(name="isDisabled")
    private final @Nullable Input<Boolean> isDisabled;

    public Input<Boolean> getIsDisabled() {
        return this.isDisabled == null ? Input.empty() : this.isDisabled;
    }

    @InputImport(name="power", required=true)
    private final Input<String> power;

    public Input<String> getPower() {
        return this.power;
    }

    @InputImport(name="publicDomainNames")
    private final @Nullable Input<List<ContainerPublicDomainNameArgs>> publicDomainNames;

    public Input<List<ContainerPublicDomainNameArgs>> getPublicDomainNames() {
        return this.publicDomainNames == null ? Input.empty() : this.publicDomainNames;
    }

    @InputImport(name="scale", required=true)
    private final Input<Integer> scale;

    public Input<Integer> getScale() {
        return this.scale;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ContainerTagArgs>> tags;

    public Input<List<ContainerTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ContainerArgs(
        @Nullable Input<ContainerServiceDeploymentArgs> containerServiceDeployment,
        @Nullable Input<Boolean> isDisabled,
        Input<String> power,
        @Nullable Input<List<ContainerPublicDomainNameArgs>> publicDomainNames,
        Input<Integer> scale,
        Input<String> serviceName,
        @Nullable Input<List<ContainerTagArgs>> tags) {
        this.containerServiceDeployment = containerServiceDeployment;
        this.isDisabled = isDisabled;
        this.power = Objects.requireNonNull(power, "expected parameter 'power' to be non-null");
        this.publicDomainNames = publicDomainNames;
        this.scale = Objects.requireNonNull(scale, "expected parameter 'scale' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tags = tags;
    }

    private ContainerArgs() {
        this.containerServiceDeployment = Input.empty();
        this.isDisabled = Input.empty();
        this.power = Input.empty();
        this.publicDomainNames = Input.empty();
        this.scale = Input.empty();
        this.serviceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerServiceDeploymentArgs> containerServiceDeployment;
        private @Nullable Input<Boolean> isDisabled;
        private Input<String> power;
        private @Nullable Input<List<ContainerPublicDomainNameArgs>> publicDomainNames;
        private Input<Integer> scale;
        private Input<String> serviceName;
        private @Nullable Input<List<ContainerTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerServiceDeployment = defaults.containerServiceDeployment;
    	      this.isDisabled = defaults.isDisabled;
    	      this.power = defaults.power;
    	      this.publicDomainNames = defaults.publicDomainNames;
    	      this.scale = defaults.scale;
    	      this.serviceName = defaults.serviceName;
    	      this.tags = defaults.tags;
        }

        public Builder setContainerServiceDeployment(@Nullable Input<ContainerServiceDeploymentArgs> containerServiceDeployment) {
            this.containerServiceDeployment = containerServiceDeployment;
            return this;
        }

        public Builder setContainerServiceDeployment(@Nullable ContainerServiceDeploymentArgs containerServiceDeployment) {
            this.containerServiceDeployment = Input.ofNullable(containerServiceDeployment);
            return this;
        }

        public Builder setIsDisabled(@Nullable Input<Boolean> isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Builder setIsDisabled(@Nullable Boolean isDisabled) {
            this.isDisabled = Input.ofNullable(isDisabled);
            return this;
        }

        public Builder setPower(Input<String> power) {
            this.power = Objects.requireNonNull(power);
            return this;
        }

        public Builder setPower(String power) {
            this.power = Input.of(Objects.requireNonNull(power));
            return this;
        }

        public Builder setPublicDomainNames(@Nullable Input<List<ContainerPublicDomainNameArgs>> publicDomainNames) {
            this.publicDomainNames = publicDomainNames;
            return this;
        }

        public Builder setPublicDomainNames(@Nullable List<ContainerPublicDomainNameArgs> publicDomainNames) {
            this.publicDomainNames = Input.ofNullable(publicDomainNames);
            return this;
        }

        public Builder setScale(Input<Integer> scale) {
            this.scale = Objects.requireNonNull(scale);
            return this;
        }

        public Builder setScale(Integer scale) {
            this.scale = Input.of(Objects.requireNonNull(scale));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ContainerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ContainerTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ContainerArgs build() {
            return new ContainerArgs(containerServiceDeployment, isDisabled, power, publicDomainNames, scale, serviceName, tags);
        }
    }
}