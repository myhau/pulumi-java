// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOrderableDbInstanceResult {
    /**
     * Availability zones where the instance is available.
     * 
     */
    private final List<String> availabilityZones;
    private final @Nullable String engine;
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceClass;
    private final @Nullable String licenseModel;
    private final @Nullable List<String> preferredInstanceClasses;
    private final Boolean vpc;

    @OutputCustomType.Constructor({"availabilityZones","engine","engineVersion","id","instanceClass","licenseModel","preferredInstanceClasses","vpc"})
    private GetOrderableDbInstanceResult(
        List<String> availabilityZones,
        @Nullable String engine,
        String engineVersion,
        String id,
        String instanceClass,
        @Nullable String licenseModel,
        @Nullable List<String> preferredInstanceClasses,
        Boolean vpc) {
        this.availabilityZones = Objects.requireNonNull(availabilityZones);
        this.engine = engine;
        this.engineVersion = Objects.requireNonNull(engineVersion);
        this.id = Objects.requireNonNull(id);
        this.instanceClass = Objects.requireNonNull(instanceClass);
        this.licenseModel = licenseModel;
        this.preferredInstanceClasses = preferredInstanceClasses;
        this.vpc = Objects.requireNonNull(vpc);
    }

    /**
     * Availability zones where the instance is available.
     * 
     */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public Optional<String> getEngine() {
        return Optional.ofNullable(this.engine);
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }
    public Optional<String> getLicenseModel() {
        return Optional.ofNullable(this.licenseModel);
    }
    public List<String> getPreferredInstanceClasses() {
        return this.preferredInstanceClasses == null ? List.of() : this.preferredInstanceClasses;
    }
    public Boolean getVpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderableDbInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private @Nullable String engine;
        private String engineVersion;
        private String id;
        private String instanceClass;
        private @Nullable String licenseModel;
        private @Nullable List<String> preferredInstanceClasses;
        private Boolean vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderableDbInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.licenseModel = defaults.licenseModel;
    	      this.preferredInstanceClasses = defaults.preferredInstanceClasses;
    	      this.vpc = defaults.vpc;
        }

        public Builder setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
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

        public Builder setVpc(Boolean vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public GetOrderableDbInstanceResult build() {
            return new GetOrderableDbInstanceResult(availabilityZones, engine, engineVersion, id, instanceClass, licenseModel, preferredInstanceClasses, vpc);
        }
    }
}
