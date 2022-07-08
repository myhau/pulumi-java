// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableFieldSchemaPolicyTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableFieldSchemaPolicyTagsArgs Empty = new TableFieldSchemaPolicyTagsArgs();

    /**
     * A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
     * 
     */
    @Import(name="names")
    private @Nullable Output<List<String>> names;

    /**
     * @return A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
     * 
     */
    public Optional<Output<List<String>>> names() {
        return Optional.ofNullable(this.names);
    }

    private TableFieldSchemaPolicyTagsArgs() {}

    private TableFieldSchemaPolicyTagsArgs(TableFieldSchemaPolicyTagsArgs $) {
        this.names = $.names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableFieldSchemaPolicyTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableFieldSchemaPolicyTagsArgs $;

        public Builder() {
            $ = new TableFieldSchemaPolicyTagsArgs();
        }

        public Builder(TableFieldSchemaPolicyTagsArgs defaults) {
            $ = new TableFieldSchemaPolicyTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param names A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
         * 
         * @return builder
         * 
         */
        public Builder names(@Nullable Output<List<String>> names) {
            $.names = names;
            return this;
        }

        /**
         * @param names A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
         * 
         * @return builder
         * 
         */
        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        /**
         * @param names A list of category resource names. For example, &#34;projects/1/location/eu/taxonomies/2/policyTags/3&#34;. At most 1 policy tag is allowed.
         * 
         * @return builder
         * 
         */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        public TableFieldSchemaPolicyTagsArgs build() {
            return $;
        }
    }

}
