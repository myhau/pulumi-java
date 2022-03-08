// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdentitySelectorResponse {
    /**
     * The identity appear in the form of principals in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
     * 
     */
    private final String identity;

    @OutputCustomType.Constructor({"identity"})
    private IdentitySelectorResponse(String identity) {
        this.identity = identity;
    }

    /**
     * The identity appear in the form of principals in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
     * 
    */
    public String getIdentity() {
        return this.identity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentitySelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identity;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentitySelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
        }

        public Builder setIdentity(String identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public IdentitySelectorResponse build() {
            return new IdentitySelectorResponse(identity);
        }
    }
}
