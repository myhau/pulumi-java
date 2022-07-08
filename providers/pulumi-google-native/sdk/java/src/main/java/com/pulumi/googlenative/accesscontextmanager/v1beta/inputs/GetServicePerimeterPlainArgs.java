// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServicePerimeterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePerimeterPlainArgs Empty = new GetServicePerimeterPlainArgs();

    @Import(name="accessPolicyId", required=true)
    private String accessPolicyId;

    public String accessPolicyId() {
        return this.accessPolicyId;
    }

    @Import(name="servicePerimeterId", required=true)
    private String servicePerimeterId;

    public String servicePerimeterId() {
        return this.servicePerimeterId;
    }

    private GetServicePerimeterPlainArgs() {}

    private GetServicePerimeterPlainArgs(GetServicePerimeterPlainArgs $) {
        this.accessPolicyId = $.accessPolicyId;
        this.servicePerimeterId = $.servicePerimeterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePerimeterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePerimeterPlainArgs $;

        public Builder() {
            $ = new GetServicePerimeterPlainArgs();
        }

        public Builder(GetServicePerimeterPlainArgs defaults) {
            $ = new GetServicePerimeterPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicyId(String accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder servicePerimeterId(String servicePerimeterId) {
            $.servicePerimeterId = servicePerimeterId;
            return this;
        }

        public GetServicePerimeterPlainArgs build() {
            $.accessPolicyId = Objects.requireNonNull($.accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
            $.servicePerimeterId = Objects.requireNonNull($.servicePerimeterId, "expected parameter 'servicePerimeterId' to be non-null");
            return $;
        }
    }

}
