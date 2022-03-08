// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TarGZipReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.TarReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.ZipDeflateReadSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class XmlReadSettingsResponse {
    /**
     * Compression settings.
     * 
     */
    private final @Nullable Object compressionProperties;
    /**
     * Indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object detectDataType;
    /**
     * Namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     * 
     */
    private final @Nullable Object namespacePrefixes;
    /**
     * Indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object namespaces;
    /**
     * The read setting type.
     * Expected value is 'XmlReadSettings'.
     * 
     */
    private final String type;
    /**
     * Indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object validationMode;

    @OutputCustomType.Constructor({"compressionProperties","detectDataType","namespacePrefixes","namespaces","type","validationMode"})
    private XmlReadSettingsResponse(
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
        this.type = type;
        this.validationMode = validationMode;
    }

    /**
     * Compression settings.
     * 
    */
    public Optional<Object> getCompressionProperties() {
        return Optional.ofNullable(this.compressionProperties);
    }
    /**
     * Indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDetectDataType() {
        return Optional.ofNullable(this.detectDataType);
    }
    /**
     * Namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     * 
    */
    public Optional<Object> getNamespacePrefixes() {
        return Optional.ofNullable(this.namespacePrefixes);
    }
    /**
     * Indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getNamespaces() {
        return Optional.ofNullable(this.namespaces);
    }
    /**
     * The read setting type.
     * Expected value is 'XmlReadSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getValidationMode() {
        return Optional.ofNullable(this.validationMode);
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

        public Builder setCompressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }

        public Builder setDetectDataType(@Nullable Object detectDataType) {
            this.detectDataType = detectDataType;
            return this;
        }

        public Builder setNamespacePrefixes(@Nullable Object namespacePrefixes) {
            this.namespacePrefixes = namespacePrefixes;
            return this;
        }

        public Builder setNamespaces(@Nullable Object namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidationMode(@Nullable Object validationMode) {
            this.validationMode = validationMode;
            return this;
        }
        public XmlReadSettingsResponse build() {
            return new XmlReadSettingsResponse(compressionProperties, detectDataType, namespacePrefixes, namespaces, type, validationMode);
        }
    }
}
