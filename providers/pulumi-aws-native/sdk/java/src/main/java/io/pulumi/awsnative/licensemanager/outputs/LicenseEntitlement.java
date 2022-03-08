// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LicenseEntitlement {
    private final @Nullable Boolean allowCheckIn;
    private final @Nullable Integer maxCount;
    private final String name;
    private final @Nullable Boolean overage;
    private final String unit;
    private final @Nullable String value;

    @OutputCustomType.Constructor({"allowCheckIn","maxCount","name","overage","unit","value"})
    private LicenseEntitlement(
        @Nullable Boolean allowCheckIn,
        @Nullable Integer maxCount,
        String name,
        @Nullable Boolean overage,
        String unit,
        @Nullable String value) {
        this.allowCheckIn = allowCheckIn;
        this.maxCount = maxCount;
        this.name = name;
        this.overage = overage;
        this.unit = unit;
        this.value = value;
    }

    public Optional<Boolean> getAllowCheckIn() {
        return Optional.ofNullable(this.allowCheckIn);
    }
    public Optional<Integer> getMaxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getOverage() {
        return Optional.ofNullable(this.overage);
    }
    public String getUnit() {
        return this.unit;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseEntitlement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCheckIn;
        private @Nullable Integer maxCount;
        private String name;
        private @Nullable Boolean overage;
        private String unit;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseEntitlement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCheckIn = defaults.allowCheckIn;
    	      this.maxCount = defaults.maxCount;
    	      this.name = defaults.name;
    	      this.overage = defaults.overage;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setAllowCheckIn(@Nullable Boolean allowCheckIn) {
            this.allowCheckIn = allowCheckIn;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOverage(@Nullable Boolean overage) {
            this.overage = overage;
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public LicenseEntitlement build() {
            return new LicenseEntitlement(allowCheckIn, maxCount, name, overage, unit, value);
        }
    }
}
