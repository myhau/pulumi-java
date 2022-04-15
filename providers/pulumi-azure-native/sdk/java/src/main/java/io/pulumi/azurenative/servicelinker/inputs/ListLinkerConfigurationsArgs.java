// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListLinkerConfigurationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListLinkerConfigurationsArgs Empty = new ListLinkerConfigurationsArgs();

    /**
     * The name Linker resource.
     * 
     */
    @Import(name="linkerName", required=true)
      private final String linkerName;

    public String linkerName() {
        return this.linkerName;
    }

    /**
     * The fully qualified Azure Resource manager identifier of the resource to be connected.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final String resourceUri;

    public String resourceUri() {
        return this.resourceUri;
    }

    public ListLinkerConfigurationsArgs(
        String linkerName,
        String resourceUri) {
        this.linkerName = Objects.requireNonNull(linkerName, "expected parameter 'linkerName' to be non-null");
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private ListLinkerConfigurationsArgs() {
        this.linkerName = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListLinkerConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkerName;
        private String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ListLinkerConfigurationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkerName = defaults.linkerName;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder linkerName(String linkerName) {
            this.linkerName = Objects.requireNonNull(linkerName);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }        public ListLinkerConfigurationsArgs build() {
            return new ListLinkerConfigurationsArgs(linkerName, resourceUri);
        }
    }
}
