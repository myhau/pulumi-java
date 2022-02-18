// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectACLState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectACLState Empty = new DefaultObjectACLState();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    @InputImport(name="roleEntities")
    private final @Nullable Input<List<String>> roleEntities;

    public Input<List<String>> getRoleEntities() {
        return this.roleEntities == null ? Input.empty() : this.roleEntities;
    }

    public DefaultObjectACLState(
        @Nullable Input<String> bucket,
        @Nullable Input<List<String>> roleEntities) {
        this.bucket = bucket;
        this.roleEntities = roleEntities;
    }

    private DefaultObjectACLState() {
        this.bucket = Input.empty();
        this.roleEntities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectACLState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<List<String>> roleEntities;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectACLState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.roleEntities = defaults.roleEntities;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setRoleEntities(@Nullable Input<List<String>> roleEntities) {
            this.roleEntities = roleEntities;
            return this;
        }

        public Builder setRoleEntities(@Nullable List<String> roleEntities) {
            this.roleEntities = Input.ofNullable(roleEntities);
            return this;
        }

        public DefaultObjectACLState build() {
            return new DefaultObjectACLState(bucket, roleEntities);
        }
    }
}
