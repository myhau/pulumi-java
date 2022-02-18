// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs;
import io.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    /**
     * Authority encodes how Google will recognize identities from this Membership.
     * See the workload identity documentation for more details:
     * https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     * Structure is documented below.
     * 
     */
    @InputImport(name="authority")
    private final @Nullable Input<MembershipAuthorityArgs> authority;

    public Input<MembershipAuthorityArgs> getAuthority() {
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
    private final @Nullable Input<MembershipEndpointArgs> endpoint;

    public Input<MembershipEndpointArgs> getEndpoint() {
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
    @InputImport(name="membershipId", required=true)
    private final Input<String> membershipId;

    public Input<String> getMembershipId() {
        return this.membershipId;
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

    public MembershipArgs(
        @Nullable Input<MembershipAuthorityArgs> authority,
        @Nullable Input<String> description,
        @Nullable Input<MembershipEndpointArgs> endpoint,
        @Nullable Input<Map<String,String>> labels,
        Input<String> membershipId,
        @Nullable Input<String> project) {
        this.authority = authority;
        this.description = description;
        this.endpoint = endpoint;
        this.labels = labels;
        this.membershipId = Objects.requireNonNull(membershipId, "expected parameter 'membershipId' to be non-null");
        this.project = project;
    }

    private MembershipArgs() {
        this.authority = Input.empty();
        this.description = Input.empty();
        this.endpoint = Input.empty();
        this.labels = Input.empty();
        this.membershipId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MembershipAuthorityArgs> authority;
        private @Nullable Input<String> description;
        private @Nullable Input<MembershipEndpointArgs> endpoint;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> membershipId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.labels = defaults.labels;
    	      this.membershipId = defaults.membershipId;
    	      this.project = defaults.project;
        }

        public Builder setAuthority(@Nullable Input<MembershipAuthorityArgs> authority) {
            this.authority = authority;
            return this;
        }

        public Builder setAuthority(@Nullable MembershipAuthorityArgs authority) {
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

        public Builder setEndpoint(@Nullable Input<MembershipEndpointArgs> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable MembershipEndpointArgs endpoint) {
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

        public Builder setMembershipId(Input<String> membershipId) {
            this.membershipId = Objects.requireNonNull(membershipId);
            return this;
        }

        public Builder setMembershipId(String membershipId) {
            this.membershipId = Input.of(Objects.requireNonNull(membershipId));
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

        public MembershipArgs build() {
            return new MembershipArgs(authority, description, endpoint, labels, membershipId, project);
        }
    }
}
