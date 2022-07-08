// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudasset.v1.outputs.AccessSelectorResponse;
import com.pulumi.googlenative.cloudasset.v1.outputs.ConditionContextResponse;
import com.pulumi.googlenative.cloudasset.v1.outputs.IdentitySelectorResponse;
import com.pulumi.googlenative.cloudasset.v1.outputs.OptionsResponse;
import com.pulumi.googlenative.cloudasset.v1.outputs.ResourceSelectorResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IamPolicyAnalysisQueryResponse {
    /**
     * @return Optional. Specifies roles or permissions for analysis. This is optional.
     * 
     */
    private final AccessSelectorResponse accessSelector;
    /**
     * @return Optional. The hypothetical context for IAM conditions evaluation.
     * 
     */
    private final ConditionContextResponse conditionContext;
    /**
     * @return Optional. Specifies an identity for analysis.
     * 
     */
    private final IdentitySelectorResponse identitySelector;
    /**
     * @return Optional. The query options.
     * 
     */
    private final OptionsResponse options;
    /**
     * @return Optional. Specifies a resource for analysis.
     * 
     */
    private final ResourceSelectorResponse resourceSelector;
    /**
     * @return The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as &#34;organizations/123&#34;), a folder number (such as &#34;folders/123&#34;), a project ID (such as &#34;projects/my-project-id&#34;), or a project number (such as &#34;projects/12345&#34;). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
     */
    private final String scope;

    @CustomType.Constructor
    private IamPolicyAnalysisQueryResponse(
        @CustomType.Parameter("accessSelector") AccessSelectorResponse accessSelector,
        @CustomType.Parameter("conditionContext") ConditionContextResponse conditionContext,
        @CustomType.Parameter("identitySelector") IdentitySelectorResponse identitySelector,
        @CustomType.Parameter("options") OptionsResponse options,
        @CustomType.Parameter("resourceSelector") ResourceSelectorResponse resourceSelector,
        @CustomType.Parameter("scope") String scope) {
        this.accessSelector = accessSelector;
        this.conditionContext = conditionContext;
        this.identitySelector = identitySelector;
        this.options = options;
        this.resourceSelector = resourceSelector;
        this.scope = scope;
    }

    /**
     * @return Optional. Specifies roles or permissions for analysis. This is optional.
     * 
     */
    public AccessSelectorResponse accessSelector() {
        return this.accessSelector;
    }
    /**
     * @return Optional. The hypothetical context for IAM conditions evaluation.
     * 
     */
    public ConditionContextResponse conditionContext() {
        return this.conditionContext;
    }
    /**
     * @return Optional. Specifies an identity for analysis.
     * 
     */
    public IdentitySelectorResponse identitySelector() {
        return this.identitySelector;
    }
    /**
     * @return Optional. The query options.
     * 
     */
    public OptionsResponse options() {
        return this.options;
    }
    /**
     * @return Optional. Specifies a resource for analysis.
     * 
     */
    public ResourceSelectorResponse resourceSelector() {
        return this.resourceSelector;
    }
    /**
     * @return The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as &#34;organizations/123&#34;), a folder number (such as &#34;folders/123&#34;), a project ID (such as &#34;projects/my-project-id&#34;), or a project number (such as &#34;projects/12345&#34;). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamPolicyAnalysisQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessSelectorResponse accessSelector;
        private ConditionContextResponse conditionContext;
        private IdentitySelectorResponse identitySelector;
        private OptionsResponse options;
        private ResourceSelectorResponse resourceSelector;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(IamPolicyAnalysisQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessSelector = defaults.accessSelector;
    	      this.conditionContext = defaults.conditionContext;
    	      this.identitySelector = defaults.identitySelector;
    	      this.options = defaults.options;
    	      this.resourceSelector = defaults.resourceSelector;
    	      this.scope = defaults.scope;
        }

        public Builder accessSelector(AccessSelectorResponse accessSelector) {
            this.accessSelector = Objects.requireNonNull(accessSelector);
            return this;
        }
        public Builder conditionContext(ConditionContextResponse conditionContext) {
            this.conditionContext = Objects.requireNonNull(conditionContext);
            return this;
        }
        public Builder identitySelector(IdentitySelectorResponse identitySelector) {
            this.identitySelector = Objects.requireNonNull(identitySelector);
            return this;
        }
        public Builder options(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder resourceSelector(ResourceSelectorResponse resourceSelector) {
            this.resourceSelector = Objects.requireNonNull(resourceSelector);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public IamPolicyAnalysisQueryResponse build() {
            return new IamPolicyAnalysisQueryResponse(accessSelector, conditionContext, identitySelector, options, resourceSelector, scope);
        }
    }
}
