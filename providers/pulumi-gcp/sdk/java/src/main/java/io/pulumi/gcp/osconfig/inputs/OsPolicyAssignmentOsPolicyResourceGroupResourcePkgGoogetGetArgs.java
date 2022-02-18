// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs();

    /**
     * Required. The name of the repository.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs(Input<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs(name);
        }
    }
}
