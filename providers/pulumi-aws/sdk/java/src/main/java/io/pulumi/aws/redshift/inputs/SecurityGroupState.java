// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.aws.redshift.inputs.SecurityGroupIngressGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityGroupState Empty = new SecurityGroupState();

    /**
     * The description of the Redshift security group. Defaults to "Managed by Pulumi".
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A list of ingress rules.
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<List<SecurityGroupIngressGetArgs>> ingress;

    public Input<List<SecurityGroupIngressGetArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * The name of the Redshift security group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SecurityGroupState(
        @Nullable Input<String> description,
        @Nullable Input<List<SecurityGroupIngressGetArgs>> ingress,
        @Nullable Input<String> name) {
        this.description = description == null ? Input.ofNullable("Managed by Pulumi") : description;
        this.ingress = ingress;
        this.name = name;
    }

    private SecurityGroupState() {
        this.description = Input.empty();
        this.ingress = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<SecurityGroupIngressGetArgs>> ingress;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIngress(@Nullable Input<List<SecurityGroupIngressGetArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable List<SecurityGroupIngressGetArgs> ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public SecurityGroupState build() {
            return new SecurityGroupState(description, ingress, name);
        }
    }
}
