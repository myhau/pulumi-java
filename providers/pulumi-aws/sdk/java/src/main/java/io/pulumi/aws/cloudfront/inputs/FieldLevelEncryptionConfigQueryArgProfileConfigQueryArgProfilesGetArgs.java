// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs();

    @InputImport(name="items")
      private final @Nullable Input<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items;

    public Input<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs(@Nullable Input<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items) {
        this.items = items;
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }
        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs(items);
        }
    }
}