// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TimelineErrorResponse {
    /**
     * the error message
     * 
     */
    private final String errorMessage;
    /**
     * the query kind
     * 
     */
    private final String kind;
    /**
     * the query id
     * 
     */
    private final @Nullable String queryId;

    @CustomType.Constructor
    private TimelineErrorResponse(
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("queryId") @Nullable String queryId) {
        this.errorMessage = errorMessage;
        this.kind = kind;
        this.queryId = queryId;
    }

    /**
     * the error message
     * 
    */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * the query kind
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * the query id
     * 
    */
    public Optional<String> queryId() {
        return Optional.ofNullable(this.queryId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimelineErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private String kind;
        private @Nullable String queryId;

        public Builder() {
    	      // Empty
        }

        public Builder(TimelineErrorResponse defaults) {
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
        }        public TimelineErrorResponse build() {
            return new TimelineErrorResponse(errorMessage, kind, queryId);
        }
    }
}
