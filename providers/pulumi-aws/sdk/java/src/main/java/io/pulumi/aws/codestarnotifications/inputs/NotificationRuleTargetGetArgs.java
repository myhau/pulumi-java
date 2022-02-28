// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarnotifications.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationRuleTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRuleTargetGetArgs Empty = new NotificationRuleTargetGetArgs();

    /**
     * The ARN of notification rule target. For example, a SNS Topic ARN.
     * 
     */
    @InputImport(name="address", required=true)
      private final Input<String> address;

    public Input<String> getAddress() {
        return this.address;
    }

    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The type of the notification target. Default value is `SNS`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public NotificationRuleTargetGetArgs(
        Input<String> address,
        @Nullable Input<String> status,
        @Nullable Input<String> type) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.status = status;
        this.type = type;
    }

    private NotificationRuleTargetGetArgs() {
        this.address = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> address;
        private @Nullable Input<String> status;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setAddress(Input<String> address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setAddress(String address) {
            this.address = Input.of(Objects.requireNonNull(address));
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public NotificationRuleTargetGetArgs build() {
            return new NotificationRuleTargetGetArgs(address, status, type);
        }
    }
}
