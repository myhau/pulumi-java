// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.inputs.InTotoProvenanceArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.SlsaProvenanceArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.SlsaProvenanceZeroTwoArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Spec defined at https://github.com/in-toto/attestation/tree/main/spec#statement The serialized InTotoStatement will be stored as Envelope.payload. Envelope.payloadType is always &#34;application/vnd.in-toto+json&#34;.
 * 
 */
public final class InTotoStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final InTotoStatementArgs Empty = new InTotoStatementArgs();

    /**
     * `https://slsa.dev/provenance/v0.1` for SlsaProvenance.
     * 
     */
    @Import(name="predicateType")
    private @Nullable Output<String> predicateType;

    /**
     * @return `https://slsa.dev/provenance/v0.1` for SlsaProvenance.
     * 
     */
    public Optional<Output<String>> predicateType() {
        return Optional.ofNullable(this.predicateType);
    }

    @Import(name="provenance")
    private @Nullable Output<InTotoProvenanceArgs> provenance;

    public Optional<Output<InTotoProvenanceArgs>> provenance() {
        return Optional.ofNullable(this.provenance);
    }

    @Import(name="slsaProvenance")
    private @Nullable Output<SlsaProvenanceArgs> slsaProvenance;

    public Optional<Output<SlsaProvenanceArgs>> slsaProvenance() {
        return Optional.ofNullable(this.slsaProvenance);
    }

    @Import(name="slsaProvenanceZeroTwo")
    private @Nullable Output<SlsaProvenanceZeroTwoArgs> slsaProvenanceZeroTwo;

    public Optional<Output<SlsaProvenanceZeroTwoArgs>> slsaProvenanceZeroTwo() {
        return Optional.ofNullable(this.slsaProvenanceZeroTwo);
    }

    @Import(name="subject")
    private @Nullable Output<List<SubjectArgs>> subject;

    public Optional<Output<List<SubjectArgs>>> subject() {
        return Optional.ofNullable(this.subject);
    }

    /**
     * Always `https://in-toto.io/Statement/v0.1`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Always `https://in-toto.io/Statement/v0.1`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private InTotoStatementArgs() {}

    private InTotoStatementArgs(InTotoStatementArgs $) {
        this.predicateType = $.predicateType;
        this.provenance = $.provenance;
        this.slsaProvenance = $.slsaProvenance;
        this.slsaProvenanceZeroTwo = $.slsaProvenanceZeroTwo;
        this.subject = $.subject;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InTotoStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InTotoStatementArgs $;

        public Builder() {
            $ = new InTotoStatementArgs();
        }

        public Builder(InTotoStatementArgs defaults) {
            $ = new InTotoStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param predicateType `https://slsa.dev/provenance/v0.1` for SlsaProvenance.
         * 
         * @return builder
         * 
         */
        public Builder predicateType(@Nullable Output<String> predicateType) {
            $.predicateType = predicateType;
            return this;
        }

        /**
         * @param predicateType `https://slsa.dev/provenance/v0.1` for SlsaProvenance.
         * 
         * @return builder
         * 
         */
        public Builder predicateType(String predicateType) {
            return predicateType(Output.of(predicateType));
        }

        public Builder provenance(@Nullable Output<InTotoProvenanceArgs> provenance) {
            $.provenance = provenance;
            return this;
        }

        public Builder provenance(InTotoProvenanceArgs provenance) {
            return provenance(Output.of(provenance));
        }

        public Builder slsaProvenance(@Nullable Output<SlsaProvenanceArgs> slsaProvenance) {
            $.slsaProvenance = slsaProvenance;
            return this;
        }

        public Builder slsaProvenance(SlsaProvenanceArgs slsaProvenance) {
            return slsaProvenance(Output.of(slsaProvenance));
        }

        public Builder slsaProvenanceZeroTwo(@Nullable Output<SlsaProvenanceZeroTwoArgs> slsaProvenanceZeroTwo) {
            $.slsaProvenanceZeroTwo = slsaProvenanceZeroTwo;
            return this;
        }

        public Builder slsaProvenanceZeroTwo(SlsaProvenanceZeroTwoArgs slsaProvenanceZeroTwo) {
            return slsaProvenanceZeroTwo(Output.of(slsaProvenanceZeroTwo));
        }

        public Builder subject(@Nullable Output<List<SubjectArgs>> subject) {
            $.subject = subject;
            return this;
        }

        public Builder subject(List<SubjectArgs> subject) {
            return subject(Output.of(subject));
        }

        public Builder subject(SubjectArgs... subject) {
            return subject(List.of(subject));
        }

        /**
         * @param type Always `https://in-toto.io/Statement/v0.1`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Always `https://in-toto.io/Statement/v0.1`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public InTotoStatementArgs build() {
            return $;
        }
    }

}
