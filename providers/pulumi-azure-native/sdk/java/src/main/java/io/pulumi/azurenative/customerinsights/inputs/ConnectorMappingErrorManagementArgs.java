// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.azurenative.customerinsights.enums.ErrorManagementTypes;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The error management.
 * 
 */
public final class ConnectorMappingErrorManagementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorMappingErrorManagementArgs Empty = new ConnectorMappingErrorManagementArgs();

    /**
     * The error limit allowed while importing data.
     * 
     */
    @Import(name="errorLimit")
      private final @Nullable Output<Integer> errorLimit;

    public Output<Integer> errorLimit() {
        return this.errorLimit == null ? Codegen.empty() : this.errorLimit;
    }

    /**
     * The type of error management to use for the mapping.
     * 
     */
    @Import(name="errorManagementType", required=true)
      private final Output<ErrorManagementTypes> errorManagementType;

    public Output<ErrorManagementTypes> errorManagementType() {
        return this.errorManagementType;
    }

    public ConnectorMappingErrorManagementArgs(
        @Nullable Output<Integer> errorLimit,
        Output<ErrorManagementTypes> errorManagementType) {
        this.errorLimit = errorLimit;
        this.errorManagementType = Objects.requireNonNull(errorManagementType, "expected parameter 'errorManagementType' to be non-null");
    }

    private ConnectorMappingErrorManagementArgs() {
        this.errorLimit = Codegen.empty();
        this.errorManagementType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingErrorManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> errorLimit;
        private Output<ErrorManagementTypes> errorManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingErrorManagementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorLimit = defaults.errorLimit;
    	      this.errorManagementType = defaults.errorManagementType;
        }

        public Builder errorLimit(@Nullable Output<Integer> errorLimit) {
            this.errorLimit = errorLimit;
            return this;
        }
        public Builder errorLimit(@Nullable Integer errorLimit) {
            this.errorLimit = Codegen.ofNullable(errorLimit);
            return this;
        }
        public Builder errorManagementType(Output<ErrorManagementTypes> errorManagementType) {
            this.errorManagementType = Objects.requireNonNull(errorManagementType);
            return this;
        }
        public Builder errorManagementType(ErrorManagementTypes errorManagementType) {
            this.errorManagementType = Output.of(Objects.requireNonNull(errorManagementType));
            return this;
        }        public ConnectorMappingErrorManagementArgs build() {
            return new ConnectorMappingErrorManagementArgs(errorLimit, errorManagementType);
        }
    }
}
