// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.policysimulator.v1beta1.inputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationReplayArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationReplayArgs Empty = new OrganizationReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Import(name="config", required=true)
    private Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;

    /**
     * @return The configuration used for the `Replay`.
     * 
     */
    public Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config() {
        return this.config;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    private OrganizationReplayArgs() {}

    private OrganizationReplayArgs(OrganizationReplayArgs $) {
        this.config = $.config;
        this.location = $.location;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationReplayArgs $;

        public Builder() {
            $ = new OrganizationReplayArgs();
        }

        public Builder(OrganizationReplayArgs defaults) {
            $ = new OrganizationReplayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The configuration used for the `Replay`.
         * 
         * @return builder
         * 
         */
        public Builder config(Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The configuration used for the `Replay`.
         * 
         * @return builder
         * 
         */
        public Builder config(GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public OrganizationReplayArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
