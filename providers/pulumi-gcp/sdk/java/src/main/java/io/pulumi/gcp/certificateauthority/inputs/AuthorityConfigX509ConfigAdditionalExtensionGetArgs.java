// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class AuthorityConfigX509ConfigAdditionalExtensionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigAdditionalExtensionGetArgs Empty = new AuthorityConfigX509ConfigAdditionalExtensionGetArgs();

    @InputImport(name="critical", required=true)
    private final Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical;
    }

    @InputImport(name="objectId", required=true)
    private final Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs> objectId;

    public Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs> getObjectId() {
        return this.objectId;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public AuthorityConfigX509ConfigAdditionalExtensionGetArgs(
        Input<Boolean> critical,
        Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs> objectId,
        Input<String> value) {
        this.critical = Objects.requireNonNull(critical, "expected parameter 'critical' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AuthorityConfigX509ConfigAdditionalExtensionGetArgs() {
        this.critical = Input.empty();
        this.objectId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigAdditionalExtensionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> critical;
        private Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs> objectId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigAdditionalExtensionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(Input<Boolean> critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder setCritical(Boolean critical) {
            this.critical = Input.of(Objects.requireNonNull(critical));
            return this;
        }

        public Builder setObjectId(Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(AuthorityConfigX509ConfigAdditionalExtensionObjectIdGetArgs objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public AuthorityConfigX509ConfigAdditionalExtensionGetArgs build() {
            return new AuthorityConfigX509ConfigAdditionalExtensionGetArgs(critical, objectId, value);
        }
    }
}