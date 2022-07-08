// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub.v1.inputs.ApplianceClusterArgs;
import com.pulumi.googlenative.gkehub.v1.inputs.EdgeClusterArgs;
import com.pulumi.googlenative.gkehub.v1.inputs.GkeClusterArgs;
import com.pulumi.googlenative.gkehub.v1.inputs.KubernetesResourceArgs;
import com.pulumi.googlenative.gkehub.v1.inputs.MultiCloudClusterArgs;
import com.pulumi.googlenative.gkehub.v1.inputs.OnPremClusterArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * Optional. Specific information for a GDC Edge Appliance cluster.
     * 
     */
    @Import(name="applianceCluster")
    private @Nullable Output<ApplianceClusterArgs> applianceCluster;

    /**
     * @return Optional. Specific information for a GDC Edge Appliance cluster.
     * 
     */
    public Optional<Output<ApplianceClusterArgs>> applianceCluster() {
        return Optional.ofNullable(this.applianceCluster);
    }

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @Import(name="edgeCluster")
    private @Nullable Output<EdgeClusterArgs> edgeCluster;

    /**
     * @return Optional. Specific information for a Google Edge cluster.
     * 
     */
    public Optional<Output<EdgeClusterArgs>> edgeCluster() {
        return Optional.ofNullable(this.edgeCluster);
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @Import(name="gkeCluster")
    private @Nullable Output<GkeClusterArgs> gkeCluster;

    /**
     * @return Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    public Optional<Output<GkeClusterArgs>> gkeCluster() {
        return Optional.ofNullable(this.gkeCluster);
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @Import(name="kubernetesResource")
    private @Nullable Output<KubernetesResourceArgs> kubernetesResource;

    /**
     * @return Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    public Optional<Output<KubernetesResourceArgs>> kubernetesResource() {
        return Optional.ofNullable(this.kubernetesResource);
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @Import(name="multiCloudCluster")
    private @Nullable Output<MultiCloudClusterArgs> multiCloudCluster;

    /**
     * @return Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    public Optional<Output<MultiCloudClusterArgs>> multiCloudCluster() {
        return Optional.ofNullable(this.multiCloudCluster);
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
     * 
     */
    @Import(name="onPremCluster")
    private @Nullable Output<OnPremClusterArgs> onPremCluster;

    /**
     * @return Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
     * 
     */
    public Optional<Output<OnPremClusterArgs>> onPremCluster() {
        return Optional.ofNullable(this.onPremCluster);
    }

    private MembershipEndpointArgs() {}

    private MembershipEndpointArgs(MembershipEndpointArgs $) {
        this.applianceCluster = $.applianceCluster;
        this.edgeCluster = $.edgeCluster;
        this.gkeCluster = $.gkeCluster;
        this.kubernetesResource = $.kubernetesResource;
        this.multiCloudCluster = $.multiCloudCluster;
        this.onPremCluster = $.onPremCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipEndpointArgs $;

        public Builder() {
            $ = new MembershipEndpointArgs();
        }

        public Builder(MembershipEndpointArgs defaults) {
            $ = new MembershipEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applianceCluster Optional. Specific information for a GDC Edge Appliance cluster.
         * 
         * @return builder
         * 
         */
        public Builder applianceCluster(@Nullable Output<ApplianceClusterArgs> applianceCluster) {
            $.applianceCluster = applianceCluster;
            return this;
        }

        /**
         * @param applianceCluster Optional. Specific information for a GDC Edge Appliance cluster.
         * 
         * @return builder
         * 
         */
        public Builder applianceCluster(ApplianceClusterArgs applianceCluster) {
            return applianceCluster(Output.of(applianceCluster));
        }

        /**
         * @param edgeCluster Optional. Specific information for a Google Edge cluster.
         * 
         * @return builder
         * 
         */
        public Builder edgeCluster(@Nullable Output<EdgeClusterArgs> edgeCluster) {
            $.edgeCluster = edgeCluster;
            return this;
        }

        /**
         * @param edgeCluster Optional. Specific information for a Google Edge cluster.
         * 
         * @return builder
         * 
         */
        public Builder edgeCluster(EdgeClusterArgs edgeCluster) {
            return edgeCluster(Output.of(edgeCluster));
        }

        /**
         * @param gkeCluster Optional. Specific information for a GKE-on-GCP cluster.
         * 
         * @return builder
         * 
         */
        public Builder gkeCluster(@Nullable Output<GkeClusterArgs> gkeCluster) {
            $.gkeCluster = gkeCluster;
            return this;
        }

        /**
         * @param gkeCluster Optional. Specific information for a GKE-on-GCP cluster.
         * 
         * @return builder
         * 
         */
        public Builder gkeCluster(GkeClusterArgs gkeCluster) {
            return gkeCluster(Output.of(gkeCluster));
        }

        /**
         * @param kubernetesResource Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesResource(@Nullable Output<KubernetesResourceArgs> kubernetesResource) {
            $.kubernetesResource = kubernetesResource;
            return this;
        }

        /**
         * @param kubernetesResource Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesResource(KubernetesResourceArgs kubernetesResource) {
            return kubernetesResource(Output.of(kubernetesResource));
        }

        /**
         * @param multiCloudCluster Optional. Specific information for a GKE Multi-Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder multiCloudCluster(@Nullable Output<MultiCloudClusterArgs> multiCloudCluster) {
            $.multiCloudCluster = multiCloudCluster;
            return this;
        }

        /**
         * @param multiCloudCluster Optional. Specific information for a GKE Multi-Cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder multiCloudCluster(MultiCloudClusterArgs multiCloudCluster) {
            return multiCloudCluster(Output.of(multiCloudCluster));
        }

        /**
         * @param onPremCluster Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
         * 
         * @return builder
         * 
         */
        public Builder onPremCluster(@Nullable Output<OnPremClusterArgs> onPremCluster) {
            $.onPremCluster = onPremCluster;
            return this;
        }

        /**
         * @param onPremCluster Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil &#34;type&#34; instead.
         * 
         * @return builder
         * 
         */
        public Builder onPremCluster(OnPremClusterArgs onPremCluster) {
            return onPremCluster(Output.of(onPremCluster));
        }

        public MembershipEndpointArgs build() {
            return $;
        }
    }

}
