// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasedatabase.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firebasedatabase.v1beta.enums.InstanceType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The globally unique identifier of the database instance.
     * 
     */
    @Import(name="databaseId")
    private @Nullable Output<String> databaseId;

    /**
     * @return The globally unique identifier of the database instance.
     * 
     */
    public Optional<Output<String>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    @Import(name="type")
    private @Nullable Output<InstanceType> type;

    /**
     * @return Immutable. The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
     * 
     */
    public Optional<Output<InstanceType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * When set to true, the request will be validated but not submitted.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    /**
     * @return When set to true, the request will be validated but not submitted.
     * 
     */
    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.databaseId = $.databaseId;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.type = $.type;
        this.validateOnly = $.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseId The globally unique identifier of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(@Nullable Output<String> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The globally unique identifier of the database instance.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(String databaseId) {
            return databaseId(Output.of(databaseId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The fully qualified resource name of the database instance, in the form: `projects/{project-number}/locations/{location-id}/instances/{database-id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type Immutable. The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<InstanceType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Immutable. The database instance type. On creation only USER_DATABASE is allowed, which is also the default when omitted.
         * 
         * @return builder
         * 
         */
        public Builder type(InstanceType type) {
            return type(Output.of(type));
        }

        /**
         * @param validateOnly When set to true, the request will be validated but not submitted.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly When set to true, the request will be validated but not submitted.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public InstanceArgs build() {
            return $;
        }
    }

}
