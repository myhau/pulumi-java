// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListMonitorVMHostsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListMonitorVMHostsArgs Empty = new ListMonitorVMHostsArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
      private final String monitorName;

    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public ListMonitorVMHostsArgs(
        String monitorName,
        String resourceGroupName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListMonitorVMHostsArgs() {
        this.monitorName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorVMHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String monitorName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorVMHostsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder monitorName(String monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public ListMonitorVMHostsArgs build() {
            return new ListMonitorVMHostsArgs(monitorName, resourceGroupName);
        }
    }
}
