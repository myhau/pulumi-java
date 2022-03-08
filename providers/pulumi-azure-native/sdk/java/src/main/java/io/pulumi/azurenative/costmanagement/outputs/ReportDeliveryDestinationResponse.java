// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReportDeliveryDestinationResponse {
    /**
     * The name of the container where reports will be uploaded.
     * 
     */
    private final String container;
    /**
     * The resource id of the storage account where reports will be delivered.
     * 
     */
    private final String resourceId;
    /**
     * The name of the directory where reports will be uploaded.
     * 
     */
    private final @Nullable String rootFolderPath;

    @OutputCustomType.Constructor({"container","resourceId","rootFolderPath"})
    private ReportDeliveryDestinationResponse(
        String container,
        String resourceId,
        @Nullable String rootFolderPath) {
        this.container = container;
        this.resourceId = resourceId;
        this.rootFolderPath = rootFolderPath;
    }

    /**
     * The name of the container where reports will be uploaded.
     * 
    */
    public String getContainer() {
        return this.container;
    }
    /**
     * The resource id of the storage account where reports will be delivered.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The name of the directory where reports will be uploaded.
     * 
    */
    public Optional<String> getRootFolderPath() {
        return Optional.ofNullable(this.rootFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String resourceId;
        private @Nullable String rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }
        public ReportDeliveryDestinationResponse build() {
            return new ReportDeliveryDestinationResponse(container, resourceId, rootFolderPath);
        }
    }
}
