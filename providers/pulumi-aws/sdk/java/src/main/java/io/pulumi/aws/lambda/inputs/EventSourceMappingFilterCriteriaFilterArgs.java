// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceMappingFilterCriteriaFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterCriteriaFilterArgs Empty = new EventSourceMappingFilterCriteriaFilterArgs();

    /**
     * A filter pattern up to 4096 characters. See [Filter Rule Syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax).
     * 
     */
    @InputImport(name="pattern")
      private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    public EventSourceMappingFilterCriteriaFilterArgs(@Nullable Input<String> pattern) {
        this.pattern = pattern;
    }

    private EventSourceMappingFilterCriteriaFilterArgs() {
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteriaFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteriaFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }
        public EventSourceMappingFilterCriteriaFilterArgs build() {
            return new EventSourceMappingFilterCriteriaFilterArgs(pattern);
        }
    }
}
