// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClientOpenIdUserInfoResult {
    /**
     * The email of the account used by the provider to authenticate with GCP.
     * 
     */
    private final String email;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"email","id"})
    private GetClientOpenIdUserInfoResult(
        String email,
        String id) {
        this.email = Objects.requireNonNull(email);
        this.id = Objects.requireNonNull(id);
    }

    /**
     * The email of the account used by the provider to authenticate with GCP.
     * 
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientOpenIdUserInfoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientOpenIdUserInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public GetClientOpenIdUserInfoResult build() {
            return new GetClientOpenIdUserInfoResult(email, id);
        }
    }
}
