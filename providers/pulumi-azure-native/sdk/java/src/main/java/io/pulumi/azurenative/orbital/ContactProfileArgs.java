// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.orbital.enums.AutoTrackingConfiguration;
import io.pulumi.azurenative.orbital.inputs.ContactProfileLinkArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactProfileArgs Empty = new ContactProfileArgs();

    /**
     * Auto track configuration.
     * 
     */
    @Import(name="autoTrackingConfiguration")
      private final @Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration;

    public Output<AutoTrackingConfiguration> autoTrackingConfiguration() {
        return this.autoTrackingConfiguration == null ? Codegen.empty() : this.autoTrackingConfiguration;
    }

    /**
     * Contact Profile Name
     * 
     */
    @Import(name="contactProfileName")
      private final @Nullable Output<String> contactProfileName;

    public Output<String> contactProfileName() {
        return this.contactProfileName == null ? Codegen.empty() : this.contactProfileName;
    }

    /**
     * The URI of the Event Hub used for telemetry
     * 
     */
    @Import(name="eventHubUri")
      private final @Nullable Output<String> eventHubUri;

    public Output<String> eventHubUri() {
        return this.eventHubUri == null ? Codegen.empty() : this.eventHubUri;
    }

    /**
     * Links of the Contact Profile
     * 
     */
    @Import(name="links", required=true)
      private final Output<List<ContactProfileLinkArgs>> links;

    public Output<List<ContactProfileLinkArgs>> links() {
        return this.links;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    @Import(name="minimumElevationDegrees")
      private final @Nullable Output<Double> minimumElevationDegrees;

    public Output<Double> minimumElevationDegrees() {
        return this.minimumElevationDegrees == null ? Codegen.empty() : this.minimumElevationDegrees;
    }

    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
     */
    @Import(name="minimumViableContactDuration")
      private final @Nullable Output<String> minimumViableContactDuration;

    public Output<String> minimumViableContactDuration() {
        return this.minimumViableContactDuration == null ? Codegen.empty() : this.minimumViableContactDuration;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ContactProfileArgs(
        @Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration,
        @Nullable Output<String> contactProfileName,
        @Nullable Output<String> eventHubUri,
        Output<List<ContactProfileLinkArgs>> links,
        @Nullable Output<String> location,
        @Nullable Output<Double> minimumElevationDegrees,
        @Nullable Output<String> minimumViableContactDuration,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.autoTrackingConfiguration = autoTrackingConfiguration;
        this.contactProfileName = contactProfileName;
        this.eventHubUri = eventHubUri;
        this.links = Objects.requireNonNull(links, "expected parameter 'links' to be non-null");
        this.location = location;
        this.minimumElevationDegrees = minimumElevationDegrees;
        this.minimumViableContactDuration = minimumViableContactDuration;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ContactProfileArgs() {
        this.autoTrackingConfiguration = Codegen.empty();
        this.contactProfileName = Codegen.empty();
        this.eventHubUri = Codegen.empty();
        this.links = Codegen.empty();
        this.location = Codegen.empty();
        this.minimumElevationDegrees = Codegen.empty();
        this.minimumViableContactDuration = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration;
        private @Nullable Output<String> contactProfileName;
        private @Nullable Output<String> eventHubUri;
        private Output<List<ContactProfileLinkArgs>> links;
        private @Nullable Output<String> location;
        private @Nullable Output<Double> minimumElevationDegrees;
        private @Nullable Output<String> minimumViableContactDuration;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoTrackingConfiguration = defaults.autoTrackingConfiguration;
    	      this.contactProfileName = defaults.contactProfileName;
    	      this.eventHubUri = defaults.eventHubUri;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.minimumElevationDegrees = defaults.minimumElevationDegrees;
    	      this.minimumViableContactDuration = defaults.minimumViableContactDuration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder autoTrackingConfiguration(@Nullable Output<AutoTrackingConfiguration> autoTrackingConfiguration) {
            this.autoTrackingConfiguration = autoTrackingConfiguration;
            return this;
        }
        public Builder autoTrackingConfiguration(@Nullable AutoTrackingConfiguration autoTrackingConfiguration) {
            this.autoTrackingConfiguration = Codegen.ofNullable(autoTrackingConfiguration);
            return this;
        }
        public Builder contactProfileName(@Nullable Output<String> contactProfileName) {
            this.contactProfileName = contactProfileName;
            return this;
        }
        public Builder contactProfileName(@Nullable String contactProfileName) {
            this.contactProfileName = Codegen.ofNullable(contactProfileName);
            return this;
        }
        public Builder eventHubUri(@Nullable Output<String> eventHubUri) {
            this.eventHubUri = eventHubUri;
            return this;
        }
        public Builder eventHubUri(@Nullable String eventHubUri) {
            this.eventHubUri = Codegen.ofNullable(eventHubUri);
            return this;
        }
        public Builder links(Output<List<ContactProfileLinkArgs>> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }
        public Builder links(List<ContactProfileLinkArgs> links) {
            this.links = Output.of(Objects.requireNonNull(links));
            return this;
        }
        public Builder links(ContactProfileLinkArgs... links) {
            return links(List.of(links));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder minimumElevationDegrees(@Nullable Output<Double> minimumElevationDegrees) {
            this.minimumElevationDegrees = minimumElevationDegrees;
            return this;
        }
        public Builder minimumElevationDegrees(@Nullable Double minimumElevationDegrees) {
            this.minimumElevationDegrees = Codegen.ofNullable(minimumElevationDegrees);
            return this;
        }
        public Builder minimumViableContactDuration(@Nullable Output<String> minimumViableContactDuration) {
            this.minimumViableContactDuration = minimumViableContactDuration;
            return this;
        }
        public Builder minimumViableContactDuration(@Nullable String minimumViableContactDuration) {
            this.minimumViableContactDuration = Codegen.ofNullable(minimumViableContactDuration);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ContactProfileArgs build() {
            return new ContactProfileArgs(autoTrackingConfiguration, contactProfileName, eventHubUri, links, location, minimumElevationDegrees, minimumViableContactDuration, resourceGroupName, tags);
        }
    }
}
