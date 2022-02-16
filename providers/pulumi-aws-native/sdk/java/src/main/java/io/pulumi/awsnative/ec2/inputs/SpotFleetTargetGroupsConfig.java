// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetTargetGroup;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class SpotFleetTargetGroupsConfig extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetTargetGroupsConfig Empty = new SpotFleetTargetGroupsConfig();

    @InputImport(name="targetGroups", required=true)
    private final List<SpotFleetTargetGroup> targetGroups;

    public List<SpotFleetTargetGroup> getTargetGroups() {
        return this.targetGroups;
    }

    public SpotFleetTargetGroupsConfig(List<SpotFleetTargetGroup> targetGroups) {
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private SpotFleetTargetGroupsConfig() {
        this.targetGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTargetGroupsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SpotFleetTargetGroup> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTargetGroupsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setTargetGroups(List<SpotFleetTargetGroup> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public SpotFleetTargetGroupsConfig build() {
            return new SpotFleetTargetGroupsConfig(targetGroups);
        }
    }
}