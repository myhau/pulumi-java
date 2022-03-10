// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EntrypointResponse {
    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    private final String shell;

    @OutputCustomType.Constructor
    private EntrypointResponse(@OutputCustomType.Parameter("shell") String shell) {
        this.shell = shell;
    }

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
    */
    public String getShell() {
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

        public Builder setShell(String shell) {
            this.shell = Objects.requireNonNull(shell);
            return this;
        }
        public EntrypointResponse build() {
            return new EntrypointResponse(shell);
        }
    }
}
