// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.InstanceTemplateDiskDiskEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceTemplateDisk {
    private final @Nullable Boolean autoDelete;
    private final @Nullable Boolean boot;
    private final @Nullable String deviceName;
    private final @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey;
    private final @Nullable String diskName;
    private final @Nullable Integer diskSizeGb;
    private final @Nullable String diskType;
    private final @Nullable String $interface;
    private final @Nullable Map<String,String> labels;
    private final @Nullable String mode;
    private final @Nullable String resourcePolicies;
    private final @Nullable String source;
    private final @Nullable String sourceImage;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"autoDelete","boot","deviceName","diskEncryptionKey","diskName","diskSizeGb","diskType","$interface","labels","mode","resourcePolicies","source","sourceImage","type"})
    private InstanceTemplateDisk(
        @Nullable Boolean autoDelete,
        @Nullable Boolean boot,
        @Nullable String deviceName,
        @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey,
        @Nullable String diskName,
        @Nullable Integer diskSizeGb,
        @Nullable String diskType,
        @Nullable String $interface,
        @Nullable Map<String,String> labels,
        @Nullable String mode,
        @Nullable String resourcePolicies,
        @Nullable String source,
        @Nullable String sourceImage,
        @Nullable String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.$interface = $interface;
        this.labels = labels;
        this.mode = mode;
        this.resourcePolicies = resourcePolicies;
        this.source = source;
        this.sourceImage = sourceImage;
        this.type = type;
    }

    public Optional<Boolean> getAutoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }
    public Optional<Boolean> getBoot() {
        return Optional.ofNullable(this.boot);
    }
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    public Optional<InstanceTemplateDiskDiskEncryptionKey> getDiskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }
    public Optional<String> getDiskName() {
        return Optional.ofNullable(this.diskName);
    }
    public Optional<Integer> getDiskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    public Optional<String> get$interface() {
        return Optional.ofNullable(this.$interface);
    }
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> getResourcePolicies() {
        return Optional.ofNullable(this.resourcePolicies);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> getSourceImage() {
        return Optional.ofNullable(this.sourceImage);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDelete;
        private @Nullable Boolean boot;
        private @Nullable String deviceName;
        private @Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey;
        private @Nullable String diskName;
        private @Nullable Integer diskSizeGb;
        private @Nullable String diskType;
        private @Nullable String $interface;
        private @Nullable Map<String,String> labels;
        private @Nullable String mode;
        private @Nullable String resourcePolicies;
        private @Nullable String source;
        private @Nullable String sourceImage;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder setBoot(@Nullable Boolean boot) {
            this.boot = boot;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable InstanceTemplateDiskDiskEncryptionKey diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setResourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setSourceImage(@Nullable String sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public InstanceTemplateDisk build() {
            return new InstanceTemplateDisk(autoDelete, boot, deviceName, diskEncryptionKey, diskName, diskSizeGb, diskType, $interface, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}