// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamBindingArgs Empty = new FhirStoreIamBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<FhirStoreIamBindingConditionArgs> condition;

    public Input<FhirStoreIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="fhirStoreId", required=true)
    private final Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId;
    }

    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public FhirStoreIamBindingArgs(
        @Nullable Input<FhirStoreIamBindingConditionArgs> condition,
        Input<String> fhirStoreId,
        Input<List<String>> members,
        Input<String> role) {
        this.condition = condition;
        this.fhirStoreId = Objects.requireNonNull(fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FhirStoreIamBindingArgs() {
        this.condition = Input.empty();
        this.fhirStoreId = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FhirStoreIamBindingConditionArgs> condition;
        private Input<String> fhirStoreId;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<FhirStoreIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FhirStoreIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setFhirStoreId(Input<String> fhirStoreId) {
            this.fhirStoreId = Objects.requireNonNull(fhirStoreId);
            return this;
        }

        public Builder setFhirStoreId(String fhirStoreId) {
            this.fhirStoreId = Input.of(Objects.requireNonNull(fhirStoreId));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public FhirStoreIamBindingArgs build() {
            return new FhirStoreIamBindingArgs(condition, fhirStoreId, members, role);
        }
    }
}