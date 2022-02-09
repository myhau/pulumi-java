// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeReferenceArgs Empty = new VolumeReferenceArgs();

    @InputImport(name="destinationPath", required=true)
    private final Input<String> destinationPath;

    public Input<String> getDestinationPath() {
        return this.destinationPath;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public VolumeReferenceArgs(
        Input<String> destinationPath,
        Input<String> name,
        @Nullable Input<Boolean> readOnly) {
        this.destinationPath = Objects.requireNonNull(destinationPath, "expected parameter 'destinationPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
    }

    private VolumeReferenceArgs() {
        this.destinationPath = Input.empty();
        this.name = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationPath;
        private Input<String> name;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPath = defaults.destinationPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setDestinationPath(Input<String> destinationPath) {
            this.destinationPath = Objects.requireNonNull(destinationPath);
            return this;
        }

        public Builder setDestinationPath(String destinationPath) {
            this.destinationPath = Input.of(Objects.requireNonNull(destinationPath));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public VolumeReferenceArgs build() {
            return new VolumeReferenceArgs(destinationPath, name, readOnly);
        }
    }
}