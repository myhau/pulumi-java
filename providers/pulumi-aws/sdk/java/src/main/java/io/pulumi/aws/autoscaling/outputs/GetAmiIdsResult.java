// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.GetAmiIdsFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAmiIdsResult {
    /**
     * A list of the Autoscaling Groups Arns in the current region.
     * 
     */
    private final List<String> arns;
    private final @Nullable List<GetAmiIdsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of the Autoscaling Groups in the current region.
     * 
     */
    private final List<String> names;

    @OutputCustomType.Constructor({"arns","filters","id","names"})
    private GetAmiIdsResult(
        List<String> arns,
        @Nullable List<GetAmiIdsFilter> filters,
        String id,
        List<String> names) {
        this.arns = Objects.requireNonNull(arns);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.names = Objects.requireNonNull(names);
    }

    /**
     * A list of the Autoscaling Groups Arns in the current region.
     * 
     */
    public List<String> getArns() {
        return this.arns;
    }
    public List<GetAmiIdsFilter> getFilters() {
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
     * A list of the Autoscaling Groups in the current region.
     * 
     */
    public List<String> getNames() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetAmiIdsFilter> filters;
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setFilters(@Nullable List<GetAmiIdsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public GetAmiIdsResult build() {
            return new GetAmiIdsResult(arns, filters, id, names);
        }
    }
}
