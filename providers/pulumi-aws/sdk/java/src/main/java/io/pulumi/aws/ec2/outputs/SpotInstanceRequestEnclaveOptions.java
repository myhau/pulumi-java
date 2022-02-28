// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotInstanceRequestEnclaveOptions {
    /**
     * Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private SpotInstanceRequestEnclaveOptions(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestEnclaveOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestEnclaveOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public SpotInstanceRequestEnclaveOptions build() {
            return new SpotInstanceRequestEnclaveOptions(enabled);
        }
    }
}
