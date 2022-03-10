// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.memcache_v1beta2.outputs.MemcacheParametersResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeResponse {
    /**
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    private final String host;
    /**
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    private final String nodeId;
    /**
     * User defined parameters currently applied to the node.
     * 
     */
    private final MemcacheParametersResponse parameters;
    /**
     * The port number of the Memcached server on this node.
     * 
     */
    private final Integer port;
    /**
     * Current state of the Memcached node.
     * 
     */
    private final String state;
    /**
     * Returns true if there is an update waiting to be applied
     * 
     */
    private final Boolean updateAvailable;
    /**
     * Location (GCP Zone) for the Memcached node.
     * 
     */
    private final String zone;

    @OutputCustomType.Constructor
    private NodeResponse(
        @OutputCustomType.Parameter("host") String host,
        @OutputCustomType.Parameter("nodeId") String nodeId,
        @OutputCustomType.Parameter("parameters") MemcacheParametersResponse parameters,
        @OutputCustomType.Parameter("port") Integer port,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("updateAvailable") Boolean updateAvailable,
        @OutputCustomType.Parameter("zone") String zone) {
        this.host = host;
        this.nodeId = nodeId;
        this.parameters = parameters;
        this.port = port;
        this.state = state;
        this.updateAvailable = updateAvailable;
        this.zone = zone;
    }

    /**
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
    */
    public String getNodeId() {
        return this.nodeId;
    }
    /**
     * User defined parameters currently applied to the node.
     * 
    */
    public MemcacheParametersResponse getParameters() {
        return this.parameters;
    }
    /**
     * The port number of the Memcached server on this node.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Current state of the Memcached node.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Returns true if there is an update waiting to be applied
     * 
    */
    public Boolean getUpdateAvailable() {
        return this.updateAvailable;
    }
    /**
     * Location (GCP Zone) for the Memcached node.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String nodeId;
        private MemcacheParametersResponse parameters;
        private Integer port;
        private String state;
        private Boolean updateAvailable;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.nodeId = defaults.nodeId;
    	      this.parameters = defaults.parameters;
    	      this.port = defaults.port;
    	      this.state = defaults.state;
    	      this.updateAvailable = defaults.updateAvailable;
    	      this.zone = defaults.zone;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setNodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder setParameters(MemcacheParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateAvailable(Boolean updateAvailable) {
            this.updateAvailable = Objects.requireNonNull(updateAvailable);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public NodeResponse build() {
            return new NodeResponse(host, nodeId, parameters, port, state, updateAvailable, zone);
        }
    }
}
