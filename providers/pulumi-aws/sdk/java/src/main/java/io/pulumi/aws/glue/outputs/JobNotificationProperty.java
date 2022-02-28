// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobNotificationProperty {
    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    private final @Nullable Integer notifyDelayAfter;

    @OutputCustomType.Constructor({"notifyDelayAfter"})
    private JobNotificationProperty(@Nullable Integer notifyDelayAfter) {
        this.notifyDelayAfter = notifyDelayAfter;
    }

    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay notification.
     * 
     */
    public Optional<Integer> getNotifyDelayAfter() {
        return Optional.ofNullable(this.notifyDelayAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNotificationProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer notifyDelayAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(JobNotificationProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifyDelayAfter = defaults.notifyDelayAfter;
        }

        public Builder setNotifyDelayAfter(@Nullable Integer notifyDelayAfter) {
            this.notifyDelayAfter = notifyDelayAfter;
            return this;
        }
        public JobNotificationProperty build() {
            return new JobNotificationProperty(notifyDelayAfter);
        }
    }
}
