// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFoldersFolder {
    /**
     * The timestamp of when the folder was created
     * 
     */
    private final String createTime;
    /**
     * The timestamp of when the folder was requested to be deleted (if applicable)
     * 
     */
    private final String deleteTime;
    /**
     * The display name of the folder
     * 
     */
    private final String displayName;
    /**
     * Entity tag identifier of the folder
     * 
     */
    private final String etag;
    /**
     * The id of the folder
     * 
     */
    private final String name;
    /**
     * The parent id of the folder
     * 
     */
    private final String parent;
    /**
     * The lifecycle state of the folder
     * 
     */
    private final String state;
    /**
     * The timestamp of when the folder was last modified
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","deleteTime","displayName","etag","name","parent","state","updateTime"})
    private GetFoldersFolder(
        String createTime,
        String deleteTime,
        String displayName,
        String etag,
        String name,
        String parent,
        String state,
        String updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.etag = etag;
        this.name = name;
        this.parent = parent;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * The timestamp of when the folder was created
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The timestamp of when the folder was requested to be deleted (if applicable)
     * 
    */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The display name of the folder
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Entity tag identifier of the folder
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The id of the folder
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parent id of the folder
     * 
    */
    public String getParent() {
        return this.parent;
    }
    /**
     * The lifecycle state of the folder
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The timestamp of when the folder was last modified
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private String name;
        private String parent;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFoldersFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetFoldersFolder build() {
            return new GetFoldersFolder(createTime, deleteTime, displayName, etag, name, parent, state, updateTime);
        }
    }
}
