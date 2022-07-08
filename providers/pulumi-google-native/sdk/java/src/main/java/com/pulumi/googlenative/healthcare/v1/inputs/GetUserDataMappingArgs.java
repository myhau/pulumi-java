// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserDataMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserDataMappingArgs Empty = new GetUserDataMappingArgs();

    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
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

    @Import(name="userDataMappingId", required=true)
    private Output<String> userDataMappingId;

    public Output<String> userDataMappingId() {
        return this.userDataMappingId;
    }

    private GetUserDataMappingArgs() {}

    private GetUserDataMappingArgs(GetUserDataMappingArgs $) {
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.project = $.project;
        this.userDataMappingId = $.userDataMappingId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserDataMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserDataMappingArgs $;

        public Builder() {
            $ = new GetUserDataMappingArgs();
        }

        public Builder(GetUserDataMappingArgs defaults) {
            $ = new GetUserDataMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
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

        public Builder userDataMappingId(Output<String> userDataMappingId) {
            $.userDataMappingId = userDataMappingId;
            return this;
        }

        public Builder userDataMappingId(String userDataMappingId) {
            return userDataMappingId(Output.of(userDataMappingId));
        }

        public GetUserDataMappingArgs build() {
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.userDataMappingId = Objects.requireNonNull($.userDataMappingId, "expected parameter 'userDataMappingId' to be non-null");
            return $;
        }
    }

}
