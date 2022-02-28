// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerPortRange {
    /**
     * The first port in the range of ports, inclusive.
     * 
     */
    private final @Nullable Integer fromPort;
    /**
     * The last port in the range of ports, inclusive.
     * 
     */
    private final @Nullable Integer toPort;

    @OutputCustomType.Constructor({"fromPort","toPort"})
    private ListenerPortRange(
        @Nullable Integer fromPort,
        @Nullable Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    /**
     * The first port in the range of ports, inclusive.
     * 
     */
    public Optional<Integer> getFromPort() {
        return Optional.ofNullable(this.fromPort);
    }
    /**
     * The last port in the range of ports, inclusive.
     * 
     */
    public Optional<Integer> getToPort() {
        return Optional.ofNullable(this.toPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fromPort;
        private @Nullable Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(@Nullable Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder setToPort(@Nullable Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public ListenerPortRange build() {
            return new ListenerPortRange(fromPort, toPort);
        }
    }
}
