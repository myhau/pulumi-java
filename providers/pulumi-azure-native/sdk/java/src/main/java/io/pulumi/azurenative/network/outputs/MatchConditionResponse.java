// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.MatchVariableResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MatchConditionResponse {
    /**
     * Match value.
     * 
     */
    private final List<String> matchValues;
    /**
     * List of match variables.
     * 
     */
    private final List<MatchVariableResponse> matchVariables;
    /**
     * Whether this is negate condition or not.
     * 
     */
    private final @Nullable Boolean negationConditon;
    /**
     * The operator to be matched.
     * 
     */
    private final String operator;
    /**
     * List of transforms.
     * 
     */
    private final @Nullable List<String> transforms;

    @OutputCustomType.Constructor({"matchValues","matchVariables","negationConditon","operator","transforms"})
    private MatchConditionResponse(
        List<String> matchValues,
        List<MatchVariableResponse> matchVariables,
        @Nullable Boolean negationConditon,
        String operator,
        @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.matchVariables = matchVariables;
        this.negationConditon = negationConditon;
        this.operator = operator;
        this.transforms = transforms;
    }

    /**
     * Match value.
     * 
    */
    public List<String> getMatchValues() {
        return this.matchValues;
    }
    /**
     * List of match variables.
     * 
    */
    public List<MatchVariableResponse> getMatchVariables() {
        return this.matchVariables;
    }
    /**
     * Whether this is negate condition or not.
     * 
    */
    public Optional<Boolean> getNegationConditon() {
        return Optional.ofNullable(this.negationConditon);
    }
    /**
     * The operator to be matched.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * List of transforms.
     * 
    */
    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> matchValues;
        private List<MatchVariableResponse> matchVariables;
        private @Nullable Boolean negationConditon;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.matchVariables = defaults.matchVariables;
    	      this.negationConditon = defaults.negationConditon;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder setMatchValues(List<String> matchValues) {
            this.matchValues = Objects.requireNonNull(matchValues);
            return this;
        }

        public Builder setMatchVariables(List<MatchVariableResponse> matchVariables) {
            this.matchVariables = Objects.requireNonNull(matchVariables);
            return this;
        }

        public Builder setNegationConditon(@Nullable Boolean negationConditon) {
            this.negationConditon = negationConditon;
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }
        public MatchConditionResponse build() {
            return new MatchConditionResponse(matchValues, matchVariables, negationConditon, operator, transforms);
        }
    }
}
