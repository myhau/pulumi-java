// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of Cloud SQL instance that is used by the Apache Airflow software.
 * 
 */
public final class DatabaseConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseConfigArgs Empty = new DatabaseConfigArgs();

    /**
     * Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    private DatabaseConfigArgs() {}

    private DatabaseConfigArgs(DatabaseConfigArgs $) {
        this.machineType = $.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseConfigArgs $;

        public Builder() {
            $ = new DatabaseConfigArgs();
        }

        public Builder(DatabaseConfigArgs defaults) {
            $ = new DatabaseConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param machineType Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public DatabaseConfigArgs build() {
            return $;
        }
    }

}
