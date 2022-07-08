// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkEndpointGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkEndpointGroupArgs Empty = new GetNetworkEndpointGroupArgs();

    @Import(name="networkEndpointGroup", required=true)
    private Output<String> networkEndpointGroup;

    public Output<String> networkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetNetworkEndpointGroupArgs() {}

    private GetNetworkEndpointGroupArgs(GetNetworkEndpointGroupArgs $) {
        this.networkEndpointGroup = $.networkEndpointGroup;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkEndpointGroupArgs $;

        public Builder() {
            $ = new GetNetworkEndpointGroupArgs();
        }

        public Builder(GetNetworkEndpointGroupArgs defaults) {
            $ = new GetNetworkEndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkEndpointGroup(Output<String> networkEndpointGroup) {
            $.networkEndpointGroup = networkEndpointGroup;
            return this;
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            return networkEndpointGroup(Output.of(networkEndpointGroup));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetNetworkEndpointGroupArgs build() {
            $.networkEndpointGroup = Objects.requireNonNull($.networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
