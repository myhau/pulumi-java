// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.enums.Encoding;
import io.pulumi.azurenative.streamanalytics.enums.JsonOutputSerializationFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JsonSerializationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonSerializationArgs Empty = new JsonSerializationArgs();

    @InputImport(name="encoding")
    private final @Nullable Input<Either<String,Encoding>> encoding;

    public Input<Either<String,Encoding>> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    @InputImport(name="format")
    private final @Nullable Input<Either<String,JsonOutputSerializationFormat>> format;

    public Input<Either<String,JsonOutputSerializationFormat>> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public JsonSerializationArgs(
        @Nullable Input<Either<String,Encoding>> encoding,
        @Nullable Input<Either<String,JsonOutputSerializationFormat>> format,
        Input<String> type) {
        this.encoding = encoding;
        this.format = format;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JsonSerializationArgs() {
        this.encoding = Input.empty();
        this.format = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonSerializationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Encoding>> encoding;
        private @Nullable Input<Either<String,JsonOutputSerializationFormat>> format;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonSerializationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
        }

        public Builder setEncoding(@Nullable Input<Either<String,Encoding>> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable Either<String,Encoding> encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setFormat(@Nullable Input<Either<String,JsonOutputSerializationFormat>> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable Either<String,JsonOutputSerializationFormat> format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public JsonSerializationArgs build() {
            return new JsonSerializationArgs(encoding, format, type);
        }
    }
}