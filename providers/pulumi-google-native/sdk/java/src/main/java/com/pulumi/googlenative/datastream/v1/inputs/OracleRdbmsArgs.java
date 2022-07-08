// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1.inputs.OracleSchemaArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Oracle database structure.
 * 
 */
public final class OracleRdbmsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleRdbmsArgs Empty = new OracleRdbmsArgs();

    /**
     * Oracle schemas/databases in the database server.
     * 
     */
    @Import(name="oracleSchemas")
    private @Nullable Output<List<OracleSchemaArgs>> oracleSchemas;

    /**
     * @return Oracle schemas/databases in the database server.
     * 
     */
    public Optional<Output<List<OracleSchemaArgs>>> oracleSchemas() {
        return Optional.ofNullable(this.oracleSchemas);
    }

    private OracleRdbmsArgs() {}

    private OracleRdbmsArgs(OracleRdbmsArgs $) {
        this.oracleSchemas = $.oracleSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleRdbmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsArgs $;

        public Builder() {
            $ = new OracleRdbmsArgs();
        }

        public Builder(OracleRdbmsArgs defaults) {
            $ = new OracleRdbmsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oracleSchemas Oracle schemas/databases in the database server.
         * 
         * @return builder
         * 
         */
        public Builder oracleSchemas(@Nullable Output<List<OracleSchemaArgs>> oracleSchemas) {
            $.oracleSchemas = oracleSchemas;
            return this;
        }

        /**
         * @param oracleSchemas Oracle schemas/databases in the database server.
         * 
         * @return builder
         * 
         */
        public Builder oracleSchemas(List<OracleSchemaArgs> oracleSchemas) {
            return oracleSchemas(Output.of(oracleSchemas));
        }

        /**
         * @param oracleSchemas Oracle schemas/databases in the database server.
         * 
         * @return builder
         * 
         */
        public Builder oracleSchemas(OracleSchemaArgs... oracleSchemas) {
            return oracleSchemas(List.of(oracleSchemas));
        }

        public OracleRdbmsArgs build() {
            return $;
        }
    }

}
