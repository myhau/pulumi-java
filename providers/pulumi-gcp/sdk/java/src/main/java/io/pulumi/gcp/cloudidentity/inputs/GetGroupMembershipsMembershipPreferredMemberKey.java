// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGroupMembershipsMembershipPreferredMemberKey extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupMembershipsMembershipPreferredMemberKey Empty = new GetGroupMembershipsMembershipPreferredMemberKey();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="namespace", required=true)
    private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public GetGroupMembershipsMembershipPreferredMemberKey(
        String id,
        String namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private GetGroupMembershipsMembershipPreferredMemberKey() {
        this.id = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembershipPreferredMemberKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupMembershipsMembershipPreferredMemberKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public GetGroupMembershipsMembershipPreferredMemberKey build() {
            return new GetGroupMembershipsMembershipPreferredMemberKey(id, namespace);
        }
    }
}