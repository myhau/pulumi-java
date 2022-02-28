// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSerDeInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSerDeInfoArgs Empty = new CatalogTableStorageDescriptorSerDeInfoArgs();

    /**
     * Name of the target table.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,String>> parameters;

    public Input<Map<String,String>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Usually the class that implements the SerDe. An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe`.
     * 
     */
    @InputImport(name="serializationLibrary")
      private final @Nullable Input<String> serializationLibrary;

    public Input<String> getSerializationLibrary() {
        return this.serializationLibrary == null ? Input.empty() : this.serializationLibrary;
    }

    public CatalogTableStorageDescriptorSerDeInfoArgs(
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> parameters,
        @Nullable Input<String> serializationLibrary) {
        this.name = name;
        this.parameters = parameters;
        this.serializationLibrary = serializationLibrary;
    }

    private CatalogTableStorageDescriptorSerDeInfoArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.serializationLibrary = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSerDeInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> parameters;
        private @Nullable Input<String> serializationLibrary;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSerDeInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.serializationLibrary = defaults.serializationLibrary;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setSerializationLibrary(@Nullable Input<String> serializationLibrary) {
            this.serializationLibrary = serializationLibrary;
            return this;
        }

        public Builder setSerializationLibrary(@Nullable String serializationLibrary) {
            this.serializationLibrary = Input.ofNullable(serializationLibrary);
            return this;
        }
        public CatalogTableStorageDescriptorSerDeInfoArgs build() {
            return new CatalogTableStorageDescriptorSerDeInfoArgs(name, parameters, serializationLibrary);
        }
    }
}
