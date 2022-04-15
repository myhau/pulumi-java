// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions Empty = new ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions();

    @Import(name="preflightOptions")
      private final @Nullable List<String> preflightOptions;

    public List<String> preflightOptions() {
        return this.preflightOptions == null ? List.of() : this.preflightOptions;
    }

    @Import(name="preflightSupported")
      private final @Nullable Boolean preflightSupported;

    public Optional<Boolean> preflightSupported() {
        return this.preflightSupported == null ? Optional.empty() : Optional.ofNullable(this.preflightSupported);
    }

    public ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions(
        @Nullable List<String> preflightOptions,
        @Nullable Boolean preflightSupported) {
        this.preflightOptions = preflightOptions;
        this.preflightSupported = preflightSupported;
    }

    private ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions() {
        this.preflightOptions = List.of();
        this.preflightSupported = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> preflightOptions;
        private @Nullable Boolean preflightSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preflightOptions = defaults.preflightOptions;
    	      this.preflightSupported = defaults.preflightSupported;
        }

        public Builder preflightOptions(@Nullable List<String> preflightOptions) {
            this.preflightOptions = preflightOptions;
            return this;
        }
        public Builder preflightOptions(String... preflightOptions) {
            return preflightOptions(List.of(preflightOptions));
        }
        public Builder preflightSupported(@Nullable Boolean preflightSupported) {
            this.preflightSupported = preflightSupported;
            return this;
        }        public ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions(preflightOptions, preflightSupported);
        }
    }
}
