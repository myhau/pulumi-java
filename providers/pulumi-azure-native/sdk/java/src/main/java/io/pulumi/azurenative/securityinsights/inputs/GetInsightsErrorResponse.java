// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GetInsights Query Errors.
 * 
 */
public final class GetInsightsErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetInsightsErrorResponse Empty = new GetInsightsErrorResponse();

    /**
     * the error message
     * 
     */
    @Import(name="errorMessage", required=true)
      private final String errorMessage;

    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * the query kind
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * the query id
     * 
     */
    @Import(name="queryId")
      private final @Nullable String queryId;

    public Optional<String> queryId() {
        return this.queryId == null ? Optional.empty() : Optional.ofNullable(this.queryId);
    }

    public GetInsightsErrorResponse(
        String errorMessage,
        String kind,
        @Nullable String queryId) {
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.queryId = queryId;
    }

    private GetInsightsErrorResponse() {
        this.errorMessage = null;
        this.kind = null;
        this.queryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInsightsErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private String kind;
        private @Nullable String queryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInsightsErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.kind = defaults.kind;
    	      this.queryId = defaults.queryId;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder queryId(@Nullable String queryId) {
            this.queryId = queryId;
            return this;
        }        public GetInsightsErrorResponse build() {
            return new GetInsightsErrorResponse(errorMessage, kind, queryId);
        }
    }
}
