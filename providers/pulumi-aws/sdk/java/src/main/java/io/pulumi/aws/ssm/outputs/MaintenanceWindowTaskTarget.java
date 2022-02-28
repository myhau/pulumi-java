// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MaintenanceWindowTaskTarget {
    private final String key;
    /**
     * The array of strings.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"key","values"})
    private MaintenanceWindowTaskTarget(
        String key,
        List<String> values) {
        this.key = Objects.requireNonNull(key);
        this.values = Objects.requireNonNull(values);
    }

    public String getKey() {
        return this.key;
    }
    /**
     * The array of strings.
     * 
     */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public MaintenanceWindowTaskTarget build() {
            return new MaintenanceWindowTaskTarget(key, values);
        }
    }
}
