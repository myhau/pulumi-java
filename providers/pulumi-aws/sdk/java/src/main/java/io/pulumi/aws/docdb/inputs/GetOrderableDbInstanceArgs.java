// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderableDbInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrderableDbInstanceArgs Empty = new GetOrderableDbInstanceArgs();

    /**
     * DB engine. Default: `docdb`
     * 
     */
    @InputImport(name="engine")
      private final @Nullable String engine;

    public Optional<String> getEngine() {
        return this.engine == null ? Optional.empty() : Optional.ofNullable(this.engine);
    }

    /**
     * Version of the DB engine.
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable String engineVersion;

    public Optional<String> getEngineVersion() {
        return this.engineVersion == null ? Optional.empty() : Optional.ofNullable(this.engineVersion);
    }

    /**
     * DB instance class. Examples of classes are `db.r5.12xlarge`, `db.r5.24xlarge`, `db.r5.2xlarge`, `db.r5.4xlarge`, `db.r5.large`, `db.r5.xlarge`, and `db.t3.medium`. (Conflicts with `preferred_instance_classes`.)
     * 
     */
    @InputImport(name="instanceClass")
      private final @Nullable String instanceClass;

    public Optional<String> getInstanceClass() {
        return this.instanceClass == null ? Optional.empty() : Optional.ofNullable(this.instanceClass);
    }

    /**
     * License model. Default: `na`
     * 
     */
    @InputImport(name="licenseModel")
      private final @Nullable String licenseModel;

    public Optional<String> getLicenseModel() {
        return this.licenseModel == null ? Optional.empty() : Optional.ofNullable(this.licenseModel);
    }

    /**
     * Ordered list of preferred DocumentDB DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. (Conflicts with `instance_class`.)
     * 
     */
    @InputImport(name="preferredInstanceClasses")
      private final @Nullable List<String> preferredInstanceClasses;

    public List<String> getPreferredInstanceClasses() {
        return this.preferredInstanceClasses == null ? List.of() : this.preferredInstanceClasses;
    }

    /**
     * Enable to show only VPC.
     * 
     */
    @InputImport(name="vpc")
      private final @Nullable Boolean vpc;

    public Optional<Boolean> getVpc() {
        return this.vpc == null ? Optional.empty() : Optional.ofNullable(this.vpc);
    }

    public GetOrderableDbInstanceArgs(
        @Nullable String engine,
        @Nullable String engineVersion,
        @Nullable String instanceClass,
        @Nullable String licenseModel,
        @Nullable List<String> preferredInstanceClasses,
        @Nullable Boolean vpc) {
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.instanceClass = instanceClass;
        this.licenseModel = licenseModel;
        this.preferredInstanceClasses = preferredInstanceClasses;
        this.vpc = vpc;
    }

    private GetOrderableDbInstanceArgs() {
        this.engine = null;
        this.engineVersion = null;
        this.instanceClass = null;
        this.licenseModel = null;
        this.preferredInstanceClasses = List.of();
        this.vpc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableDbInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String engine;
        private @Nullable String engineVersion;
        private @Nullable String instanceClass;
        private @Nullable String licenseModel;
        private @Nullable List<String> preferredInstanceClasses;
        private @Nullable Boolean vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableDbInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.instanceClass = defaults.instanceClass;
    	      this.licenseModel = defaults.licenseModel;
    	      this.preferredInstanceClasses = defaults.preferredInstanceClasses;
    	      this.vpc = defaults.vpc;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setInstanceClass(@Nullable String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }

        public Builder setLicenseModel(@Nullable String licenseModel) {
            this.licenseModel = licenseModel;
            return this;
        }

        public Builder setPreferredInstanceClasses(@Nullable List<String> preferredInstanceClasses) {
            this.preferredInstanceClasses = preferredInstanceClasses;
            return this;
        }

        public Builder setVpc(@Nullable Boolean vpc) {
            this.vpc = vpc;
            return this;
        }
        public GetOrderableDbInstanceArgs build() {
            return new GetOrderableDbInstanceArgs(engine, engineVersion, instanceClass, licenseModel, preferredInstanceClasses, vpc);
        }
    }
}
