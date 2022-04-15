// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.TarReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Xml read settings.
 * 
 */
public final class XmlReadSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final XmlReadSettingsResponse Empty = new XmlReadSettingsResponse();

    /**
     * Compression settings.
     * 
     */
    @Import(name="compressionProperties")
      private final @Nullable Object compressionProperties;

    public Object compressionProperties() {
        return this.compressionProperties == null ? null : this.compressionProperties;
    }

    /**
     * Indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="detectDataType")
      private final @Nullable Object detectDataType;

    public Optional<Object> detectDataType() {
        return this.detectDataType == null ? Optional.empty() : Optional.ofNullable(this.detectDataType);
    }

    /**
     * Namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     * 
     */
    @Import(name="namespacePrefixes")
      private final @Nullable Object namespacePrefixes;

    public Optional<Object> namespacePrefixes() {
        return this.namespacePrefixes == null ? Optional.empty() : Optional.ofNullable(this.namespacePrefixes);
    }

    /**
     * Indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="namespaces")
      private final @Nullable Object namespaces;

    public Optional<Object> namespaces() {
        return this.namespaces == null ? Optional.empty() : Optional.ofNullable(this.namespaces);
    }

    /**
     * The read setting type.
     * Expected value is 'XmlReadSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="validationMode")
      private final @Nullable Object validationMode;

    public Optional<Object> validationMode() {
        return this.validationMode == null ? Optional.empty() : Optional.ofNullable(this.validationMode);
    }

    public XmlReadSettingsResponse(
        @Nullable Object compressionProperties,
        @Nullable Object detectDataType,
        @Nullable Object namespacePrefixes,
        @Nullable Object namespaces,
        String type,
        @Nullable Object validationMode) {
        this.compressionProperties = compressionProperties;
        this.detectDataType = detectDataType;
        this.namespacePrefixes = namespacePrefixes;
        this.namespaces = namespaces;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.validationMode = validationMode;
    }

    private XmlReadSettingsResponse() {
        this.compressionProperties = null;
        this.detectDataType = null;
        this.namespacePrefixes = null;
        this.namespaces = null;
        this.type = null;
        this.validationMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XmlReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compressionProperties;
        private @Nullable Object detectDataType;
        private @Nullable Object namespacePrefixes;
        private @Nullable Object namespaces;
        private String type;
        private @Nullable Object validationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(XmlReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.detectDataType = defaults.detectDataType;
    	      this.namespacePrefixes = defaults.namespacePrefixes;
    	      this.namespaces = defaults.namespaces;
    	      this.type = defaults.type;
    	      this.validationMode = defaults.validationMode;
        }

        public Builder compressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }
        public Builder detectDataType(@Nullable Object detectDataType) {
            this.detectDataType = detectDataType;
            return this;
        }
        public Builder namespacePrefixes(@Nullable Object namespacePrefixes) {
            this.namespacePrefixes = namespacePrefixes;
            return this;
        }
        public Builder namespaces(@Nullable Object namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validationMode(@Nullable Object validationMode) {
            this.validationMode = validationMode;
            return this;
        }        public XmlReadSettingsResponse build() {
            return new XmlReadSettingsResponse(compressionProperties, detectDataType, namespacePrefixes, namespaces, type, validationMode);
        }
    }
}
