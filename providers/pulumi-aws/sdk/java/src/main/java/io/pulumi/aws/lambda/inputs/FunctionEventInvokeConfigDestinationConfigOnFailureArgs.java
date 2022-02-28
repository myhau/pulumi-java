// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionEventInvokeConfigDestinationConfigOnFailureArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigDestinationConfigOnFailureArgs Empty = new FunctionEventInvokeConfigDestinationConfigOnFailureArgs();

    /**
     * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
     * 
     */
    @InputImport(name="destination", required=true)
      private final Input<String> destination;

    public Input<String> getDestination() {
        return this.destination;
    }

    public FunctionEventInvokeConfigDestinationConfigOnFailureArgs(Input<String> destination) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
    }

    private FunctionEventInvokeConfigDestinationConfigOnFailureArgs() {
        this.destination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfigOnFailureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destination;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigOnFailureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(Input<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }
        public FunctionEventInvokeConfigDestinationConfigOnFailureArgs build() {
            return new FunctionEventInvokeConfigDestinationConfigOnFailureArgs(destination);
        }
    }
}
