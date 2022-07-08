// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppConnectorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppConnectorPlainArgs Empty = new GetAppConnectorPlainArgs();

    @Import(name="appConnectorId", required=true)
    private String appConnectorId;

    public String appConnectorId() {
        return this.appConnectorId;
    }

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

    private GetAppConnectorPlainArgs() {}

    private GetAppConnectorPlainArgs(GetAppConnectorPlainArgs $) {
        this.appConnectorId = $.appConnectorId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppConnectorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppConnectorPlainArgs $;

        public Builder() {
            $ = new GetAppConnectorPlainArgs();
        }

        public Builder(GetAppConnectorPlainArgs defaults) {
            $ = new GetAppConnectorPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder appConnectorId(String appConnectorId) {
            $.appConnectorId = appConnectorId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAppConnectorPlainArgs build() {
            $.appConnectorId = Objects.requireNonNull($.appConnectorId, "expected parameter 'appConnectorId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
