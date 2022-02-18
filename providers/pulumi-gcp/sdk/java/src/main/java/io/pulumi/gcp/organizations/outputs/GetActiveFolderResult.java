// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetActiveFolderResult {
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The resource name of the Folder. This uniquely identifies the folder.
     * 
     */
    private final String name;
    private final String parent;

    @OutputCustomType.Constructor({"displayName","id","name","parent"})
    private GetActiveFolderResult(
        String displayName,
        String id,
        String name,
        String parent) {
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.parent = Objects.requireNonNull(parent);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name of the Folder. This uniquely identifies the folder.
     * 
     */
    public String getName() {
        return this.name;
    }
    public String getParent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActiveFolderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String name;
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActiveFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public GetActiveFolderResult build() {
            return new GetActiveFolderResult(displayName, id, name, parent);
        }
    }
}
