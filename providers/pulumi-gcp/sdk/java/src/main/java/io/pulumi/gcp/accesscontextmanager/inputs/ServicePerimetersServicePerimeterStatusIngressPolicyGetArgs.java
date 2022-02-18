// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs();

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressFrom")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;

    public Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> getIngressFrom() {
        return this.ingressFrom == null ? Input.empty() : this.ingressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="ingressTo")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

    public Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> getIngressTo() {
        return this.ingressTo == null ? Input.empty() : this.ingressTo;
    }

    public ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs(
        @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom,
        @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs() {
        this.ingressFrom = Input.empty();
        this.ingressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom;
        private @Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder setIngressFrom(@Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs> ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder setIngressFrom(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromGetArgs ingressFrom) {
            this.ingressFrom = Input.ofNullable(ingressFrom);
            return this;
        }

        public Builder setIngressTo(@Nullable Input<ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs> ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }

        public Builder setIngressTo(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressToGetArgs ingressTo) {
            this.ingressTo = Input.ofNullable(ingressTo);
            return this;
        }

        public ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs(ingressFrom, ingressTo);
        }
    }
}
