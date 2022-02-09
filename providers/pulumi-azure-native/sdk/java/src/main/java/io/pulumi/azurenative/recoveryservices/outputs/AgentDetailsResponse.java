// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AgentDiskDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AgentDetailsResponse {
    private final String agentId;
    private final String biosId;
    private final List<AgentDiskDetailsResponse> disks;
    private final String fqdn;
    private final String machineId;

    @OutputCustomType.Constructor({"agentId","biosId","disks","fqdn","machineId"})
    private AgentDetailsResponse(
        String agentId,
        String biosId,
        List<AgentDiskDetailsResponse> disks,
        String fqdn,
        String machineId) {
        this.agentId = Objects.requireNonNull(agentId);
        this.biosId = Objects.requireNonNull(biosId);
        this.disks = Objects.requireNonNull(disks);
        this.fqdn = Objects.requireNonNull(fqdn);
        this.machineId = Objects.requireNonNull(machineId);
    }

    public String getAgentId() {
        return this.agentId;
    }
    public String getBiosId() {
        return this.biosId;
    }
    public List<AgentDiskDetailsResponse> getDisks() {
        return this.disks;
    }
    public String getFqdn() {
        return this.fqdn;
    }
    public String getMachineId() {
        return this.machineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String biosId;
        private List<AgentDiskDetailsResponse> disks;
        private String fqdn;
        private String machineId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.biosId = defaults.biosId;
    	      this.disks = defaults.disks;
    	      this.fqdn = defaults.fqdn;
    	      this.machineId = defaults.machineId;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setBiosId(String biosId) {
            this.biosId = Objects.requireNonNull(biosId);
            return this;
        }

        public Builder setDisks(List<AgentDiskDetailsResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setMachineId(String machineId) {
            this.machineId = Objects.requireNonNull(machineId);
            return this;
        }

        public AgentDetailsResponse build() {
            return new AgentDetailsResponse(agentId, biosId, disks, fqdn, machineId);
        }
    }
}