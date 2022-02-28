// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReceiptRuleAddHeaderActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleAddHeaderActionGetArgs Empty = new ReceiptRuleAddHeaderActionGetArgs();

    /**
     * The name of the header to add
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value of the header to add
     * 
     */
    @InputImport(name="headerValue", required=true)
      private final Input<String> headerValue;

    public Input<String> getHeaderValue() {
        return this.headerValue;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @InputImport(name="position", required=true)
      private final Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position;
    }

    public ReceiptRuleAddHeaderActionGetArgs(
        Input<String> headerName,
        Input<String> headerValue,
        Input<Integer> position) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private ReceiptRuleAddHeaderActionGetArgs() {
        this.headerName = Input.empty();
        this.headerValue = Input.empty();
        this.position = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;
        private Input<String> headerValue;
        private Input<Integer> position;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.position = defaults.position;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setHeaderValue(Input<String> headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder setHeaderValue(String headerValue) {
            this.headerValue = Input.of(Objects.requireNonNull(headerValue));
            return this;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }
        public ReceiptRuleAddHeaderActionGetArgs build() {
            return new ReceiptRuleAddHeaderActionGetArgs(headerName, headerValue, position);
        }
    }
}
