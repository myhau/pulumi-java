// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReadinessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReadinessCheckArgs Empty = new ReadinessCheckArgs();

    /**
     * Unique name describing the readiness check.
     * 
     */
    @InputImport(name="readinessCheckName", required=true)
      private final Input<String> readinessCheckName;

    public Input<String> getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * Name describing the resource set that will be monitored for readiness.
     * 
     */
    @InputImport(name="resourceSetName", required=true)
      private final Input<String> resourceSetName;

    public Input<String> getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ReadinessCheckArgs(
        Input<String> readinessCheckName,
        Input<String> resourceSetName,
        @Nullable Input<Map<String,String>> tags) {
        this.readinessCheckName = Objects.requireNonNull(readinessCheckName, "expected parameter 'readinessCheckName' to be non-null");
        this.resourceSetName = Objects.requireNonNull(resourceSetName, "expected parameter 'resourceSetName' to be non-null");
        this.tags = tags;
    }

    private ReadinessCheckArgs() {
        this.readinessCheckName = Input.empty();
        this.resourceSetName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> readinessCheckName;
        private Input<String> resourceSetName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readinessCheckName = defaults.readinessCheckName;
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.tags = defaults.tags;
        }

        public Builder setReadinessCheckName(Input<String> readinessCheckName) {
            this.readinessCheckName = Objects.requireNonNull(readinessCheckName);
            return this;
        }

        public Builder setReadinessCheckName(String readinessCheckName) {
            this.readinessCheckName = Input.of(Objects.requireNonNull(readinessCheckName));
            return this;
        }

        public Builder setResourceSetName(Input<String> resourceSetName) {
            this.resourceSetName = Objects.requireNonNull(resourceSetName);
            return this;
        }

        public Builder setResourceSetName(String resourceSetName) {
            this.resourceSetName = Input.of(Objects.requireNonNull(resourceSetName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ReadinessCheckArgs build() {
            return new ReadinessCheckArgs(readinessCheckName, resourceSetName, tags);
        }
    }
}
