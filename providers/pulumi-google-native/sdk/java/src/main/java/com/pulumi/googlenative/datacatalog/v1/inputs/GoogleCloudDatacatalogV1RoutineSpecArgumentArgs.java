// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog.v1.enums.GoogleCloudDatacatalogV1RoutineSpecArgumentMode;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input or output argument of a function or stored procedure.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgumentArgs Empty = new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs();

    /**
     * Specifies whether the argument is input or output.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode;

    /**
     * @return Specifies whether the argument is input or output.
     * 
     */
    public Optional<Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name of the argument. A return argument of a function might not have a name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the argument. A return argument of a function might not have a name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the argument. The exact value depends on the source system and the language.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgumentArgs() {}

    private GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs $) {
        this.mode = $.mode;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1RoutineSpecArgumentArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs();
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs defaults) {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Specifies whether the argument is input or output.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<GoogleCloudDatacatalogV1RoutineSpecArgumentMode> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Specifies whether the argument is input or output.
         * 
         * @return builder
         * 
         */
        public Builder mode(GoogleCloudDatacatalogV1RoutineSpecArgumentMode mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name of the argument. A return argument of a function might not have a name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the argument. A return argument of a function might not have a name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of the argument. The exact value depends on the source system and the language.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the argument. The exact value depends on the source system and the language.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GoogleCloudDatacatalogV1RoutineSpecArgumentArgs build() {
            return $;
        }
    }

}
