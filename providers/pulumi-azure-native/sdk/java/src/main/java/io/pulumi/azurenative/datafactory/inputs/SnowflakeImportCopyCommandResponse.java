// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Snowflake import command settings.
 * 
 */
public final class SnowflakeImportCopyCommandResponse extends io.pulumi.resources.InvokeArgs {

    public static final SnowflakeImportCopyCommandResponse Empty = new SnowflakeImportCopyCommandResponse();

    /**
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     * 
     */
    @Import(name="additionalCopyOptions")
      private final @Nullable Map<String,Object> additionalCopyOptions;

    public Map<String,Object> additionalCopyOptions() {
        return this.additionalCopyOptions == null ? Map.of() : this.additionalCopyOptions;
    }

    /**
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "FORCE": "TRUE", "LOAD_UNCERTAIN_FILES": "'FALSE'" }
     * 
     */
    @Import(name="additionalFormatOptions")
      private final @Nullable Map<String,Object> additionalFormatOptions;

    public Map<String,Object> additionalFormatOptions() {
        return this.additionalFormatOptions == null ? Map.of() : this.additionalFormatOptions;
    }

    /**
     * The import setting type.
     * Expected value is 'SnowflakeImportCopyCommand'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SnowflakeImportCopyCommandResponse(
        @Nullable Map<String,Object> additionalCopyOptions,
        @Nullable Map<String,Object> additionalFormatOptions,
        String type) {
        this.additionalCopyOptions = additionalCopyOptions;
        this.additionalFormatOptions = additionalFormatOptions;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SnowflakeImportCopyCommandResponse() {
        this.additionalCopyOptions = Map.of();
        this.additionalFormatOptions = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeImportCopyCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> additionalCopyOptions;
        private @Nullable Map<String,Object> additionalFormatOptions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeImportCopyCommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCopyOptions = defaults.additionalCopyOptions;
    	      this.additionalFormatOptions = defaults.additionalFormatOptions;
    	      this.type = defaults.type;
        }

        public Builder additionalCopyOptions(@Nullable Map<String,Object> additionalCopyOptions) {
            this.additionalCopyOptions = additionalCopyOptions;
            return this;
        }
        public Builder additionalFormatOptions(@Nullable Map<String,Object> additionalFormatOptions) {
            this.additionalFormatOptions = additionalFormatOptions;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SnowflakeImportCopyCommandResponse build() {
            return new SnowflakeImportCopyCommandResponse(additionalCopyOptions, additionalFormatOptions, type);
        }
    }
}
