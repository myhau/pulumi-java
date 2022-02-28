// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AvailabilityZoneGroupState extends io.pulumi.resources.ResourceArgs {

    public static final AvailabilityZoneGroupState Empty = new AvailabilityZoneGroupState();

    /**
     * Name of the Availability Zone Group.
     * 
     */
    @InputImport(name="groupName")
      private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    /**
     * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
     * 
     */
    @InputImport(name="optInStatus")
      private final @Nullable Input<String> optInStatus;

    public Input<String> getOptInStatus() {
        return this.optInStatus == null ? Input.empty() : this.optInStatus;
    }

    public AvailabilityZoneGroupState(
        @Nullable Input<String> groupName,
        @Nullable Input<String> optInStatus) {
        this.groupName = groupName;
        this.optInStatus = optInStatus;
    }

    private AvailabilityZoneGroupState() {
        this.groupName = Input.empty();
        this.optInStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityZoneGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupName;
        private @Nullable Input<String> optInStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityZoneGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
    	      this.optInStatus = defaults.optInStatus;
        }

        public Builder setGroupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }

        public Builder setOptInStatus(@Nullable Input<String> optInStatus) {
            this.optInStatus = optInStatus;
            return this;
        }

        public Builder setOptInStatus(@Nullable String optInStatus) {
            this.optInStatus = Input.ofNullable(optInStatus);
            return this;
        }
        public AvailabilityZoneGroupState build() {
            return new AvailabilityZoneGroupState(groupName, optInStatus);
        }
    }
}
