// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCompositeTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCompositeTypePlainArgs Empty = new GetCompositeTypePlainArgs();

    @Import(name="compositeType", required=true)
    private String compositeType;

    public String compositeType() {
        return this.compositeType;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCompositeTypePlainArgs() {}

    private GetCompositeTypePlainArgs(GetCompositeTypePlainArgs $) {
        this.compositeType = $.compositeType;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCompositeTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCompositeTypePlainArgs $;

        public Builder() {
            $ = new GetCompositeTypePlainArgs();
        }

        public Builder(GetCompositeTypePlainArgs defaults) {
            $ = new GetCompositeTypePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder compositeType(String compositeType) {
            $.compositeType = compositeType;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCompositeTypePlainArgs build() {
            $.compositeType = Objects.requireNonNull($.compositeType, "expected parameter 'compositeType' to be non-null");
            return $;
        }
    }

}
