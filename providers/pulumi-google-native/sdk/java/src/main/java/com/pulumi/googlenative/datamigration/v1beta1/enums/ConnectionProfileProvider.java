// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The database provider.
     * 
     */
    @EnumType
    public enum ConnectionProfileProvider {
        /**
         * The database provider is unknown.
         * 
         */
        DatabaseProviderUnspecified("DATABASE_PROVIDER_UNSPECIFIED"),
        /**
         * CloudSQL runs the database.
         * 
         */
        Cloudsql("CLOUDSQL"),
        /**
         * RDS runs the database.
         * 
         */
        Rds("RDS");

        private final String value;

        ConnectionProfileProvider(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionProfileProvider[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
