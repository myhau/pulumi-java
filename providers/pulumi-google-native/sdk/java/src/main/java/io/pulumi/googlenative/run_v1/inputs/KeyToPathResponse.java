// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class KeyToPathResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyToPathResponse Empty = new KeyToPathResponse();

    @InputImport(name="key", required=true)
    private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="mode", required=true)
    private final Integer mode;

    public Integer getMode() {
        return this.mode;
    }

    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    public KeyToPathResponse(
        String key,
        Integer mode,
        String path) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private KeyToPathResponse() {
        this.key = null;
        this.mode = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyToPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Integer mode;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyToPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setMode(Integer mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public KeyToPathResponse build() {
            return new KeyToPathResponse(key, mode, path);
        }
    }
}