// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class SparkSqlBatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkSqlBatchResponse Empty = new SparkSqlBatchResponse();

    @InputImport(name="jarFileUris", required=true)
    private final List<String> jarFileUris;

    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }

    @InputImport(name="queryFileUri", required=true)
    private final String queryFileUri;

    public String getQueryFileUri() {
        return this.queryFileUri;
    }

    @InputImport(name="queryVariables", required=true)
    private final Map<String,String> queryVariables;

    public Map<String,String> getQueryVariables() {
        return this.queryVariables;
    }

    public SparkSqlBatchResponse(
        List<String> jarFileUris,
        String queryFileUri,
        Map<String,String> queryVariables) {
        this.jarFileUris = Objects.requireNonNull(jarFileUris, "expected parameter 'jarFileUris' to be non-null");
        this.queryFileUri = Objects.requireNonNull(queryFileUri, "expected parameter 'queryFileUri' to be non-null");
        this.queryVariables = Objects.requireNonNull(queryVariables, "expected parameter 'queryVariables' to be non-null");
    }

    private SparkSqlBatchResponse() {
        this.jarFileUris = List.of();
        this.queryFileUri = null;
        this.queryVariables = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkSqlBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> jarFileUris;
        private String queryFileUri;
        private Map<String,String> queryVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkSqlBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryVariables = defaults.queryVariables;
        }

        public Builder setJarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryVariables(Map<String,String> queryVariables) {
            this.queryVariables = Objects.requireNonNull(queryVariables);
            return this;
        }

        public SparkSqlBatchResponse build() {
            return new SparkSqlBatchResponse(jarFileUris, queryFileUri, queryVariables);
        }
    }
}