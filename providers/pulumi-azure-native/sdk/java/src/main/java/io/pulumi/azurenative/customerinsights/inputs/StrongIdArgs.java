// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Property/Properties which represent a unique ID.
 * 
 */
public final class StrongIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final StrongIdArgs Empty = new StrongIdArgs();

    /**
     * Localized descriptions.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<Map<String,String>> description;

    public Output<Map<String,String>> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Localized display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<Map<String,String>> displayName;

    public Output<Map<String,String>> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The properties which make up the unique ID.
     * 
     */
    @Import(name="keyPropertyNames", required=true)
      private final Output<List<String>> keyPropertyNames;

    public Output<List<String>> keyPropertyNames() {
        return this.keyPropertyNames;
    }

    /**
     * The Name identifying the strong ID.
     * 
     */
    @Import(name="strongIdName", required=true)
      private final Output<String> strongIdName;

    public Output<String> strongIdName() {
        return this.strongIdName;
    }

    public StrongIdArgs(
        @Nullable Output<Map<String,String>> description,
        @Nullable Output<Map<String,String>> displayName,
        Output<List<String>> keyPropertyNames,
        Output<String> strongIdName) {
        this.description = description;
        this.displayName = displayName;
        this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames, "expected parameter 'keyPropertyNames' to be non-null");
        this.strongIdName = Objects.requireNonNull(strongIdName, "expected parameter 'strongIdName' to be non-null");
    }

    private StrongIdArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.keyPropertyNames = Codegen.empty();
        this.strongIdName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StrongIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> description;
        private @Nullable Output<Map<String,String>> displayName;
        private Output<List<String>> keyPropertyNames;
        private Output<String> strongIdName;

        public Builder() {
    	      // Empty
        }

        public Builder(StrongIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.keyPropertyNames = defaults.keyPropertyNames;
    	      this.strongIdName = defaults.strongIdName;
        }

        public Builder description(@Nullable Output<Map<String,String>> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable Map<String,String> description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder keyPropertyNames(Output<List<String>> keyPropertyNames) {
            this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames);
            return this;
        }
        public Builder keyPropertyNames(List<String> keyPropertyNames) {
            this.keyPropertyNames = Output.of(Objects.requireNonNull(keyPropertyNames));
            return this;
        }
        public Builder keyPropertyNames(String... keyPropertyNames) {
            return keyPropertyNames(List.of(keyPropertyNames));
        }
        public Builder strongIdName(Output<String> strongIdName) {
            this.strongIdName = Objects.requireNonNull(strongIdName);
            return this;
        }
        public Builder strongIdName(String strongIdName) {
            this.strongIdName = Output.of(Objects.requireNonNull(strongIdName));
            return this;
        }        public StrongIdArgs build() {
            return new StrongIdArgs(description, displayName, keyPropertyNames, strongIdName);
        }
    }
}
