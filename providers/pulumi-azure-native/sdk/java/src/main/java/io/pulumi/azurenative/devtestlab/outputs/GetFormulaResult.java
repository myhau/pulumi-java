// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.FormulaPropertiesFromVmResponse;
import io.pulumi.azurenative.devtestlab.outputs.LabVirtualMachineCreationParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFormulaResult {
    /**
     * The author of the formula.
     * 
     */
    private final String author;
    /**
     * The creation date of the formula.
     * 
     */
    private final String creationDate;
    /**
     * The description of the formula.
     * 
     */
    private final @Nullable String description;
    /**
     * The content of the formula.
     * 
     */
    private final @Nullable LabVirtualMachineCreationParameterResponse formulaContent;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The OS type of the formula.
     * 
     */
    private final @Nullable String osType;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;
    /**
     * Information about a VM from which a formula is to be created.
     * 
     */
    private final @Nullable FormulaPropertiesFromVmResponse vm;

    @CustomType.Constructor
    private GetFormulaResult(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("formulaContent") @Nullable LabVirtualMachineCreationParameterResponse formulaContent,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") String uniqueIdentifier,
        @CustomType.Parameter("vm") @Nullable FormulaPropertiesFromVmResponse vm) {
        this.author = author;
        this.creationDate = creationDate;
        this.description = description;
        this.formulaContent = formulaContent;
        this.id = id;
        this.location = location;
        this.name = name;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
        this.vm = vm;
    }

    /**
     * The author of the formula.
     * 
    */
    public String author() {
        return this.author;
    }
    /**
     * The creation date of the formula.
     * 
    */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * The description of the formula.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The content of the formula.
     * 
    */
    public Optional<LabVirtualMachineCreationParameterResponse> formulaContent() {
        return Optional.ofNullable(this.formulaContent);
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The OS type of the formula.
     * 
    */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * Information about a VM from which a formula is to be created.
     * 
    */
    public Optional<FormulaPropertiesFromVmResponse> vm() {
        return Optional.ofNullable(this.vm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFormulaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private String creationDate;
        private @Nullable String description;
        private @Nullable LabVirtualMachineCreationParameterResponse formulaContent;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String osType;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;
        private @Nullable FormulaPropertiesFromVmResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFormulaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.formulaContent = defaults.formulaContent;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.vm = defaults.vm;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder formulaContent(@Nullable LabVirtualMachineCreationParameterResponse formulaContent) {
            this.formulaContent = formulaContent;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public Builder vm(@Nullable FormulaPropertiesFromVmResponse vm) {
            this.vm = vm;
            return this;
        }        public GetFormulaResult build() {
            return new GetFormulaResult(author, creationDate, description, formulaContent, id, location, name, osType, provisioningState, tags, type, uniqueIdentifier, vm);
        }
    }
}
