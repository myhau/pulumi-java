// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InsightFiltersFindingProviderFieldsCriticality {
    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String eq;
    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String gte;
    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String lte;

    @OutputCustomType.Constructor({"eq","gte","lte"})
    private InsightFiltersFindingProviderFieldsCriticality(
        @Nullable String eq,
        @Nullable String gte,
        @Nullable String lte) {
        this.eq = eq;
        this.gte = gte;
        this.lte = lte;
    }

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> getEq() {
        return Optional.ofNullable(this.eq);
    }
    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> getGte() {
        return Optional.ofNullable(this.gte);
    }
    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    public Optional<String> getLte() {
        return Optional.ofNullable(this.lte);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersFindingProviderFieldsCriticality defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eq;
        private @Nullable String gte;
        private @Nullable String lte;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersFindingProviderFieldsCriticality defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        public Builder setEq(@Nullable String eq) {
            this.eq = eq;
            return this;
        }

        public Builder setGte(@Nullable String gte) {
            this.gte = gte;
            return this;
        }

        public Builder setLte(@Nullable String lte) {
            this.lte = lte;
            return this;
        }
        public InsightFiltersFindingProviderFieldsCriticality build() {
            return new InsightFiltersFindingProviderFieldsCriticality(eq, gte, lte);
        }
    }
}
