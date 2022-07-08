// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDataSourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataSourcePlainArgs Empty = new GetDataSourcePlainArgs();

    @Import(name="datasourceId", required=true)
    private String datasourceId;

    public String datasourceId() {
        return this.datasourceId;
    }

    @Import(name="debugOptionsEnableDebugging")
    private @Nullable String debugOptionsEnableDebugging;

    public Optional<String> debugOptionsEnableDebugging() {
        return Optional.ofNullable(this.debugOptionsEnableDebugging);
    }

    private GetDataSourcePlainArgs() {}

    private GetDataSourcePlainArgs(GetDataSourcePlainArgs $) {
        this.datasourceId = $.datasourceId;
        this.debugOptionsEnableDebugging = $.debugOptionsEnableDebugging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataSourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataSourcePlainArgs $;

        public Builder() {
            $ = new GetDataSourcePlainArgs();
        }

        public Builder(GetDataSourcePlainArgs defaults) {
            $ = new GetDataSourcePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasourceId(String datasourceId) {
            $.datasourceId = datasourceId;
            return this;
        }

        public Builder debugOptionsEnableDebugging(@Nullable String debugOptionsEnableDebugging) {
            $.debugOptionsEnableDebugging = debugOptionsEnableDebugging;
            return this;
        }

        public GetDataSourcePlainArgs build() {
            $.datasourceId = Objects.requireNonNull($.datasourceId, "expected parameter 'datasourceId' to be non-null");
            return $;
        }
    }

}
