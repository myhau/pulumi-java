// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.SearchParameterArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the configuration for FHIR search.
 * 
 */
public final class SearchConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchConfigArgs Empty = new SearchConfigArgs();

    /**
     * A list of search parameters in this FHIR store that are used to configure this FHIR store.
     * 
     */
    @Import(name="searchParameters")
    private @Nullable Output<List<SearchParameterArgs>> searchParameters;

    /**
     * @return A list of search parameters in this FHIR store that are used to configure this FHIR store.
     * 
     */
    public Optional<Output<List<SearchParameterArgs>>> searchParameters() {
        return Optional.ofNullable(this.searchParameters);
    }

    private SearchConfigArgs() {}

    private SearchConfigArgs(SearchConfigArgs $) {
        this.searchParameters = $.searchParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchConfigArgs $;

        public Builder() {
            $ = new SearchConfigArgs();
        }

        public Builder(SearchConfigArgs defaults) {
            $ = new SearchConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param searchParameters A list of search parameters in this FHIR store that are used to configure this FHIR store.
         * 
         * @return builder
         * 
         */
        public Builder searchParameters(@Nullable Output<List<SearchParameterArgs>> searchParameters) {
            $.searchParameters = searchParameters;
            return this;
        }

        /**
         * @param searchParameters A list of search parameters in this FHIR store that are used to configure this FHIR store.
         * 
         * @return builder
         * 
         */
        public Builder searchParameters(List<SearchParameterArgs> searchParameters) {
            return searchParameters(Output.of(searchParameters));
        }

        /**
         * @param searchParameters A list of search parameters in this FHIR store that are used to configure this FHIR store.
         * 
         * @return builder
         * 
         */
        public Builder searchParameters(SearchParameterArgs... searchParameters) {
            return searchParameters(List.of(searchParameters));
        }

        public SearchConfigArgs build() {
            return $;
        }
    }

}
