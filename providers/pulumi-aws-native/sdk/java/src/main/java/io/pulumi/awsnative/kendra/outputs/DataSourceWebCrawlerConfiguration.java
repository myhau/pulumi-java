// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceProxyConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceWebCrawlerAuthenticationConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceWebCrawlerUrls;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceWebCrawlerConfiguration {
    private final @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration;
    private final @Nullable Integer crawlDepth;
    private final @Nullable Double maxContentSizePerPageInMegaBytes;
    private final @Nullable Integer maxLinksPerPage;
    private final @Nullable Integer maxUrlsPerMinuteCrawlRate;
    private final @Nullable DataSourceProxyConfiguration proxyConfiguration;
    private final @Nullable List<String> urlExclusionPatterns;
    private final @Nullable List<String> urlInclusionPatterns;
    private final DataSourceWebCrawlerUrls urls;

    @OutputCustomType.Constructor({"authenticationConfiguration","crawlDepth","maxContentSizePerPageInMegaBytes","maxLinksPerPage","maxUrlsPerMinuteCrawlRate","proxyConfiguration","urlExclusionPatterns","urlInclusionPatterns","urls"})
    private DataSourceWebCrawlerConfiguration(
        @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration,
        @Nullable Integer crawlDepth,
        @Nullable Double maxContentSizePerPageInMegaBytes,
        @Nullable Integer maxLinksPerPage,
        @Nullable Integer maxUrlsPerMinuteCrawlRate,
        @Nullable DataSourceProxyConfiguration proxyConfiguration,
        @Nullable List<String> urlExclusionPatterns,
        @Nullable List<String> urlInclusionPatterns,
        DataSourceWebCrawlerUrls urls) {
        this.authenticationConfiguration = authenticationConfiguration;
        this.crawlDepth = crawlDepth;
        this.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
        this.maxLinksPerPage = maxLinksPerPage;
        this.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
        this.proxyConfiguration = proxyConfiguration;
        this.urlExclusionPatterns = urlExclusionPatterns;
        this.urlInclusionPatterns = urlInclusionPatterns;
        this.urls = urls;
    }

    public Optional<DataSourceWebCrawlerAuthenticationConfiguration> getAuthenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    public Optional<Integer> getCrawlDepth() {
        return Optional.ofNullable(this.crawlDepth);
    }
    public Optional<Double> getMaxContentSizePerPageInMegaBytes() {
        return Optional.ofNullable(this.maxContentSizePerPageInMegaBytes);
    }
    public Optional<Integer> getMaxLinksPerPage() {
        return Optional.ofNullable(this.maxLinksPerPage);
    }
    public Optional<Integer> getMaxUrlsPerMinuteCrawlRate() {
        return Optional.ofNullable(this.maxUrlsPerMinuteCrawlRate);
    }
    public Optional<DataSourceProxyConfiguration> getProxyConfiguration() {
        return Optional.ofNullable(this.proxyConfiguration);
    }
    public List<String> getUrlExclusionPatterns() {
        return this.urlExclusionPatterns == null ? List.of() : this.urlExclusionPatterns;
    }
    public List<String> getUrlInclusionPatterns() {
        return this.urlInclusionPatterns == null ? List.of() : this.urlInclusionPatterns;
    }
    public DataSourceWebCrawlerUrls getUrls() {
        return this.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceWebCrawlerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration;
        private @Nullable Integer crawlDepth;
        private @Nullable Double maxContentSizePerPageInMegaBytes;
        private @Nullable Integer maxLinksPerPage;
        private @Nullable Integer maxUrlsPerMinuteCrawlRate;
        private @Nullable DataSourceProxyConfiguration proxyConfiguration;
        private @Nullable List<String> urlExclusionPatterns;
        private @Nullable List<String> urlInclusionPatterns;
        private DataSourceWebCrawlerUrls urls;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceWebCrawlerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.crawlDepth = defaults.crawlDepth;
    	      this.maxContentSizePerPageInMegaBytes = defaults.maxContentSizePerPageInMegaBytes;
    	      this.maxLinksPerPage = defaults.maxLinksPerPage;
    	      this.maxUrlsPerMinuteCrawlRate = defaults.maxUrlsPerMinuteCrawlRate;
    	      this.proxyConfiguration = defaults.proxyConfiguration;
    	      this.urlExclusionPatterns = defaults.urlExclusionPatterns;
    	      this.urlInclusionPatterns = defaults.urlInclusionPatterns;
    	      this.urls = defaults.urls;
        }

        public Builder setAuthenticationConfiguration(@Nullable DataSourceWebCrawlerAuthenticationConfiguration authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setCrawlDepth(@Nullable Integer crawlDepth) {
            this.crawlDepth = crawlDepth;
            return this;
        }

        public Builder setMaxContentSizePerPageInMegaBytes(@Nullable Double maxContentSizePerPageInMegaBytes) {
            this.maxContentSizePerPageInMegaBytes = maxContentSizePerPageInMegaBytes;
            return this;
        }

        public Builder setMaxLinksPerPage(@Nullable Integer maxLinksPerPage) {
            this.maxLinksPerPage = maxLinksPerPage;
            return this;
        }

        public Builder setMaxUrlsPerMinuteCrawlRate(@Nullable Integer maxUrlsPerMinuteCrawlRate) {
            this.maxUrlsPerMinuteCrawlRate = maxUrlsPerMinuteCrawlRate;
            return this;
        }

        public Builder setProxyConfiguration(@Nullable DataSourceProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }

        public Builder setUrlExclusionPatterns(@Nullable List<String> urlExclusionPatterns) {
            this.urlExclusionPatterns = urlExclusionPatterns;
            return this;
        }

        public Builder setUrlInclusionPatterns(@Nullable List<String> urlInclusionPatterns) {
            this.urlInclusionPatterns = urlInclusionPatterns;
            return this;
        }

        public Builder setUrls(DataSourceWebCrawlerUrls urls) {
            this.urls = Objects.requireNonNull(urls);
            return this;
        }
        public DataSourceWebCrawlerConfiguration build() {
            return new DataSourceWebCrawlerConfiguration(authenticationConfiguration, crawlDepth, maxContentSizePerPageInMegaBytes, maxLinksPerPage, maxUrlsPerMinuteCrawlRate, proxyConfiguration, urlExclusionPatterns, urlInclusionPatterns, urls);
        }
    }
}
