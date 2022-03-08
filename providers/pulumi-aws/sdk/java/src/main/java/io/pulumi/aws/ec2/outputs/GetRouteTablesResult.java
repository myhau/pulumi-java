// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetRouteTablesFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteTablesResult {
    private final @Nullable List<GetRouteTablesFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A set of all the route table ids found. This data source will fail if none are found.
     * 
     */
    private final List<String> ids;
    private final Map<String,String> tags;
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor({"filters","id","ids","tags","vpcId"})
    private GetRouteTablesResult(
        @Nullable List<GetRouteTablesFilter> filters,
        String id,
        List<String> ids,
        Map<String,String> tags,
        @Nullable String vpcId) {
        this.filters = filters;
        this.id = id;
        this.ids = ids;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    public List<GetRouteTablesFilter> getFilters() {
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
     * A set of all the route table ids found. This data source will fail if none are found.
     * 
    */
    public List<String> getIds() {
        return this.ids;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTablesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetRouteTablesFilter> filters;
        private String id;
        private List<String> ids;
        private Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTablesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setFilters(@Nullable List<GetRouteTablesFilter> filters) {
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

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetRouteTablesResult build() {
            return new GetRouteTablesResult(filters, id, ids, tags, vpcId);
        }
    }
}
