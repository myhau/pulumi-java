// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionBackendServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionBackendServicePlainArgs Empty = new GetRegionBackendServicePlainArgs();

    @Import(name="backendService", required=true)
    private String backendService;

    public String backendService() {
        return this.backendService;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetRegionBackendServicePlainArgs() {}

    private GetRegionBackendServicePlainArgs(GetRegionBackendServicePlainArgs $) {
        this.backendService = $.backendService;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionBackendServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionBackendServicePlainArgs $;

        public Builder() {
            $ = new GetRegionBackendServicePlainArgs();
        }

        public Builder(GetRegionBackendServicePlainArgs defaults) {
            $ = new GetRegionBackendServicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendService(String backendService) {
            $.backendService = backendService;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRegionBackendServicePlainArgs build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
