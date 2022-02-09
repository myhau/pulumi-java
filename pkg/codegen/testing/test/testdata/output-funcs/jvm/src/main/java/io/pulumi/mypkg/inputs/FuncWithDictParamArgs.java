// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuncWithDictParamArgs extends io.pulumi.resources.InvokeArgs {

    public static final FuncWithDictParamArgs Empty = new FuncWithDictParamArgs();

    @InputImport(name="a")
    private final @Nullable Map<String,String> a;

    public Map<String,String> getA() {
        return this.a == null ? Map.of() : this.a;
    }

    @InputImport(name="b")
    private final @Nullable String b;

    public Optional<String> getB() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    public FuncWithDictParamArgs(
        @Nullable Map<String,String> a,
        @Nullable String b) {
        this.a = a;
        this.b = b;
    }

    private FuncWithDictParamArgs() {
        this.a = Map.of();
        this.b = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithDictParamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> a;
        private @Nullable String b;

        public Builder() {
    	      // Empty
        }

        public Builder(FuncWithDictParamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
        }

        public Builder setA(@Nullable Map<String,String> a) {
            this.a = a;
            return this;
        }

        public Builder setB(@Nullable String b) {
            this.b = b;
            return this;
        }

        public FuncWithDictParamArgs build() {
            return new FuncWithDictParamArgs(a, b);
        }
    }
}