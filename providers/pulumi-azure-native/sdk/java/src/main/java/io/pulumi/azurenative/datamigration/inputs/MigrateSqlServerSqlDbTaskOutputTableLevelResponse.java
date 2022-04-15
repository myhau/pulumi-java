// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Table level result for Sql Server to Azure Sql DB migration.
 * 
 */
public final class MigrateSqlServerSqlDbTaskOutputTableLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskOutputTableLevelResponse Empty = new MigrateSqlServerSqlDbTaskOutputTableLevelResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String endedOn() {
        return this.endedOn;
    }

    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
     */
    @Import(name="errorPrefix", required=true)
      private final String errorPrefix;

    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Number of successfully completed items
     * 
     */
    @Import(name="itemsCompletedCount", required=true)
      private final Double itemsCompletedCount;

    public Double itemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    /**
     * Number of items
     * 
     */
    @Import(name="itemsCount", required=true)
      private final Double itemsCount;

    public Double itemsCount() {
        return this.itemsCount;
    }

    /**
     * Name of the item
     * 
     */
    @Import(name="objectName", required=true)
      private final String objectName;

    public String objectName() {
        return this.objectName;
    }

    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    @Import(name="resultPrefix", required=true)
      private final String resultPrefix;

    public String resultPrefix() {
        return this.resultPrefix;
    }

    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String resultType() {
        return this.resultType;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String startedOn() {
        return this.startedOn;
    }

    /**
     * Current state of migration
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Status message
     * 
     */
    @Import(name="statusMessage", required=true)
      private final String statusMessage;

    public String statusMessage() {
        return this.statusMessage;
    }

    public MigrateSqlServerSqlDbTaskOutputTableLevelResponse(
        String endedOn,
        String errorPrefix,
        String id,
        Double itemsCompletedCount,
        Double itemsCount,
        String objectName,
        String resultPrefix,
        String resultType,
        String startedOn,
        String state,
        String statusMessage) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.errorPrefix = Objects.requireNonNull(errorPrefix, "expected parameter 'errorPrefix' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount, "expected parameter 'itemsCompletedCount' to be non-null");
        this.itemsCount = Objects.requireNonNull(itemsCount, "expected parameter 'itemsCount' to be non-null");
        this.objectName = Objects.requireNonNull(objectName, "expected parameter 'objectName' to be non-null");
        this.resultPrefix = Objects.requireNonNull(resultPrefix, "expected parameter 'resultPrefix' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskOutputTableLevelResponse() {
        this.endedOn = null;
        this.errorPrefix = null;
        this.id = null;
        this.itemsCompletedCount = null;
        this.itemsCount = null;
        this.objectName = null;
        this.resultPrefix = null;
        this.resultType = null;
        this.startedOn = null;
        this.state = null;
        this.statusMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private String id;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String objectName;
        private String resultPrefix;
        private String resultType;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.id = defaults.id;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.objectName = defaults.objectName;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder errorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder itemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }
        public Builder itemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }
        public Builder objectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }
        public Builder resultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }        public MigrateSqlServerSqlDbTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputTableLevelResponse(endedOn, errorPrefix, id, itemsCompletedCount, itemsCount, objectName, resultPrefix, resultType, startedOn, state, statusMessage);
        }
    }
}
