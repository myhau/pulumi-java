// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.VersionResponse;
import com.pulumi.googlenative.containeranalysis.v1alpha1.outputs.VulnerabilityLocationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DetailResponse {
    /**
     * @return The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
     */
    private final String cpeUri;
    /**
     * @return A vendor-specific description of this note.
     * 
     */
    private final String description;
    /**
     * @return The fix for this specific package version.
     * 
     */
    private final VulnerabilityLocationResponse fixedLocation;
    /**
     * @return Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    private final Boolean isObsolete;
    /**
     * @return The max version of the package in which the vulnerability exists.
     * 
     */
    private final VersionResponse maxAffectedVersion;
    /**
     * @return The min version of the package in which the vulnerability exists.
     * 
     */
    private final VersionResponse minAffectedVersion;
    /**
     * @return The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
     */
    private final String package_;
    /**
     * @return The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
     */
    private final String packageType;
    /**
     * @return The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    private final String severityName;
    /**
     * @return The source from which the information in this Detail was obtained.
     * 
     */
    private final String source;
    /**
     * @return The vendor of the product. e.g. &#34;google&#34;
     * 
     */
    private final String vendor;

    @CustomType.Constructor
    private DetailResponse(
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fixedLocation") VulnerabilityLocationResponse fixedLocation,
        @CustomType.Parameter("isObsolete") Boolean isObsolete,
        @CustomType.Parameter("maxAffectedVersion") VersionResponse maxAffectedVersion,
        @CustomType.Parameter("minAffectedVersion") VersionResponse minAffectedVersion,
        @CustomType.Parameter("package") String package_,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("severityName") String severityName,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("vendor") String vendor) {
        this.cpeUri = cpeUri;
        this.description = description;
        this.fixedLocation = fixedLocation;
        this.isObsolete = isObsolete;
        this.maxAffectedVersion = maxAffectedVersion;
        this.minAffectedVersion = minAffectedVersion;
        this.package_ = package_;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.vendor = vendor;
    }

    /**
     * @return The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
     */
    public String cpeUri() {
        return this.cpeUri;
    }
    /**
     * @return A vendor-specific description of this note.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The fix for this specific package version.
     * 
     */
    public VulnerabilityLocationResponse fixedLocation() {
        return this.fixedLocation;
    }
    /**
     * @return Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    public Boolean isObsolete() {
        return this.isObsolete;
    }
    /**
     * @return The max version of the package in which the vulnerability exists.
     * 
     */
    public VersionResponse maxAffectedVersion() {
        return this.maxAffectedVersion;
    }
    /**
     * @return The min version of the package in which the vulnerability exists.
     * 
     */
    public VersionResponse minAffectedVersion() {
        return this.minAffectedVersion;
    }
    /**
     * @return The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
     */
    public String package_() {
        return this.package_;
    }
    /**
     * @return The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    public String severityName() {
        return this.severityName;
    }
    /**
     * @return The source from which the information in this Detail was obtained.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The vendor of the product. e.g. &#34;google&#34;
     * 
     */
    public String vendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String description;
        private VulnerabilityLocationResponse fixedLocation;
        private Boolean isObsolete;
        private VersionResponse maxAffectedVersion;
        private VersionResponse minAffectedVersion;
        private String package_;
        private String packageType;
        private String severityName;
        private String source;
        private String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.package_ = defaults.package_;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.vendor = defaults.vendor;
        }

        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }
        public Builder isObsolete(Boolean isObsolete) {
            this.isObsolete = Objects.requireNonNull(isObsolete);
            return this;
        }
        public Builder maxAffectedVersion(VersionResponse maxAffectedVersion) {
            this.maxAffectedVersion = Objects.requireNonNull(maxAffectedVersion);
            return this;
        }
        public Builder minAffectedVersion(VersionResponse minAffectedVersion) {
            this.minAffectedVersion = Objects.requireNonNull(minAffectedVersion);
            return this;
        }
        public Builder package_(String package_) {
            this.package_ = Objects.requireNonNull(package_);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder severityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder vendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }        public DetailResponse build() {
            return new DetailResponse(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, package_, packageType, severityName, source, vendor);
        }
    }
}
