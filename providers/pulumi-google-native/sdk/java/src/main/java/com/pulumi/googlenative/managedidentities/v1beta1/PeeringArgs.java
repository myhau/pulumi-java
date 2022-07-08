// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeringArgs Empty = new PeeringArgs();

    /**
     * The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    @Import(name="authorizedNetwork", required=true)
    private Output<String> authorizedNetwork;

    /**
     * @return The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork;
    }

    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    @Import(name="domainResource", required=true)
    private Output<String> domainResource;

    /**
     * @return Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    public Output<String> domainResource() {
        return this.domainResource;
    }

    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Required. Peering Id, unique name to identify peering.
     * 
     */
    @Import(name="peeringId", required=true)
    private Output<String> peeringId;

    /**
     * @return Required. Peering Id, unique name to identify peering.
     * 
     */
    public Output<String> peeringId() {
        return this.peeringId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private PeeringArgs() {}

    private PeeringArgs(PeeringArgs $) {
        this.authorizedNetwork = $.authorizedNetwork;
        this.domainResource = $.domainResource;
        this.labels = $.labels;
        this.peeringId = $.peeringId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringArgs $;

        public Builder() {
            $ = new PeeringArgs();
        }

        public Builder(PeeringArgs defaults) {
            $ = new PeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedNetwork The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param domainResource Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
         * 
         * @return builder
         * 
         */
        public Builder domainResource(Output<String> domainResource) {
            $.domainResource = domainResource;
            return this;
        }

        /**
         * @param domainResource Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
         * 
         * @return builder
         * 
         */
        public Builder domainResource(String domainResource) {
            return domainResource(Output.of(domainResource));
        }

        /**
         * @param labels Optional. Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Resource labels to represent user provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param peeringId Required. Peering Id, unique name to identify peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(Output<String> peeringId) {
            $.peeringId = peeringId;
            return this;
        }

        /**
         * @param peeringId Required. Peering Id, unique name to identify peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringId(String peeringId) {
            return peeringId(Output.of(peeringId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public PeeringArgs build() {
            $.authorizedNetwork = Objects.requireNonNull($.authorizedNetwork, "expected parameter 'authorizedNetwork' to be non-null");
            $.domainResource = Objects.requireNonNull($.domainResource, "expected parameter 'domainResource' to be non-null");
            $.peeringId = Objects.requireNonNull($.peeringId, "expected parameter 'peeringId' to be non-null");
            return $;
        }
    }

}
