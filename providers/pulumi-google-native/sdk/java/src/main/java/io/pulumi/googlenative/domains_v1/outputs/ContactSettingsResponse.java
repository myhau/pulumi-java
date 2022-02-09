// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1.outputs.ContactResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContactSettingsResponse {
    private final ContactResponse adminContact;
    private final String privacy;
    private final ContactResponse registrantContact;
    private final ContactResponse technicalContact;

    @OutputCustomType.Constructor({"adminContact","privacy","registrantContact","technicalContact"})
    private ContactSettingsResponse(
        ContactResponse adminContact,
        String privacy,
        ContactResponse registrantContact,
        ContactResponse technicalContact) {
        this.adminContact = Objects.requireNonNull(adminContact);
        this.privacy = Objects.requireNonNull(privacy);
        this.registrantContact = Objects.requireNonNull(registrantContact);
        this.technicalContact = Objects.requireNonNull(technicalContact);
    }

    public ContactResponse getAdminContact() {
        return this.adminContact;
    }
    public String getPrivacy() {
        return this.privacy;
    }
    public ContactResponse getRegistrantContact() {
        return this.registrantContact;
    }
    public ContactResponse getTechnicalContact() {
        return this.technicalContact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactResponse adminContact;
        private String privacy;
        private ContactResponse registrantContact;
        private ContactResponse technicalContact;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContact = defaults.adminContact;
    	      this.privacy = defaults.privacy;
    	      this.registrantContact = defaults.registrantContact;
    	      this.technicalContact = defaults.technicalContact;
        }

        public Builder setAdminContact(ContactResponse adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }

        public Builder setPrivacy(String privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }

        public Builder setRegistrantContact(ContactResponse registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }

        public Builder setTechnicalContact(ContactResponse technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }

        public ContactSettingsResponse build() {
            return new ContactSettingsResponse(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}