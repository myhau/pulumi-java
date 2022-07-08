// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServingConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServingConfigArgs Empty = new GetServingConfigArgs();

    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="servingConfigId", required=true)
    private Output<String> servingConfigId;

    public Output<String> servingConfigId() {
        return this.servingConfigId;
    }

    private GetServingConfigArgs() {}

    private GetServingConfigArgs(GetServingConfigArgs $) {
        this.catalogId = $.catalogId;
        this.location = $.location;
        this.project = $.project;
        this.servingConfigId = $.servingConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServingConfigArgs $;

        public Builder() {
            $ = new GetServingConfigArgs();
        }

        public Builder(GetServingConfigArgs defaults) {
            $ = new GetServingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder servingConfigId(Output<String> servingConfigId) {
            $.servingConfigId = servingConfigId;
            return this;
        }

        public Builder servingConfigId(String servingConfigId) {
            return servingConfigId(Output.of(servingConfigId));
        }

        public GetServingConfigArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.servingConfigId = Objects.requireNonNull($.servingConfigId, "expected parameter 'servingConfigId' to be non-null");
            return $;
        }
    }

}
