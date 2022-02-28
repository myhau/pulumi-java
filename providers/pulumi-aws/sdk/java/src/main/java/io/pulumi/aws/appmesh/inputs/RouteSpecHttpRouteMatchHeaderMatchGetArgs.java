// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchHeaderMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderMatchGetArgs Empty = new RouteSpecHttpRouteMatchHeaderMatchGetArgs();

    /**
     * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="exact")
      private final @Nullable Input<String> exact;

    public Input<String> getExact() {
        return this.exact == null ? Input.empty() : this.exact;
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * The object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    @InputImport(name="range")
      private final @Nullable Input<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range;

    public Input<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    /**
     * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="regex")
      private final @Nullable Input<String> regex;

    public Input<String> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    /**
     * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="suffix")
      private final @Nullable Input<String> suffix;

    public Input<String> getSuffix() {
        return this.suffix == null ? Input.empty() : this.suffix;
    }

    public RouteSpecHttpRouteMatchHeaderMatchGetArgs(
        @Nullable Input<String> exact,
        @Nullable Input<String> prefix,
        @Nullable Input<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range,
        @Nullable Input<String> regex,
        @Nullable Input<String> suffix) {
        this.exact = exact;
        this.prefix = prefix;
        this.range = range;
        this.regex = regex;
        this.suffix = suffix;
    }

    private RouteSpecHttpRouteMatchHeaderMatchGetArgs() {
        this.exact = Input.empty();
        this.prefix = Input.empty();
        this.range = Input.empty();
        this.regex = Input.empty();
        this.suffix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeaderMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exact;
        private @Nullable Input<String> prefix;
        private @Nullable Input<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range;
        private @Nullable Input<String> regex;
        private @Nullable Input<String> suffix;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeaderMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.regex = defaults.regex;
    	      this.suffix = defaults.suffix;
        }

        public Builder setExact(@Nullable Input<String> exact) {
            this.exact = exact;
            return this;
        }

        public Builder setExact(@Nullable String exact) {
            this.exact = Input.ofNullable(exact);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setRange(@Nullable Input<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs range) {
            this.range = Input.ofNullable(range);
            return this;
        }

        public Builder setRegex(@Nullable Input<String> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable String regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setSuffix(@Nullable Input<String> suffix) {
            this.suffix = suffix;
            return this;
        }

        public Builder setSuffix(@Nullable String suffix) {
            this.suffix = Input.ofNullable(suffix);
            return this;
        }
        public RouteSpecHttpRouteMatchHeaderMatchGetArgs build() {
            return new RouteSpecHttpRouteMatchHeaderMatchGetArgs(exact, prefix, range, regex, suffix);
        }
    }
}
