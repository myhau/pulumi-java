// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.BandwidthScheduleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBandwidthSettingResult {
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The schedules.
     * 
     */
    private final List<BandwidthScheduleResponse> schedules;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The number of volumes that uses the bandwidth setting.
     * 
     */
    private final Integer volumeCount;

    @CustomType.Constructor
    private GetBandwidthSettingResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedules") List<BandwidthScheduleResponse> schedules,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeCount") Integer volumeCount) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.schedules = schedules;
        this.type = type;
        this.volumeCount = volumeCount;
    }

    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name of the object.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The schedules.
     * 
    */
    public List<BandwidthScheduleResponse> schedules() {
        return this.schedules;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The number of volumes that uses the bandwidth setting.
     * 
    */
    public Integer volumeCount() {
        return this.volumeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBandwidthSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private List<BandwidthScheduleResponse> schedules;
        private String type;
        private Integer volumeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBandwidthSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.type = defaults.type;
    	      this.volumeCount = defaults.volumeCount;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedules(List<BandwidthScheduleResponse> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(BandwidthScheduleResponse... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeCount(Integer volumeCount) {
            this.volumeCount = Objects.requireNonNull(volumeCount);
            return this;
        }        public GetBandwidthSettingResult build() {
            return new GetBandwidthSettingResult(id, kind, name, schedules, type, volumeCount);
        }
    }
}
