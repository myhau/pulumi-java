// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionAuthenticateCognitoGetArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionAuthenticateOidcGetArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionFixedResponseGetArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionForwardGetArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerDefaultActionRedirectGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionGetArgs Empty = new ListenerDefaultActionGetArgs();

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    @InputImport(name="authenticateCognito")
      private final @Nullable Input<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito;

    public Input<ListenerDefaultActionAuthenticateCognitoGetArgs> getAuthenticateCognito() {
        return this.authenticateCognito == null ? Input.empty() : this.authenticateCognito;
    }

    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    @InputImport(name="authenticateOidc")
      private final @Nullable Input<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc;

    public Input<ListenerDefaultActionAuthenticateOidcGetArgs> getAuthenticateOidc() {
        return this.authenticateOidc == null ? Input.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @InputImport(name="fixedResponse")
      private final @Nullable Input<ListenerDefaultActionFixedResponseGetArgs> fixedResponse;

    public Input<ListenerDefaultActionFixedResponseGetArgs> getFixedResponse() {
        return this.fixedResponse == null ? Input.empty() : this.fixedResponse;
    }

    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    @InputImport(name="forward")
      private final @Nullable Input<ListenerDefaultActionForwardGetArgs> forward;

    public Input<ListenerDefaultActionForwardGetArgs> getForward() {
        return this.forward == null ? Input.empty() : this.forward;
    }

    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    @InputImport(name="order")
      private final @Nullable Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    @InputImport(name="redirect")
      private final @Nullable Input<ListenerDefaultActionRedirectGetArgs> redirect;

    public Input<ListenerDefaultActionRedirectGetArgs> getRedirect() {
        return this.redirect == null ? Input.empty() : this.redirect;
    }

    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @InputImport(name="targetGroupArn")
      private final @Nullable Input<String> targetGroupArn;

    public Input<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Input.empty() : this.targetGroupArn;
    }

    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ListenerDefaultActionGetArgs(
        @Nullable Input<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito,
        @Nullable Input<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc,
        @Nullable Input<ListenerDefaultActionFixedResponseGetArgs> fixedResponse,
        @Nullable Input<ListenerDefaultActionForwardGetArgs> forward,
        @Nullable Input<Integer> order,
        @Nullable Input<ListenerDefaultActionRedirectGetArgs> redirect,
        @Nullable Input<String> targetGroupArn,
        Input<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerDefaultActionGetArgs() {
        this.authenticateCognito = Input.empty();
        this.authenticateOidc = Input.empty();
        this.fixedResponse = Input.empty();
        this.forward = Input.empty();
        this.order = Input.empty();
        this.redirect = Input.empty();
        this.targetGroupArn = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito;
        private @Nullable Input<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc;
        private @Nullable Input<ListenerDefaultActionFixedResponseGetArgs> fixedResponse;
        private @Nullable Input<ListenerDefaultActionForwardGetArgs> forward;
        private @Nullable Input<Integer> order;
        private @Nullable Input<ListenerDefaultActionRedirectGetArgs> redirect;
        private @Nullable Input<String> targetGroupArn;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder setAuthenticateCognito(@Nullable Input<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder setAuthenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognitoGetArgs authenticateCognito) {
            this.authenticateCognito = Input.ofNullable(authenticateCognito);
            return this;
        }

        public Builder setAuthenticateOidc(@Nullable Input<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder setAuthenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidcGetArgs authenticateOidc) {
            this.authenticateOidc = Input.ofNullable(authenticateOidc);
            return this;
        }

        public Builder setFixedResponse(@Nullable Input<ListenerDefaultActionFixedResponseGetArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }

        public Builder setFixedResponse(@Nullable ListenerDefaultActionFixedResponseGetArgs fixedResponse) {
            this.fixedResponse = Input.ofNullable(fixedResponse);
            return this;
        }

        public Builder setForward(@Nullable Input<ListenerDefaultActionForwardGetArgs> forward) {
            this.forward = forward;
            return this;
        }

        public Builder setForward(@Nullable ListenerDefaultActionForwardGetArgs forward) {
            this.forward = Input.ofNullable(forward);
            return this;
        }

        public Builder setOrder(@Nullable Input<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = Input.ofNullable(order);
            return this;
        }

        public Builder setRedirect(@Nullable Input<ListenerDefaultActionRedirectGetArgs> redirect) {
            this.redirect = redirect;
            return this;
        }

        public Builder setRedirect(@Nullable ListenerDefaultActionRedirectGetArgs redirect) {
            this.redirect = Input.ofNullable(redirect);
            return this;
        }

        public Builder setTargetGroupArn(@Nullable Input<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder setTargetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Input.ofNullable(targetGroupArn);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ListenerDefaultActionGetArgs build() {
            return new ListenerDefaultActionGetArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
