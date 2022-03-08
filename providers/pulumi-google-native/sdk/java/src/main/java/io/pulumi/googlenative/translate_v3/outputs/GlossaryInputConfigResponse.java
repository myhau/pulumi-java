// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.translate_v3.outputs.GcsSourceResponse;
import java.util.Objects;

@OutputCustomType
public final class GlossaryInputConfigResponse {
    /**
     * Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. See documentation for more information - [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
     * 
     */
    private final GcsSourceResponse gcsSource;

    @OutputCustomType.Constructor({"gcsSource"})
    private GlossaryInputConfigResponse(GcsSourceResponse gcsSource) {
        this.gcsSource = gcsSource;
    }

    /**
     * Google Cloud Storage location of glossary data. File format is determined based on the filename extension. API returns [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file formats. Wildcards are not allowed. This must be a single file in one of the following formats: For unidirectional glossaries: - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated. The first column is source text. The second column is target text. The file must not contain headers. That is, the first row is data, not column names. - TMX (`.tmx`): TMX file with parallel data defining source/target term pairs. For equivalent term sets glossaries: - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms in multiple languages. See documentation for more information - [glossaries](https://cloud.google.com/translate/docs/advanced/glossary).
     * 
    */
    public GcsSourceResponse getGcsSource() {
        return this.gcsSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlossaryInputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcsSourceResponse gcsSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GlossaryInputConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsSource = defaults.gcsSource;
        }

        public Builder setGcsSource(GcsSourceResponse gcsSource) {
            this.gcsSource = Objects.requireNonNull(gcsSource);
            return this;
        }
        public GlossaryInputConfigResponse build() {
            return new GlossaryInputConfigResponse(gcsSource);
        }
    }
}
