// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2StoredTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2StoredTypeArgs Empty = new GooglePrivacyDlpV2StoredTypeArgs();

    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GooglePrivacyDlpV2StoredTypeArgs(
        @Nullable Input<String> createTime,
        @Nullable Input<String> name) {
        this.createTime = createTime;
        this.name = name;
    }

    private GooglePrivacyDlpV2StoredTypeArgs() {
        this.createTime = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StoredTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public GooglePrivacyDlpV2StoredTypeArgs build() {
            return new GooglePrivacyDlpV2StoredTypeArgs(createTime, name);
        }
    }
}