// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.CompositeTypeLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.TemplateContentsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCompositeTypeResult {
    private final String description;
    private final String insertTime;
    private final List<CompositeTypeLabelEntryResponse> labels;
    private final String name;
    private final OperationResponse operation;
    private final String selfLink;
    private final String status;
    private final TemplateContentsResponse templateContents;

    @OutputCustomType.Constructor({"description","insertTime","labels","name","operation","selfLink","status","templateContents"})
    private GetCompositeTypeResult(
        String description,
        String insertTime,
        List<CompositeTypeLabelEntryResponse> labels,
        String name,
        OperationResponse operation,
        String selfLink,
        String status,
        TemplateContentsResponse templateContents) {
        this.description = Objects.requireNonNull(description);
        this.insertTime = Objects.requireNonNull(insertTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.operation = Objects.requireNonNull(operation);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.status = Objects.requireNonNull(status);
        this.templateContents = Objects.requireNonNull(templateContents);
    }

    public String getDescription() {
        return this.description;
    }
    public String getInsertTime() {
        return this.insertTime;
    }
    public List<CompositeTypeLabelEntryResponse> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public OperationResponse getOperation() {
        return this.operation;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getStatus() {
        return this.status;
    }
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