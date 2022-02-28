// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration {
    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    private final @Nullable Boolean allowNonRestoredState;

    @OutputCustomType.Constructor({"allowNonRestoredState"})
    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration(@Nullable Boolean allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    public Optional<Boolean> getAllowNonRestoredState() {
        return Optional.ofNullable(this.allowNonRestoredState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowNonRestoredState;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNonRestoredState = defaults.allowNonRestoredState;
        }

        public Builder setAllowNonRestoredState(@Nullable Boolean allowNonRestoredState) {
            this.allowNonRestoredState = allowNonRestoredState;
            return this;
        }
        public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration build() {
            return new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfiguration(allowNonRestoredState);
        }
    }
}
