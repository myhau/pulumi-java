// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppHybridConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppHybridConnectionSlotArgs Empty = new WebAppHybridConnectionSlotArgs();

    /**
     * The hostname of the endpoint.
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname == null ? Codegen.empty() : this.hostname;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The name of the web app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The namespace for this hybrid connection.
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The port of the endpoint.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The ARM URI to the Service Bus relay.
     * 
     */
    @Import(name="relayArmUri")
      private final @Nullable Output<String> relayArmUri;

    public Output<String> relayArmUri() {
        return this.relayArmUri == null ? Codegen.empty() : this.relayArmUri;
    }

    /**
     * The name of the Service Bus relay.
     * 
     */
    @Import(name="relayName")
      private final @Nullable Output<String> relayName;

    public Output<String> relayName() {
        return this.relayName == null ? Codegen.empty() : this.relayName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    @Import(name="sendKeyName")
      private final @Nullable Output<String> sendKeyName;

    public Output<String> sendKeyName() {
        return this.sendKeyName == null ? Codegen.empty() : this.sendKeyName;
    }

    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    @Import(name="sendKeyValue")
      private final @Nullable Output<String> sendKeyValue;

    public Output<String> sendKeyValue() {
        return this.sendKeyValue == null ? Codegen.empty() : this.sendKeyValue;
    }

    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Import(name="serviceBusNamespace")
      private final @Nullable Output<String> serviceBusNamespace;

    public Output<String> serviceBusNamespace() {
        return this.serviceBusNamespace == null ? Codegen.empty() : this.serviceBusNamespace;
    }

    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    @Import(name="serviceBusSuffix")
      private final @Nullable Output<String> serviceBusSuffix;

    public Output<String> serviceBusSuffix() {
        return this.serviceBusSuffix == null ? Codegen.empty() : this.serviceBusSuffix;
    }

    /**
     * The name of the slot for the web app.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> slot() {
        return this.slot;
    }

    public WebAppHybridConnectionSlotArgs(
        @Nullable Output<String> hostname,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> namespaceName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> relayArmUri,
        @Nullable Output<String> relayName,
        Output<String> resourceGroupName,
        @Nullable Output<String> sendKeyName,
        @Nullable Output<String> sendKeyValue,
        @Nullable Output<String> serviceBusNamespace,
        @Nullable Output<String> serviceBusSuffix,
        Output<String> slot) {
        this.hostname = hostname;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.port = port;
        this.relayArmUri = relayArmUri;
        this.relayName = relayName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sendKeyName = sendKeyName;
        this.sendKeyValue = sendKeyValue;
        this.serviceBusNamespace = serviceBusNamespace;
        this.serviceBusSuffix = serviceBusSuffix;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private WebAppHybridConnectionSlotArgs() {
        this.hostname = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.port = Codegen.empty();
        this.relayArmUri = Codegen.empty();
        this.relayName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sendKeyName = Codegen.empty();
        this.sendKeyValue = Codegen.empty();
        this.serviceBusNamespace = Codegen.empty();
        this.serviceBusSuffix = Codegen.empty();
        this.slot = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppHybridConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostname;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> namespaceName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> relayArmUri;
        private @Nullable Output<String> relayName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sendKeyName;
        private @Nullable Output<String> sendKeyValue;
        private @Nullable Output<String> serviceBusNamespace;
        private @Nullable Output<String> serviceBusSuffix;
        private Output<String> slot;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppHybridConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.port = defaults.port;
    	      this.relayArmUri = defaults.relayArmUri;
    	      this.relayName = defaults.relayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sendKeyName = defaults.sendKeyName;
    	      this.sendKeyValue = defaults.sendKeyValue;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.serviceBusSuffix = defaults.serviceBusSuffix;
    	      this.slot = defaults.slot;
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Codegen.ofNullable(hostname);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder relayArmUri(@Nullable Output<String> relayArmUri) {
            this.relayArmUri = relayArmUri;
            return this;
        }
        public Builder relayArmUri(@Nullable String relayArmUri) {
            this.relayArmUri = Codegen.ofNullable(relayArmUri);
            return this;
        }
        public Builder relayName(@Nullable Output<String> relayName) {
            this.relayName = relayName;
            return this;
        }
        public Builder relayName(@Nullable String relayName) {
            this.relayName = Codegen.ofNullable(relayName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sendKeyName(@Nullable Output<String> sendKeyName) {
            this.sendKeyName = sendKeyName;
            return this;
        }
        public Builder sendKeyName(@Nullable String sendKeyName) {
            this.sendKeyName = Codegen.ofNullable(sendKeyName);
            return this;
        }
        public Builder sendKeyValue(@Nullable Output<String> sendKeyValue) {
            this.sendKeyValue = sendKeyValue;
            return this;
        }
        public Builder sendKeyValue(@Nullable String sendKeyValue) {
            this.sendKeyValue = Codegen.ofNullable(sendKeyValue);
            return this;
        }
        public Builder serviceBusNamespace(@Nullable Output<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Codegen.ofNullable(serviceBusNamespace);
            return this;
        }
        public Builder serviceBusSuffix(@Nullable Output<String> serviceBusSuffix) {
            this.serviceBusSuffix = serviceBusSuffix;
            return this;
        }
        public Builder serviceBusSuffix(@Nullable String serviceBusSuffix) {
            this.serviceBusSuffix = Codegen.ofNullable(serviceBusSuffix);
            return this;
        }
        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }        public WebAppHybridConnectionSlotArgs build() {
            return new WebAppHybridConnectionSlotArgs(hostname, kind, name, namespaceName, port, relayArmUri, relayName, resourceGroupName, sendKeyName, sendKeyValue, serviceBusNamespace, serviceBusSuffix, slot);
        }
    }
}
