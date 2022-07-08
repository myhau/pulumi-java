// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteResponse {
    /**
     * @return The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final String condition;
    /**
     * @return The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    private final String intent;
    /**
     * @return The unique identifier of this transition route.
     * 
     */
    private final String name;
    /**
     * @return The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    private final String targetFlow;
    /**
     * @return The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    private final String targetPage;
    /**
     * @return The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1TransitionRouteResponse(
        @CustomType.Parameter("condition") String condition,
        @CustomType.Parameter("intent") String intent,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("targetFlow") String targetFlow,
        @CustomType.Parameter("targetPage") String targetPage,
        @CustomType.Parameter("triggerFulfillment") GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
        this.condition = condition;
        this.intent = intent;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    /**
     * @return The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    public String intent() {
        return this.intent;
    }
    /**
     * @return The unique identifier of this transition route.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    public String targetFlow() {
        return this.targetFlow;
    }
    /**
     * @return The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    public String targetPage() {
        return this.targetPage;
    }
    /**
     * @return The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment() {
        return this.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TransitionRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String condition;
        private String intent;
        private String name;
        private String targetFlow;
        private String targetPage;
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TransitionRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder intent(String intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder targetFlow(String targetFlow) {
            this.targetFlow = Objects.requireNonNull(targetFlow);
            return this;
        }
        public Builder targetPage(String targetPage) {
            this.targetPage = Objects.requireNonNull(targetPage);
            return this;
        }
        public Builder triggerFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse triggerFulfillment) {
            this.triggerFulfillment = Objects.requireNonNull(triggerFulfillment);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1TransitionRouteResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TransitionRouteResponse(condition, intent, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
