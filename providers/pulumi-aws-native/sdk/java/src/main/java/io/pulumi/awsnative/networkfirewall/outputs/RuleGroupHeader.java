// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderDirection;
import io.pulumi.awsnative.networkfirewall.enums.RuleGroupHeaderProtocol;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupHeader {
    private final String destination;
    private final String destinationPort;
    private final RuleGroupHeaderDirection direction;
    private final RuleGroupHeaderProtocol protocol;
    private final String source;
    private final String sourcePort;

    @OutputCustomType.Constructor({"destination","destinationPort","direction","protocol","source","sourcePort"})
    private RuleGroupHeader(
        String destination,
        String destinationPort,
        RuleGroupHeaderDirection direction,
        RuleGroupHeaderProtocol protocol,
        String source,
        String sourcePort) {
        this.destination = destination;
        this.destinationPort = destinationPort;
        this.direction = direction;
        this.protocol = protocol;
        this.source = source;
        this.sourcePort = sourcePort;
    }

    public String getDestination() {
        return this.destination;
    }
    public String getDestinationPort() {
        return this.destinationPort;
    }
    public RuleGroupHeaderDirection getDirection() {
        return this.direction;
    }
    public RuleGroupHeaderProtocol getProtocol() {
        return this.protocol;
    }
    public String getSource() {
        return this.source;
    }
    public String getSourcePort() {
        return this.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String destinationPort;
        private RuleGroupHeaderDirection direction;
        private RuleGroupHeaderProtocol protocol;
        private String source;
        private String sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationPort = defaults.destinationPort;
    	      this.direction = defaults.direction;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder setDestination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestinationPort(String destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }

        public Builder setDirection(RuleGroupHeaderDirection direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setProtocol(RuleGroupHeaderProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourcePort(String sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }
        public RuleGroupHeader build() {
            return new RuleGroupHeader(destination, destinationPort, direction, protocol, source, sourcePort);
        }
    }
}
