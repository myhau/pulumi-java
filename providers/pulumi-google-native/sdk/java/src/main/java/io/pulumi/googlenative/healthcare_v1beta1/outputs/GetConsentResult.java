// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.GoogleCloudHealthcareV1beta1ConsentPolicyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConsentResult {
    /**
     * The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    private final String consentArtifact;
    /**
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    private final String expireTime;
    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    private final String name;
    /**
     * Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    private final List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies;
    /**
     * The timestamp that the revision was created.
     * 
     */
    private final String revisionCreateTime;
    /**
     * The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent's resource name.
     * 
     */
    private final String revisionId;
    /**
     * Indicates the current state of this Consent.
     * 
     */
    private final String state;
    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    private final String ttl;
    /**
     * User's UUID provided by the client.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor({"consentArtifact","expireTime","metadata","name","policies","revisionCreateTime","revisionId","state","ttl","userId"})
    private GetConsentResult(
        String consentArtifact,
        String expireTime,
        Map<String,String> metadata,
        String name,
        List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies,
        String revisionCreateTime,
        String revisionId,
        String state,
        String ttl,
        String userId) {
        this.consentArtifact = consentArtifact;
        this.expireTime = expireTime;
        this.metadata = metadata;
        this.name = name;
        this.policies = policies;
        this.revisionCreateTime = revisionCreateTime;
        this.revisionId = revisionId;
        this.state = state;
        this.ttl = ttl;
        this.userId = userId;
    }

    /**
     * The resource name of the Consent artifact that contains proof of the end user's consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
    */
    public String getConsentArtifact() {
        return this.consentArtifact;
    }
    /**
     * Timestamp in UTC of when this Consent is considered expired.
     * 
    */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Represents a user's consent in terms of the resources that can be accessed and under what conditions.
     * 
    */
    public List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> getPolicies() {
        return this.policies;
    }
    /**
     * The timestamp that the revision was created.
     * 
    */
    public String getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * The revision ID of the Consent. The format is an 8-character hexadecimal string. Refer to a specific revision of a Consent by appending `@{revision_id}` to the Consent's resource name.
     * 
    */
    public String getRevisionId() {
        return this.revisionId;
    }
    /**
     * Indicates the current state of this Consent.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
    */
    public String getTtl() {
        return this.ttl;
    }
    /**
     * User's UUID provided by the client.
     * 
    */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consentArtifact;
        private String expireTime;
        private Map<String,String> metadata;
        private String name;
        private List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies;
        private String revisionCreateTime;
        private String revisionId;
        private String state;
        private String ttl;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentArtifact = defaults.consentArtifact;
    	      this.expireTime = defaults.expireTime;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.policies = defaults.policies;
    	      this.revisionCreateTime = defaults.revisionCreateTime;
    	      this.revisionId = defaults.revisionId;
    	      this.state = defaults.state;
    	      this.ttl = defaults.ttl;
    	      this.userId = defaults.userId;
        }

        public Builder setConsentArtifact(String consentArtifact) {
            this.consentArtifact = Objects.requireNonNull(consentArtifact);
            return this;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicies(List<GoogleCloudHealthcareV1beta1ConsentPolicyResponse> policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }

        public Builder setRevisionCreateTime(String revisionCreateTime) {
            this.revisionCreateTime = Objects.requireNonNull(revisionCreateTime);
            return this;
        }

        public Builder setRevisionId(String revisionId) {
            this.revisionId = Objects.requireNonNull(revisionId);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetConsentResult build() {
            return new GetConsentResult(consentArtifact, expireTime, metadata, name, policies, revisionCreateTime, revisionId, state, ttl, userId);
        }
    }
}
