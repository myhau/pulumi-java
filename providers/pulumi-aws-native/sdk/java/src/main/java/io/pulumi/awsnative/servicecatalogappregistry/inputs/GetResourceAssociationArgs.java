// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResourceAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceAssociationArgs Empty = new GetResourceAssociationArgs();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public GetResourceAssociationArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetResourceAssociationArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public GetResourceAssociationArgs build() {
            return new GetResourceAssociationArgs(id);
        }
    }
}