// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the On Premise resource that was assessed
 * 
 */
public final class OnPremiseResourceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnPremiseResourceDetailsArgs Empty = new OnPremiseResourceDetailsArgs();

    /**
     * The name of the machine
     * 
     */
    @Import(name="machineName", required=true)
      private final Output<String> machineName;

    public Output<String> machineName() {
        return this.machineName;
    }

    /**
     * The platform where the assessed resource resides
     * Expected value is 'OnPremise'.
     * 
     */
    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    /**
     * The oms agent Id installed on the machine
     * 
     */
    @Import(name="sourceComputerId", required=true)
      private final Output<String> sourceComputerId;

    public Output<String> sourceComputerId() {
        return this.sourceComputerId;
    }

    /**
     * The unique Id of the machine
     * 
     */
    @Import(name="vmuuid", required=true)
      private final Output<String> vmuuid;

    public Output<String> vmuuid() {
        return this.vmuuid;
    }

    /**
     * Azure resource Id of the workspace the machine is attached to
     * 
     */
    @Import(name="workspaceId", required=true)
      private final Output<String> workspaceId;

    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    public OnPremiseResourceDetailsArgs(
        Output<String> machineName,
        Output<String> source,
        Output<String> sourceComputerId,
        Output<String> vmuuid,
        Output<String> workspaceId) {
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceComputerId = Objects.requireNonNull(sourceComputerId, "expected parameter 'sourceComputerId' to be non-null");
        this.vmuuid = Objects.requireNonNull(vmuuid, "expected parameter 'vmuuid' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private OnPremiseResourceDetailsArgs() {
        this.machineName = Codegen.empty();
        this.source = Codegen.empty();
        this.sourceComputerId = Codegen.empty();
        this.vmuuid = Codegen.empty();
        this.workspaceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremiseResourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> machineName;
        private Output<String> source;
        private Output<String> sourceComputerId;
        private Output<String> vmuuid;
        private Output<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremiseResourceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineName = defaults.machineName;
    	      this.source = defaults.source;
    	      this.sourceComputerId = defaults.sourceComputerId;
    	      this.vmuuid = defaults.vmuuid;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder machineName(Output<String> machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }
        public Builder machineName(String machineName) {
            this.machineName = Output.of(Objects.requireNonNull(machineName));
            return this;
        }
        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder sourceComputerId(Output<String> sourceComputerId) {
            this.sourceComputerId = Objects.requireNonNull(sourceComputerId);
            return this;
        }
        public Builder sourceComputerId(String sourceComputerId) {
            this.sourceComputerId = Output.of(Objects.requireNonNull(sourceComputerId));
            return this;
        }
        public Builder vmuuid(Output<String> vmuuid) {
            this.vmuuid = Objects.requireNonNull(vmuuid);
            return this;
        }
        public Builder vmuuid(String vmuuid) {
            this.vmuuid = Output.of(Objects.requireNonNull(vmuuid));
            return this;
        }
        public Builder workspaceId(Output<String> workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Output.of(Objects.requireNonNull(workspaceId));
            return this;
        }        public OnPremiseResourceDetailsArgs build() {
            return new OnPremiseResourceDetailsArgs(machineName, source, sourceComputerId, vmuuid, workspaceId);
        }
    }
}
