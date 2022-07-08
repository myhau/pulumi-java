// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1ContentNotebookResponse;
import com.pulumi.googlenative.dataplex.v1.outputs.GoogleCloudDataplexV1ContentSqlScriptResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetContentResult {
    /**
     * @return Content creation time.
     * 
     */
    private final String createTime;
    /**
     * @return Content data in string format.
     * 
     */
    private final String dataText;
    /**
     * @return Optional. Description of the content.
     * 
     */
    private final String description;
    /**
     * @return Optional. User defined labels for the content.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The relative resource name of the content, of the form: projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * 
     */
    private final String name;
    /**
     * @return Notebook related configurations.
     * 
     */
    private final GoogleCloudDataplexV1ContentNotebookResponse notebook;
    /**
     * @return The path for the Content file, represented as directory structure. Unique within a lake. Limited to alphanumerics, hyphens, underscores, dots and slashes.
     * 
     */
    private final String path;
    /**
     * @return Sql Script related configurations.
     * 
     */
    private final GoogleCloudDataplexV1ContentSqlScriptResponse sqlScript;
    /**
     * @return System generated globally unique ID for the content. This ID will be different if the content is deleted and re-created with the same name.
     * 
     */
    private final String uid;
    /**
     * @return The time when the content was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetContentResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dataText") String dataText,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notebook") GoogleCloudDataplexV1ContentNotebookResponse notebook,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("sqlScript") GoogleCloudDataplexV1ContentSqlScriptResponse sqlScript,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.dataText = dataText;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.notebook = notebook;
        this.path = path;
        this.sqlScript = sqlScript;
        this.uid = uid;
        this.updateTime = updateTime;
    }

    /**
     * @return Content creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Content data in string format.
     * 
     */
    public String dataText() {
        return this.dataText;
    }
    /**
     * @return Optional. Description of the content.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. User defined labels for the content.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The relative resource name of the content, of the form: projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Notebook related configurations.
     * 
     */
    public GoogleCloudDataplexV1ContentNotebookResponse notebook() {
        return this.notebook;
    }
    /**
     * @return The path for the Content file, represented as directory structure. Unique within a lake. Limited to alphanumerics, hyphens, underscores, dots and slashes.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Sql Script related configurations.
     * 
     */
    public GoogleCloudDataplexV1ContentSqlScriptResponse sqlScript() {
        return this.sqlScript;
    }
    /**
     * @return System generated globally unique ID for the content. This ID will be different if the content is deleted and re-created with the same name.
     * 
     */
    public String uid() {
        return this.uid;
    }
    /**
     * @return The time when the content was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String dataText;
        private String description;
        private Map<String,String> labels;
        private String name;
        private GoogleCloudDataplexV1ContentNotebookResponse notebook;
        private String path;
        private GoogleCloudDataplexV1ContentSqlScriptResponse sqlScript;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dataText = defaults.dataText;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notebook = defaults.notebook;
    	      this.path = defaults.path;
    	      this.sqlScript = defaults.sqlScript;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dataText(String dataText) {
            this.dataText = Objects.requireNonNull(dataText);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notebook(GoogleCloudDataplexV1ContentNotebookResponse notebook) {
            this.notebook = Objects.requireNonNull(notebook);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder sqlScript(GoogleCloudDataplexV1ContentSqlScriptResponse sqlScript) {
            this.sqlScript = Objects.requireNonNull(sqlScript);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetContentResult build() {
            return new GetContentResult(createTime, dataText, description, labels, name, notebook, path, sqlScript, uid, updateTime);
        }
    }
}
