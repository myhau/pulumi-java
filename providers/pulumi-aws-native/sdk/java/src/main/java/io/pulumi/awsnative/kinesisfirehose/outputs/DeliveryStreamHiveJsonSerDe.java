// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamHiveJsonSerDe {
    private final @Nullable List<String> timestampFormats;

    @OutputCustomType.Constructor({"timestampFormats"})
    private DeliveryStreamHiveJsonSerDe(@Nullable List<String> timestampFormats) {
        this.timestampFormats = timestampFormats;
    }

    public List<String> getTimestampFormats() {
        return this.timestampFormats == null ? List.of() : this.timestampFormats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHiveJsonSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> timestampFormats;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHiveJsonSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timestampFormats = defaults.timestampFormats;
        }

        public Builder setTimestampFormats(@Nullable List<String> timestampFormats) {
            this.timestampFormats = timestampFormats;
            return this;
        }

        public DeliveryStreamHiveJsonSerDe build() {
            return new DeliveryStreamHiveJsonSerDe(timestampFormats);
        }
    }
}