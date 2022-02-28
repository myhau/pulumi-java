// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * Name of the lambda function.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Alias name or version number of the lambda functionE.g., `$LATEST`, `my-alias`, or `1`
     * 
     */
    @InputImport(name="qualifier")
      private final @Nullable String qualifier;

    public Optional<String> getQualifier() {
        return this.qualifier == null ? Optional.empty() : Optional.ofNullable(this.qualifier);
    }

    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetFunctionArgs(
        String functionName,
        @Nullable String qualifier,
        @Nullable Map<String,String> tags) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.qualifier = qualifier;
        this.tags = tags;
    }

    private GetFunctionArgs() {
        this.functionName = null;
        this.qualifier = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private @Nullable String qualifier;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.qualifier = defaults.qualifier;
    	      this.tags = defaults.tags;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetFunctionArgs build() {
            return new GetFunctionArgs(functionName, qualifier, tags);
        }
    }
}
