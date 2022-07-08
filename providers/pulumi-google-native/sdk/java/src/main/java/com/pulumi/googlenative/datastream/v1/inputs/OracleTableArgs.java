// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1.inputs.OracleColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Oracle table.
 * 
 */
public final class OracleTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleTableArgs Empty = new OracleTableArgs();

    /**
     * Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    @Import(name="oracleColumns")
    private @Nullable Output<List<OracleColumnArgs>> oracleColumns;

    /**
     * @return Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * 
     */
    public Optional<Output<List<OracleColumnArgs>>> oracleColumns() {
        return Optional.ofNullable(this.oracleColumns);
    }

    /**
     * Table name.
     * 
     */
    @Import(name="table")
    private @Nullable Output<String> table;

    /**
     * @return Table name.
     * 
     */
    public Optional<Output<String>> table() {
        return Optional.ofNullable(this.table);
    }

    private OracleTableArgs() {}

    private OracleTableArgs(OracleTableArgs $) {
        this.oracleColumns = $.oracleColumns;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleTableArgs $;

        public Builder() {
            $ = new OracleTableArgs();
        }

        public Builder(OracleTableArgs defaults) {
            $ = new OracleTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(@Nullable Output<List<OracleColumnArgs>> oracleColumns) {
            $.oracleColumns = oracleColumns;
            return this;
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(List<OracleColumnArgs> oracleColumns) {
            return oracleColumns(Output.of(oracleColumns));
        }

        /**
         * @param oracleColumns Oracle columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
         * 
         * @return builder
         * 
         */
        public Builder oracleColumns(OracleColumnArgs... oracleColumns) {
            return oracleColumns(List.of(oracleColumns));
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<String> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Table name.
         * 
         * @return builder
         * 
         */
        public Builder table(String table) {
            return table(Output.of(table));
        }

        public OracleTableArgs build() {
            return $;
        }
    }

}
