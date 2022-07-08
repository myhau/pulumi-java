// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.memcache.v1.outputs.MemcacheParametersResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeResponse {
    /**
     * @return Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    private final String host;
    /**
     * @return Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    private final String nodeId;
    /**
     * @return User defined parameters currently applied to the node.
     * 
     */
    private final MemcacheParametersResponse parameters;
    /**
     * @return The port number of the Memcached server on this node.
     * 
     */
    private final Integer port;
    /**
     * @return Current state of the Memcached node.
     * 
     */
    private final String state;
    /**
     * @return Location (GCP Zone) for the Memcached node.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private NodeResponse(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("nodeId") String nodeId,
        @CustomType.Parameter("parameters") MemcacheParametersResponse parameters,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("zone") String zone) {
        this.host = host;
        this.nodeId = nodeId;
        this.parameters = parameters;
        this.port = port;
        this.state = state;
        this.zone = zone;
    }

    /**
     * @return Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return User defined parameters currently applied to the node.
     * 
     */
    public MemcacheParametersResponse parameters() {
        return this.parameters;
    }
    /**
     * @return The port number of the Memcached server on this node.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Current state of the Memcached node.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Location (GCP Zone) for the Memcached node.
     * 
     */
    public String zone() {
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
    	      this.zone = defaults.zone;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }
        public Builder parameters(MemcacheParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public NodeResponse build() {
            return new NodeResponse(host, nodeId, parameters, port, state, zone);
        }
    }
}
