// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSecondarySourceBuildStatusConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondarySourceBuildStatusConfigGetArgs Empty = new ProjectSecondarySourceBuildStatusConfigGetArgs();

    /**
     * Specifies the context of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    @InputImport(name="context")
      private final @Nullable Input<String> context;

    public Input<String> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * Specifies the target url of the build status CodeBuild sends to the source provider. The usage of this parameter depends on the source provider.
     * 
     */
    @InputImport(name="targetUrl")
      private final @Nullable Input<String> targetUrl;

    public Input<String> getTargetUrl() {
        return this.targetUrl == null ? Input.empty() : this.targetUrl;
    }

    public ProjectSecondarySourceBuildStatusConfigGetArgs(
        @Nullable Input<String> context,
        @Nullable Input<String> targetUrl) {
        this.context = context;
        this.targetUrl = targetUrl;
    }

    private ProjectSecondarySourceBuildStatusConfigGetArgs() {
        this.context = Input.empty();
        this.targetUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceBuildStatusConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> context;
        private @Nullable Input<String> targetUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceBuildStatusConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.targetUrl = defaults.targetUrl;
        }

        public Builder setContext(@Nullable Input<String> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setTargetUrl(@Nullable Input<String> targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public Builder setTargetUrl(@Nullable String targetUrl) {
            this.targetUrl = Input.ofNullable(targetUrl);
            return this;
        }
        public ProjectSecondarySourceBuildStatusConfigGetArgs build() {
            return new ProjectSecondarySourceBuildStatusConfigGetArgs(context, targetUrl);
        }
    }
}
