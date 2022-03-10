// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.RolloutPolicyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeprecationStatusResponse {
    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    private final String deleted;
    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    private final String deprecated;
    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    private final String obsolete;
    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    private final String replacement;
    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    private final String state;
    /**
     * The rollout policy for this deprecation. This policy is only enforced by image family views. The rollout policy restricts the zones where the associated resource is considered in a deprecated state. When the rollout policy does not include the user specified zone, or if the zone is rolled out, the associated resource is considered in a deprecated state. The rollout policy for this deprecation is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    private final RolloutPolicyResponse stateOverride;

    @OutputCustomType.Constructor
    private DeprecationStatusResponse(
        @OutputCustomType.Parameter("deleted") String deleted,
        @OutputCustomType.Parameter("deprecated") String deprecated,
        @OutputCustomType.Parameter("obsolete") String obsolete,
        @OutputCustomType.Parameter("replacement") String replacement,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("stateOverride") RolloutPolicyResponse stateOverride) {
        this.deleted = deleted;
        this.deprecated = deprecated;
        this.obsolete = obsolete;
        this.replacement = replacement;
        this.state = state;
        this.stateOverride = stateOverride;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
    */
    public String getDeleted() {
        return this.deleted;
    }
    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
    */
    public String getDeprecated() {
        return this.deprecated;
    }
    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
    */
    public String getObsolete() {
        return this.obsolete;
    }
    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
    */
    public String getReplacement() {
        return this.replacement;
    }
    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The rollout policy for this deprecation. This policy is only enforced by image family views. The rollout policy restricts the zones where the associated resource is considered in a deprecated state. When the rollout policy does not include the user specified zone, or if the zone is rolled out, the associated resource is considered in a deprecated state. The rollout policy for this deprecation is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
    */
    public RolloutPolicyResponse getStateOverride() {
        return this.stateOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeprecationStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deleted;
        private String deprecated;
        private String obsolete;
        private String replacement;
        private String state;
        private RolloutPolicyResponse stateOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(DeprecationStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.deprecated = defaults.deprecated;
    	      this.obsolete = defaults.obsolete;
    	      this.replacement = defaults.replacement;
    	      this.state = defaults.state;
    	      this.stateOverride = defaults.stateOverride;
        }

        public Builder setDeleted(String deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDeprecated(String deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
            return this;
        }

        public Builder setObsolete(String obsolete) {
            this.obsolete = Objects.requireNonNull(obsolete);
            return this;
        }

        public Builder setReplacement(String replacement) {
            this.replacement = Objects.requireNonNull(replacement);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateOverride(RolloutPolicyResponse stateOverride) {
            this.stateOverride = Objects.requireNonNull(stateOverride);
            return this;
        }
        public DeprecationStatusResponse build() {
            return new DeprecationStatusResponse(deleted, deprecated, obsolete, replacement, state, stateOverride);
        }
    }
}
