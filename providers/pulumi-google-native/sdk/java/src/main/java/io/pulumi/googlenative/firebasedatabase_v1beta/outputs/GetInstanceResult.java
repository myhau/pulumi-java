// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasedatabase_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * Immutable. The globally unique hostname of the database.
     * 
     */
    private final String databaseUrl;
    /**
     * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    private final String name;
    /**
     * The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
     * 
     */
    private final String project;
    /**
     * The database's lifecycle state. Read-only.
     * 
     */
    private final String state;
    /**
     * The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"databaseUrl","name","project","state","type"})
    private GetInstanceResult(
        String databaseUrl,
        String name,
        String project,
        String state,
        String type) {
        this.databaseUrl = databaseUrl;
        this.name = name;
        this.project = project;
        this.state = state;
        this.type = type;
    }

    /**
     * Immutable. The globally unique hostname of the database.
     * 
    */
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }
    /**
     * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource name of the project this instance belongs to. For example: `projects/{project-number}`.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The database's lifecycle state. Read-only.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseUrl;
        private String name;
        private String project;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = Objects.requireNonNull(databaseUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(databaseUrl, name, project, state, type);
        }
    }
}
