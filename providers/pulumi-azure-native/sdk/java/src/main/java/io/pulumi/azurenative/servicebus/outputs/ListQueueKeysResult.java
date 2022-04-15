// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListQueueKeysResult {
    /**
     * Primary connection string of the alias if GEO DR is enabled
     * 
     */
    private final String aliasPrimaryConnectionString;
    /**
     * Secondary  connection string of the alias if GEO DR is enabled
     * 
     */
    private final String aliasSecondaryConnectionString;
    /**
     * A string that describes the authorization rule.
     * 
     */
    private final String keyName;
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
     */
    private final String primaryConnectionString;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String primaryKey;
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
     */
    private final String secondaryConnectionString;
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private ListQueueKeysResult(
        @CustomType.Parameter("aliasPrimaryConnectionString") String aliasPrimaryConnectionString,
        @CustomType.Parameter("aliasSecondaryConnectionString") String aliasSecondaryConnectionString,
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("primaryConnectionString") String primaryConnectionString,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("secondaryConnectionString") String secondaryConnectionString,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.aliasPrimaryConnectionString = aliasPrimaryConnectionString;
        this.aliasSecondaryConnectionString = aliasSecondaryConnectionString;
        this.keyName = keyName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
    }

    /**
     * Primary connection string of the alias if GEO DR is enabled
     * 
    */
    public String aliasPrimaryConnectionString() {
        return this.aliasPrimaryConnectionString;
    }
    /**
     * Secondary  connection string of the alias if GEO DR is enabled
     * 
    */
    public String aliasSecondaryConnectionString() {
        return this.aliasSecondaryConnectionString;
    }
    /**
     * A string that describes the authorization rule.
     * 
    */
    public String keyName() {
        return this.keyName;
    }
    /**
     * Primary connection string of the created namespace authorization rule.
     * 
    */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String primaryKey() {
        return this.primaryKey;
    }
    /**
     * Secondary connection string of the created namespace authorization rule.
     * 
    */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * A base64-encoded 256-bit primary key for signing and validating the SAS token.
     * 
    */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListQueueKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasPrimaryConnectionString;
        private String aliasSecondaryConnectionString;
        private String keyName;
        private String primaryConnectionString;
        private String primaryKey;
        private String secondaryConnectionString;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListQueueKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasPrimaryConnectionString = defaults.aliasPrimaryConnectionString;
    	      this.aliasSecondaryConnectionString = defaults.aliasSecondaryConnectionString;
    	      this.keyName = defaults.keyName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder aliasPrimaryConnectionString(String aliasPrimaryConnectionString) {
            this.aliasPrimaryConnectionString = Objects.requireNonNull(aliasPrimaryConnectionString);
            return this;
        }
        public Builder aliasSecondaryConnectionString(String aliasSecondaryConnectionString) {
            this.aliasSecondaryConnectionString = Objects.requireNonNull(aliasSecondaryConnectionString);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder primaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }        public ListQueueKeysResult build() {
            return new ListQueueKeysResult(aliasPrimaryConnectionString, aliasSecondaryConnectionString, keyName, primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
