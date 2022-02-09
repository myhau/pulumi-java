// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlacementProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlacementProfileArgs Empty = new PlacementProfileArgs();

    @InputImport(name="clusterId")
    private final @Nullable Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId == null ? Input.empty() : this.clusterId;
    }

    @InputImport(name="datastoreId")
    private final @Nullable Input<String> datastoreId;

    public Input<String> getDatastoreId() {
        return this.datastoreId == null ? Input.empty() : this.datastoreId;
    }

    @InputImport(name="hostId")
    private final @Nullable Input<String> hostId;

    public Input<String> getHostId() {
        return this.hostId == null ? Input.empty() : this.hostId;
    }

    @InputImport(name="resourcePoolId")
    private final @Nullable Input<String> resourcePoolId;

    public Input<String> getResourcePoolId() {
        return this.resourcePoolId == null ? Input.empty() : this.resourcePoolId;
    }

    public PlacementProfileArgs(
        @Nullable Input<String> clusterId,
        @Nullable Input<String> datastoreId,
        @Nullable Input<String> hostId,
        @Nullable Input<String> resourcePoolId) {
        this.clusterId = clusterId;
        this.datastoreId = datastoreId;
        this.hostId = hostId;
        this.resourcePoolId = resourcePoolId;
    }

    private PlacementProfileArgs() {
        this.clusterId = Input.empty();
        this.datastoreId = Input.empty();
        this.hostId = Input.empty();
        this.resourcePoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlacementProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterId;
        private @Nullable Input<String> datastoreId;
        private @Nullable Input<String> hostId;
        private @Nullable Input<String> resourcePoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(PlacementProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.datastoreId = defaults.datastoreId;
    	      this.hostId = defaults.hostId;
    	      this.resourcePoolId = defaults.resourcePoolId;
        }

        public Builder setClusterId(@Nullable Input<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = Input.ofNullable(clusterId);
            return this;
        }

        public Builder setDatastoreId(@Nullable Input<String> datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = Input.ofNullable(datastoreId);
            return this;
        }

        public Builder setHostId(@Nullable Input<String> hostId) {
            this.hostId = hostId;
            return this;
        }

        public Builder setHostId(@Nullable String hostId) {
            this.hostId = Input.ofNullable(hostId);
            return this;
        }

        public Builder setResourcePoolId(@Nullable Input<String> resourcePoolId) {
            this.resourcePoolId = resourcePoolId;
            return this;
        }

        public Builder setResourcePoolId(@Nullable String resourcePoolId) {
            this.resourcePoolId = Input.ofNullable(resourcePoolId);
            return this;
        }

        public PlacementProfileArgs build() {
            return new PlacementProfileArgs(clusterId, datastoreId, hostId, resourcePoolId);
        }
    }
}