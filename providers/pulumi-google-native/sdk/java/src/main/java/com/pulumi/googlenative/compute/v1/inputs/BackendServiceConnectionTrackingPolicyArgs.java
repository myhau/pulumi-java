// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends;
import com.pulumi.googlenative.compute.v1.enums.BackendServiceConnectionTrackingPolicyTrackingMode;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection Tracking configuration for this BackendService.
 * 
 */
public final class BackendServiceConnectionTrackingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceConnectionTrackingPolicyArgs Empty = new BackendServiceConnectionTrackingPolicyArgs();

    /**
     * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
     * 
     */
    @Import(name="connectionPersistenceOnUnhealthyBackends")
    private @Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends;

    /**
     * @return Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
     * 
     */
    public Optional<Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends>> connectionPersistenceOnUnhealthyBackends() {
        return Optional.ofNullable(this.connectionPersistenceOnUnhealthyBackends);
    }

    /**
     * Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
     * 
     */
    @Import(name="enableStrongAffinity")
    private @Nullable Output<Boolean> enableStrongAffinity;

    /**
     * @return Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
     * 
     */
    public Optional<Output<Boolean>> enableStrongAffinity() {
        return Optional.ofNullable(this.enableStrongAffinity);
    }

    /**
     * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
     * 
     */
    @Import(name="idleTimeoutSec")
    private @Nullable Output<Integer> idleTimeoutSec;

    /**
     * @return Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutSec() {
        return Optional.ofNullable(this.idleTimeoutSec);
    }

    /**
     * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
     * 
     */
    @Import(name="trackingMode")
    private @Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode;

    /**
     * @return Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
     * 
     */
    public Optional<Output<BackendServiceConnectionTrackingPolicyTrackingMode>> trackingMode() {
        return Optional.ofNullable(this.trackingMode);
    }

    private BackendServiceConnectionTrackingPolicyArgs() {}

    private BackendServiceConnectionTrackingPolicyArgs(BackendServiceConnectionTrackingPolicyArgs $) {
        this.connectionPersistenceOnUnhealthyBackends = $.connectionPersistenceOnUnhealthyBackends;
        this.enableStrongAffinity = $.enableStrongAffinity;
        this.idleTimeoutSec = $.idleTimeoutSec;
        this.trackingMode = $.trackingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceConnectionTrackingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceConnectionTrackingPolicyArgs $;

        public Builder() {
            $ = new BackendServiceConnectionTrackingPolicyArgs();
        }

        public Builder(BackendServiceConnectionTrackingPolicyArgs defaults) {
            $ = new BackendServiceConnectionTrackingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPersistenceOnUnhealthyBackends Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
         * 
         * @return builder
         * 
         */
        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends) {
            $.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }

        /**
         * @param connectionPersistenceOnUnhealthyBackends Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
         * 
         * @return builder
         * 
         */
        public Builder connectionPersistenceOnUnhealthyBackends(BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends connectionPersistenceOnUnhealthyBackends) {
            return connectionPersistenceOnUnhealthyBackends(Output.of(connectionPersistenceOnUnhealthyBackends));
        }

        /**
         * @param enableStrongAffinity Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
         * 
         * @return builder
         * 
         */
        public Builder enableStrongAffinity(@Nullable Output<Boolean> enableStrongAffinity) {
            $.enableStrongAffinity = enableStrongAffinity;
            return this;
        }

        /**
         * @param enableStrongAffinity Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
         * 
         * @return builder
         * 
         */
        public Builder enableStrongAffinity(Boolean enableStrongAffinity) {
            return enableStrongAffinity(Output.of(enableStrongAffinity));
        }

        /**
         * @param idleTimeoutSec Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutSec(@Nullable Output<Integer> idleTimeoutSec) {
            $.idleTimeoutSec = idleTimeoutSec;
            return this;
        }

        /**
         * @param idleTimeoutSec Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutSec(Integer idleTimeoutSec) {
            return idleTimeoutSec(Output.of(idleTimeoutSec));
        }

        /**
         * @param trackingMode Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
         * 
         * @return builder
         * 
         */
        public Builder trackingMode(@Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode) {
            $.trackingMode = trackingMode;
            return this;
        }

        /**
         * @param trackingMode Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
         * 
         * @return builder
         * 
         */
        public Builder trackingMode(BackendServiceConnectionTrackingPolicyTrackingMode trackingMode) {
            return trackingMode(Output.of(trackingMode));
        }

        public BackendServiceConnectionTrackingPolicyArgs build() {
            return $;
        }
    }

}
