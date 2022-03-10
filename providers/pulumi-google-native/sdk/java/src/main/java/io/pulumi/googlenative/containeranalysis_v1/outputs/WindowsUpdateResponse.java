// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.CategoryResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.IdentityResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WindowsUpdateResponse {
    /**
     * The list of categories to which the update belongs.
     * 
     */
    private final List<CategoryResponse> categories;
    /**
     * The localized description of the update.
     * 
     */
    private final String description;
    /**
     * Required - The unique identifier for the update.
     * 
     */
    private final IdentityResponse identity;
    /**
     * The Microsoft Knowledge Base article IDs that are associated with the update.
     * 
     */
    private final List<String> kbArticleIds;
    /**
     * The last published timestamp of the update.
     * 
     */
    private final String lastPublishedTimestamp;
    /**
     * The hyperlink to the support information for the update.
     * 
     */
    private final String supportUrl;
    /**
     * The localized title of the update.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor
    private WindowsUpdateResponse(
        @OutputCustomType.Parameter("categories") List<CategoryResponse> categories,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("identity") IdentityResponse identity,
        @OutputCustomType.Parameter("kbArticleIds") List<String> kbArticleIds,
        @OutputCustomType.Parameter("lastPublishedTimestamp") String lastPublishedTimestamp,
        @OutputCustomType.Parameter("supportUrl") String supportUrl,
        @OutputCustomType.Parameter("title") String title) {
        this.categories = categories;
        this.description = description;
        this.identity = identity;
        this.kbArticleIds = kbArticleIds;
        this.lastPublishedTimestamp = lastPublishedTimestamp;
        this.supportUrl = supportUrl;
        this.title = title;
    }

    /**
     * The list of categories to which the update belongs.
     * 
    */
    public List<CategoryResponse> getCategories() {
        return this.categories;
    }
    /**
     * The localized description of the update.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Required - The unique identifier for the update.
     * 
    */
    public IdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * The Microsoft Knowledge Base article IDs that are associated with the update.
     * 
    */
    public List<String> getKbArticleIds() {
        return this.kbArticleIds;
    }
    /**
     * The last published timestamp of the update.
     * 
    */
    public String getLastPublishedTimestamp() {
        return this.lastPublishedTimestamp;
    }
    /**
     * The hyperlink to the support information for the update.
     * 
    */
    public String getSupportUrl() {
        return this.supportUrl;
    }
    /**
     * The localized title of the update.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CategoryResponse> categories;
        private String description;
        private IdentityResponse identity;
        private List<String> kbArticleIds;
        private String lastPublishedTimestamp;
        private String supportUrl;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.identity = defaults.identity;
    	      this.kbArticleIds = defaults.kbArticleIds;
    	      this.lastPublishedTimestamp = defaults.lastPublishedTimestamp;
    	      this.supportUrl = defaults.supportUrl;
    	      this.title = defaults.title;
        }

        public Builder setCategories(List<CategoryResponse> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIdentity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setKbArticleIds(List<String> kbArticleIds) {
            this.kbArticleIds = Objects.requireNonNull(kbArticleIds);
            return this;
        }

        public Builder setLastPublishedTimestamp(String lastPublishedTimestamp) {
            this.lastPublishedTimestamp = Objects.requireNonNull(lastPublishedTimestamp);
            return this;
        }

        public Builder setSupportUrl(String supportUrl) {
            this.supportUrl = Objects.requireNonNull(supportUrl);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public WindowsUpdateResponse build() {
            return new WindowsUpdateResponse(categories, description, identity, kbArticleIds, lastPublishedTimestamp, supportUrl, title);
        }
    }
}
