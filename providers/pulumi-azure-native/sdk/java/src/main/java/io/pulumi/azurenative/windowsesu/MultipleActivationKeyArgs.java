// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsesu;

import io.pulumi.azurenative.windowsesu.enums.OsType;
import io.pulumi.azurenative.windowsesu.enums.SupportType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultipleActivationKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultipleActivationKeyArgs Empty = new MultipleActivationKeyArgs();

    /**
     * Agreement number under which the key is requested.
     * 
     */
    @Import(name="agreementNumber")
      private final @Nullable Output<String> agreementNumber;

    public Output<String> agreementNumber() {
        return this.agreementNumber == null ? Codegen.empty() : this.agreementNumber;
    }

    /**
     * Number of activations/servers using the MAK key.
     * 
     */
    @Import(name="installedServerNumber")
      private final @Nullable Output<Integer> installedServerNumber;

    public Output<Integer> installedServerNumber() {
        return this.installedServerNumber == null ? Codegen.empty() : this.installedServerNumber;
    }

    /**
     * <code> true </code> if user has eligible on-premises Windows physical or virtual machines, and that the requested key will only be used in their organization; <code> false </code> otherwise.
     * 
     */
    @Import(name="isEligible")
      private final @Nullable Output<Boolean> isEligible;

    public Output<Boolean> isEligible() {
        return this.isEligible == null ? Codegen.empty() : this.isEligible;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the MAK key.
     * 
     */
    @Import(name="multipleActivationKeyName")
      private final @Nullable Output<String> multipleActivationKeyName;

    public Output<String> multipleActivationKeyName() {
        return this.multipleActivationKeyName == null ? Codegen.empty() : this.multipleActivationKeyName;
    }

    /**
     * Type of OS for which the key is requested.
     * 
     */
    @Import(name="osType")
      private final @Nullable Output<Either<String,OsType>> osType;

    public Output<Either<String,OsType>> osType() {
        return this.osType == null ? Codegen.empty() : this.osType;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Type of support
     * 
     */
    @Import(name="supportType")
      private final @Nullable Output<Either<String,SupportType>> supportType;

    public Output<Either<String,SupportType>> supportType() {
        return this.supportType == null ? Codegen.empty() : this.supportType;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public MultipleActivationKeyArgs(
        @Nullable Output<String> agreementNumber,
        @Nullable Output<Integer> installedServerNumber,
        @Nullable Output<Boolean> isEligible,
        @Nullable Output<String> location,
        @Nullable Output<String> multipleActivationKeyName,
        @Nullable Output<Either<String,OsType>> osType,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,SupportType>> supportType,
        @Nullable Output<Map<String,String>> tags) {
        this.agreementNumber = agreementNumber;
        this.installedServerNumber = installedServerNumber;
        this.isEligible = isEligible;
        this.location = location;
        this.multipleActivationKeyName = multipleActivationKeyName;
        this.osType = osType;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.supportType = supportType == null ? Output.ofLeft("SupplementalServicing") : supportType;
        this.tags = tags;
    }

    private MultipleActivationKeyArgs() {
        this.agreementNumber = Codegen.empty();
        this.installedServerNumber = Codegen.empty();
        this.isEligible = Codegen.empty();
        this.location = Codegen.empty();
        this.multipleActivationKeyName = Codegen.empty();
        this.osType = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.supportType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultipleActivationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agreementNumber;
        private @Nullable Output<Integer> installedServerNumber;
        private @Nullable Output<Boolean> isEligible;
        private @Nullable Output<String> location;
        private @Nullable Output<String> multipleActivationKeyName;
        private @Nullable Output<Either<String,OsType>> osType;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,SupportType>> supportType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MultipleActivationKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreementNumber = defaults.agreementNumber;
    	      this.installedServerNumber = defaults.installedServerNumber;
    	      this.isEligible = defaults.isEligible;
    	      this.location = defaults.location;
    	      this.multipleActivationKeyName = defaults.multipleActivationKeyName;
    	      this.osType = defaults.osType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.supportType = defaults.supportType;
    	      this.tags = defaults.tags;
        }

        public Builder agreementNumber(@Nullable Output<String> agreementNumber) {
            this.agreementNumber = agreementNumber;
            return this;
        }
        public Builder agreementNumber(@Nullable String agreementNumber) {
            this.agreementNumber = Codegen.ofNullable(agreementNumber);
            return this;
        }
        public Builder installedServerNumber(@Nullable Output<Integer> installedServerNumber) {
            this.installedServerNumber = installedServerNumber;
            return this;
        }
        public Builder installedServerNumber(@Nullable Integer installedServerNumber) {
            this.installedServerNumber = Codegen.ofNullable(installedServerNumber);
            return this;
        }
        public Builder isEligible(@Nullable Output<Boolean> isEligible) {
            this.isEligible = isEligible;
            return this;
        }
        public Builder isEligible(@Nullable Boolean isEligible) {
            this.isEligible = Codegen.ofNullable(isEligible);
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
        public Builder multipleActivationKeyName(@Nullable Output<String> multipleActivationKeyName) {
            this.multipleActivationKeyName = multipleActivationKeyName;
            return this;
        }
        public Builder multipleActivationKeyName(@Nullable String multipleActivationKeyName) {
            this.multipleActivationKeyName = Codegen.ofNullable(multipleActivationKeyName);
            return this;
        }
        public Builder osType(@Nullable Output<Either<String,OsType>> osType) {
            this.osType = osType;
            return this;
        }
        public Builder osType(@Nullable Either<String,OsType> osType) {
            this.osType = Codegen.ofNullable(osType);
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
        public Builder supportType(@Nullable Output<Either<String,SupportType>> supportType) {
            this.supportType = supportType;
            return this;
        }
        public Builder supportType(@Nullable Either<String,SupportType> supportType) {
            this.supportType = Codegen.ofNullable(supportType);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public MultipleActivationKeyArgs build() {
            return new MultipleActivationKeyArgs(agreementNumber, installedServerNumber, isEligible, location, multipleActivationKeyName, osType, resourceGroupName, supportType, tags);
        }
    }
}
