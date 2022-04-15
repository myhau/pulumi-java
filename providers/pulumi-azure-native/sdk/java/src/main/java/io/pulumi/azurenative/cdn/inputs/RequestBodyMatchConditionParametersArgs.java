// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.RequestBodyOperator;
import io.pulumi.azurenative.cdn.enums.Transform;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for RequestBody match conditions
 * 
 */
public final class RequestBodyMatchConditionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestBodyMatchConditionParametersArgs Empty = new RequestBodyMatchConditionParametersArgs();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
      private final @Nullable Output<List<String>> matchValues;

    public Output<List<String>> matchValues() {
        return this.matchValues == null ? Codegen.empty() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
      private final @Nullable Output<Boolean> negateCondition;

    public Output<Boolean> negateCondition() {
        return this.negateCondition == null ? Codegen.empty() : this.negateCondition;
    }

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,RequestBodyOperator>> operator;

    public Output<Either<String,RequestBodyOperator>> operator() {
        return this.operator;
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
      private final @Nullable Output<List<Either<String,Transform>>> transforms;

    public Output<List<Either<String,Transform>>> transforms() {
        return this.transforms == null ? Codegen.empty() : this.transforms;
    }

    public RequestBodyMatchConditionParametersArgs(
        @Nullable Output<List<String>> matchValues,
        @Nullable Output<Boolean> negateCondition,
        Output<String> odataType,
        Output<Either<String,RequestBodyOperator>> operator,
        @Nullable Output<List<Either<String,Transform>>> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.transforms = transforms;
    }

    private RequestBodyMatchConditionParametersArgs() {
        this.matchValues = Codegen.empty();
        this.negateCondition = Codegen.empty();
        this.odataType = Codegen.empty();
        this.operator = Codegen.empty();
        this.transforms = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestBodyMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> matchValues;
        private @Nullable Output<Boolean> negateCondition;
        private Output<String> odataType;
        private Output<Either<String,RequestBodyOperator>> operator;
        private @Nullable Output<List<Either<String,Transform>>> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestBodyMatchConditionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(@Nullable Output<List<String>> matchValues) {
            this.matchValues = matchValues;
            return this;
        }
        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = Codegen.ofNullable(matchValues);
            return this;
        }
        public Builder matchValues(String... matchValues) {
            return matchValues(List.of(matchValues));
        }
        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }
        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = Codegen.ofNullable(negateCondition);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder operator(Output<Either<String,RequestBodyOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder operator(Either<String,RequestBodyOperator> operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }
        public Builder transforms(@Nullable Output<List<Either<String,Transform>>> transforms) {
            this.transforms = transforms;
            return this;
        }
        public Builder transforms(@Nullable List<Either<String,Transform>> transforms) {
            this.transforms = Codegen.ofNullable(transforms);
            return this;
        }
        public Builder transforms(Either<String,Transform>... transforms) {
            return transforms(List.of(transforms));
        }        public RequestBodyMatchConditionParametersArgs build() {
            return new RequestBodyMatchConditionParametersArgs(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
