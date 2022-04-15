// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;


/**
 * Azure ML WebService Input/Output file
 * 
 */
public final class AzureMLWebServiceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureMLWebServiceFileArgs Empty = new AzureMLWebServiceFileArgs();

    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="filePath", required=true)
      private final Output<Object> filePath;

    public Output<Object> filePath() {
        return this.filePath;
    }

    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    public AzureMLWebServiceFileArgs(
        Output<Object> filePath,
        Output<LinkedServiceReferenceArgs> linkedServiceName) {
        this.filePath = Objects.requireNonNull(filePath, "expected parameter 'filePath' to be non-null");
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
    }

    private AzureMLWebServiceFileArgs() {
        this.filePath = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLWebServiceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> filePath;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLWebServiceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.linkedServiceName = defaults.linkedServiceName;
        }

        public Builder filePath(Output<Object> filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }
        public Builder filePath(Object filePath) {
            this.filePath = Output.of(Objects.requireNonNull(filePath));
            return this;
        }
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }        public AzureMLWebServiceFileArgs build() {
            return new AzureMLWebServiceFileArgs(filePath, linkedServiceName);
        }
    }
}
