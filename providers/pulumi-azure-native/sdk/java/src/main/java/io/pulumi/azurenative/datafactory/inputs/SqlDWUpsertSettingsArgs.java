// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sql DW upsert option settings
 * 
 */
public final class SqlDWUpsertSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDWUpsertSettingsArgs Empty = new SqlDWUpsertSettingsArgs();

    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="interimSchemaName")
      private final @Nullable Output<Object> interimSchemaName;

    public Output<Object> interimSchemaName() {
        return this.interimSchemaName == null ? Codegen.empty() : this.interimSchemaName;
    }

    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<Object> keys;

    public Output<Object> keys() {
        return this.keys == null ? Codegen.empty() : this.keys;
    }

    public SqlDWUpsertSettingsArgs(
        @Nullable Output<Object> interimSchemaName,
        @Nullable Output<Object> keys) {
        this.interimSchemaName = interimSchemaName;
        this.keys = keys;
    }

    private SqlDWUpsertSettingsArgs() {
        this.interimSchemaName = Codegen.empty();
        this.keys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWUpsertSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> interimSchemaName;
        private @Nullable Output<Object> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWUpsertSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interimSchemaName = defaults.interimSchemaName;
    	      this.keys = defaults.keys;
        }

        public Builder interimSchemaName(@Nullable Output<Object> interimSchemaName) {
            this.interimSchemaName = interimSchemaName;
            return this;
        }
        public Builder interimSchemaName(@Nullable Object interimSchemaName) {
            this.interimSchemaName = Codegen.ofNullable(interimSchemaName);
            return this;
        }
        public Builder keys(@Nullable Output<Object> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable Object keys) {
            this.keys = Codegen.ofNullable(keys);
            return this;
        }        public SqlDWUpsertSettingsArgs build() {
            return new SqlDWUpsertSettingsArgs(interimSchemaName, keys);
        }
    }
}
