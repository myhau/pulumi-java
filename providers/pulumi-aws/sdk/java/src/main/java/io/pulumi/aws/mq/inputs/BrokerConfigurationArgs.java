// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerConfigurationArgs Empty = new BrokerConfigurationArgs();

    /**
     * The Configuration ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Revision of the Configuration.
     * 
     */
    @InputImport(name="revision")
      private final @Nullable Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    public BrokerConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<Integer> revision) {
        this.id = id;
        this.revision = revision;
    }

    private BrokerConfigurationArgs() {
        this.id = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.revision = defaults.revision;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setRevision(@Nullable Input<Integer> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable Integer revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }
        public BrokerConfigurationArgs build() {
            return new BrokerConfigurationArgs(id, revision);
        }
    }
}