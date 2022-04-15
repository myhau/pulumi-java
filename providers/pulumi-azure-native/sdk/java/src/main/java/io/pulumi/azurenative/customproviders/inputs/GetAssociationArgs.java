// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssociationArgs Empty = new GetAssociationArgs();

    /**
     * The name of the association.
     * 
     */
    @Import(name="associationName", required=true)
      private final String associationName;

    public String associationName() {
        return this.associationName;
    }

    /**
     * The scope of the association.
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String scope() {
        return this.scope;
    }

    public GetAssociationArgs(
        String associationName,
        String scope) {
        this.associationName = Objects.requireNonNull(associationName, "expected parameter 'associationName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetAssociationArgs() {
        this.associationName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationName = defaults.associationName;
    	      this.scope = defaults.scope;
        }

        public Builder associationName(String associationName) {
            this.associationName = Objects.requireNonNull(associationName);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetAssociationArgs build() {
            return new GetAssociationArgs(associationName, scope);
        }
    }
}
