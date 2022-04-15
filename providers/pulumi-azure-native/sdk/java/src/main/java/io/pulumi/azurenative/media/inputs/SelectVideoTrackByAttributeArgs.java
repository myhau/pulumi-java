// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AttributeFilter;
import io.pulumi.azurenative.media.enums.TrackAttribute;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Select video tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectVideoTrackByAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectVideoTrackByAttributeArgs Empty = new SelectVideoTrackByAttributeArgs();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @Import(name="attribute", required=true)
      private final Output<Either<String,TrackAttribute>> attribute;

    public Output<Either<String,TrackAttribute>> attribute() {
        return this.attribute;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<Either<String,AttributeFilter>> filter;

    public Output<Either<String,AttributeFilter>> filter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    @Import(name="filterValue")
      private final @Nullable Output<String> filterValue;

    public Output<String> filterValue() {
        return this.filterValue == null ? Codegen.empty() : this.filterValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    public SelectVideoTrackByAttributeArgs(
        Output<Either<String,TrackAttribute>> attribute,
        Output<Either<String,AttributeFilter>> filter,
        @Nullable Output<String> filterValue,
        Output<String> odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectVideoTrackByAttributeArgs() {
        this.attribute = Codegen.empty();
        this.filter = Codegen.empty();
        this.filterValue = Codegen.empty();
        this.odataType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,TrackAttribute>> attribute;
        private Output<Either<String,AttributeFilter>> filter;
        private @Nullable Output<String> filterValue;
        private Output<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder attribute(Output<Either<String,TrackAttribute>> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder attribute(Either<String,TrackAttribute> attribute) {
            this.attribute = Output.of(Objects.requireNonNull(attribute));
            return this;
        }
        public Builder filter(Output<Either<String,AttributeFilter>> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(Either<String,AttributeFilter> filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder filterValue(@Nullable Output<String> filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public Builder filterValue(@Nullable String filterValue) {
            this.filterValue = Codegen.ofNullable(filterValue);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }        public SelectVideoTrackByAttributeArgs build() {
            return new SelectVideoTrackByAttributeArgs(attribute, filter, filterValue, odataType);
        }
    }
}
