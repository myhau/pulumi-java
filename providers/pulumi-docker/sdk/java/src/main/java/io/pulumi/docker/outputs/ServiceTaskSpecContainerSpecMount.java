// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountBindOptions;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountTmpfsOptions;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountVolumeOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTaskSpecContainerSpecMount {
    private final @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions;
    private final @Nullable Boolean readOnly;
    private final @Nullable String source;
    private final String target;
    private final @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions;
    private final String type;
    private final @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions;

    @OutputCustomType.Constructor({"bindOptions","readOnly","source","target","tmpfsOptions","type","volumeOptions"})
    private ServiceTaskSpecContainerSpecMount(
        @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions,
        @Nullable Boolean readOnly,
        @Nullable String source,
        String target,
        @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions,
        String type,
        @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions) {
        this.bindOptions = bindOptions;
        this.readOnly = readOnly;
        this.source = source;
        this.target = target;
        this.tmpfsOptions = tmpfsOptions;
        this.type = type;
        this.volumeOptions = volumeOptions;
    }

    public Optional<ServiceTaskSpecContainerSpecMountBindOptions> getBindOptions() {
        return Optional.ofNullable(this.bindOptions);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public String getTarget() {
        return this.target;
    }
    public Optional<ServiceTaskSpecContainerSpecMountTmpfsOptions> getTmpfsOptions() {
        return Optional.ofNullable(this.tmpfsOptions);
    }
    public String getType() {
        return this.type;
    }
    public Optional<ServiceTaskSpecContainerSpecMountVolumeOptions> getVolumeOptions() {
        return Optional.ofNullable(this.volumeOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions;
        private @Nullable Boolean readOnly;
        private @Nullable String source;
        private String target;
        private @Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions;
        private String type;
        private @Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindOptions = defaults.bindOptions;
    	      this.readOnly = defaults.readOnly;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.tmpfsOptions = defaults.tmpfsOptions;
    	      this.type = defaults.type;
    	      this.volumeOptions = defaults.volumeOptions;
        }

        public Builder setBindOptions(@Nullable ServiceTaskSpecContainerSpecMountBindOptions bindOptions) {
            this.bindOptions = bindOptions;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTmpfsOptions(@Nullable ServiceTaskSpecContainerSpecMountTmpfsOptions tmpfsOptions) {
            this.tmpfsOptions = tmpfsOptions;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumeOptions(@Nullable ServiceTaskSpecContainerSpecMountVolumeOptions volumeOptions) {
            this.volumeOptions = volumeOptions;
            return this;
        }
        public ServiceTaskSpecContainerSpecMount build() {
            return new ServiceTaskSpecContainerSpecMount(bindOptions, readOnly, source, target, tmpfsOptions, type, volumeOptions);
        }
    }
}