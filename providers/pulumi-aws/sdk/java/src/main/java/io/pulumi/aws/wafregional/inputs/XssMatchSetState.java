// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class XssMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final XssMatchSetState Empty = new XssMatchSetState();

    /**
     * The name of the set
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    @InputImport(name="xssMatchTuples")
      private final @Nullable Input<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples;

    public Input<List<XssMatchSetXssMatchTupleGetArgs>> getXssMatchTuples() {
        return this.xssMatchTuples == null ? Input.empty() : this.xssMatchTuples;
    }

    public XssMatchSetState(
        @Nullable Input<String> name,
        @Nullable Input<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples) {
        this.name = name;
        this.xssMatchTuples = xssMatchTuples;
    }

    private XssMatchSetState() {
        this.name = Input.empty();
        this.xssMatchTuples = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.xssMatchTuples = defaults.xssMatchTuples;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setXssMatchTuples(@Nullable Input<List<XssMatchSetXssMatchTupleGetArgs>> xssMatchTuples) {
            this.xssMatchTuples = xssMatchTuples;
            return this;
        }

        public Builder setXssMatchTuples(@Nullable List<XssMatchSetXssMatchTupleGetArgs> xssMatchTuples) {
            this.xssMatchTuples = Input.ofNullable(xssMatchTuples);
            return this;
        }
        public XssMatchSetState build() {
            return new XssMatchSetState(name, xssMatchTuples);
        }
    }
}