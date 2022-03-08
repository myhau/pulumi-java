// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudasset_v1.outputs.IamPolicyAnalysisQueryResponse;
import java.util.Objects;

@OutputCustomType
public final class QueryContentResponse {
    /**
     * An IAM Policy Analysis query, which could be used in the AssetService.AnalyzeIamPolicy rpc or the AssetService.AnalyzeIamPolicyLongrunning rpc.
     * 
     */
    private final IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery;

    @OutputCustomType.Constructor({"iamPolicyAnalysisQuery"})
    private QueryContentResponse(IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery) {
        this.iamPolicyAnalysisQuery = iamPolicyAnalysisQuery;
    }

    /**
     * An IAM Policy Analysis query, which could be used in the AssetService.AnalyzeIamPolicy rpc or the AssetService.AnalyzeIamPolicyLongrunning rpc.
     * 
    */
    public IamPolicyAnalysisQueryResponse getIamPolicyAnalysisQuery() {
        return this.iamPolicyAnalysisQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamPolicyAnalysisQuery = defaults.iamPolicyAnalysisQuery;
        }

        public Builder setIamPolicyAnalysisQuery(IamPolicyAnalysisQueryResponse iamPolicyAnalysisQuery) {
            this.iamPolicyAnalysisQuery = Objects.requireNonNull(iamPolicyAnalysisQuery);
            return this;
        }
        public QueryContentResponse build() {
            return new QueryContentResponse(iamPolicyAnalysisQuery);
        }
    }
}
