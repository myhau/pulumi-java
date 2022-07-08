// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream.v1alpha1.inputs.MysqlRdbmsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL source configuration
 * 
 */
public final class MysqlSourceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlSourceConfigArgs Empty = new MysqlSourceConfigArgs();

    /**
     * MySQL objects to retrieve from the source.
     * 
     */
    @Import(name="allowlist")
    private @Nullable Output<MysqlRdbmsArgs> allowlist;

    /**
     * @return MySQL objects to retrieve from the source.
     * 
     */
    public Optional<Output<MysqlRdbmsArgs>> allowlist() {
        return Optional.ofNullable(this.allowlist);
    }

    /**
     * MySQL objects to exclude from the stream.
     * 
     */
    @Import(name="rejectlist")
    private @Nullable Output<MysqlRdbmsArgs> rejectlist;

    /**
     * @return MySQL objects to exclude from the stream.
     * 
     */
    public Optional<Output<MysqlRdbmsArgs>> rejectlist() {
        return Optional.ofNullable(this.rejectlist);
    }

    private MysqlSourceConfigArgs() {}

    private MysqlSourceConfigArgs(MysqlSourceConfigArgs $) {
        this.allowlist = $.allowlist;
        this.rejectlist = $.rejectlist;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlSourceConfigArgs $;

        public Builder() {
            $ = new MysqlSourceConfigArgs();
        }

        public Builder(MysqlSourceConfigArgs defaults) {
            $ = new MysqlSourceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowlist MySQL objects to retrieve from the source.
         * 
         * @return builder
         * 
         */
        public Builder allowlist(@Nullable Output<MysqlRdbmsArgs> allowlist) {
            $.allowlist = allowlist;
            return this;
        }

        /**
         * @param allowlist MySQL objects to retrieve from the source.
         * 
         * @return builder
         * 
         */
        public Builder allowlist(MysqlRdbmsArgs allowlist) {
            return allowlist(Output.of(allowlist));
        }

        /**
         * @param rejectlist MySQL objects to exclude from the stream.
         * 
         * @return builder
         * 
         */
        public Builder rejectlist(@Nullable Output<MysqlRdbmsArgs> rejectlist) {
            $.rejectlist = rejectlist;
            return this;
        }

        /**
         * @param rejectlist MySQL objects to exclude from the stream.
         * 
         * @return builder
         * 
         */
        public Builder rejectlist(MysqlRdbmsArgs rejectlist) {
            return rejectlist(Output.of(rejectlist));
        }

        public MysqlSourceConfigArgs build() {
            return $;
        }
    }

}
