// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterAuthResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The token to use to authenticate with the cluster.
     * 
     */
    private final String token;

    @OutputCustomType.Constructor({"id","name","token"})
    private GetClusterAuthResult(
        String id,
        String name,
        String token) {
        this.id = id;
        this.name = name;
        this.token = token;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The token to use to authenticate with the cluster.
     * 
    */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAuthResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAuthResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.token = defaults.token;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public GetClusterAuthResult build() {
            return new GetClusterAuthResult(id, name, token);
        }
    }
}
