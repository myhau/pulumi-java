// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage.v1.inputs.ObjectIamPolicyBindingsItemArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectIamPolicyArgs Empty = new ObjectIamPolicyArgs();

    /**
     * An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    @Import(name="bindings")
    private @Nullable Output<List<ObjectIamPolicyBindingsItemArgs>> bindings;

    /**
     * @return An association between a role, which comes with a set of permissions, and members who may assume that role.
     * 
     */
    public Optional<Output<List<ObjectIamPolicyBindingsItemArgs>>> bindings() {
        return Optional.ofNullable(this.bindings);
    }

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * HTTP 1.1  Entity tag for the policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return HTTP 1.1  Entity tag for the policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * If present, selects a specific revision of this object (as opposed to the latest version, the default).
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return If present, selects a specific revision of this object (as opposed to the latest version, the default).
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    @Import(name="object", required=true)
    private Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    /**
     * The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    @Import(name="userProject")
    private @Nullable Output<String> userProject;

    /**
     * @return The project to be billed for this request. Required for Requester Pays buckets.
     * 
     */
    public Optional<Output<String>> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    /**
     * The IAM policy format version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return The IAM policy format version.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private ObjectIamPolicyArgs() {}

    private ObjectIamPolicyArgs(ObjectIamPolicyArgs $) {
        this.bindings = $.bindings;
        this.bucket = $.bucket;
        this.etag = $.etag;
        this.generation = $.generation;
        this.kind = $.kind;
        this.object = $.object;
        this.resourceId = $.resourceId;
        this.userProject = $.userProject;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectIamPolicyArgs $;

        public Builder() {
            $ = new ObjectIamPolicyArgs();
        }

        public Builder(ObjectIamPolicyArgs defaults) {
            $ = new ObjectIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bindings An association between a role, which comes with a set of permissions, and members who may assume that role.
         * 
         * @return builder
         * 
         */
        public Builder bindings(@Nullable Output<List<ObjectIamPolicyBindingsItemArgs>> bindings) {
            $.bindings = bindings;
            return this;
        }

        /**
         * @param bindings An association between a role, which comes with a set of permissions, and members who may assume that role.
         * 
         * @return builder
         * 
         */
        public Builder bindings(List<ObjectIamPolicyBindingsItemArgs> bindings) {
            return bindings(Output.of(bindings));
        }

        /**
         * @param bindings An association between a role, which comes with a set of permissions, and members who may assume that role.
         * 
         * @return builder
         * 
         */
        public Builder bindings(ObjectIamPolicyBindingsItemArgs... bindings) {
            return bindings(List.of(bindings));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param etag HTTP 1.1  Entity tag for the policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag HTTP 1.1  Entity tag for the policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param kind The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of item this is. For policies, this is always storage#policy. This field is ignored on input.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        public Builder object(String object) {
            return object(Output.of(object));
        }

        /**
         * @param resourceId The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the resource to which this policy belongs. Will be of the form projects/_/buckets/bucket for buckets, and projects/_/buckets/bucket/objects/object for objects. A specific generation may be specified by appending #generationNumber to the end of the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17. The current generation can be denoted with #0. This field is ignored on input.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param userProject The project to be billed for this request. Required for Requester Pays buckets.
         * 
         * @return builder
         * 
         */
        public Builder userProject(@Nullable Output<String> userProject) {
            $.userProject = userProject;
            return this;
        }

        /**
         * @param userProject The project to be billed for this request. Required for Requester Pays buckets.
         * 
         * @return builder
         * 
         */
        public Builder userProject(String userProject) {
            return userProject(Output.of(userProject));
        }

        /**
         * @param version The IAM policy format version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The IAM policy format version.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ObjectIamPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
