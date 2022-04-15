// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.MachineExtensionInstanceViewResponseStatus;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MachineExtensionPropertiesResponseInstanceView {
    /**
     * The machine extension name.
     * 
     */
    private final String name;
    /**
     * Instance view status.
     * 
     */
    private final @Nullable MachineExtensionInstanceViewResponseStatus status;
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final String typeHandlerVersion;

    @CustomType.Constructor
    private MachineExtensionPropertiesResponseInstanceView(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") @Nullable MachineExtensionInstanceViewResponseStatus status,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("typeHandlerVersion") String typeHandlerVersion) {
        this.name = name;
        this.status = status;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * The machine extension name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Instance view status.
     * 
    */
    public Optional<MachineExtensionInstanceViewResponseStatus> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionPropertiesResponseInstanceView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable MachineExtensionInstanceViewResponseStatus status;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionPropertiesResponseInstanceView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(@Nullable MachineExtensionInstanceViewResponseStatus status) {
            this.status = status;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }        public MachineExtensionPropertiesResponseInstanceView build() {
            return new MachineExtensionPropertiesResponseInstanceView(name, status, type, typeHandlerVersion);
        }
    }
}
