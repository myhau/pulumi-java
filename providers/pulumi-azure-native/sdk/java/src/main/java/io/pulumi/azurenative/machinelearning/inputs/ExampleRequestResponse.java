// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sample input data for the service's input(s).
 * 
 */
public final class ExampleRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExampleRequestResponse Empty = new ExampleRequestResponse();

    /**
     * Sample input data for the web service's global parameters
     * 
     */
    @Import(name="globalParameters")
      private final @Nullable Map<String,Object> globalParameters;

    public Map<String,Object> globalParameters() {
        return this.globalParameters == null ? Map.of() : this.globalParameters;
    }

    /**
     * Sample input data for the web service's input(s) given as an input name to sample input values matrix map.
     * 
     */
    @Import(name="inputs")
      private final @Nullable Map<String,List<List<Object>>> inputs;

    public Map<String,List<List<Object>>> inputs() {
        return this.inputs == null ? Map.of() : this.inputs;
    }

    public ExampleRequestResponse(
        @Nullable Map<String,Object> globalParameters,
        @Nullable Map<String,List<List<Object>>> inputs) {
        this.globalParameters = globalParameters;
        this.inputs = inputs;
    }

    private ExampleRequestResponse() {
        this.globalParameters = Map.of();
        this.inputs = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExampleRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> globalParameters;
        private @Nullable Map<String,List<List<Object>>> inputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ExampleRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalParameters = defaults.globalParameters;
    	      this.inputs = defaults.inputs;
        }

        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }
        public Builder inputs(@Nullable Map<String,List<List<Object>>> inputs) {
            this.inputs = inputs;
            return this;
        }        public ExampleRequestResponse build() {
            return new ExampleRequestResponse(globalParameters, inputs);
        }
    }
}
