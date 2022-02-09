// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.storage_v1.inputs.BucketAccessControlProjectTeamResponse;
import java.lang.String;
import java.util.Objects;


public final class BucketAccessControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketAccessControlResponse Empty = new BucketAccessControlResponse();

    @InputImport(name="bucket", required=true)
    private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    @InputImport(name="domain", required=true)
    private final String domain;

    public String getDomain() {
        return this.domain;
    }

    @InputImport(name="email", required=true)
    private final String email;

    public String getEmail() {
        return this.email;
    }

    @InputImport(name="entity", required=true)
    private final String entity;

    public String getEntity() {
        return this.entity;
    }

    @InputImport(name="entityId", required=true)
    private final String entityId;

    public String getEntityId() {
        return this.entityId;
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="projectTeam", required=true)
    private final BucketAccessControlProjectTeamResponse projectTeam;

    public BucketAccessControlProjectTeamResponse getProjectTeam() {
        return this.projectTeam;
    }

    @InputImport(name="role", required=true)
    private final String role;

    public String getRole() {
        return this.role;
    }

    @InputImport(name="selfLink", required=true)
    private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    public BucketAccessControlResponse(
        String bucket,
        String domain,
        String email,
        String entity,
        String entityId,
        String etag,
        String kind,
        BucketAccessControlProjectTeamResponse projectTeam,
        String role,
        String selfLink) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.entityId = Objects.requireNonNull(entityId, "expected parameter 'entityId' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.projectTeam = Objects.requireNonNull(projectTeam, "expected parameter 'projectTeam' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
    }

    private BucketAccessControlResponse() {
        this.bucket = null;
        this.domain = null;
        this.email = null;
        this.entity = null;
        this.entityId = null;
        this.etag = null;
        this.kind = null;
        this.projectTeam = null;
        this.role = null;
        this.selfLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String domain;
        private String email;
        private String entity;
        private String entityId;
        private String etag;
        private String kind;
        private BucketAccessControlProjectTeamResponse projectTeam;
        private String role;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.etag = defaults.etag;
    	      this.kind = defaults.kind;
    	      this.projectTeam = defaults.projectTeam;
    	      this.role = defaults.role;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEntity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setProjectTeam(BucketAccessControlProjectTeamResponse projectTeam) {
            this.projectTeam = Objects.requireNonNull(projectTeam);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public BucketAccessControlResponse build() {
            return new BucketAccessControlResponse(bucket, domain, email, entity, entityId, etag, kind, projectTeam, role, selfLink);
        }
    }
}