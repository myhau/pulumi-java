// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpGroupRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpGroupRuleGetArgs Empty = new IpGroupRuleGetArgs();

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The IP address range, in CIDR notation, e.g., `10.0.0.0/16`
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    public IpGroupRuleGetArgs(
        @Nullable Input<String> description,
        Input<String> source) {
        this.description = description;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private IpGroupRuleGetArgs() {
        this.description = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpGroupRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(IpGroupRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.source = defaults.source;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }
        public IpGroupRuleGetArgs build() {
            return new IpGroupRuleGetArgs(description, source);
        }
    }
}
