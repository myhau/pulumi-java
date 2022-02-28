// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoExportPolicyArgs;
import io.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3AutoImportPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataRepositoryAssociationS3Args extends io.pulumi.resources.ResourceArgs {

    public static final DataRepositoryAssociationS3Args Empty = new DataRepositoryAssociationS3Args();

    /**
     * Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     * 
     */
    @InputImport(name="autoExportPolicy")
      private final @Nullable Input<DataRepositoryAssociationS3AutoExportPolicyArgs> autoExportPolicy;

    public Input<DataRepositoryAssociationS3AutoExportPolicyArgs> getAutoExportPolicy() {
        return this.autoExportPolicy == null ? Input.empty() : this.autoExportPolicy;
    }

    /**
     * Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     * 
     */
    @InputImport(name="autoImportPolicy")
      private final @Nullable Input<DataRepositoryAssociationS3AutoImportPolicyArgs> autoImportPolicy;

    public Input<DataRepositoryAssociationS3AutoImportPolicyArgs> getAutoImportPolicy() {
        return this.autoImportPolicy == null ? Input.empty() : this.autoImportPolicy;
    }

    public DataRepositoryAssociationS3Args(
        @Nullable Input<DataRepositoryAssociationS3AutoExportPolicyArgs> autoExportPolicy,
        @Nullable Input<DataRepositoryAssociationS3AutoImportPolicyArgs> autoImportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
        this.autoImportPolicy = autoImportPolicy;
    }

    private DataRepositoryAssociationS3Args() {
        this.autoExportPolicy = Input.empty();
        this.autoImportPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataRepositoryAssociationS3AutoExportPolicyArgs> autoExportPolicy;
        private @Nullable Input<DataRepositoryAssociationS3AutoImportPolicyArgs> autoImportPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExportPolicy = defaults.autoExportPolicy;
    	      this.autoImportPolicy = defaults.autoImportPolicy;
        }

        public Builder setAutoExportPolicy(@Nullable Input<DataRepositoryAssociationS3AutoExportPolicyArgs> autoExportPolicy) {
            this.autoExportPolicy = autoExportPolicy;
            return this;
        }

        public Builder setAutoExportPolicy(@Nullable DataRepositoryAssociationS3AutoExportPolicyArgs autoExportPolicy) {
            this.autoExportPolicy = Input.ofNullable(autoExportPolicy);
            return this;
        }

        public Builder setAutoImportPolicy(@Nullable Input<DataRepositoryAssociationS3AutoImportPolicyArgs> autoImportPolicy) {
            this.autoImportPolicy = autoImportPolicy;
            return this;
        }

        public Builder setAutoImportPolicy(@Nullable DataRepositoryAssociationS3AutoImportPolicyArgs autoImportPolicy) {
            this.autoImportPolicy = Input.ofNullable(autoImportPolicy);
            return this;
        }
        public DataRepositoryAssociationS3Args build() {
            return new DataRepositoryAssociationS3Args(autoExportPolicy, autoImportPolicy);
        }
    }
}
