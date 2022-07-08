// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.enums.CloudSqlPropertiesType;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs.CloudSqlCredentialArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection properties specific to the Cloud SQL.
 * 
 */
public final class CloudSqlPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudSqlPropertiesArgs Empty = new CloudSqlPropertiesArgs();

    /**
     * Input only. Cloud SQL credential.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CloudSqlCredentialArgs> credential;

    /**
     * @return Input only. Cloud SQL credential.
     * 
     */
    public Optional<Output<CloudSqlCredentialArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Database name.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Database name.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Cloud SQL instance ID in the form `project:location:instance`.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Cloud SQL instance ID in the form `project:location:instance`.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @Import(name="type")
    private @Nullable Output<CloudSqlPropertiesType> type;

    /**
     * @return Type of the Cloud SQL database.
     * 
     */
    public Optional<Output<CloudSqlPropertiesType>> type() {
        return Optional.ofNullable(this.type);
    }

    private CloudSqlPropertiesArgs() {}

    private CloudSqlPropertiesArgs(CloudSqlPropertiesArgs $) {
        this.credential = $.credential;
        this.database = $.database;
        this.instanceId = $.instanceId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlPropertiesArgs $;

        public Builder() {
            $ = new CloudSqlPropertiesArgs();
        }

        public Builder(CloudSqlPropertiesArgs defaults) {
            $ = new CloudSqlPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credential Input only. Cloud SQL credential.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CloudSqlCredentialArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential Input only. Cloud SQL credential.
         * 
         * @return builder
         * 
         */
        public Builder credential(CloudSqlCredentialArgs credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database name.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param instanceId Cloud SQL instance ID in the form `project:location:instance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Cloud SQL instance ID in the form `project:location:instance`.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param type Type of the Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<CloudSqlPropertiesType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the Cloud SQL database.
         * 
         * @return builder
         * 
         */
        public Builder type(CloudSqlPropertiesType type) {
            return type(Output.of(type));
        }

        public CloudSqlPropertiesArgs build() {
            return $;
        }
    }

}
