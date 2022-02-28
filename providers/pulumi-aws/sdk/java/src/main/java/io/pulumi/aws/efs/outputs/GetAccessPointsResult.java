// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAccessPointsResult {
    /**
     * Set of Amazon Resource Names (ARNs).
     * 
     */
    private final List<String> arns;
    private final String fileSystemId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of identifiers.
     * 
     */
    private final List<String> ids;

    @OutputCustomType.Constructor({"arns","fileSystemId","id","ids"})
    private GetAccessPointsResult(
        List<String> arns,
        String fileSystemId,
        String id,
        List<String> ids) {
        this.arns = Objects.requireNonNull(arns);
        this.fileSystemId = Objects.requireNonNull(fileSystemId);
        this.id = Objects.requireNonNull(id);
        this.ids = Objects.requireNonNull(ids);
    }

    /**
     * Set of Amazon Resource Names (ARNs).
     * 
     */
    public List<String> getArns() {
        return this.arns;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Set of identifiers.
     * 
     */
    public List<String> getIds() {
        return this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String fileSystemId;
        private String id;
        private List<String> ids;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
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
        public GetAccessPointsResult build() {
            return new GetAccessPointsResult(arns, fileSystemId, id, ids);
        }
    }
}
