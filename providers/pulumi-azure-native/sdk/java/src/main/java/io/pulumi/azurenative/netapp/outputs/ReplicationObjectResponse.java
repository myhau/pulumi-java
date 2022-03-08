// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicationObjectResponse {
    /**
     * Indicates whether the local volume is the source or destination for the Volume Replication
     * 
     */
    private final @Nullable String endpointType;
    /**
     * The remote region for the other end of the Volume Replication.
     * 
     */
    private final @Nullable String remoteVolumeRegion;
    /**
     * The resource ID of the remote volume.
     * 
     */
    private final String remoteVolumeResourceId;
    /**
     * Id
     * 
     */
    private final @Nullable String replicationId;
    /**
     * Schedule
     * 
     */
    private final String replicationSchedule;

    @OutputCustomType.Constructor({"endpointType","remoteVolumeRegion","remoteVolumeResourceId","replicationId","replicationSchedule"})
    private ReplicationObjectResponse(
        @Nullable String endpointType,
        @Nullable String remoteVolumeRegion,
        String remoteVolumeResourceId,
        @Nullable String replicationId,
        String replicationSchedule) {
        this.endpointType = endpointType;
        this.remoteVolumeRegion = remoteVolumeRegion;
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        this.replicationId = replicationId;
        this.replicationSchedule = replicationSchedule;
    }

    /**
     * Indicates whether the local volume is the source or destination for the Volume Replication
     * 
    */
    public Optional<String> getEndpointType() {
        return Optional.ofNullable(this.endpointType);
    }
    /**
     * The remote region for the other end of the Volume Replication.
     * 
    */
    public Optional<String> getRemoteVolumeRegion() {
        return Optional.ofNullable(this.remoteVolumeRegion);
    }
    /**
     * The resource ID of the remote volume.
     * 
    */
    public String getRemoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }
    /**
     * Id
     * 
    */
    public Optional<String> getReplicationId() {
        return Optional.ofNullable(this.replicationId);
    }
    /**
     * Schedule
     * 
    */
    public String getReplicationSchedule() {
        return this.replicationSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpointType;
        private @Nullable String remoteVolumeRegion;
        private String remoteVolumeResourceId;
        private @Nullable String replicationId;
        private String replicationSchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.remoteVolumeRegion = defaults.remoteVolumeRegion;
    	      this.remoteVolumeResourceId = defaults.remoteVolumeResourceId;
    	      this.replicationId = defaults.replicationId;
    	      this.replicationSchedule = defaults.replicationSchedule;
        }

        public Builder setEndpointType(@Nullable String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        public Builder setRemoteVolumeRegion(@Nullable String remoteVolumeRegion) {
            this.remoteVolumeRegion = remoteVolumeRegion;
            return this;
        }

        public Builder setRemoteVolumeResourceId(String remoteVolumeResourceId) {
            this.remoteVolumeResourceId = Objects.requireNonNull(remoteVolumeResourceId);
            return this;
        }

        public Builder setReplicationId(@Nullable String replicationId) {
            this.replicationId = replicationId;
            return this;
        }

        public Builder setReplicationSchedule(String replicationSchedule) {
            this.replicationSchedule = Objects.requireNonNull(replicationSchedule);
            return this;
        }
        public ReplicationObjectResponse build() {
            return new ReplicationObjectResponse(endpointType, remoteVolumeRegion, remoteVolumeResourceId, replicationId, replicationSchedule);
        }
    }
}
