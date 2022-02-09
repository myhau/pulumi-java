// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SourceControlAuthInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListBuildTaskSourceRepositoryPropertiesResult {
    private final @Nullable Boolean isCommitTriggerEnabled;
    private final String repositoryUrl;
    private final @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties;
    private final String sourceControlType;

    @OutputCustomType.Constructor({"isCommitTriggerEnabled","repositoryUrl","sourceControlAuthProperties","sourceControlType"})
    private ListBuildTaskSourceRepositoryPropertiesResult(
        @Nullable Boolean isCommitTriggerEnabled,
        String repositoryUrl,
        @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties,
        String sourceControlType) {
        this.isCommitTriggerEnabled = isCommitTriggerEnabled;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        this.sourceControlType = Objects.requireNonNull(sourceControlType);
    }

    public Optional<Boolean> getIsCommitTriggerEnabled() {
        return Optional.ofNullable(this.isCommitTriggerEnabled);
    }
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    public Optional<SourceControlAuthInfoResponse> getSourceControlAuthProperties() {
        return Optional.ofNullable(this.sourceControlAuthProperties);
    }
    public String getSourceControlType() {
        return this.sourceControlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBuildTaskSourceRepositoryPropertiesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCommitTriggerEnabled;
        private String repositoryUrl;
        private @Nullable SourceControlAuthInfoResponse sourceControlAuthProperties;
        private String sourceControlType;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBuildTaskSourceRepositoryPropertiesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCommitTriggerEnabled = defaults.isCommitTriggerEnabled;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceControlAuthProperties = defaults.sourceControlAuthProperties;
    	      this.sourceControlType = defaults.sourceControlType;
        }

        public Builder setIsCommitTriggerEnabled(@Nullable Boolean isCommitTriggerEnabled) {
            this.isCommitTriggerEnabled = isCommitTriggerEnabled;
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setSourceControlAuthProperties(@Nullable SourceControlAuthInfoResponse sourceControlAuthProperties) {
            this.sourceControlAuthProperties = sourceControlAuthProperties;
            return this;
        }

        public Builder setSourceControlType(String sourceControlType) {
            this.sourceControlType = Objects.requireNonNull(sourceControlType);
            return this;
        }

        public ListBuildTaskSourceRepositoryPropertiesResult build() {
            return new ListBuildTaskSourceRepositoryPropertiesResult(isCommitTriggerEnabled, repositoryUrl, sourceControlAuthProperties, sourceControlType);
        }
    }
}