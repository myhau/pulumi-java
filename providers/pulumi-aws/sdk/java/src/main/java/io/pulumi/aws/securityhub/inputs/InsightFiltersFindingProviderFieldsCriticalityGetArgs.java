// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersFindingProviderFieldsCriticalityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersFindingProviderFieldsCriticalityGetArgs Empty = new InsightFiltersFindingProviderFieldsCriticalityGetArgs();

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @InputImport(name="eq")
      private final @Nullable Input<String> eq;

    public Input<String> getEq() {
        return this.eq == null ? Input.empty() : this.eq;
    }

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @InputImport(name="gte")
      private final @Nullable Input<String> gte;

    public Input<String> getGte() {
        return this.gte == null ? Input.empty() : this.gte;
    }

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @InputImport(name="lte")
      private final @Nullable Input<String> lte;

    public Input<String> getLte() {
        return this.lte == null ? Input.empty() : this.lte;
    }

    public InsightFiltersFindingProviderFieldsCriticalityGetArgs(
        @Nullable Input<String> eq,
        @Nullable Input<String> gte,
        @Nullable Input<String> lte) {
        this.eq = eq;
        this.gte = gte;
        this.lte = lte;
    }

    private InsightFiltersFindingProviderFieldsCriticalityGetArgs() {
        this.eq = Input.empty();
        this.gte = Input.empty();
        this.lte = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersFindingProviderFieldsCriticalityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eq;
        private @Nullable Input<String> gte;
        private @Nullable Input<String> lte;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersFindingProviderFieldsCriticalityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        public Builder setEq(@Nullable Input<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setEq(@Nullable String eq) {
            this.eq = Input.ofNullable(eq);
            return this;
        }

        public Builder setGte(@Nullable Input<String> gte) {
            this.gte = gte;
            return this;
        }

        public Builder setGte(@Nullable String gte) {
            this.gte = Input.ofNullable(gte);
            return this;
        }

        public Builder setLte(@Nullable Input<String> lte) {
            this.lte = lte;
            return this;
        }

        public Builder setLte(@Nullable String lte) {
            this.lte = Input.ofNullable(lte);
            return this;
        }
        public InsightFiltersFindingProviderFieldsCriticalityGetArgs build() {
            return new InsightFiltersFindingProviderFieldsCriticalityGetArgs(eq, gte, lte);
        }
    }
}
