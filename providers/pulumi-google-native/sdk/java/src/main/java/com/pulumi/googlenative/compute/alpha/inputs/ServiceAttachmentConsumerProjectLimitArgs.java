// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAttachmentConsumerProjectLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConsumerProjectLimitArgs Empty = new ServiceAttachmentConsumerProjectLimitArgs();

    /**
     * The value of the limit to set.
     * 
     */
    @Import(name="connectionLimit")
    private @Nullable Output<Integer> connectionLimit;

    /**
     * @return The value of the limit to set.
     * 
     */
    public Optional<Output<Integer>> connectionLimit() {
        return Optional.ofNullable(this.connectionLimit);
    }

    /**
     * The project id or number for the project to set the limit for.
     * 
     */
    @Import(name="projectIdOrNum")
    private @Nullable Output<String> projectIdOrNum;

    /**
     * @return The project id or number for the project to set the limit for.
     * 
     */
    public Optional<Output<String>> projectIdOrNum() {
        return Optional.ofNullable(this.projectIdOrNum);
    }

    private ServiceAttachmentConsumerProjectLimitArgs() {}

    private ServiceAttachmentConsumerProjectLimitArgs(ServiceAttachmentConsumerProjectLimitArgs $) {
        this.connectionLimit = $.connectionLimit;
        this.projectIdOrNum = $.projectIdOrNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAttachmentConsumerProjectLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAttachmentConsumerProjectLimitArgs $;

        public Builder() {
            $ = new ServiceAttachmentConsumerProjectLimitArgs();
        }

        public Builder(ServiceAttachmentConsumerProjectLimitArgs defaults) {
            $ = new ServiceAttachmentConsumerProjectLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionLimit The value of the limit to set.
         * 
         * @return builder
         * 
         */
        public Builder connectionLimit(@Nullable Output<Integer> connectionLimit) {
            $.connectionLimit = connectionLimit;
            return this;
        }

        /**
         * @param connectionLimit The value of the limit to set.
         * 
         * @return builder
         * 
         */
        public Builder connectionLimit(Integer connectionLimit) {
            return connectionLimit(Output.of(connectionLimit));
        }

        /**
         * @param projectIdOrNum The project id or number for the project to set the limit for.
         * 
         * @return builder
         * 
         */
        public Builder projectIdOrNum(@Nullable Output<String> projectIdOrNum) {
            $.projectIdOrNum = projectIdOrNum;
            return this;
        }

        /**
         * @param projectIdOrNum The project id or number for the project to set the limit for.
         * 
         * @return builder
         * 
         */
        public Builder projectIdOrNum(String projectIdOrNum) {
            return projectIdOrNum(Output.of(projectIdOrNum));
        }

        public ServiceAttachmentConsumerProjectLimitArgs build() {
            return $;
        }
    }

}
