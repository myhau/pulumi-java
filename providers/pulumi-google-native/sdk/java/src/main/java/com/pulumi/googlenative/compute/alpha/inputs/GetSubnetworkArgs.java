// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetworkArgs Empty = new GetSubnetworkArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="subnetwork", required=true)
    private Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork;
    }

    private GetSubnetworkArgs() {}

    private GetSubnetworkArgs(GetSubnetworkArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetworkArgs $;

        public Builder() {
            $ = new GetSubnetworkArgs();
        }

        public Builder(GetSubnetworkArgs defaults) {
            $ = new GetSubnetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder subnetwork(Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public GetSubnetworkArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}
