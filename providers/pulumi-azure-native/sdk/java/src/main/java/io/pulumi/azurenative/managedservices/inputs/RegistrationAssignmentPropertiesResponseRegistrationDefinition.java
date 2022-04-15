// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.azurenative.managedservices.inputs.PlanResponse;
import io.pulumi.azurenative.managedservices.inputs.RegistrationAssignmentPropertiesResponseProperties;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Registration definition inside registration assignment.
 * 
 */
public final class RegistrationAssignmentPropertiesResponseRegistrationDefinition extends io.pulumi.resources.InvokeArgs {

    public static final RegistrationAssignmentPropertiesResponseRegistrationDefinition Empty = new RegistrationAssignmentPropertiesResponseRegistrationDefinition();

    /**
     * Fully qualified path of the registration definition.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Name of the registration definition.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Plan details for the managed services.
     * 
     */
    @Import(name="plan")
      private final @Nullable PlanResponse plan;

    public Optional<PlanResponse> plan() {
        return this.plan == null ? Optional.empty() : Optional.ofNullable(this.plan);
    }

    /**
     * Properties of registration definition inside registration assignment.
     * 
     */
    @Import(name="properties")
      private final @Nullable RegistrationAssignmentPropertiesResponseProperties properties;

    public Optional<RegistrationAssignmentPropertiesResponseProperties> properties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * Type of the resource (Microsoft.ManagedServices/registrationDefinitions).
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public RegistrationAssignmentPropertiesResponseRegistrationDefinition(
        String id,
        String name,
        @Nullable PlanResponse plan,
        @Nullable RegistrationAssignmentPropertiesResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.plan = plan;
        this.properties = properties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RegistrationAssignmentPropertiesResponseRegistrationDefinition() {
        this.id = null;
        this.name = null;
        this.plan = null;
        this.properties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PlanResponse plan;
        private @Nullable RegistrationAssignmentPropertiesResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesResponseRegistrationDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }
        public Builder properties(@Nullable RegistrationAssignmentPropertiesResponseProperties properties) {
            this.properties = properties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RegistrationAssignmentPropertiesResponseRegistrationDefinition build() {
            return new RegistrationAssignmentPropertiesResponseRegistrationDefinition(id, name, plan, properties, type);
        }
    }
}
