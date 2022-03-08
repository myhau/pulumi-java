// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotSlotPriority {
    private final Integer priority;
    /**
     * The name of the slot.
     * 
     */
    private final String slotName;

    @OutputCustomType.Constructor({"priority","slotName"})
    private BotSlotPriority(
        Integer priority,
        String slotName) {
        this.priority = priority;
        this.slotName = slotName;
    }

    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The name of the slot.
     * 
    */
    public String getSlotName() {
        return this.slotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotPriority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private String slotName;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotPriority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.slotName = defaults.slotName;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setSlotName(String slotName) {
            this.slotName = Objects.requireNonNull(slotName);
            return this;
        }
        public BotSlotPriority build() {
            return new BotSlotPriority(priority, slotName);
        }
    }
}
