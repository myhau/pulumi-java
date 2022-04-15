// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Nfs3TargetResponse {
    /**
     * IP address or host name of an NFSv3 host (e.g., 10.0.44.44).
     * 
     */
    private final @Nullable String target;
    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    private final @Nullable String usageModel;

    @CustomType.Constructor
    private Nfs3TargetResponse(
        @CustomType.Parameter("target") @Nullable String target,
        @CustomType.Parameter("usageModel") @Nullable String usageModel) {
        this.target = target;
        this.usageModel = usageModel;
    }

    /**
     * IP address or host name of an NFSv3 host (e.g., 10.0.44.44).
     * 
    */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
    */
    public Optional<String> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Nfs3TargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;
        private @Nullable String usageModel;

        public Builder() {
    	      // Empty
        }

        public Builder(Nfs3TargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.usageModel = defaults.usageModel;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder usageModel(@Nullable String usageModel) {
            this.usageModel = usageModel;
            return this;
        }        public Nfs3TargetResponse build() {
            return new Nfs3TargetResponse(target, usageModel);
        }
    }
}
