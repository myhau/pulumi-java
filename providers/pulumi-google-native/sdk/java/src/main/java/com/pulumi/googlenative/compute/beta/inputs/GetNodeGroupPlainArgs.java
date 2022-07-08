// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupPlainArgs Empty = new GetNodeGroupPlainArgs();

    @Import(name="nodeGroup", required=true)
    private String nodeGroup;

    public String nodeGroup() {
        return this.nodeGroup;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetNodeGroupPlainArgs() {}

    private GetNodeGroupPlainArgs(GetNodeGroupPlainArgs $) {
        this.nodeGroup = $.nodeGroup;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeGroupPlainArgs $;

        public Builder() {
            $ = new GetNodeGroupPlainArgs();
        }

        public Builder(GetNodeGroupPlainArgs defaults) {
            $ = new GetNodeGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder nodeGroup(String nodeGroup) {
            $.nodeGroup = nodeGroup;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetNodeGroupPlainArgs build() {
            $.nodeGroup = Objects.requireNonNull($.nodeGroup, "expected parameter 'nodeGroup' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
