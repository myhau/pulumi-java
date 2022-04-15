// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VnetRouteResponse {
    /**
     * The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     */
    private final @Nullable String endAddress;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
     */
    private final @Nullable String routeType;
    /**
     * The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     */
    private final @Nullable String startAddress;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private VnetRouteResponse(
        @CustomType.Parameter("endAddress") @Nullable String endAddress,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("routeType") @Nullable String routeType,
        @CustomType.Parameter("startAddress") @Nullable String startAddress,
        @CustomType.Parameter("type") String type) {
        this.endAddress = endAddress;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.routeType = routeType;
        this.startAddress = startAddress;
        this.type = type;
    }

    /**
     * The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
    */
    public Optional<String> endAddress() {
        return Optional.ofNullable(this.endAddress);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app's routes with those from a Virtual Network.
     * 
    */
    public Optional<String> routeType() {
        return Optional.ofNullable(this.routeType);
    }
    /**
     * The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
    */
    public Optional<String> startAddress() {
        return Optional.ofNullable(this.startAddress);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endAddress;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String routeType;
        private @Nullable String startAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAddress = defaults.endAddress;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routeType = defaults.routeType;
    	      this.startAddress = defaults.startAddress;
    	      this.type = defaults.type;
        }

        public Builder endAddress(@Nullable String endAddress) {
            this.endAddress = endAddress;
            return this;
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
        public Builder routeType(@Nullable String routeType) {
            this.routeType = routeType;
            return this;
        }
        public Builder startAddress(@Nullable String startAddress) {
            this.startAddress = startAddress;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public VnetRouteResponse build() {
            return new VnetRouteResponse(endAddress, id, kind, name, routeType, startAddress, type);
        }
    }
}
