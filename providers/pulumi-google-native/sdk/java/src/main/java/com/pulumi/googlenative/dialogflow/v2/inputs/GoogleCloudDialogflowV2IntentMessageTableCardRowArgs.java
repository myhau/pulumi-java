// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardCellArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Row of TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardRowArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardRowArgs Empty = new GoogleCloudDialogflowV2IntentMessageTableCardRowArgs();

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    @Import(name="cells")
    private @Nullable Output<List<GoogleCloudDialogflowV2IntentMessageTableCardCellArgs>> cells;

    /**
     * @return Optional. List of cells that make up this row.
     * 
     */
    public Optional<Output<List<GoogleCloudDialogflowV2IntentMessageTableCardCellArgs>>> cells() {
        return Optional.ofNullable(this.cells);
    }

    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    @Import(name="dividerAfter")
    private @Nullable Output<Boolean> dividerAfter;

    /**
     * @return Optional. Whether to add a visual divider after this row.
     * 
     */
    public Optional<Output<Boolean>> dividerAfter() {
        return Optional.ofNullable(this.dividerAfter);
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardRowArgs() {}

    private GoogleCloudDialogflowV2IntentMessageTableCardRowArgs(GoogleCloudDialogflowV2IntentMessageTableCardRowArgs $) {
        this.cells = $.cells;
        this.dividerAfter = $.dividerAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardRowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageTableCardRowArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardRowArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardRowArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardRowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cells Optional. List of cells that make up this row.
         * 
         * @return builder
         * 
         */
        public Builder cells(@Nullable Output<List<GoogleCloudDialogflowV2IntentMessageTableCardCellArgs>> cells) {
            $.cells = cells;
            return this;
        }

        /**
         * @param cells Optional. List of cells that make up this row.
         * 
         * @return builder
         * 
         */
        public Builder cells(List<GoogleCloudDialogflowV2IntentMessageTableCardCellArgs> cells) {
            return cells(Output.of(cells));
        }

        /**
         * @param cells Optional. List of cells that make up this row.
         * 
         * @return builder
         * 
         */
        public Builder cells(GoogleCloudDialogflowV2IntentMessageTableCardCellArgs... cells) {
            return cells(List.of(cells));
        }

        /**
         * @param dividerAfter Optional. Whether to add a visual divider after this row.
         * 
         * @return builder
         * 
         */
        public Builder dividerAfter(@Nullable Output<Boolean> dividerAfter) {
            $.dividerAfter = dividerAfter;
            return this;
        }

        /**
         * @param dividerAfter Optional. Whether to add a visual divider after this row.
         * 
         * @return builder
         * 
         */
        public Builder dividerAfter(Boolean dividerAfter) {
            return dividerAfter(Output.of(dividerAfter));
        }

        public GoogleCloudDialogflowV2IntentMessageTableCardRowArgs build() {
            return $;
        }
    }

}
