// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for HttpVersion match conditions
 * 
 */
public final class HttpVersionMatchConditionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpVersionMatchConditionParametersResponse Empty = new HttpVersionMatchConditionParametersResponse();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
      private final @Nullable List<String> matchValues;

    public List<String> matchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
      private final @Nullable Boolean negateCondition;

    public Optional<Boolean> negateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String operator() {
        return this.operator;
    }

    public HttpVersionMatchConditionParametersResponse(
        @Nullable List<String> matchValues,
        @Nullable Boolean negateCondition,
        String odataType,
        String operator) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
    }

    private HttpVersionMatchConditionParametersResponse() {
        this.matchValues = List.of();
        this.negateCondition = null;
        this.odataType = null;
        this.operator = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpVersionMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpVersionMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }        public HttpVersionMatchConditionParametersResponse build() {
            return new HttpVersionMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator);
        }
    }
}
