// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppSiteExtensionResult {
    /**
     * List of authors.
     * 
     */
    private final @Nullable List<String> authors;
    /**
     * Site Extension comment.
     * 
     */
    private final @Nullable String comment;
    /**
     * Detailed description.
     * 
     */
    private final @Nullable String description;
    /**
     * Count of downloads.
     * 
     */
    private final @Nullable Integer downloadCount;
    /**
     * Site extension ID.
     * 
     */
    private final @Nullable String extensionId;
    /**
     * Site extension type.
     * 
     */
    private final @Nullable String extensionType;
    /**
     * Extension URL.
     * 
     */
    private final @Nullable String extensionUrl;
    /**
     * Feed URL.
     * 
     */
    private final @Nullable String feedUrl;
    /**
     * Icon URL.
     * 
     */
    private final @Nullable String iconUrl;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Installed timestamp.
     * 
     */
    private final @Nullable String installedDateTime;
    /**
     * Installer command line parameters.
     * 
     */
    private final @Nullable String installerCommandLineParams;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * License URL.
     * 
     */
    private final @Nullable String licenseUrl;
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
     */
    private final @Nullable Boolean localIsLatestVersion;
    /**
     * Local path.
     * 
     */
    private final @Nullable String localPath;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Project URL.
     * 
     */
    private final @Nullable String projectUrl;
    /**
     * Provisioning state.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Published timestamp.
     * 
     */
    private final @Nullable String publishedDateTime;
    /**
     * Summary description.
     * 
     */
    private final @Nullable String summary;
    private final @Nullable String title;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Version information.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetWebAppSiteExtensionResult(
        @CustomType.Parameter("authors") @Nullable List<String> authors,
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("downloadCount") @Nullable Integer downloadCount,
        @CustomType.Parameter("extensionId") @Nullable String extensionId,
        @CustomType.Parameter("extensionType") @Nullable String extensionType,
        @CustomType.Parameter("extensionUrl") @Nullable String extensionUrl,
        @CustomType.Parameter("feedUrl") @Nullable String feedUrl,
        @CustomType.Parameter("iconUrl") @Nullable String iconUrl,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("installedDateTime") @Nullable String installedDateTime,
        @CustomType.Parameter("installerCommandLineParams") @Nullable String installerCommandLineParams,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("licenseUrl") @Nullable String licenseUrl,
        @CustomType.Parameter("localIsLatestVersion") @Nullable Boolean localIsLatestVersion,
        @CustomType.Parameter("localPath") @Nullable String localPath,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("projectUrl") @Nullable String projectUrl,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("publishedDateTime") @Nullable String publishedDateTime,
        @CustomType.Parameter("summary") @Nullable String summary,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.authors = authors;
        this.comment = comment;
        this.description = description;
        this.downloadCount = downloadCount;
        this.extensionId = extensionId;
        this.extensionType = extensionType;
        this.extensionUrl = extensionUrl;
        this.feedUrl = feedUrl;
        this.iconUrl = iconUrl;
        this.id = id;
        this.installedDateTime = installedDateTime;
        this.installerCommandLineParams = installerCommandLineParams;
        this.kind = kind;
        this.licenseUrl = licenseUrl;
        this.localIsLatestVersion = localIsLatestVersion;
        this.localPath = localPath;
        this.name = name;
        this.projectUrl = projectUrl;
        this.provisioningState = provisioningState;
        this.publishedDateTime = publishedDateTime;
        this.summary = summary;
        this.title = title;
        this.type = type;
        this.version = version;
    }

    /**
     * List of authors.
     * 
    */
    public List<String> authors() {
        return this.authors == null ? List.of() : this.authors;
    }
    /**
     * Site Extension comment.
     * 
    */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * Detailed description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Count of downloads.
     * 
    */
    public Optional<Integer> downloadCount() {
        return Optional.ofNullable(this.downloadCount);
    }
    /**
     * Site extension ID.
     * 
    */
    public Optional<String> extensionId() {
        return Optional.ofNullable(this.extensionId);
    }
    /**
     * Site extension type.
     * 
    */
    public Optional<String> extensionType() {
        return Optional.ofNullable(this.extensionType);
    }
    /**
     * Extension URL.
     * 
    */
    public Optional<String> extensionUrl() {
        return Optional.ofNullable(this.extensionUrl);
    }
    /**
     * Feed URL.
     * 
    */
    public Optional<String> feedUrl() {
        return Optional.ofNullable(this.feedUrl);
    }
    /**
     * Icon URL.
     * 
    */
    public Optional<String> iconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Installed timestamp.
     * 
    */
    public Optional<String> installedDateTime() {
        return Optional.ofNullable(this.installedDateTime);
    }
    /**
     * Installer command line parameters.
     * 
    */
    public Optional<String> installerCommandLineParams() {
        return Optional.ofNullable(this.installerCommandLineParams);
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * License URL.
     * 
    */
    public Optional<String> licenseUrl() {
        return Optional.ofNullable(this.licenseUrl);
    }
    /**
     * <code>true</code> if the local version is the latest version; <code>false</code> otherwise.
     * 
    */
    public Optional<Boolean> localIsLatestVersion() {
        return Optional.ofNullable(this.localIsLatestVersion);
    }
    /**
     * Local path.
     * 
    */
    public Optional<String> localPath() {
        return Optional.ofNullable(this.localPath);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Project URL.
     * 
    */
    public Optional<String> projectUrl() {
        return Optional.ofNullable(this.projectUrl);
    }
    /**
     * Provisioning state.
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Published timestamp.
     * 
    */
    public Optional<String> publishedDateTime() {
        return Optional.ofNullable(this.publishedDateTime);
    }
    /**
     * Summary description.
     * 
    */
    public Optional<String> summary() {
        return Optional.ofNullable(this.summary);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Version information.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSiteExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authors;
        private @Nullable String comment;
        private @Nullable String description;
        private @Nullable Integer downloadCount;
        private @Nullable String extensionId;
        private @Nullable String extensionType;
        private @Nullable String extensionUrl;
        private @Nullable String feedUrl;
        private @Nullable String iconUrl;
        private String id;
        private @Nullable String installedDateTime;
        private @Nullable String installerCommandLineParams;
        private @Nullable String kind;
        private @Nullable String licenseUrl;
        private @Nullable Boolean localIsLatestVersion;
        private @Nullable String localPath;
        private String name;
        private @Nullable String projectUrl;
        private @Nullable String provisioningState;
        private @Nullable String publishedDateTime;
        private @Nullable String summary;
        private @Nullable String title;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSiteExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authors = defaults.authors;
    	      this.comment = defaults.comment;
    	      this.description = defaults.description;
    	      this.downloadCount = defaults.downloadCount;
    	      this.extensionId = defaults.extensionId;
    	      this.extensionType = defaults.extensionType;
    	      this.extensionUrl = defaults.extensionUrl;
    	      this.feedUrl = defaults.feedUrl;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.installedDateTime = defaults.installedDateTime;
    	      this.installerCommandLineParams = defaults.installerCommandLineParams;
    	      this.kind = defaults.kind;
    	      this.licenseUrl = defaults.licenseUrl;
    	      this.localIsLatestVersion = defaults.localIsLatestVersion;
    	      this.localPath = defaults.localPath;
    	      this.name = defaults.name;
    	      this.projectUrl = defaults.projectUrl;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishedDateTime = defaults.publishedDateTime;
    	      this.summary = defaults.summary;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder authors(@Nullable List<String> authors) {
            this.authors = authors;
            return this;
        }
        public Builder authors(String... authors) {
            return authors(List.of(authors));
        }
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder downloadCount(@Nullable Integer downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Builder extensionId(@Nullable String extensionId) {
            this.extensionId = extensionId;
            return this;
        }
        public Builder extensionType(@Nullable String extensionType) {
            this.extensionType = extensionType;
            return this;
        }
        public Builder extensionUrl(@Nullable String extensionUrl) {
            this.extensionUrl = extensionUrl;
            return this;
        }
        public Builder feedUrl(@Nullable String feedUrl) {
            this.feedUrl = feedUrl;
            return this;
        }
        public Builder iconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder installedDateTime(@Nullable String installedDateTime) {
            this.installedDateTime = installedDateTime;
            return this;
        }
        public Builder installerCommandLineParams(@Nullable String installerCommandLineParams) {
            this.installerCommandLineParams = installerCommandLineParams;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder licenseUrl(@Nullable String licenseUrl) {
            this.licenseUrl = licenseUrl;
            return this;
        }
        public Builder localIsLatestVersion(@Nullable Boolean localIsLatestVersion) {
            this.localIsLatestVersion = localIsLatestVersion;
            return this;
        }
        public Builder localPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder projectUrl(@Nullable String projectUrl) {
            this.projectUrl = projectUrl;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder publishedDateTime(@Nullable String publishedDateTime) {
            this.publishedDateTime = publishedDateTime;
            return this;
        }
        public Builder summary(@Nullable String summary) {
            this.summary = summary;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetWebAppSiteExtensionResult build() {
            return new GetWebAppSiteExtensionResult(authors, comment, description, downloadCount, extensionId, extensionType, extensionUrl, feedUrl, iconUrl, id, installedDateTime, installerCommandLineParams, kind, licenseUrl, localIsLatestVersion, localPath, name, projectUrl, provisioningState, publishedDateTime, summary, title, type, version);
        }
    }
}
