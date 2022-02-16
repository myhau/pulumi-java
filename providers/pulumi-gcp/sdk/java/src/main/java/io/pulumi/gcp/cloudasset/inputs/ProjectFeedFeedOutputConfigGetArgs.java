// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigPubsubDestinationGetArgs;
import java.util.Objects;


public final class ProjectFeedFeedOutputConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedFeedOutputConfigGetArgs Empty = new ProjectFeedFeedOutputConfigGetArgs();

    @InputImport(name="pubsubDestination", required=true)
    private final Input<ProjectFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

    public Input<ProjectFeedFeedOutputConfigPubsubDestinationGetArgs> getPubsubDestination() {
        return this.pubsubDestination;
    }

    public ProjectFeedFeedOutputConfigGetArgs(Input<ProjectFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
        this.pubsubDestination = Objects.requireNonNull(pubsubDestination, "expected parameter 'pubsubDestination' to be non-null");
    }

    private ProjectFeedFeedOutputConfigGetArgs() {
        this.pubsubDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedFeedOutputConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ProjectFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedFeedOutputConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubDestination = defaults.pubsubDestination;
        }

        public Builder setPubsubDestination(Input<ProjectFeedFeedOutputConfigPubsubDestinationGetArgs> pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }

        public Builder setPubsubDestination(ProjectFeedFeedOutputConfigPubsubDestinationGetArgs pubsubDestination) {
            this.pubsubDestination = Input.of(Objects.requireNonNull(pubsubDestination));
            return this;
        }

        public ProjectFeedFeedOutputConfigGetArgs build() {
            return new ProjectFeedFeedOutputConfigGetArgs(pubsubDestination);
        }
    }
}