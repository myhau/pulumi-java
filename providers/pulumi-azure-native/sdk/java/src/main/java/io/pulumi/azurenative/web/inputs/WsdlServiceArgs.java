// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The service with name and endpoint names
 * 
 */
public final class WsdlServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WsdlServiceArgs Empty = new WsdlServiceArgs();

    /**
     * List of the endpoints' qualified names
     * 
     */
    @Import(name="endpointQualifiedNames")
      private final @Nullable Output<List<String>> endpointQualifiedNames;

    public Output<List<String>> endpointQualifiedNames() {
        return this.endpointQualifiedNames == null ? Codegen.empty() : this.endpointQualifiedNames;
    }

    /**
     * The service's qualified name
     * 
     */
    @Import(name="qualifiedName", required=true)
      private final Output<String> qualifiedName;

    public Output<String> qualifiedName() {
        return this.qualifiedName;
    }

    public WsdlServiceArgs(
        @Nullable Output<List<String>> endpointQualifiedNames,
        Output<String> qualifiedName) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        this.qualifiedName = Objects.requireNonNull(qualifiedName, "expected parameter 'qualifiedName' to be non-null");
    }

    private WsdlServiceArgs() {
        this.endpointQualifiedNames = Codegen.empty();
        this.qualifiedName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> endpointQualifiedNames;
        private Output<String> qualifiedName;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointQualifiedNames = defaults.endpointQualifiedNames;
    	      this.qualifiedName = defaults.qualifiedName;
        }

        public Builder endpointQualifiedNames(@Nullable Output<List<String>> endpointQualifiedNames) {
            this.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }
        public Builder endpointQualifiedNames(@Nullable List<String> endpointQualifiedNames) {
            this.endpointQualifiedNames = Codegen.ofNullable(endpointQualifiedNames);
            return this;
        }
        public Builder endpointQualifiedNames(String... endpointQualifiedNames) {
            return endpointQualifiedNames(List.of(endpointQualifiedNames));
        }
        public Builder qualifiedName(Output<String> qualifiedName) {
            this.qualifiedName = Objects.requireNonNull(qualifiedName);
            return this;
        }
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = Output.of(Objects.requireNonNull(qualifiedName));
            return this;
        }        public WsdlServiceArgs build() {
            return new WsdlServiceArgs(endpointQualifiedNames, qualifiedName);
        }
    }
}
