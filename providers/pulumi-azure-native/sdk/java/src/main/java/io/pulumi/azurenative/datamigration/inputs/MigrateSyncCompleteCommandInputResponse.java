// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for command that completes sync migration for a database.
 * 
 */
public final class MigrateSyncCompleteCommandInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSyncCompleteCommandInputResponse Empty = new MigrateSyncCompleteCommandInputResponse();

    /**
     * Time stamp to complete
     * 
     */
    @Import(name="commitTimeStamp")
      private final @Nullable String commitTimeStamp;

    public Optional<String> commitTimeStamp() {
        return this.commitTimeStamp == null ? Optional.empty() : Optional.ofNullable(this.commitTimeStamp);
    }

    /**
     * Name of database
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    public MigrateSyncCompleteCommandInputResponse(
        @Nullable String commitTimeStamp,
        String databaseName) {
        this.commitTimeStamp = commitTimeStamp;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
    }

    private MigrateSyncCompleteCommandInputResponse() {
        this.commitTimeStamp = null;
        this.databaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSyncCompleteCommandInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitTimeStamp;
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSyncCompleteCommandInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitTimeStamp = defaults.commitTimeStamp;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder commitTimeStamp(@Nullable String commitTimeStamp) {
            this.commitTimeStamp = commitTimeStamp;
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }        public MigrateSyncCompleteCommandInputResponse build() {
            return new MigrateSyncCompleteCommandInputResponse(commitTimeStamp, databaseName);
        }
    }
}
