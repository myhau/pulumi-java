// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionInstanceGroupManagerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionInstanceGroupManagerArgs Empty = new GetRegionInstanceGroupManagerArgs();

    @Import(name="instanceGroupManager", required=true)
    private Output<String> instanceGroupManager;

    public Output<String> instanceGroupManager() {
        return this.instanceGroupManager;
    }

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

    private GetRegionInstanceGroupManagerArgs() {}

    private GetRegionInstanceGroupManagerArgs(GetRegionInstanceGroupManagerArgs $) {
        this.instanceGroupManager = $.instanceGroupManager;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionInstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionInstanceGroupManagerArgs $;

        public Builder() {
            $ = new GetRegionInstanceGroupManagerArgs();
        }

        public Builder(GetRegionInstanceGroupManagerArgs defaults) {
            $ = new GetRegionInstanceGroupManagerArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroupManager(Output<String> instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
            return this;
        }

        public Builder instanceGroupManager(String instanceGroupManager) {
            return instanceGroupManager(Output.of(instanceGroupManager));
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

        public GetRegionInstanceGroupManagerArgs build() {
            $.instanceGroupManager = Objects.requireNonNull($.instanceGroupManager, "expected parameter 'instanceGroupManager' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
