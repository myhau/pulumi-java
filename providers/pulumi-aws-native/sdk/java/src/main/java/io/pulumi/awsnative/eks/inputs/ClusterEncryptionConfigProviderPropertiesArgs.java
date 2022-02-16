// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEncryptionConfigProviderPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigProviderPropertiesArgs Empty = new ClusterEncryptionConfigProviderPropertiesArgs();

    @InputImport(name="keyArn")
    private final @Nullable Input<String> keyArn;

    public Input<String> getKeyArn() {
        return this.keyArn == null ? Input.empty() : this.keyArn;
    }

    public ClusterEncryptionConfigProviderPropertiesArgs(@Nullable Input<String> keyArn) {
        this.keyArn = keyArn;
    }

    private ClusterEncryptionConfigProviderPropertiesArgs() {
        this.keyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder setKeyArn(@Nullable Input<String> keyArn) {
            this.keyArn = keyArn;
            return this;
        }

        public Builder setKeyArn(@Nullable String keyArn) {
            this.keyArn = Input.ofNullable(keyArn);
            return this;
        }

        public ClusterEncryptionConfigProviderPropertiesArgs build() {
            return new ClusterEncryptionConfigProviderPropertiesArgs(keyArn);
        }
    }
}