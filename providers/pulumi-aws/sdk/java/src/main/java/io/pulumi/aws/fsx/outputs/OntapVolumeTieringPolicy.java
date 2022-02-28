// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OntapVolumeTieringPolicy {
    private final @Nullable Integer coolingPeriod;
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"coolingPeriod","name"})
    private OntapVolumeTieringPolicy(
        @Nullable Integer coolingPeriod,
        @Nullable String name) {
        this.coolingPeriod = coolingPeriod;
        this.name = name;
    }

    public Optional<Integer> getCoolingPeriod() {
        return Optional.ofNullable(this.coolingPeriod);
    }
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapVolumeTieringPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coolingPeriod;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapVolumeTieringPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolingPeriod = defaults.coolingPeriod;
    	      this.name = defaults.name;
        }

        public Builder setCoolingPeriod(@Nullable Integer coolingPeriod) {
            this.coolingPeriod = coolingPeriod;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public OntapVolumeTieringPolicy build() {
            return new OntapVolumeTieringPolicy(coolingPeriod, name);
        }
    }
}
