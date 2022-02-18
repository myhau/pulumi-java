// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs Empty = new ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs();

    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<String> method;

    public Input<String> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
     */
    @InputImport(name="permission")
    private final @Nullable Input<String> permission;

    public Input<String> getPermission() {
        return this.permission == null ? Input.empty() : this.permission;
    }

    public ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs(
        @Nullable Input<String> method,
        @Nullable Input<String> permission) {
        this.method = method;
        this.permission = permission;
    }

    private ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs() {
        this.method = Input.empty();
        this.permission = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> method;
        private @Nullable Input<String> permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder setMethod(@Nullable Input<String> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setPermission(@Nullable Input<String> permission) {
            this.permission = permission;
            return this;
        }

        public Builder setPermission(@Nullable String permission) {
            this.permission = Input.ofNullable(permission);
            return this;
        }

        public ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs build() {
            return new ServicePerimetersServicePerimeterSpecEgressPolicyEgressToOperationMethodSelectorGetArgs(method, permission);
        }
    }
}
