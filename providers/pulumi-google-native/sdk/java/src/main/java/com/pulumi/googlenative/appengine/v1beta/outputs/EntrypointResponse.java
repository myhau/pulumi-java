// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EntrypointResponse {
    /**
     * @return The format should be a shell command that can be fed to bash -c.
     * 
     */
    private final String shell;

    @CustomType.Constructor
    private EntrypointResponse(@CustomType.Parameter("shell") String shell) {
        this.shell = shell;
    }

    /**
     * @return The format should be a shell command that can be fed to bash -c.
     * 
     */
    public String shell() {
        return this.shell;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntrypointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shell;

        public Builder() {
    	      // Empty
        }

        public Builder(EntrypointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shell = defaults.shell;
        }

        public Builder shell(String shell) {
            this.shell = Objects.requireNonNull(shell);
            return this;
        }        public EntrypointResponse build() {
            return new EntrypointResponse(shell);
        }
    }
}
