// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schema in Thrift format.
 * 
 */
public final class GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs Empty = new GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs();

    /**
     * Thrift IDL source of the schema.
     * 
     */
    @Import(name="text")
    private @Nullable Output<String> text;

    /**
     * @return Thrift IDL source of the schema.
     * 
     */
    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    private GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs() {}

    private GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs();
        }

        public Builder(GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs defaults) {
            $ = new GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text Thrift IDL source of the schema.
         * 
         * @return builder
         * 
         */
        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text Thrift IDL source of the schema.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public GoogleCloudDatacatalogV1PhysicalSchemaThriftSchemaArgs build() {
            return $;
        }
    }

}
