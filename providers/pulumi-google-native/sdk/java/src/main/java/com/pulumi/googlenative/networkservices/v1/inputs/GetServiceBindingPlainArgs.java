// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceBindingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceBindingPlainArgs Empty = new GetServiceBindingPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceBindingId", required=true)
    private String serviceBindingId;

    public String serviceBindingId() {
        return this.serviceBindingId;
    }

    private GetServiceBindingPlainArgs() {}

    private GetServiceBindingPlainArgs(GetServiceBindingPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.serviceBindingId = $.serviceBindingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceBindingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceBindingPlainArgs $;

        public Builder() {
            $ = new GetServiceBindingPlainArgs();
        }

        public Builder(GetServiceBindingPlainArgs defaults) {
            $ = new GetServiceBindingPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder serviceBindingId(String serviceBindingId) {
            $.serviceBindingId = serviceBindingId;
            return this;
        }

        public GetServiceBindingPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.serviceBindingId = Objects.requireNonNull($.serviceBindingId, "expected parameter 'serviceBindingId' to be non-null");
            return $;
        }
    }

}
