// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.aws.ebs.outputs.GetEbsVolumesFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEbsVolumesResult {
    private final @Nullable List<GetEbsVolumesFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A set of all the EBS Volume IDs found. This data source will fail if
     * no volumes match the provided criteria.
     * 
     */
    private final List<String> ids;
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor({"filters","id","ids","tags"})
    private GetEbsVolumesResult(
        @Nullable List<GetEbsVolumesFilter> filters,
        String id,
        List<String> ids,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
    }

    public List<GetEbsVolumesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A set of all the EBS Volume IDs found. This data source will fail if
     * no volumes match the provided criteria.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEbsVolumesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetEbsVolumesFilter> filters;
        private String id;
        private List<String> ids;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEbsVolumesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetEbsVolumesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIds(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetEbsVolumesResult build() {
            return new GetEbsVolumesResult(filters, id, ids, tags);
        }
    }
}
