// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DockerImagePlatformResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DockerBuildResponse {
    /**
     * Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * <seealso href="https://docs.docker.com/engine/context/working-with-contexts/" />
     * 
     */
    private final @Nullable String context;
    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is 'Build'.
     * 
     */
    private final String dockerSpecificationType;
    /**
     * Docker command line instructions to assemble an image.
     * <seealso href="https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments" />
     * 
     */
    private final String dockerfile;
    /**
     * The platform information of the docker image.
     * 
     */
    private final @Nullable DockerImagePlatformResponse platform;

    @CustomType.Constructor
    private DockerBuildResponse(
        @CustomType.Parameter("context") @Nullable String context,
        @CustomType.Parameter("dockerSpecificationType") String dockerSpecificationType,
        @CustomType.Parameter("dockerfile") String dockerfile,
        @CustomType.Parameter("platform") @Nullable DockerImagePlatformResponse platform) {
        this.context = context;
        this.dockerSpecificationType = dockerSpecificationType;
        this.dockerfile = dockerfile;
        this.platform = platform;
    }

    /**
     * Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * <seealso href="https://docs.docker.com/engine/context/working-with-contexts/" />
     * 
    */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is 'Build'.
     * 
    */
    public String dockerSpecificationType() {
        return this.dockerSpecificationType;
    }
    /**
     * Docker command line instructions to assemble an image.
     * <seealso href="https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments" />
     * 
    */
    public String dockerfile() {
        return this.dockerfile;
    }
    /**
     * The platform information of the docker image.
     * 
    */
    public Optional<DockerImagePlatformResponse> platform() {
        return Optional.ofNullable(this.platform);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private String dockerSpecificationType;
        private String dockerfile;
        private @Nullable DockerImagePlatformResponse platform;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.dockerSpecificationType = defaults.dockerSpecificationType;
    	      this.dockerfile = defaults.dockerfile;
    	      this.platform = defaults.platform;
        }

        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        public Builder dockerSpecificationType(String dockerSpecificationType) {
            this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType);
            return this;
        }
        public Builder dockerfile(String dockerfile) {
            this.dockerfile = Objects.requireNonNull(dockerfile);
            return this;
        }
        public Builder platform(@Nullable DockerImagePlatformResponse platform) {
            this.platform = platform;
            return this;
        }        public DockerBuildResponse build() {
            return new DockerBuildResponse(context, dockerSpecificationType, dockerfile, platform);
        }
    }
}
