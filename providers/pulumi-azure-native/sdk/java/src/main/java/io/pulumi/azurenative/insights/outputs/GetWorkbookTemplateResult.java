// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.WorkbookTemplateGalleryResponse;
import io.pulumi.azurenative.insights.outputs.WorkbookTemplateLocalizedGalleryResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkbookTemplateResult {
    /**
     * Information about the author of the workbook template.
     * 
     */
    private final @Nullable String author;
    /**
     * Workbook galleries supported by the template.
     * 
     */
    private final List<WorkbookTemplateGalleryResponse> galleries;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    private final @Nullable Map<String,List<WorkbookTemplateLocalizedGalleryResponse>> localized;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name.
     * 
     */
    private final String name;
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    private final Object templateData;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkbookTemplateResult(
        @CustomType.Parameter("author") @Nullable String author,
        @CustomType.Parameter("galleries") List<WorkbookTemplateGalleryResponse> galleries,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("localized") @Nullable Map<String,List<WorkbookTemplateLocalizedGalleryResponse>> localized,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("templateData") Object templateData,
        @CustomType.Parameter("type") String type) {
        this.author = author;
        this.galleries = galleries;
        this.id = id;
        this.localized = localized;
        this.location = location;
        this.name = name;
        this.priority = priority;
        this.tags = tags;
        this.templateData = templateData;
        this.type = type;
    }

    /**
     * Information about the author of the workbook template.
     * 
    */
    public Optional<String> author() {
        return Optional.ofNullable(this.author);
    }
    /**
     * Workbook galleries supported by the template.
     * 
    */
    public List<WorkbookTemplateGalleryResponse> galleries() {
        return this.galleries;
    }
    /**
     * Azure resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
    */
    public Map<String,List<WorkbookTemplateLocalizedGalleryResponse>> localized() {
        return this.localized == null ? Map.of() : this.localized;
    }
    /**
     * Resource location
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Azure resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
    */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Valid JSON object containing workbook template payload.
     * 
    */
    public Object templateData() {
        return this.templateData;
    }
    /**
     * Azure resource type
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkbookTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String author;
        private List<WorkbookTemplateGalleryResponse> galleries;
        private String id;
        private @Nullable Map<String,List<WorkbookTemplateLocalizedGalleryResponse>> localized;
        private String location;
        private String name;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> tags;
        private Object templateData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkbookTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.galleries = defaults.galleries;
    	      this.id = defaults.id;
    	      this.localized = defaults.localized;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
    	      this.templateData = defaults.templateData;
    	      this.type = defaults.type;
        }

        public Builder author(@Nullable String author) {
            this.author = author;
            return this;
        }
        public Builder galleries(List<WorkbookTemplateGalleryResponse> galleries) {
            this.galleries = Objects.requireNonNull(galleries);
            return this;
        }
        public Builder galleries(WorkbookTemplateGalleryResponse... galleries) {
            return galleries(List.of(galleries));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder localized(@Nullable Map<String,List<WorkbookTemplateLocalizedGalleryResponse>> localized) {
            this.localized = localized;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder templateData(Object templateData) {
            this.templateData = Objects.requireNonNull(templateData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkbookTemplateResult build() {
            return new GetWorkbookTemplateResult(author, galleries, id, localized, location, name, priority, tags, templateData, type);
        }
    }
}
