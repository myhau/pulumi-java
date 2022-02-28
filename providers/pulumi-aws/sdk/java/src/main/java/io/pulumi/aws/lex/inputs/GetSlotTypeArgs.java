// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSlotTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSlotTypeArgs Empty = new GetSlotTypeArgs();

    /**
     * The name of the slot type. The name is case sensitive.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The version of the slot type.
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetSlotTypeArgs(
        String name,
        @Nullable String version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private GetSlotTypeArgs() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlotTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSlotTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetSlotTypeArgs build() {
            return new GetSlotTypeArgs(name, version);
        }
    }
}
