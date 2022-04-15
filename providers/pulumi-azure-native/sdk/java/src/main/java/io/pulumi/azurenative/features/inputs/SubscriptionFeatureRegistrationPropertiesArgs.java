// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.inputs;

import io.pulumi.azurenative.features.enums.SubscriptionFeatureRegistrationState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionFeatureRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionFeatureRegistrationPropertiesArgs Empty = new SubscriptionFeatureRegistrationPropertiesArgs();

    /**
     * The feature description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Key-value pairs for meta data.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Indicates whether feature should be displayed in Portal.
     * 
     */
    @Import(name="shouldFeatureDisplayInPortal")
      private final @Nullable Output<Boolean> shouldFeatureDisplayInPortal;

    public Output<Boolean> shouldFeatureDisplayInPortal() {
        return this.shouldFeatureDisplayInPortal == null ? Codegen.empty() : this.shouldFeatureDisplayInPortal;
    }

    /**
     * The state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state;

    public Output<Either<String,SubscriptionFeatureRegistrationState>> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public SubscriptionFeatureRegistrationPropertiesArgs(
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<Boolean> shouldFeatureDisplayInPortal,
        @Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state) {
        this.description = description;
        this.metadata = metadata;
        this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal == null ? Codegen.ofNullable(false) : shouldFeatureDisplayInPortal;
        this.state = state;
    }

    private SubscriptionFeatureRegistrationPropertiesArgs() {
        this.description = Codegen.empty();
        this.metadata = Codegen.empty();
        this.shouldFeatureDisplayInPortal = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<Boolean> shouldFeatureDisplayInPortal;
        private @Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionFeatureRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.shouldFeatureDisplayInPortal = defaults.shouldFeatureDisplayInPortal;
    	      this.state = defaults.state;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder shouldFeatureDisplayInPortal(@Nullable Output<Boolean> shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
            return this;
        }
        public Builder shouldFeatureDisplayInPortal(@Nullable Boolean shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = Codegen.ofNullable(shouldFeatureDisplayInPortal);
            return this;
        }
        public Builder state(@Nullable Output<Either<String,SubscriptionFeatureRegistrationState>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,SubscriptionFeatureRegistrationState> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public SubscriptionFeatureRegistrationPropertiesArgs build() {
            return new SubscriptionFeatureRegistrationPropertiesArgs(description, metadata, shouldFeatureDisplayInPortal, state);
        }
    }
}
