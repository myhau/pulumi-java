// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs.v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCompanyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCompanyPlainArgs Empty = new GetCompanyPlainArgs();

    @Import(name="companyId", required=true)
    private String companyId;

    public String companyId() {
        return this.companyId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    private GetCompanyPlainArgs() {}

    private GetCompanyPlainArgs(GetCompanyPlainArgs $) {
        this.companyId = $.companyId;
        this.project = $.project;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCompanyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCompanyPlainArgs $;

        public Builder() {
            $ = new GetCompanyPlainArgs();
        }

        public Builder(GetCompanyPlainArgs defaults) {
            $ = new GetCompanyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder companyId(String companyId) {
            $.companyId = companyId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public GetCompanyPlainArgs build() {
            $.companyId = Objects.requireNonNull($.companyId, "expected parameter 'companyId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
