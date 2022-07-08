// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExprResponse {
    /**
     * @return Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    private final String description;
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * @return Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    private final String location;
    /**
     * @return Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private ExprResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    /**
     * @return Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expression;
        private String location;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ExprResponse build() {
            return new ExprResponse(description, expression, location, title);
        }
    }
}
