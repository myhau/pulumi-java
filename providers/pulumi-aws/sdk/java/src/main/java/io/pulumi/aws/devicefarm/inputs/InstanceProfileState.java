// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.devicefarm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileState Empty = new InstanceProfileState();

    /**
     * The Amazon Resource Name of this instance profile.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of the instance profile.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
     * 
     */
    @InputImport(name="excludeAppPackagesFromCleanups")
      private final @Nullable Input<List<String>> excludeAppPackagesFromCleanups;

    public Input<List<String>> getExcludeAppPackagesFromCleanups() {
        return this.excludeAppPackagesFromCleanups == null ? Input.empty() : this.excludeAppPackagesFromCleanups;
    }

    /**
     * The name for the instance profile.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
     * 
     */
    @InputImport(name="packageCleanup")
      private final @Nullable Input<Boolean> packageCleanup;

    public Input<Boolean> getPackageCleanup() {
        return this.packageCleanup == null ? Input.empty() : this.packageCleanup;
    }

    /**
     * When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
     * 
     */
    @InputImport(name="rebootAfterUse")
      private final @Nullable Input<Boolean> rebootAfterUse;

    public Input<Boolean> getRebootAfterUse() {
        return this.rebootAfterUse == null ? Input.empty() : this.rebootAfterUse;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public InstanceProfileState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> excludeAppPackagesFromCleanups,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> packageCleanup,
        @Nullable Input<Boolean> rebootAfterUse,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.excludeAppPackagesFromCleanups = excludeAppPackagesFromCleanups;
        this.name = name;
        this.packageCleanup = packageCleanup;
        this.rebootAfterUse = rebootAfterUse;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private InstanceProfileState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.excludeAppPackagesFromCleanups = Input.empty();
        this.name = Input.empty();
        this.packageCleanup = Input.empty();
        this.rebootAfterUse = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> excludeAppPackagesFromCleanups;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> packageCleanup;
        private @Nullable Input<Boolean> rebootAfterUse;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.excludeAppPackagesFromCleanups = defaults.excludeAppPackagesFromCleanups;
    	      this.name = defaults.name;
    	      this.packageCleanup = defaults.packageCleanup;
    	      this.rebootAfterUse = defaults.rebootAfterUse;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExcludeAppPackagesFromCleanups(@Nullable Input<List<String>> excludeAppPackagesFromCleanups) {
            this.excludeAppPackagesFromCleanups = excludeAppPackagesFromCleanups;
            return this;
        }

        public Builder setExcludeAppPackagesFromCleanups(@Nullable List<String> excludeAppPackagesFromCleanups) {
            this.excludeAppPackagesFromCleanups = Input.ofNullable(excludeAppPackagesFromCleanups);
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

        public Builder setPackageCleanup(@Nullable Input<Boolean> packageCleanup) {
            this.packageCleanup = packageCleanup;
            return this;
        }

        public Builder setPackageCleanup(@Nullable Boolean packageCleanup) {
            this.packageCleanup = Input.ofNullable(packageCleanup);
            return this;
        }

        public Builder setRebootAfterUse(@Nullable Input<Boolean> rebootAfterUse) {
            this.rebootAfterUse = rebootAfterUse;
            return this;
        }

        public Builder setRebootAfterUse(@Nullable Boolean rebootAfterUse) {
            this.rebootAfterUse = Input.ofNullable(rebootAfterUse);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public InstanceProfileState build() {
            return new InstanceProfileState(arn, description, excludeAppPackagesFromCleanups, name, packageCleanup, rebootAfterUse, tags, tagsAll);
        }
    }
}
