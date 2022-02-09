// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class ObjectIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectIdArgs Empty = new ObjectIdArgs();

    @InputImport(name="objectIdPath", required=true)
    private final Input<List<Integer>> objectIdPath;

    public Input<List<Integer>> getObjectIdPath() {
        return this.objectIdPath;
    }

    public ObjectIdArgs(Input<List<Integer>> objectIdPath) {
        this.objectIdPath = Objects.requireNonNull(objectIdPath, "expected parameter 'objectIdPath' to be non-null");
    }

    private ObjectIdArgs() {
        this.objectIdPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Integer>> objectIdPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPath = defaults.objectIdPath;
        }

        public Builder setObjectIdPath(Input<List<Integer>> objectIdPath) {
            this.objectIdPath = Objects.requireNonNull(objectIdPath);
            return this;
        }

        public Builder setObjectIdPath(List<Integer> objectIdPath) {
            this.objectIdPath = Input.of(Objects.requireNonNull(objectIdPath));
            return this;
        }

        public ObjectIdArgs build() {
            return new ObjectIdArgs(objectIdPath);
        }
    }
}