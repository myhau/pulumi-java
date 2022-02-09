// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataLakeStorageAccountDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataLakeStorageAccountDetailsArgs Empty = new DataLakeStorageAccountDetailsArgs();

    @InputImport(name="accountUrl")
    private final @Nullable Input<String> accountUrl;

    public Input<String> getAccountUrl() {
        return this.accountUrl == null ? Input.empty() : this.accountUrl;
    }

    @InputImport(name="filesystem")
    private final @Nullable Input<String> filesystem;

    public Input<String> getFilesystem() {
        return this.filesystem == null ? Input.empty() : this.filesystem;
    }

    public DataLakeStorageAccountDetailsArgs(
        @Nullable Input<String> accountUrl,
        @Nullable Input<String> filesystem) {
        this.accountUrl = accountUrl;
        this.filesystem = filesystem;
    }

    private DataLakeStorageAccountDetailsArgs() {
        this.accountUrl = Input.empty();
        this.filesystem = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStorageAccountDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountUrl;
        private @Nullable Input<String> filesystem;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeStorageAccountDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountUrl = defaults.accountUrl;
    	      this.filesystem = defaults.filesystem;
        }

        public Builder setAccountUrl(@Nullable Input<String> accountUrl) {
            this.accountUrl = accountUrl;
            return this;
        }

        public Builder setAccountUrl(@Nullable String accountUrl) {
            this.accountUrl = Input.ofNullable(accountUrl);
            return this;
        }

        public Builder setFilesystem(@Nullable Input<String> filesystem) {
            this.filesystem = filesystem;
            return this;
        }

        public Builder setFilesystem(@Nullable String filesystem) {
            this.filesystem = Input.ofNullable(filesystem);
            return this;
        }

        public DataLakeStorageAccountDetailsArgs build() {
            return new DataLakeStorageAccountDetailsArgs(accountUrl, filesystem);
        }
    }
}