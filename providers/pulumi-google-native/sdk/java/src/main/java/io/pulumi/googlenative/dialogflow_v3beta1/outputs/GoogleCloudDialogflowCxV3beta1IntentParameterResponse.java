// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1IntentParameterResponse {
    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    private final String entityType;
    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    private final Boolean isList;
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    private final Boolean redact;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1IntentParameterResponse(
        @OutputCustomType.Parameter("entityType") String entityType,
        @OutputCustomType.Parameter("isList") Boolean isList,
        @OutputCustomType.Parameter("redact") Boolean redact) {
        this.entityType = entityType;
        this.isList = isList;
        this.redact = redact;
    }

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
    */
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * Indicates whether the parameter represents a list of values.
     * 
    */
    public Boolean getIsList() {
        return this.isList;
    }
    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
    */
    public Boolean getRedact() {
        return this.redact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1IntentParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private Boolean isList;
        private Boolean redact;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1IntentParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setIsList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }

        public Builder setRedact(Boolean redact) {
            this.redact = Objects.requireNonNull(redact);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1IntentParameterResponse build() {
            return new GoogleCloudDialogflowCxV3beta1IntentParameterResponse(entityType, isList, redact);
        }
    }
}
