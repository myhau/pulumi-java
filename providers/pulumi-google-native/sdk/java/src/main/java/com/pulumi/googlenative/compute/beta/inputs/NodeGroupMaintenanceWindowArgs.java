// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Time window specified for daily maintenance operations. GCE&#39;s internal maintenance will be performed within this window.
 * 
 */
public final class NodeGroupMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupMaintenanceWindowArgs Empty = new NodeGroupMaintenanceWindowArgs();

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private NodeGroupMaintenanceWindowArgs() {}

    private NodeGroupMaintenanceWindowArgs(NodeGroupMaintenanceWindowArgs $) {
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupMaintenanceWindowArgs $;

        public Builder() {
            $ = new NodeGroupMaintenanceWindowArgs();
        }

        public Builder(NodeGroupMaintenanceWindowArgs defaults) {
            $ = new NodeGroupMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startTime Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public NodeGroupMaintenanceWindowArgs build() {
            return $;
        }
    }

}
