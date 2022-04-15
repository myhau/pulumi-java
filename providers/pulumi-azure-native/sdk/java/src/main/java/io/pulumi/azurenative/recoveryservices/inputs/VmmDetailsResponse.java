// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VMM fabric specific details.
 * 
 */
public final class VmmDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmmDetailsResponse Empty = new VmmDetailsResponse();

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMM'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    public VmmDetailsResponse(String instanceType) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
    }

    private VmmDetailsResponse() {
        this.instanceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(VmmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }        public VmmDetailsResponse build() {
            return new VmmDetailsResponse(instanceType);
        }
    }
}
