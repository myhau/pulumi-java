// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupGroupKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupGroupKeyArgs Empty = new GroupGroupKeyArgs();

    /**
     * The ID of the entity.
     * For Google-managed entities, the id must be the email address of an existing
     * group or user.
     * For external-identity-mapped entities, the id must be a string conforming
     * to the Identity Source's requirements.
     * Must be unique within a namespace.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The namespace in which the entity exists.
     * If not specified, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If specified, the EntityKey represents an external-identity-mapped group.
     * The namespace must correspond to an identity source created in Admin Console
     * and must be in the form of `identitysources/{identity_source_id}`.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public GroupGroupKeyArgs(
        Input<String> id,
        @Nullable Input<String> namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = namespace;
    }

    private GroupGroupKeyArgs() {
        this.id = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupGroupKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupGroupKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public GroupGroupKeyArgs build() {
            return new GroupGroupKeyArgs(id, namespace);
        }
    }
}
