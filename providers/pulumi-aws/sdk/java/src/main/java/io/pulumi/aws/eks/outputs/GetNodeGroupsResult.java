// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetNodeGroupsResult {
    private final String clusterName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A set of all node group names in an EKS Cluster.
     * 
     */
    private final List<String> names;

    @OutputCustomType.Constructor({"clusterName","id","names"})
    private GetNodeGroupsResult(
        String clusterName,
        String id,
        List<String> names) {
        this.clusterName = Objects.requireNonNull(clusterName);
        this.id = Objects.requireNonNull(id);
        this.names = Objects.requireNonNull(names);
    }

    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A set of all node group names in an EKS Cluster.
     * 
     */
    public List<String> getNames() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String id;
        private List<String> names;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
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
        public GetNodeGroupsResult build() {
            return new GetNodeGroupsResult(clusterName, id, names);
        }
    }
}
