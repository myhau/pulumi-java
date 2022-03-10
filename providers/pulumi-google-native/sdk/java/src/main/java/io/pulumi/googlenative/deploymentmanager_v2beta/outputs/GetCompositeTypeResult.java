// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CompositeTypeLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.TemplateContentsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCompositeTypeResult {
    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    private final String description;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String insertTime;
    /**
     * Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    private final List<CompositeTypeLabelEntryResponse> labels;
    /**
     * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
     */
    private final String name;
    /**
     * The Operation that most recently ran, or is currently running, on this composite type.
     * 
     */
    private final OperationResponse operation;
    /**
     * Server defined URL for the resource.
     * 
     */
    private final String selfLink;
    private final String status;
    /**
     * Files for the template type.
     * 
     */
    private final TemplateContentsResponse templateContents;

    @OutputCustomType.Constructor
    private GetCompositeTypeResult(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("insertTime") String insertTime,
        @OutputCustomType.Parameter("labels") List<CompositeTypeLabelEntryResponse> labels,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("operation") OperationResponse operation,
        @OutputCustomType.Parameter("selfLink") String selfLink,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("templateContents") TemplateContentsResponse templateContents) {
        this.description = description;
        this.insertTime = insertTime;
        this.labels = labels;
        this.name = name;
        this.operation = operation;
        this.selfLink = selfLink;
        this.status = status;
        this.templateContents = templateContents;
    }

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getInsertTime() {
        return this.insertTime;
    }
    /**
     * Map of labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
    */
    public List<CompositeTypeLabelEntryResponse> getLabels() {
        return this.labels;
    }
    /**
     * Name of the composite type, must follow the expression: `[a-z]([-a-z0-9_.]{0,61}[a-z0-9])?`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Operation that most recently ran, or is currently running, on this composite type.
     * 
    */
    public OperationResponse getOperation() {
        return this.operation;
    }
    /**
     * Server defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getStatus() {
        return this.status;
    }
    /**
     * Files for the template type.
     * 
    */
    public TemplateContentsResponse getTemplateContents() {
        return this.templateContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompositeTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String insertTime;
        private List<CompositeTypeLabelEntryResponse> labels;
        private String name;
        private OperationResponse operation;
        private String selfLink;
        private String status;
        private TemplateContentsResponse templateContents;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompositeTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.insertTime = defaults.insertTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.templateContents = defaults.templateContents;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setInsertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder setLabels(List<CompositeTypeLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(OperationResponse operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTemplateContents(TemplateContentsResponse templateContents) {
            this.templateContents = Objects.requireNonNull(templateContents);
            return this;
        }
        public GetCompositeTypeResult build() {
            return new GetCompositeTypeResult(description, insertTime, labels, name, operation, selfLink, status, templateContents);
        }
    }
}
