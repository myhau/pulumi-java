// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DockerImagePlatformResponse extends io.pulumi.resources.InvokeArgs {

    public static final DockerImagePlatformResponse Empty = new DockerImagePlatformResponse();

    /**
     * The OS type the Environment.
     * 
     */
    @Import(name="operatingSystemType")
      private final @Nullable String operatingSystemType;

    public Optional<String> operatingSystemType() {
        return this.operatingSystemType == null ? Optional.empty() : Optional.ofNullable(this.operatingSystemType);
    }

    public DockerImagePlatformResponse(@Nullable String operatingSystemType) {
        this.operatingSystemType = operatingSystemType;
    }

    private DockerImagePlatformResponse() {
        this.operatingSystemType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerImagePlatformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operatingSystemType;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerImagePlatformResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatingSystemType = defaults.operatingSystemType;
        }

        public Builder operatingSystemType(@Nullable String operatingSystemType) {
            this.operatingSystemType = operatingSystemType;
            return this;
        }        public DockerImagePlatformResponse build() {
            return new DockerImagePlatformResponse(operatingSystemType);
        }
    }
}
