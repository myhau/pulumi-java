// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Storage account information.
 * 
 */
public final class StorageAccountInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountInformationResponse Empty = new StorageAccountInformationResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The optional suffix for the storage account.
     * 
     */
    @Import(name="suffix", required=true)
      private final String suffix;

    public String suffix() {
        return this.suffix;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public StorageAccountInformationResponse(
        String id,
        String name,
        String suffix,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.suffix = Objects.requireNonNull(suffix, "expected parameter 'suffix' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StorageAccountInformationResponse() {
        this.id = null;
        this.name = null;
        this.suffix = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String suffix;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.suffix = defaults.suffix;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder suffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public StorageAccountInformationResponse build() {
            return new StorageAccountInformationResponse(id, name, suffix, type);
        }
    }
}
