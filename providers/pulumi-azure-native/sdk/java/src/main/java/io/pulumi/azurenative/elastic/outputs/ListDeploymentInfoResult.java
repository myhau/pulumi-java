// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListDeploymentInfoResult {
    /**
     * Disk capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String diskCapacity;
    /**
     * RAM capacity of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String memoryCapacity;
    /**
     * The Elastic deployment status.
     * 
     */
    private final String status;
    /**
     * Version of the elasticsearch in Elastic cloud deployment.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private ListDeploymentInfoResult(
        @CustomType.Parameter("diskCapacity") String diskCapacity,
        @CustomType.Parameter("memoryCapacity") String memoryCapacity,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("version") String version) {
        this.diskCapacity = diskCapacity;
        this.memoryCapacity = memoryCapacity;
        this.status = status;
        this.version = version;
    }

    /**
     * Disk capacity of the elasticsearch in Elastic cloud deployment.
     * 
    */
    public String diskCapacity() {
        return this.diskCapacity;
    }
    /**
     * RAM capacity of the elasticsearch in Elastic cloud deployment.
     * 
    */
    public String memoryCapacity() {
        return this.memoryCapacity;
    }
    /**
     * The Elastic deployment status.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Version of the elasticsearch in Elastic cloud deployment.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeploymentInfoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskCapacity;
        private String memoryCapacity;
        private String status;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeploymentInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCapacity = defaults.diskCapacity;
    	      this.memoryCapacity = defaults.memoryCapacity;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder diskCapacity(String diskCapacity) {
            this.diskCapacity = Objects.requireNonNull(diskCapacity);
            return this;
        }
        public Builder memoryCapacity(String memoryCapacity) {
            this.memoryCapacity = Objects.requireNonNull(memoryCapacity);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ListDeploymentInfoResult build() {
            return new ListDeploymentInfoResult(diskCapacity, memoryCapacity, status, version);
        }
    }
}
