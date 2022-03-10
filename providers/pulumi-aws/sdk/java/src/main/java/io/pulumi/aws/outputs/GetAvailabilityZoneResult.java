// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.aws.outputs.GetAvailabilityZoneFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAvailabilityZoneResult {
    private final @Nullable Boolean allAvailabilityZones;
    private final @Nullable List<GetAvailabilityZoneFilter> filters;
    /**
     * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
     * 
     */
    private final String groupName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
     * For Availability Zones this is usually a single letter, for example `a` for the `us-west-2a` zone.
     * For Local and Wavelength Zones this is a longer string, for example `wl1-sfo-wlz-1` for the `us-west-2-wl1-sfo-wlz-1` zone.
     * 
     */
    private final String nameSuffix;
    /**
     * The name of the location from which the address is advertised.
     * 
     */
    private final String networkBorderGroup;
    /**
     * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
     * 
     */
    private final String optInStatus;
    /**
     * The ID of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     * 
     */
    private final String parentZoneId;
    /**
     * The name of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     * 
     */
    private final String parentZoneName;
    /**
     * The region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
     * 
     */
    private final String region;
    private final String state;
    private final String zoneId;
    /**
     * The type of zone. Values are `availability-zone`, `local-zone`, and `wavelength-zone`.
     * 
     */
    private final String zoneType;

    @OutputCustomType.Constructor({"allAvailabilityZones","filters","groupName","id","name","nameSuffix","networkBorderGroup","optInStatus","parentZoneId","parentZoneName","region","state","zoneId","zoneType"})
    private GetAvailabilityZoneResult(
        @Nullable Boolean allAvailabilityZones,
        @Nullable List<GetAvailabilityZoneFilter> filters,
        String groupName,
        String id,
        String name,
        String nameSuffix,
        String networkBorderGroup,
        String optInStatus,
        String parentZoneId,
        String parentZoneName,
        String region,
        String state,
        String zoneId,
        String zoneType) {
        this.allAvailabilityZones = allAvailabilityZones;
        this.filters = filters;
        this.groupName = groupName;
        this.id = id;
        this.name = name;
        this.nameSuffix = nameSuffix;
        this.networkBorderGroup = networkBorderGroup;
        this.optInStatus = optInStatus;
        this.parentZoneId = parentZoneId;
        this.parentZoneName = parentZoneName;
        this.region = region;
        this.state = state;
        this.zoneId = zoneId;
        this.zoneType = zoneType;
    }

    public Optional<Boolean> getAllAvailabilityZones() {
        return Optional.ofNullable(this.allAvailabilityZones);
    }
    public List<GetAvailabilityZoneFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * For Availability Zones, this is the same value as the Region name. For Local Zones, the name of the associated group, for example `us-west-2-lax-1`.
     * 
    */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The part of the AZ name that appears after the region name, uniquely identifying the AZ within its region.
     * For Availability Zones this is usually a single letter, for example `a` for the `us-west-2a` zone.
     * For Local and Wavelength Zones this is a longer string, for example `wl1-sfo-wlz-1` for the `us-west-2-wl1-sfo-wlz-1` zone.
     * 
    */
    public String getNameSuffix() {
        return this.nameSuffix;
    }
    /**
     * The name of the location from which the address is advertised.
     * 
    */
    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }
    /**
     * For Availability Zones, this always has the value of `opt-in-not-required`. For Local Zones, this is the opt in status. The possible values are `opted-in` and `not-opted-in`.
     * 
    */
    public String getOptInStatus() {
        return this.optInStatus;
    }
    /**
     * The ID of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     * 
    */
    public String getParentZoneId() {
        return this.parentZoneId;
    }
    /**
     * The name of the zone that handles some of the Local Zone or Wavelength Zone control plane operations, such as API calls.
     * 
    */
    public String getParentZoneName() {
        return this.parentZoneName;
    }
    /**
     * The region where the selected availability zone resides. This is always the region selected on the provider, since this data source searches only within that region.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    public String getState() {
        return this.state;
    }
    public String getZoneId() {
        return this.zoneId;
    }
    /**
     * The type of zone. Values are `availability-zone`, `local-zone`, and `wavelength-zone`.
     * 
    */
    public String getZoneType() {
        return this.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allAvailabilityZones;
        private @Nullable List<GetAvailabilityZoneFilter> filters;
        private String groupName;
        private String id;
        private String name;
        private String nameSuffix;
        private String networkBorderGroup;
        private String optInStatus;
        private String parentZoneId;
        private String parentZoneName;
        private String region;
        private String state;
        private String zoneId;
        private String zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allAvailabilityZones = defaults.allAvailabilityZones;
    	      this.filters = defaults.filters;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nameSuffix = defaults.nameSuffix;
    	      this.networkBorderGroup = defaults.networkBorderGroup;
    	      this.optInStatus = defaults.optInStatus;
    	      this.parentZoneId = defaults.parentZoneId;
    	      this.parentZoneName = defaults.parentZoneName;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
    	      this.zoneId = defaults.zoneId;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder setAllAvailabilityZones(@Nullable Boolean allAvailabilityZones) {
            this.allAvailabilityZones = allAvailabilityZones;
            return this;
        }

        public Builder setFilters(@Nullable List<GetAvailabilityZoneFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNameSuffix(String nameSuffix) {
            this.nameSuffix = Objects.requireNonNull(nameSuffix);
            return this;
        }

        public Builder setNetworkBorderGroup(String networkBorderGroup) {
            this.networkBorderGroup = Objects.requireNonNull(networkBorderGroup);
            return this;
        }

        public Builder setOptInStatus(String optInStatus) {
            this.optInStatus = Objects.requireNonNull(optInStatus);
            return this;
        }

        public Builder setParentZoneId(String parentZoneId) {
            this.parentZoneId = Objects.requireNonNull(parentZoneId);
            return this;
        }

        public Builder setParentZoneName(String parentZoneName) {
            this.parentZoneName = Objects.requireNonNull(parentZoneName);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setZoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }

        public Builder setZoneType(String zoneType) {
            this.zoneType = Objects.requireNonNull(zoneType);
            return this;
        }
        public GetAvailabilityZoneResult build() {
            return new GetAvailabilityZoneResult(allAvailabilityZones, filters, groupName, id, name, nameSuffix, networkBorderGroup, optInStatus, parentZoneId, parentZoneName, region, state, zoneId, zoneType);
        }
    }
}