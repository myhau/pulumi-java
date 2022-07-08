// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MultiCloudCluster contains information specific to GKE Multi-Cloud clusters.
 * 
 */
public final class MultiCloudClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiCloudClusterArgs Empty = new MultiCloudClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
    private @Nullable Output<String> resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    public Optional<Output<String>> resourceLink() {
        return Optional.ofNullable(this.resourceLink);
    }

    private MultiCloudClusterArgs() {}

    private MultiCloudClusterArgs(MultiCloudClusterArgs $) {
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiCloudClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiCloudClusterArgs $;

        public Builder() {
            $ = new MultiCloudClusterArgs();
        }

        public Builder(MultiCloudClusterArgs defaults) {
            $ = new MultiCloudClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            return resourceLink(Output.of(resourceLink));
        }

        public MultiCloudClusterArgs build() {
            return $;
        }
    }

}
