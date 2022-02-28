// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterGlobalClusterMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterGlobalClusterMemberArgs Empty = new GlobalClusterGlobalClusterMemberArgs();

    /**
     * Amazon Resource Name (ARN) of member DB Cluster.
     * 
     */
    @InputImport(name="dbClusterArn")
      private final @Nullable Input<String> dbClusterArn;

    public Input<String> getDbClusterArn() {
        return this.dbClusterArn == null ? Input.empty() : this.dbClusterArn;
    }

    /**
     * Whether the member is the primary DB Cluster.
     * 
     */
    @InputImport(name="isWriter")
      private final @Nullable Input<Boolean> isWriter;

    public Input<Boolean> getIsWriter() {
        return this.isWriter == null ? Input.empty() : this.isWriter;
    }

    public GlobalClusterGlobalClusterMemberArgs(
        @Nullable Input<String> dbClusterArn,
        @Nullable Input<Boolean> isWriter) {
        this.dbClusterArn = dbClusterArn;
        this.isWriter = isWriter;
    }

    private GlobalClusterGlobalClusterMemberArgs() {
        this.dbClusterArn = Input.empty();
        this.isWriter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterGlobalClusterMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dbClusterArn;
        private @Nullable Input<Boolean> isWriter;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterGlobalClusterMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterArn = defaults.dbClusterArn;
    	      this.isWriter = defaults.isWriter;
        }

        public Builder setDbClusterArn(@Nullable Input<String> dbClusterArn) {
            this.dbClusterArn = dbClusterArn;
            return this;
        }

        public Builder setDbClusterArn(@Nullable String dbClusterArn) {
            this.dbClusterArn = Input.ofNullable(dbClusterArn);
            return this;
        }

        public Builder setIsWriter(@Nullable Input<Boolean> isWriter) {
            this.isWriter = isWriter;
            return this;
        }

        public Builder setIsWriter(@Nullable Boolean isWriter) {
            this.isWriter = Input.ofNullable(isWriter);
            return this;
        }
        public GlobalClusterGlobalClusterMemberArgs build() {
            return new GlobalClusterGlobalClusterMemberArgs(dbClusterArn, isWriter);
        }
    }
}
