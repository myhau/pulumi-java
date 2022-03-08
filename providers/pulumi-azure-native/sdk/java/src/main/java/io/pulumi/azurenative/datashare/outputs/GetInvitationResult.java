// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInvitationResult {
    /**
     * The expiration date for the invitation and share subscription.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * unique invitation id
     * 
     */
    private final String invitationId;
    /**
     * The status of the invitation.
     * 
     */
    private final String invitationStatus;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * The time the recipient responded to the invitation.
     * 
     */
    private final String respondedAt;
    /**
     * Gets the time at which the invitation was sent.
     * 
     */
    private final String sentAt;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The target Azure AD Id. Can't be combined with email.
     * 
     */
    private final @Nullable String targetActiveDirectoryId;
    /**
     * The email the invitation is directed to.
     * 
     */
    private final @Nullable String targetEmail;
    /**
     * The target user or application Id that invitation is being sent to.
     * Must be specified along TargetActiveDirectoryId. This enables sending
     * invitations to specific users or applications in an AD tenant.
     * 
     */
    private final @Nullable String targetObjectId;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;
    /**
     * Email of the user who created the resource
     * 
     */
    private final String userEmail;
    /**
     * Name of the user who created the resource
     * 
     */
    private final String userName;

    @OutputCustomType.Constructor({"expirationDate","id","invitationId","invitationStatus","name","respondedAt","sentAt","systemData","targetActiveDirectoryId","targetEmail","targetObjectId","type","userEmail","userName"})
    private GetInvitationResult(
        @Nullable String expirationDate,
        String id,
        String invitationId,
        String invitationStatus,
        String name,
        String respondedAt,
        String sentAt,
        SystemDataResponse systemData,
        @Nullable String targetActiveDirectoryId,
        @Nullable String targetEmail,
        @Nullable String targetObjectId,
        String type,
        String userEmail,
        String userName) {
        this.expirationDate = expirationDate;
        this.id = id;
        this.invitationId = invitationId;
        this.invitationStatus = invitationStatus;
        this.name = name;
        this.respondedAt = respondedAt;
        this.sentAt = sentAt;
        this.systemData = systemData;
        this.targetActiveDirectoryId = targetActiveDirectoryId;
        this.targetEmail = targetEmail;
        this.targetObjectId = targetObjectId;
        this.type = type;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    /**
     * The expiration date for the invitation and share subscription.
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * unique invitation id
     * 
    */
    public String getInvitationId() {
        return this.invitationId;
    }
    /**
     * The status of the invitation.
     * 
    */
    public String getInvitationStatus() {
        return this.invitationStatus;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The time the recipient responded to the invitation.
     * 
    */
    public String getRespondedAt() {
        return this.respondedAt;
    }
    /**
     * Gets the time at which the invitation was sent.
     * 
    */
    public String getSentAt() {
        return this.sentAt;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The target Azure AD Id. Can't be combined with email.
     * 
    */
    public Optional<String> getTargetActiveDirectoryId() {
        return Optional.ofNullable(this.targetActiveDirectoryId);
    }
    /**
     * The email the invitation is directed to.
     * 
    */
    public Optional<String> getTargetEmail() {
        return Optional.ofNullable(this.targetEmail);
    }
    /**
     * The target user or application Id that invitation is being sent to.
     * Must be specified along TargetActiveDirectoryId. This enables sending
     * invitations to specific users or applications in an AD tenant.
     * 
    */
    public Optional<String> getTargetObjectId() {
        return Optional.ofNullable(this.targetObjectId);
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Email of the user who created the resource
     * 
    */
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Name of the user who created the resource
     * 
    */
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvitationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expirationDate;
        private String id;
        private String invitationId;
        private String invitationStatus;
        private String name;
        private String respondedAt;
        private String sentAt;
        private SystemDataResponse systemData;
        private @Nullable String targetActiveDirectoryId;
        private @Nullable String targetEmail;
        private @Nullable String targetObjectId;
        private String type;
        private String userEmail;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvitationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.invitationId = defaults.invitationId;
    	      this.invitationStatus = defaults.invitationStatus;
    	      this.name = defaults.name;
    	      this.respondedAt = defaults.respondedAt;
    	      this.sentAt = defaults.sentAt;
    	      this.systemData = defaults.systemData;
    	      this.targetActiveDirectoryId = defaults.targetActiveDirectoryId;
    	      this.targetEmail = defaults.targetEmail;
    	      this.targetObjectId = defaults.targetObjectId;
    	      this.type = defaults.type;
    	      this.userEmail = defaults.userEmail;
    	      this.userName = defaults.userName;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInvitationId(String invitationId) {
            this.invitationId = Objects.requireNonNull(invitationId);
            return this;
        }

        public Builder setInvitationStatus(String invitationStatus) {
            this.invitationStatus = Objects.requireNonNull(invitationStatus);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRespondedAt(String respondedAt) {
            this.respondedAt = Objects.requireNonNull(respondedAt);
            return this;
        }

        public Builder setSentAt(String sentAt) {
            this.sentAt = Objects.requireNonNull(sentAt);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTargetActiveDirectoryId(@Nullable String targetActiveDirectoryId) {
            this.targetActiveDirectoryId = targetActiveDirectoryId;
            return this;
        }

        public Builder setTargetEmail(@Nullable String targetEmail) {
            this.targetEmail = targetEmail;
            return this;
        }

        public Builder setTargetObjectId(@Nullable String targetObjectId) {
            this.targetObjectId = targetObjectId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetInvitationResult build() {
            return new GetInvitationResult(expirationDate, id, invitationId, invitationStatus, name, respondedAt, sentAt, systemData, targetActiveDirectoryId, targetEmail, targetObjectId, type, userEmail, userName);
        }
    }
}
