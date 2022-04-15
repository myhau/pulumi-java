// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A user that can be assigned to a compute instance.
 * 
 */
public final class AssignedUserArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignedUserArgs Empty = new AssignedUserArgs();

    /**
     * User’s AAD Object Id.
     * 
     */
    @Import(name="objectId", required=true)
      private final Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * User’s AAD Tenant Id.
     * 
     */
    @Import(name="tenantId", required=true)
      private final Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId;
    }

    public AssignedUserArgs(
        Output<String> objectId,
        Output<String> tenantId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AssignedUserArgs() {
        this.objectId = Codegen.empty();
        this.tenantId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> objectId;
        private Output<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder objectId(Output<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Output.of(Objects.requireNonNull(objectId));
            return this;
        }
        public Builder tenantId(Output<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Output.of(Objects.requireNonNull(tenantId));
            return this;
        }        public AssignedUserArgs build() {
            return new AssignedUserArgs(objectId, tenantId);
        }
    }
}
