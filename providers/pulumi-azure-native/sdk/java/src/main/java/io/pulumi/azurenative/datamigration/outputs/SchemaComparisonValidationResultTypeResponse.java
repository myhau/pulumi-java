// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SchemaComparisonValidationResultTypeResponse {
    /**
     * Name of the object that has the difference
     * 
     */
    private final String objectName;
    /**
     * Type of the object that has the difference. e.g (Table/View/StoredProcedure)
     * 
     */
    private final String objectType;
    /**
     * Update action type with respect to target
     * 
     */
    private final String updateAction;

    @CustomType.Constructor
    private SchemaComparisonValidationResultTypeResponse(
        @CustomType.Parameter("objectName") String objectName,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("updateAction") String updateAction) {
        this.objectName = objectName;
        this.objectType = objectType;
        this.updateAction = updateAction;
    }

    /**
     * Name of the object that has the difference
     * 
    */
    public String objectName() {
        return this.objectName;
    }
    /**
     * Type of the object that has the difference. e.g (Table/View/StoredProcedure)
     * 
    */
    public String objectType() {
        return this.objectType;
    }
    /**
     * Update action type with respect to target
     * 
    */
    public String updateAction() {
        return this.updateAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaComparisonValidationResultTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectName;
        private String objectType;
        private String updateAction;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaComparisonValidationResultTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectName = defaults.objectName;
    	      this.objectType = defaults.objectType;
    	      this.updateAction = defaults.updateAction;
        }

        public Builder objectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder updateAction(String updateAction) {
            this.updateAction = Objects.requireNonNull(updateAction);
            return this;
        }        public SchemaComparisonValidationResultTypeResponse build() {
            return new SchemaComparisonValidationResultTypeResponse(objectName, objectType, updateAction);
        }
    }
}
