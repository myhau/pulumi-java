// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentState extends io.pulumi.resources.ResourceArgs {

    public static final DocumentState Empty = new DocumentState();

    /**
     * The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    @InputImport(name="collection")
    private final @Nullable Input<String> collection;

    public Input<String> getCollection() {
        return this.collection == null ? Input.empty() : this.collection;
    }

    /**
     * Creation timestamp in RFC3339 format.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The Firestore database id. Defaults to `"(default)"`.
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * The client-assigned document ID to use for this document during creation.
     * 
     */
    @InputImport(name="documentId")
    private final @Nullable Input<String> documentId;

    public Input<String> getDocumentId() {
        return this.documentId == null ? Input.empty() : this.documentId;
    }

    /**
     * The document's [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    @InputImport(name="fields")
    private final @Nullable Input<String> fields;

    public Input<String> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * A server defined name for this index. Format:
     * 'projects/{{project_id}}/databases/{{database_id}}/documents/{{path}}/{{document_id}}'
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A relative path to the collection this document exists within
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Last update timestamp in RFC3339 format.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public DocumentState(
        @Nullable Input<String> collection,
        @Nullable Input<String> createTime,
        @Nullable Input<String> database,
        @Nullable Input<String> documentId,
        @Nullable Input<String> fields,
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<String> project,
        @Nullable Input<String> updateTime) {
        this.collection = collection;
        this.createTime = createTime;
        this.database = database;
        this.documentId = documentId;
        this.fields = fields;
        this.name = name;
        this.path = path;
        this.project = project;
        this.updateTime = updateTime;
    }

    private DocumentState() {
        this.collection = Input.empty();
        this.createTime = Input.empty();
        this.database = Input.empty();
        this.documentId = Input.empty();
        this.fields = Input.empty();
        this.name = Input.empty();
        this.path = Input.empty();
        this.project = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collection;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> database;
        private @Nullable Input<String> documentId;
        private @Nullable Input<String> fields;
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<String> project;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.createTime = defaults.createTime;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.project = defaults.project;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCollection(@Nullable Input<String> collection) {
            this.collection = collection;
            return this;
        }

        public Builder setCollection(@Nullable String collection) {
            this.collection = Input.ofNullable(collection);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDatabase(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder setDocumentId(@Nullable Input<String> documentId) {
            this.documentId = documentId;
            return this;
        }

        public Builder setDocumentId(@Nullable String documentId) {
            this.documentId = Input.ofNullable(documentId);
            return this;
        }

        public Builder setFields(@Nullable Input<String> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable String fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public DocumentState build() {
            return new DocumentState(collection, createTime, database, documentId, fields, name, path, project, updateTime);
        }
    }
}
