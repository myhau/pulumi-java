// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QuickConnectQuickConnectConfigUserConfig {
    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    private final String contactFlowId;
    /**
     * Specifies the identifier for the user.
     * 
     */
    private final String userId;

    @OutputCustomType.Constructor({"contactFlowId","userId"})
    private QuickConnectQuickConnectConfigUserConfig(
        String contactFlowId,
        String userId) {
        this.contactFlowId = Objects.requireNonNull(contactFlowId);
        this.userId = Objects.requireNonNull(userId);
    }

    /**
     * Specifies the identifier of the contact flow.
     * 
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }
    /**
     * Specifies the identifier for the user.
     * 
     */
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigUserConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactFlowId;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigUserConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.userId = defaults.userId;
        }

        public Builder setContactFlowId(String contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public QuickConnectQuickConnectConfigUserConfig build() {
            return new QuickConnectQuickConnectConfigUserConfig(contactFlowId, userId);
        }
    }
}
