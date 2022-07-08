// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Steps taken to build the artifact. For a TaskRun, typically each container corresponds to one step in the recipe.
 * 
 */
public final class SlsaRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlsaRecipeArgs Empty = new SlsaRecipeArgs();

    /**
     * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<Map<String,String>> arguments;

    /**
     * @return Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
     * 
     */
    public Optional<Output<Map<String,String>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
     * 
     */
    @Import(name="definedInMaterial")
    private @Nullable Output<String> definedInMaterial;

    /**
     * @return Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
     * 
     */
    public Optional<Output<String>> definedInMaterial() {
        return Optional.ofNullable(this.definedInMaterial);
    }

    /**
     * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    @Import(name="entryPoint")
    private @Nullable Output<String> entryPoint;

    /**
     * @return String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
     * 
     */
    public Optional<Output<String>> entryPoint() {
        return Optional.ofNullable(this.entryPoint);
    }

    /**
     * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Map<String,String>> environment;

    /**
     * @return Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
     * 
     */
    public Optional<Output<Map<String,String>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SlsaRecipeArgs() {}

    private SlsaRecipeArgs(SlsaRecipeArgs $) {
        this.arguments = $.arguments;
        this.definedInMaterial = $.definedInMaterial;
        this.entryPoint = $.entryPoint;
        this.environment = $.environment;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlsaRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaRecipeArgs $;

        public Builder() {
            $ = new SlsaRecipeArgs();
        }

        public Builder(SlsaRecipeArgs defaults) {
            $ = new SlsaRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<Map<String,String>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were &#34;make&#34;, then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
         * 
         * @return builder
         * 
         */
        public Builder arguments(Map<String,String> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param definedInMaterial Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
         * 
         * @return builder
         * 
         */
        public Builder definedInMaterial(@Nullable Output<String> definedInMaterial) {
            $.definedInMaterial = definedInMaterial;
            return this;
        }

        /**
         * @param definedInMaterial Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn&#39;t come from a material, as zero is default unset value for int64.
         * 
         * @return builder
         * 
         */
        public Builder definedInMaterial(String definedInMaterial) {
            return definedInMaterial(Output.of(definedInMaterial));
        }

        /**
         * @param entryPoint String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
         * 
         * @return builder
         * 
         */
        public Builder entryPoint(@Nullable Output<String> entryPoint) {
            $.entryPoint = entryPoint;
            return this;
        }

        /**
         * @param entryPoint String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were &#34;make&#34;, then this would reference the directory in which to run make as well as which target to use.
         * 
         * @return builder
         * 
         */
        public Builder entryPoint(String entryPoint) {
            return entryPoint(Output.of(entryPoint));
        }

        /**
         * @param environment Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<Map<String,String>> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
         * 
         * @return builder
         * 
         */
        public Builder environment(Map<String,String> environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param type URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SlsaRecipeArgs build() {
            return $;
        }
    }

}
