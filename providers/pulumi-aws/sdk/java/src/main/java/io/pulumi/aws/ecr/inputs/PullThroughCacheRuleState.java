// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PullThroughCacheRuleState extends io.pulumi.resources.ResourceArgs {

    public static final PullThroughCacheRuleState Empty = new PullThroughCacheRuleState();

    /**
     * The repository name prefix to use when caching images from the source registry.
     * 
     */
    @InputImport(name="ecrRepositoryPrefix")
      private final @Nullable Input<String> ecrRepositoryPrefix;

    public Input<String> getEcrRepositoryPrefix() {
        return this.ecrRepositoryPrefix == null ? Input.empty() : this.ecrRepositoryPrefix;
    }

    /**
     * The registry ID where the repository was created.
     * 
     */
    @InputImport(name="registryId")
      private final @Nullable Input<String> registryId;

    public Input<String> getRegistryId() {
        return this.registryId == null ? Input.empty() : this.registryId;
    }

    /**
     * The registry URL of the upstream public registry to use as the source.
     * 
     */
    @InputImport(name="upstreamRegistryUrl")
      private final @Nullable Input<String> upstreamRegistryUrl;

    public Input<String> getUpstreamRegistryUrl() {
        return this.upstreamRegistryUrl == null ? Input.empty() : this.upstreamRegistryUrl;
    }

    public PullThroughCacheRuleState(
        @Nullable Input<String> ecrRepositoryPrefix,
        @Nullable Input<String> registryId,
        @Nullable Input<String> upstreamRegistryUrl) {
        this.ecrRepositoryPrefix = ecrRepositoryPrefix;
        this.registryId = registryId;
        this.upstreamRegistryUrl = upstreamRegistryUrl;
    }

    private PullThroughCacheRuleState() {
        this.ecrRepositoryPrefix = Input.empty();
        this.registryId = Input.empty();
        this.upstreamRegistryUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PullThroughCacheRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ecrRepositoryPrefix;
        private @Nullable Input<String> registryId;
        private @Nullable Input<String> upstreamRegistryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PullThroughCacheRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ecrRepositoryPrefix = defaults.ecrRepositoryPrefix;
    	      this.registryId = defaults.registryId;
    	      this.upstreamRegistryUrl = defaults.upstreamRegistryUrl;
        }

        public Builder setEcrRepositoryPrefix(@Nullable Input<String> ecrRepositoryPrefix) {
            this.ecrRepositoryPrefix = ecrRepositoryPrefix;
            return this;
        }

        public Builder setEcrRepositoryPrefix(@Nullable String ecrRepositoryPrefix) {
            this.ecrRepositoryPrefix = Input.ofNullable(ecrRepositoryPrefix);
            return this;
        }

        public Builder setRegistryId(@Nullable Input<String> registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder setRegistryId(@Nullable String registryId) {
            this.registryId = Input.ofNullable(registryId);
            return this;
        }

        public Builder setUpstreamRegistryUrl(@Nullable Input<String> upstreamRegistryUrl) {
            this.upstreamRegistryUrl = upstreamRegistryUrl;
            return this;
        }

        public Builder setUpstreamRegistryUrl(@Nullable String upstreamRegistryUrl) {
            this.upstreamRegistryUrl = Input.ofNullable(upstreamRegistryUrl);
            return this;
        }
        public PullThroughCacheRuleState build() {
            return new PullThroughCacheRuleState(ecrRepositoryPrefix, registryId, upstreamRegistryUrl);
        }
    }
}