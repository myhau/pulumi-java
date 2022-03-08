// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketWebsiteResponse {
    /**
     * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting object. This allows the creation of index.html objects to represent directory pages.
     * 
     */
    private final String mainPageSuffix;
    /**
     * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this bucket as the content for a 404 Not Found result.
     * 
     */
    private final String notFoundPage;

    @OutputCustomType.Constructor({"mainPageSuffix","notFoundPage"})
    private BucketWebsiteResponse(
        String mainPageSuffix,
        String notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    /**
     * If the requested object path is missing, the service will ensure the path has a trailing '/', append this suffix, and attempt to retrieve the resulting object. This allows the creation of index.html objects to represent directory pages.
     * 
    */
    public String getMainPageSuffix() {
        return this.mainPageSuffix;
    }
    /**
     * If the requested object path is missing, and any mainPageSuffix object is missing, if applicable, the service will return the named object from this bucket as the content for a 404 Not Found result.
     * 
    */
    public String getNotFoundPage() {
        return this.notFoundPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mainPageSuffix;
        private String notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder setMainPageSuffix(String mainPageSuffix) {
            this.mainPageSuffix = Objects.requireNonNull(mainPageSuffix);
            return this;
        }

        public Builder setNotFoundPage(String notFoundPage) {
            this.notFoundPage = Objects.requireNonNull(notFoundPage);
            return this;
        }
        public BucketWebsiteResponse build() {
            return new BucketWebsiteResponse(mainPageSuffix, notFoundPage);
        }
    }
}
