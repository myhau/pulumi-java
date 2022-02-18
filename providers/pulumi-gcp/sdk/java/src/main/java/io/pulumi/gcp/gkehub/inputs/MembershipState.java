// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.MembershipAuthorityGetArgs;
import io.pulumi.gcp.gkehub.inputs.MembershipEndpointGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipState extends io.pulumi.resources.ResourceArgs {

    public static final MembershipState Empty = new MembershipState();

    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @InputImport(name="authority")
    private final @Nullable Input<MembershipAuthorityGetArgs> authority;

    public Input<MembershipAuthorityGetArgs> getAuthority() {
        return this.authority == null ? Input.empty() : this.authority;
    }

    /**
     * The name of this entity type to be displayed on the console. This field is unavailable in v1 of the API.
     * 
     * @deprecated
     * This field is unavailable in the GA provider and will be removed from the beta provider in a future release.
     * 
     */
    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    @Deprecated /* This field is unavailable in the GA provider and will be removed from the beta provider in a future release. */
    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<MembershipEndpointGetArgs> endpoint;

    public Input<MembershipEndpointGetArgs> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Labels to apply to this membership.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The client-provided identifier of the membership.
     * 
     */
    @InputImport(name="membershipId")
    private final @Nullable Input<String> membershipId;

    public Input<String> getMembershipId() {
        return this.membershipId == null ? Input.empty() : this.membershipId;
    }

    /**
     * The unique identifier of the membership.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public MembershipState(
        @Nullable Input<MembershipAuthorityGetArgs> authority,
        @Nullable Input<String> description,
        @Nullable Input<MembershipEndpointGetArgs> endpoint,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> membershipId,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.authority = authority;
        this.description = description;
        this.endpoint = endpoint;
        this.labels = labels;
        this.membershipId = membershipId;
        this.name = name;
        this.project = project;
    }

    private MembershipState() {
        this.authority = Input.empty();
        this.description = Input.empty();
        this.endpoint = Input.empty();
        this.labels = Input.empty();
        this.membershipId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MembershipAuthorityGetArgs> authority;
        private @Nullable Input<String> description;
        private @Nullable Input<MembershipEndpointGetArgs> endpoint;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> membershipId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.labels = defaults.labels;
    	      this.membershipId = defaults.membershipId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setAuthority(@Nullable Input<MembershipAuthorityGetArgs> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable MembershipAuthorityGetArgs authority) {
            this.authority = Input.ofNullable(authority);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<MembershipEndpointGetArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable MembershipEndpointGetArgs endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMembershipId(@Nullable Input<String> membershipId) {
            this.membershipId = membershipId;
            return this;
        }

        public Builder setMembershipId(@Nullable String membershipId) {
            this.membershipId = Input.ofNullable(membershipId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public MembershipState build() {
            return new MembershipState(authority, description, endpoint, labels, membershipId, name, project);
        }
    }
}
