// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.azurenative.storagesync.outputs.FilesNotTieringErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CloudTieringFilesNotTieringResponse {
    /**
     * Array of tiering errors
     * 
     */
    private final List<FilesNotTieringErrorResponse> errors;
    /**
     * Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;
    /**
     * Last cloud tiering result (HResult)
     * 
     */
    private final Double totalFileCount;

    @CustomType.Constructor
    private CloudTieringFilesNotTieringResponse(
        @CustomType.Parameter("errors") List<FilesNotTieringErrorResponse> errors,
        @CustomType.Parameter("lastUpdatedTimestamp") String lastUpdatedTimestamp,
        @CustomType.Parameter("totalFileCount") Double totalFileCount) {
        this.errors = errors;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.totalFileCount = totalFileCount;
    }

    /**
     * Array of tiering errors
     * 
    */
    public List<FilesNotTieringErrorResponse> errors() {
        return this.errors;
    }
    /**
     * Last updated timestamp
     * 
    */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * Last cloud tiering result (HResult)
     * 
    */
    public Double totalFileCount() {
        return this.totalFileCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringFilesNotTieringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilesNotTieringErrorResponse> errors;
        private String lastUpdatedTimestamp;
        private Double totalFileCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringFilesNotTieringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
    	      this.totalFileCount = defaults.totalFileCount;
        }

        public Builder errors(List<FilesNotTieringErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(FilesNotTieringErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }
        public Builder totalFileCount(Double totalFileCount) {
            this.totalFileCount = Objects.requireNonNull(totalFileCount);
            return this;
        }        public CloudTieringFilesNotTieringResponse build() {
            return new CloudTieringFilesNotTieringResponse(errors, lastUpdatedTimestamp, totalFileCount);
        }
    }
}
