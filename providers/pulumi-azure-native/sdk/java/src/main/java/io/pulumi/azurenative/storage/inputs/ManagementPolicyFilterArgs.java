// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.TagFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filters limit rule actions to a subset of blobs within the storage account. If multiple filters are defined, a logical AND is performed on all filters.
 * 
 */
public final class ManagementPolicyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyFilterArgs Empty = new ManagementPolicyFilterArgs();

    /**
     * An array of blob index tag based filters, there can be at most 10 tag filters
     * 
     */
    @Import(name="blobIndexMatch")
      private final @Nullable Output<List<TagFilterArgs>> blobIndexMatch;

    public Output<List<TagFilterArgs>> blobIndexMatch() {
        return this.blobIndexMatch == null ? Codegen.empty() : this.blobIndexMatch;
    }

    /**
     * An array of predefined enum values. Currently blockBlob supports all tiering and delete actions. Only delete actions are supported for appendBlob.
     * 
     */
    @Import(name="blobTypes", required=true)
      private final Output<List<String>> blobTypes;

    public Output<List<String>> blobTypes() {
        return this.blobTypes;
    }

    /**
     * An array of strings for prefixes to be match.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable Output<List<String>> prefixMatch;

    public Output<List<String>> prefixMatch() {
        return this.prefixMatch == null ? Codegen.empty() : this.prefixMatch;
    }

    public ManagementPolicyFilterArgs(
        @Nullable Output<List<TagFilterArgs>> blobIndexMatch,
        Output<List<String>> blobTypes,
        @Nullable Output<List<String>> prefixMatch) {
        this.blobIndexMatch = blobIndexMatch;
        this.blobTypes = Objects.requireNonNull(blobTypes, "expected parameter 'blobTypes' to be non-null");
        this.prefixMatch = prefixMatch;
    }

    private ManagementPolicyFilterArgs() {
        this.blobIndexMatch = Codegen.empty();
        this.blobTypes = Codegen.empty();
        this.prefixMatch = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TagFilterArgs>> blobIndexMatch;
        private Output<List<String>> blobTypes;
        private @Nullable Output<List<String>> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobIndexMatch = defaults.blobIndexMatch;
    	      this.blobTypes = defaults.blobTypes;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder blobIndexMatch(@Nullable Output<List<TagFilterArgs>> blobIndexMatch) {
            this.blobIndexMatch = blobIndexMatch;
            return this;
        }
        public Builder blobIndexMatch(@Nullable List<TagFilterArgs> blobIndexMatch) {
            this.blobIndexMatch = Codegen.ofNullable(blobIndexMatch);
            return this;
        }
        public Builder blobIndexMatch(TagFilterArgs... blobIndexMatch) {
            return blobIndexMatch(List.of(blobIndexMatch));
        }
        public Builder blobTypes(Output<List<String>> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }
        public Builder blobTypes(List<String> blobTypes) {
            this.blobTypes = Output.of(Objects.requireNonNull(blobTypes));
            return this;
        }
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }
        public Builder prefixMatch(@Nullable Output<List<String>> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = Codegen.ofNullable(prefixMatch);
            return this;
        }
        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }        public ManagementPolicyFilterArgs build() {
            return new ManagementPolicyFilterArgs(blobIndexMatch, blobTypes, prefixMatch);
        }
    }
}
