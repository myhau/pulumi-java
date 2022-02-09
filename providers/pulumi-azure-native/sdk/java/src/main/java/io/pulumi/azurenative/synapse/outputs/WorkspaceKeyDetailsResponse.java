// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceKeyDetailsResponse {
    private final @Nullable String keyVaultUrl;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"keyVaultUrl","name"})
    private WorkspaceKeyDetailsResponse(
        @Nullable String keyVaultUrl,
        @Nullable String name) {
        this.keyVaultUrl = keyVaultUrl;
        this.name = name;
    }

    public Optional<String> getKeyVaultUrl() {
        return Optional.ofNullable(this.keyVaultUrl);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultUrl;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultUrl = defaults.keyVaultUrl;
    	      this.name = defaults.name;
        }

        public Builder setKeyVaultUrl(@Nullable String keyVaultUrl) {
            this.keyVaultUrl = keyVaultUrl;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public WorkspaceKeyDetailsResponse build() {
            return new WorkspaceKeyDetailsResponse(keyVaultUrl, name);
        }
    }
}