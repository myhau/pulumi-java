// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NfsLocationOnPremConfig {
    /**
     * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
     * 
     */
    private final List<String> agentArns;

    @OutputCustomType.Constructor({"agentArns"})
    private NfsLocationOnPremConfig(List<String> agentArns) {
        this.agentArns = agentArns;
    }

    /**
     * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
     * 
    */
    public List<String> getAgentArns() {
        return this.agentArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsLocationOnPremConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> agentArns;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsLocationOnPremConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
        }

        public Builder setAgentArns(List<String> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }
        public NfsLocationOnPremConfig build() {
            return new NfsLocationOnPremConfig(agentArns);
        }
    }
}