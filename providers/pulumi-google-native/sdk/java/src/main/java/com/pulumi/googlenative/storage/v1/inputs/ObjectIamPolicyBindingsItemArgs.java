// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage.v1.inputs.ExprArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectIamPolicyBindingsItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectIamPolicyBindingsItemArgs Empty = new ObjectIamPolicyBindingsItemArgs();

    /**
     * The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their conditions, are examined independently.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<ExprArgs> condition;

    /**
     * @return The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their conditions, are examined independently.
     * 
     */
    public Optional<Output<ExprArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
     * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
     * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
     * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
     * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
     * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
     * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
     * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
     * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
     * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
     * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
     * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
     * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
     * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
     * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
     * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
     * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
     * The new IAM roles are:
     * - roles/storage.admin — Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
     * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
     * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
     * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
     * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
     * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
     * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
     * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
     * The new IAM roles are:
     * - roles/storage.admin — Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
     * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
     * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
     * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
     * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
     * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
     * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
     * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ObjectIamPolicyBindingsItemArgs() {}

    private ObjectIamPolicyBindingsItemArgs(ObjectIamPolicyBindingsItemArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectIamPolicyBindingsItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectIamPolicyBindingsItemArgs $;

        public Builder() {
            $ = new ObjectIamPolicyBindingsItemArgs();
        }

        public Builder(ObjectIamPolicyBindingsItemArgs defaults) {
            $ = new ObjectIamPolicyBindingsItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their conditions, are examined independently.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<ExprArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their conditions, are examined independently.
         * 
         * @return builder
         * 
         */
        public Builder condition(ExprArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param members A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
         * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
         * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
         * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
         * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
         * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
         * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
         * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
         * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
         * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
         * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
         * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
         * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
         * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
         * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
         * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
         * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
         * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
         * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
         * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
         * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
         * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
         * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
         * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
         * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param role The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
         * The new IAM roles are:
         * - roles/storage.admin — Full control of Google Cloud Storage resources.
         * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
         * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
         * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
         * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
         * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
         * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
         * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
         * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
         * The new IAM roles are:
         * - roles/storage.admin — Full control of Google Cloud Storage resources.
         * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
         * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
         * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
         * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
         * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
         * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
         * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
         * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ObjectIamPolicyBindingsItemArgs build() {
            return $;
        }
    }

}
