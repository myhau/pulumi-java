// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponsePolicyGKEClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyGKEClusterArgs Empty = new ResponsePolicyGKEClusterArgs();

    /**
     * The resource name of the cluster to bind this response policy to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
     * 
     */
    @Import(name="gkeClusterName")
    private @Nullable Output<String> gkeClusterName;

    /**
     * @return The resource name of the cluster to bind this response policy to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
     * 
     */
    public Optional<Output<String>> gkeClusterName() {
        return Optional.ofNullable(this.gkeClusterName);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ResponsePolicyGKEClusterArgs() {}

    private ResponsePolicyGKEClusterArgs(ResponsePolicyGKEClusterArgs $) {
        this.gkeClusterName = $.gkeClusterName;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponsePolicyGKEClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponsePolicyGKEClusterArgs $;

        public Builder() {
            $ = new ResponsePolicyGKEClusterArgs();
        }

        public Builder(ResponsePolicyGKEClusterArgs defaults) {
            $ = new ResponsePolicyGKEClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gkeClusterName The resource name of the cluster to bind this response policy to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
         * 
         * @return builder
         * 
         */
        public Builder gkeClusterName(@Nullable Output<String> gkeClusterName) {
            $.gkeClusterName = gkeClusterName;
            return this;
        }

        /**
         * @param gkeClusterName The resource name of the cluster to bind this response policy to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
         * 
         * @return builder
         * 
         */
        public Builder gkeClusterName(String gkeClusterName) {
            return gkeClusterName(Output.of(gkeClusterName));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ResponsePolicyGKEClusterArgs build() {
            return $;
        }
    }

}
