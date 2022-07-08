// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog.v1.outputs.GoogleCloudDatacatalogV1ContactsPersonResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1ContactsResponse {
    /**
     * @return The list of contact people for the entry.
     * 
     */
    private final List<GoogleCloudDatacatalogV1ContactsPersonResponse> people;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1ContactsResponse(@CustomType.Parameter("people") List<GoogleCloudDatacatalogV1ContactsPersonResponse> people) {
        this.people = people;
    }

    /**
     * @return The list of contact people for the entry.
     * 
     */
    public List<GoogleCloudDatacatalogV1ContactsPersonResponse> people() {
        return this.people;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDatacatalogV1ContactsPersonResponse> people;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.people = defaults.people;
        }

        public Builder people(List<GoogleCloudDatacatalogV1ContactsPersonResponse> people) {
            this.people = Objects.requireNonNull(people);
            return this;
        }
        public Builder people(GoogleCloudDatacatalogV1ContactsPersonResponse... people) {
            return people(List.of(people));
        }        public GoogleCloudDatacatalogV1ContactsResponse build() {
            return new GoogleCloudDatacatalogV1ContactsResponse(people);
        }
    }
}
