// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.retail.v2beta.inputs.GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A facet specification to perform faceted search.
 * 
 */
public final class GoogleCloudRetailV2betaSearchRequestFacetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaSearchRequestFacetSpecArgs Empty = new GoogleCloudRetailV2betaSearchRequestFacetSpecArgs();

    /**
     * Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
     */
    @Import(name="enableDynamicPosition")
    private @Nullable Output<Boolean> enableDynamicPosition;

    /**
     * @return Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
     */
    public Optional<Output<Boolean>> enableDynamicPosition() {
        return Optional.ofNullable(this.enableDynamicPosition);
    }

    /**
     * List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. Listing a facet key in this field allows its values to appear as facet results, even when they are filtered out of search results. Using this field does not affect what search results are returned. For example, suppose there are 100 products with the color facet &#34;Red&#34; and 200 products with the color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and having &#34;colorFamilies&#34; as FacetKey.key would by default return only &#34;Red&#34; products in the search results, and also return &#34;Red&#34; with count 100 as the only color facet. Although there are also blue products available, &#34;Blue&#34; would not be shown as an available facet value. If &#34;colorFamilies&#34; is listed in &#34;excludedFilterKeys&#34;, then the query returns the facet values &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. Because this field doesn&#39;t affect search results, the search results are still correctly filtered to return only &#34;Red&#34; products. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="excludedFilterKeys")
    private @Nullable Output<List<String>> excludedFilterKeys;

    /**
     * @return List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. Listing a facet key in this field allows its values to appear as facet results, even when they are filtered out of search results. Using this field does not affect what search results are returned. For example, suppose there are 100 products with the color facet &#34;Red&#34; and 200 products with the color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and having &#34;colorFamilies&#34; as FacetKey.key would by default return only &#34;Red&#34; products in the search results, and also return &#34;Red&#34; with count 100 as the only color facet. Although there are also blue products available, &#34;Blue&#34; would not be shown as an available facet value. If &#34;colorFamilies&#34; is listed in &#34;excludedFilterKeys&#34;, then the query returns the facet values &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. Because this field doesn&#39;t affect search results, the search results are still correctly filtered to return only &#34;Red&#34; products. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Optional<Output<List<String>>> excludedFilterKeys() {
        return Optional.ofNullable(this.excludedFilterKeys);
    }

    /**
     * The facet key specification.
     * 
     */
    @Import(name="facetKey", required=true)
    private Output<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey;

    /**
     * @return The facet key specification.
     * 
     */
    public Output<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey() {
        return this.facetKey;
    }

    /**
     * Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
     */
    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    /**
     * @return Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
     */
    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private GoogleCloudRetailV2betaSearchRequestFacetSpecArgs() {}

    private GoogleCloudRetailV2betaSearchRequestFacetSpecArgs(GoogleCloudRetailV2betaSearchRequestFacetSpecArgs $) {
        this.enableDynamicPosition = $.enableDynamicPosition;
        this.excludedFilterKeys = $.excludedFilterKeys;
        this.facetKey = $.facetKey;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaSearchRequestFacetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaSearchRequestFacetSpecArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaSearchRequestFacetSpecArgs();
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestFacetSpecArgs defaults) {
            $ = new GoogleCloudRetailV2betaSearchRequestFacetSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDynamicPosition Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamicPosition(@Nullable Output<Boolean> enableDynamicPosition) {
            $.enableDynamicPosition = enableDynamicPosition;
            return this;
        }

        /**
         * @param enableDynamicPosition Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it&#39;s not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * &#34;rating&#34;, enable_dynamic_position = true * &#34;price&#34;, enable_dynamic_position = false * &#34;brands&#34;, enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet &#39;gender&#39;. Then the final order of the facets in the response can be (&#34;price&#34;, &#34;brands&#34;, &#34;rating&#34;, &#34;gender&#34;) or (&#34;price&#34;, &#34;brands&#34;, &#34;gender&#34;, &#34;rating&#34;) depends on how Google Retail Search orders &#34;gender&#34; and &#34;rating&#34; facets. However, notice that &#34;price&#34; and &#34;brands&#34; will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamicPosition(Boolean enableDynamicPosition) {
            return enableDynamicPosition(Output.of(enableDynamicPosition));
        }

        /**
         * @param excludedFilterKeys List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. Listing a facet key in this field allows its values to appear as facet results, even when they are filtered out of search results. Using this field does not affect what search results are returned. For example, suppose there are 100 products with the color facet &#34;Red&#34; and 200 products with the color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and having &#34;colorFamilies&#34; as FacetKey.key would by default return only &#34;Red&#34; products in the search results, and also return &#34;Red&#34; with count 100 as the only color facet. Although there are also blue products available, &#34;Blue&#34; would not be shown as an available facet value. If &#34;colorFamilies&#34; is listed in &#34;excludedFilterKeys&#34;, then the query returns the facet values &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. Because this field doesn&#39;t affect search results, the search results are still correctly filtered to return only &#34;Red&#34; products. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder excludedFilterKeys(@Nullable Output<List<String>> excludedFilterKeys) {
            $.excludedFilterKeys = excludedFilterKeys;
            return this;
        }

        /**
         * @param excludedFilterKeys List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. Listing a facet key in this field allows its values to appear as facet results, even when they are filtered out of search results. Using this field does not affect what search results are returned. For example, suppose there are 100 products with the color facet &#34;Red&#34; and 200 products with the color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and having &#34;colorFamilies&#34; as FacetKey.key would by default return only &#34;Red&#34; products in the search results, and also return &#34;Red&#34; with count 100 as the only color facet. Although there are also blue products available, &#34;Blue&#34; would not be shown as an available facet value. If &#34;colorFamilies&#34; is listed in &#34;excludedFilterKeys&#34;, then the query returns the facet values &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. Because this field doesn&#39;t affect search results, the search results are still correctly filtered to return only &#34;Red&#34; products. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder excludedFilterKeys(List<String> excludedFilterKeys) {
            return excludedFilterKeys(Output.of(excludedFilterKeys));
        }

        /**
         * @param excludedFilterKeys List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. Listing a facet key in this field allows its values to appear as facet results, even when they are filtered out of search results. Using this field does not affect what search results are returned. For example, suppose there are 100 products with the color facet &#34;Red&#34; and 200 products with the color facet &#34;Blue&#34;. A query containing the filter &#34;colorFamilies:ANY(&#34;Red&#34;)&#34; and having &#34;colorFamilies&#34; as FacetKey.key would by default return only &#34;Red&#34; products in the search results, and also return &#34;Red&#34; with count 100 as the only color facet. Although there are also blue products available, &#34;Blue&#34; would not be shown as an available facet value. If &#34;colorFamilies&#34; is listed in &#34;excludedFilterKeys&#34;, then the query returns the facet values &#34;Red&#34; with count 100 and &#34;Blue&#34; with count 200, because the &#34;colorFamilies&#34; key is now excluded from the filter. Because this field doesn&#39;t affect search results, the search results are still correctly filtered to return only &#34;Red&#34; products. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder excludedFilterKeys(String... excludedFilterKeys) {
            return excludedFilterKeys(List.of(excludedFilterKeys));
        }

        /**
         * @param facetKey The facet key specification.
         * 
         * @return builder
         * 
         */
        public Builder facetKey(Output<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey) {
            $.facetKey = facetKey;
            return this;
        }

        /**
         * @param facetKey The facet key specification.
         * 
         * @return builder
         * 
         */
        public Builder facetKey(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs facetKey) {
            return facetKey(Output.of(facetKey));
        }

        /**
         * @param limit Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
         * 
         * @return builder
         * 
         */
        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        /**
         * @param limit Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
         * 
         * @return builder
         * 
         */
        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public GoogleCloudRetailV2betaSearchRequestFacetSpecArgs build() {
            $.facetKey = Objects.requireNonNull($.facetKey, "expected parameter 'facetKey' to be non-null");
            return $;
        }
    }

}
