// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
      private final Output<String> labAccountName;

    public Output<String> labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> labName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Import(name="uniqueIdentifier")
      private final @Nullable Output<String> uniqueIdentifier;

    public Output<String> uniqueIdentifier() {
        return this.uniqueIdentifier == null ? Codegen.empty() : this.uniqueIdentifier;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public UserArgs(
        Output<String> labAccountName,
        Output<String> labName,
        @Nullable Output<String> location,
        @Nullable Output<String> provisioningState,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> uniqueIdentifier,
        @Nullable Output<String> userName) {
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.uniqueIdentifier = uniqueIdentifier;
        this.userName = userName;
    }

    private UserArgs() {
        this.labAccountName = Codegen.empty();
        this.labName = Codegen.empty();
        this.location = Codegen.empty();
        this.provisioningState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.uniqueIdentifier = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labAccountName;
        private Output<String> labName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> provisioningState;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> uniqueIdentifier;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.userName = defaults.userName;
        }

        public Builder labAccountName(Output<String> labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }
        public Builder labAccountName(String labAccountName) {
            this.labAccountName = Output.of(Objects.requireNonNull(labAccountName));
            return this;
        }
        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder uniqueIdentifier(@Nullable Output<String> uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }
        public Builder uniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = Codegen.ofNullable(uniqueIdentifier);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public UserArgs build() {
            return new UserArgs(labAccountName, labName, location, provisioningState, resourceGroupName, tags, uniqueIdentifier, userName);
        }
    }
}
