// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs Empty = new CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs();

    /**
     * Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="commonName")
      private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    /**
     * Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
     * 
     */
    @InputImport(name="country")
      private final @Nullable Input<String> country;

    public Input<String> getCountry() {
        return this.country == null ? Input.empty() : this.country;
    }

    /**
     * Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="distinguishedNameQualifier")
      private final @Nullable Input<String> distinguishedNameQualifier;

    public Input<String> getDistinguishedNameQualifier() {
        return this.distinguishedNameQualifier == null ? Input.empty() : this.distinguishedNameQualifier;
    }

    /**
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
     * 
     */
    @InputImport(name="generationQualifier")
      private final @Nullable Input<String> generationQualifier;

    public Input<String> getGenerationQualifier() {
        return this.generationQualifier == null ? Input.empty() : this.generationQualifier;
    }

    /**
     * First name. Must be less than or equal to 16 characters in length.
     * 
     */
    @InputImport(name="givenName")
      private final @Nullable Input<String> givenName;

    public Input<String> getGivenName() {
        return this.givenName == null ? Input.empty() : this.givenName;
    }

    /**
     * Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
     * 
     */
    @InputImport(name="initials")
      private final @Nullable Input<String> initials;

    public Input<String> getInitials() {
        return this.initials == null ? Input.empty() : this.initials;
    }

    /**
     * The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
     * 
     */
    @InputImport(name="locality")
      private final @Nullable Input<String> locality;

    public Input<String> getLocality() {
        return this.locality == null ? Input.empty() : this.locality;
    }

    /**
     * Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="organization")
      private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    /**
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="organizationalUnit")
      private final @Nullable Input<String> organizationalUnit;

    public Input<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Input.empty() : this.organizationalUnit;
    }

    /**
     * Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
     * 
     */
    @InputImport(name="pseudonym")
      private final @Nullable Input<String> pseudonym;

    public Input<String> getPseudonym() {
        return this.pseudonym == null ? Input.empty() : this.pseudonym;
    }

    /**
     * State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
     * 
     */
    @InputImport(name="surname")
      private final @Nullable Input<String> surname;

    public Input<String> getSurname() {
        return this.surname == null ? Input.empty() : this.surname;
    }

    /**
     * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs(
        @Nullable Input<String> commonName,
        @Nullable Input<String> country,
        @Nullable Input<String> distinguishedNameQualifier,
        @Nullable Input<String> generationQualifier,
        @Nullable Input<String> givenName,
        @Nullable Input<String> initials,
        @Nullable Input<String> locality,
        @Nullable Input<String> organization,
        @Nullable Input<String> organizationalUnit,
        @Nullable Input<String> pseudonym,
        @Nullable Input<String> state,
        @Nullable Input<String> surname,
        @Nullable Input<String> title) {
        this.commonName = commonName;
        this.country = country;
        this.distinguishedNameQualifier = distinguishedNameQualifier;
        this.generationQualifier = generationQualifier;
        this.givenName = givenName;
        this.initials = initials;
        this.locality = locality;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.pseudonym = pseudonym;
        this.state = state;
        this.surname = surname;
        this.title = title;
    }

    private CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs() {
        this.commonName = Input.empty();
        this.country = Input.empty();
        this.distinguishedNameQualifier = Input.empty();
        this.generationQualifier = Input.empty();
        this.givenName = Input.empty();
        this.initials = Input.empty();
        this.locality = Input.empty();
        this.organization = Input.empty();
        this.organizationalUnit = Input.empty();
        this.pseudonym = Input.empty();
        this.state = Input.empty();
        this.surname = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commonName;
        private @Nullable Input<String> country;
        private @Nullable Input<String> distinguishedNameQualifier;
        private @Nullable Input<String> generationQualifier;
        private @Nullable Input<String> givenName;
        private @Nullable Input<String> initials;
        private @Nullable Input<String> locality;
        private @Nullable Input<String> organization;
        private @Nullable Input<String> organizationalUnit;
        private @Nullable Input<String> pseudonym;
        private @Nullable Input<String> state;
        private @Nullable Input<String> surname;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.country = defaults.country;
    	      this.distinguishedNameQualifier = defaults.distinguishedNameQualifier;
    	      this.generationQualifier = defaults.generationQualifier;
    	      this.givenName = defaults.givenName;
    	      this.initials = defaults.initials;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.pseudonym = defaults.pseudonym;
    	      this.state = defaults.state;
    	      this.surname = defaults.surname;
    	      this.title = defaults.title;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setCountry(@Nullable Input<String> country) {
            this.country = country;
            return this;
        }

        public Builder setCountry(@Nullable String country) {
            this.country = Input.ofNullable(country);
            return this;
        }

        public Builder setDistinguishedNameQualifier(@Nullable Input<String> distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        public Builder setDistinguishedNameQualifier(@Nullable String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = Input.ofNullable(distinguishedNameQualifier);
            return this;
        }

        public Builder setGenerationQualifier(@Nullable Input<String> generationQualifier) {
            this.generationQualifier = generationQualifier;
            return this;
        }

        public Builder setGenerationQualifier(@Nullable String generationQualifier) {
            this.generationQualifier = Input.ofNullable(generationQualifier);
            return this;
        }

        public Builder setGivenName(@Nullable Input<String> givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder setGivenName(@Nullable String givenName) {
            this.givenName = Input.ofNullable(givenName);
            return this;
        }

        public Builder setInitials(@Nullable Input<String> initials) {
            this.initials = initials;
            return this;
        }

        public Builder setInitials(@Nullable String initials) {
            this.initials = Input.ofNullable(initials);
            return this;
        }

        public Builder setLocality(@Nullable Input<String> locality) {
            this.locality = locality;
            return this;
        }

        public Builder setLocality(@Nullable String locality) {
            this.locality = Input.ofNullable(locality);
            return this;
        }

        public Builder setOrganization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder setOrganization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable Input<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Input.ofNullable(organizationalUnit);
            return this;
        }

        public Builder setPseudonym(@Nullable Input<String> pseudonym) {
            this.pseudonym = pseudonym;
            return this;
        }

        public Builder setPseudonym(@Nullable String pseudonym) {
            this.pseudonym = Input.ofNullable(pseudonym);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSurname(@Nullable Input<String> surname) {
            this.surname = surname;
            return this;
        }

        public Builder setSurname(@Nullable String surname) {
            this.surname = Input.ofNullable(surname);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs build() {
            return new CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs(commonName, country, distinguishedNameQualifier, generationQualifier, givenName, initials, locality, organization, organizationalUnit, pseudonym, state, surname, title);
        }
    }
}
