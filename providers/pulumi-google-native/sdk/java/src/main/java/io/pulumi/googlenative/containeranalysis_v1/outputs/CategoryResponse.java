// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CategoryResponse {
    /**
     * The identifier of the category.
     * 
     */
    private final String categoryId;
    /**
     * The localized name of the category.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private CategoryResponse(
        @OutputCustomType.Parameter("categoryId") String categoryId,
        @OutputCustomType.Parameter("name") String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    /**
     * The identifier of the category.
     * 
    */
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * The localized name of the category.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CategoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String categoryId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CategoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryId = defaults.categoryId;
    	      this.name = defaults.name;
        }

        public Builder setCategoryId(String categoryId) {
            this.categoryId = Objects.requireNonNull(categoryId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public CategoryResponse build() {
            return new CategoryResponse(categoryId, name);
        }
    }
}
