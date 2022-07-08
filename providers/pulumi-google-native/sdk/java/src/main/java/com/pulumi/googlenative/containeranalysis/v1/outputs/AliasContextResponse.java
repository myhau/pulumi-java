// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AliasContextResponse {
    /**
     * @return The alias kind.
     * 
     */
    private final String kind;
    /**
     * @return The alias name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AliasContextResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name) {
        this.kind = kind;
        this.name = name;
    }

    /**
     * @return The alias kind.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The alias name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public AliasContextResponse build() {
            return new AliasContextResponse(kind, name);
        }
    }
}
