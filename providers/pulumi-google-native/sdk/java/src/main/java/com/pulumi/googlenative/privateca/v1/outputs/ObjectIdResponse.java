// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ObjectIdResponse {
    /**
     * @return The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    private final List<Integer> objectIdPath;

    @CustomType.Constructor
    private ObjectIdResponse(@CustomType.Parameter("objectIdPath") List<Integer> objectIdPath) {
        this.objectIdPath = objectIdPath;
    }

    /**
     * @return The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    public List<Integer> objectIdPath() {
        return this.objectIdPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> objectIdPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPath = defaults.objectIdPath;
        }

        public Builder objectIdPath(List<Integer> objectIdPath) {
            this.objectIdPath = Objects.requireNonNull(objectIdPath);
            return this;
        }
        public Builder objectIdPath(Integer... objectIdPath) {
            return objectIdPath(List.of(objectIdPath));
        }        public ObjectIdResponse build() {
            return new ObjectIdResponse(objectIdPath);
        }
    }
}
