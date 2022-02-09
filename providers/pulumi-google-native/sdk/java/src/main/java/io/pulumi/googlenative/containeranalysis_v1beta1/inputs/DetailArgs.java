// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VulnerabilityLocationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetailArgs Empty = new DetailArgs();

    @InputImport(name="cpeUri", required=true)
    private final Input<String> cpeUri;

    public Input<String> getCpeUri() {
        return this.cpeUri;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="fixedLocation")
    private final @Nullable Input<VulnerabilityLocationArgs> fixedLocation;

    public Input<VulnerabilityLocationArgs> getFixedLocation() {
        return this.fixedLocation == null ? Input.empty() : this.fixedLocation;
    }

    @InputImport(name="isObsolete")
    private final @Nullable Input<Boolean> isObsolete;

    public Input<Boolean> getIsObsolete() {
        return this.isObsolete == null ? Input.empty() : this.isObsolete;
    }

    @InputImport(name="maxAffectedVersion")
    private final @Nullable Input<VersionArgs> maxAffectedVersion;

    public Input<VersionArgs> getMaxAffectedVersion() {
        return this.maxAffectedVersion == null ? Input.empty() : this.maxAffectedVersion;
    }

    @InputImport(name="minAffectedVersion")
    private final @Nullable Input<VersionArgs> minAffectedVersion;

    public Input<VersionArgs> getMinAffectedVersion() {
        return this.minAffectedVersion == null ? Input.empty() : this.minAffectedVersion;
    }

    @InputImport(name="package", required=true)
    private final Input<String> $package;

    public Input<String> get$package() {
        return this.$package;
    }

    @InputImport(name="packageType")
    private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    @InputImport(name="severityName")
    private final @Nullable Input<String> severityName;

    public Input<String> getSeverityName() {
        return this.severityName == null ? Input.empty() : this.severityName;
    }

    @InputImport(name="source")
    private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    @InputImport(name="sourceUpdateTime")
    private final @Nullable Input<String> sourceUpdateTime;

    public Input<String> getSourceUpdateTime() {
        return this.sourceUpdateTime == null ? Input.empty() : this.sourceUpdateTime;
    }

    @InputImport(name="vendor")
    private final @Nullable Input<String> vendor;

    public Input<String> getVendor() {
        return this.vendor == null ? Input.empty() : this.vendor;
    }

    public DetailArgs(
        Input<String> cpeUri,
        @Nullable Input<String> description,
        @Nullable Input<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Input<Boolean> isObsolete,
        @Nullable Input<VersionArgs> maxAffectedVersion,
        @Nullable Input<VersionArgs> minAffectedVersion,
        Input<String> $package,
        @Nullable Input<String> packageType,
        @Nullable Input<String> severityName,
        @Nullable Input<String> source,
        @Nullable Input<String> sourceUpdateTime,
        @Nullable Input<String> vendor) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = description;
        this.fixedLocation = fixedLocation;
        this.isObsolete = isObsolete;
        this.maxAffectedVersion = maxAffectedVersion;
        this.minAffectedVersion = minAffectedVersion;
        this.$package = Objects.requireNonNull($package, "expected parameter '$package' to be non-null");
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.sourceUpdateTime = sourceUpdateTime;
        this.vendor = vendor;
    }

    private DetailArgs() {
        this.cpeUri = Input.empty();
        this.description = Input.empty();
        this.fixedLocation = Input.empty();
        this.isObsolete = Input.empty();
        this.maxAffectedVersion = Input.empty();
        this.minAffectedVersion = Input.empty();
        this.$package = Input.empty();
        this.packageType = Input.empty();
        this.severityName = Input.empty();
        this.source = Input.empty();
        this.sourceUpdateTime = Input.empty();
        this.vendor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cpeUri;
        private @Nullable Input<String> description;
        private @Nullable Input<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Input<Boolean> isObsolete;
        private @Nullable Input<VersionArgs> maxAffectedVersion;
        private @Nullable Input<VersionArgs> minAffectedVersion;
        private Input<String> $package;
        private @Nullable Input<String> packageType;
        private @Nullable Input<String> severityName;
        private @Nullable Input<String> source;
        private @Nullable Input<String> sourceUpdateTime;
        private @Nullable Input<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.$package = defaults.$package;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.sourceUpdateTime = defaults.sourceUpdateTime;
    	      this.vendor = defaults.vendor;
        }

        public Builder setCpeUri(Input<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Input.of(Objects.requireNonNull(cpeUri));
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

        public Builder setFixedLocation(@Nullable Input<VulnerabilityLocationArgs> fixedLocation) {
            this.fixedLocation = fixedLocation;
            return this;
        }

        public Builder setFixedLocation(@Nullable VulnerabilityLocationArgs fixedLocation) {
            this.fixedLocation = Input.ofNullable(fixedLocation);
            return this;
        }

        public Builder setIsObsolete(@Nullable Input<Boolean> isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }

        public Builder setIsObsolete(@Nullable Boolean isObsolete) {
            this.isObsolete = Input.ofNullable(isObsolete);
            return this;
        }

        public Builder setMaxAffectedVersion(@Nullable Input<VersionArgs> maxAffectedVersion) {
            this.maxAffectedVersion = maxAffectedVersion;
            return this;
        }

        public Builder setMaxAffectedVersion(@Nullable VersionArgs maxAffectedVersion) {
            this.maxAffectedVersion = Input.ofNullable(maxAffectedVersion);
            return this;
        }

        public Builder setMinAffectedVersion(@Nullable Input<VersionArgs> minAffectedVersion) {
            this.minAffectedVersion = minAffectedVersion;
            return this;
        }

        public Builder setMinAffectedVersion(@Nullable VersionArgs minAffectedVersion) {
            this.minAffectedVersion = Input.ofNullable(minAffectedVersion);
            return this;
        }

        public Builder set$package(Input<String> $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Input.of(Objects.requireNonNull($package));
            return this;
        }

        public Builder setPackageType(@Nullable Input<String> packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setPackageType(@Nullable String packageType) {
            this.packageType = Input.ofNullable(packageType);
            return this;
        }

        public Builder setSeverityName(@Nullable Input<String> severityName) {
            this.severityName = severityName;
            return this;
        }

        public Builder setSeverityName(@Nullable String severityName) {
            this.severityName = Input.ofNullable(severityName);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setSourceUpdateTime(@Nullable Input<String> sourceUpdateTime) {
            this.sourceUpdateTime = sourceUpdateTime;
            return this;
        }

        public Builder setSourceUpdateTime(@Nullable String sourceUpdateTime) {
            this.sourceUpdateTime = Input.ofNullable(sourceUpdateTime);
            return this;
        }

        public Builder setVendor(@Nullable Input<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = Input.ofNullable(vendor);
            return this;
        }

        public DetailArgs build() {
            return new DetailArgs(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, $package, packageType, severityName, source, sourceUpdateTime, vendor);
        }
    }
}