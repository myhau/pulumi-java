// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetworkPlainArgs Empty = new GetSubnetworkPlainArgs();

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

    @Import(name="subnetwork", required=true)
    private String subnetwork;

    public String subnetwork() {
        return this.subnetwork;
    }

    private GetSubnetworkPlainArgs() {}

    private GetSubnetworkPlainArgs(GetSubnetworkPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetworkPlainArgs $;

        public Builder() {
            $ = new GetSubnetworkPlainArgs();
        }

        public Builder(GetSubnetworkPlainArgs defaults) {
            $ = new GetSubnetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public GetSubnetworkPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}
