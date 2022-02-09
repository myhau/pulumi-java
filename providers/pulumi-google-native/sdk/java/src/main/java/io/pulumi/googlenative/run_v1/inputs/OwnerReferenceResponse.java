// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class OwnerReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OwnerReferenceResponse Empty = new OwnerReferenceResponse();

    @InputImport(name="apiVersion", required=true)
    private final String apiVersion;

    public String getApiVersion() {
        return this.apiVersion;
    }

    @InputImport(name="blockOwnerDeletion", required=true)
    private final Boolean blockOwnerDeletion;

    public Boolean getBlockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    @InputImport(name="controller", required=true)
    private final Boolean controller;

    public Boolean getController() {
        return this.controller;
    }

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="uid", required=true)
    private final String uid;

    public String getUid() {
        return this.uid;
    }

    public OwnerReferenceResponse(
        String apiVersion,
        Boolean blockOwnerDeletion,
        Boolean controller,
        String kind,
        String name,
        String uid) {
        this.apiVersion = Objects.requireNonNull(apiVersion, "expected parameter 'apiVersion' to be non-null");
        this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion, "expected parameter 'blockOwnerDeletion' to be non-null");
        this.controller = Objects.requireNonNull(controller, "expected parameter 'controller' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private OwnerReferenceResponse() {
        this.apiVersion = null;
        this.blockOwnerDeletion = null;
        this.controller = null;
        this.kind = null;
        this.name = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private Boolean blockOwnerDeletion;
        private Boolean controller;
        private String kind;
        private String name;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OwnerReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
            return this;
        }

        public Builder setController(Boolean controller) {
            this.controller = Objects.requireNonNull(controller);
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

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public OwnerReferenceResponse build() {
            return new OwnerReferenceResponse(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
        }
    }
}