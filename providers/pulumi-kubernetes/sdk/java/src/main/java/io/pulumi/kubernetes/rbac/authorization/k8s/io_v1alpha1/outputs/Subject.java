// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Subject {
    /**
     * APIVersion holds the API group and version of the referenced subject. Defaults to "v1" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io/v1alpha1" for User and Group subjects.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    private final String kind;
    /**
     * Name of the object being referenced.
     * 
     */
    private final String name;
    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
     */
    private final @Nullable String namespace;

    @OutputCustomType.Constructor({"apiVersion","kind","name","namespace"})
    private Subject(
        @Nullable String apiVersion,
        String kind,
        String name,
        @Nullable String namespace) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * APIVersion holds the API group and version of the referenced subject. Defaults to "v1" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io/v1alpha1" for User and Group subjects.
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the object being referenced.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private String kind;
        private String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Subject build() {
            return new Subject(apiVersion, kind, name, namespace);
        }
    }
}
