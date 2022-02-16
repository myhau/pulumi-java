// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.ApplicationFeatureSettingsArgs;
import io.pulumi.gcp.appengine.inputs.ApplicationIapArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @InputImport(name="authDomain")
    private final @Nullable Input<String> authDomain;

    public Input<String> getAuthDomain() {
        return this.authDomain == null ? Input.empty() : this.authDomain;
    }

    @InputImport(name="databaseType")
    private final @Nullable Input<String> databaseType;

    public Input<String> getDatabaseType() {
        return this.databaseType == null ? Input.empty() : this.databaseType;
    }

    @InputImport(name="featureSettings")
    private final @Nullable Input<ApplicationFeatureSettingsArgs> featureSettings;

    public Input<ApplicationFeatureSettingsArgs> getFeatureSettings() {
        return this.featureSettings == null ? Input.empty() : this.featureSettings;
    }

    @InputImport(name="iap")
    private final @Nullable Input<ApplicationIapArgs> iap;

    public Input<ApplicationIapArgs> getIap() {
        return this.iap == null ? Input.empty() : this.iap;
    }

    @InputImport(name="locationId", required=true)
    private final Input<String> locationId;

    public Input<String> getLocationId() {
        return this.locationId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="servingStatus")
    private final @Nullable Input<String> servingStatus;

    public Input<String> getServingStatus() {
        return this.servingStatus == null ? Input.empty() : this.servingStatus;
    }

    public ApplicationArgs(
        @Nullable Input<String> authDomain,
        @Nullable Input<String> databaseType,
        @Nullable Input<ApplicationFeatureSettingsArgs> featureSettings,
        @Nullable Input<ApplicationIapArgs> iap,
        Input<String> locationId,
        @Nullable Input<String> project,
        @Nullable Input<String> servingStatus) {
        this.authDomain = authDomain;
        this.databaseType = databaseType;
        this.featureSettings = featureSettings;
        this.iap = iap;
        this.locationId = Objects.requireNonNull(locationId, "expected parameter 'locationId' to be non-null");
        this.project = project;
        this.servingStatus = servingStatus;
    }

    private ApplicationArgs() {
        this.authDomain = Input.empty();
        this.databaseType = Input.empty();
        this.featureSettings = Input.empty();
        this.iap = Input.empty();
        this.locationId = Input.empty();
        this.project = Input.empty();
        this.servingStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authDomain;
        private @Nullable Input<String> databaseType;
        private @Nullable Input<ApplicationFeatureSettingsArgs> featureSettings;
        private @Nullable Input<ApplicationIapArgs> iap;
        private Input<String> locationId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> servingStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authDomain = defaults.authDomain;
    	      this.databaseType = defaults.databaseType;
    	      this.featureSettings = defaults.featureSettings;
    	      this.iap = defaults.iap;
    	      this.locationId = defaults.locationId;
    	      this.project = defaults.project;
    	      this.servingStatus = defaults.servingStatus;
        }

        public Builder setAuthDomain(@Nullable Input<String> authDomain) {
            this.authDomain = authDomain;
            return this;
        }

        public Builder setAuthDomain(@Nullable String authDomain) {
            this.authDomain = Input.ofNullable(authDomain);
            return this;
        }

        public Builder setDatabaseType(@Nullable Input<String> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        public Builder setDatabaseType(@Nullable String databaseType) {
            this.databaseType = Input.ofNullable(databaseType);
            return this;
        }

        public Builder setFeatureSettings(@Nullable Input<ApplicationFeatureSettingsArgs> featureSettings) {
            this.featureSettings = featureSettings;
            return this;
        }

        public Builder setFeatureSettings(@Nullable ApplicationFeatureSettingsArgs featureSettings) {
            this.featureSettings = Input.ofNullable(featureSettings);
            return this;
        }

        public Builder setIap(@Nullable Input<ApplicationIapArgs> iap) {
            this.iap = iap;
            return this;
        }

        public Builder setIap(@Nullable ApplicationIapArgs iap) {
            this.iap = Input.ofNullable(iap);
            return this;
        }

        public Builder setLocationId(Input<String> locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = Input.of(Objects.requireNonNull(locationId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServingStatus(@Nullable Input<String> servingStatus) {
            this.servingStatus = servingStatus;
            return this;
        }

        public Builder setServingStatus(@Nullable String servingStatus) {
            this.servingStatus = Input.ofNullable(servingStatus);
            return this;
        }

        public ApplicationArgs build() {
            return new ApplicationArgs(authDomain, databaseType, featureSettings, iap, locationId, project, servingStatus);
        }
    }
}