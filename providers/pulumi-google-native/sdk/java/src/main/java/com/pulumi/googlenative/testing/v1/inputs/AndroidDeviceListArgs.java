// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing.v1.inputs.AndroidDeviceArgs;
import java.util.List;
import java.util.Objects;


/**
 * A list of Android device configurations in which the test is to be executed.
 * 
 */
public final class AndroidDeviceListArgs extends com.pulumi.resources.ResourceArgs {

    public static final AndroidDeviceListArgs Empty = new AndroidDeviceListArgs();

    /**
     * A list of Android devices.
     * 
     */
    @Import(name="androidDevices", required=true)
    private Output<List<AndroidDeviceArgs>> androidDevices;

    /**
     * @return A list of Android devices.
     * 
     */
    public Output<List<AndroidDeviceArgs>> androidDevices() {
        return this.androidDevices;
    }

    private AndroidDeviceListArgs() {}

    private AndroidDeviceListArgs(AndroidDeviceListArgs $) {
        this.androidDevices = $.androidDevices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidDeviceListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceListArgs $;

        public Builder() {
            $ = new AndroidDeviceListArgs();
        }

        public Builder(AndroidDeviceListArgs defaults) {
            $ = new AndroidDeviceListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param androidDevices A list of Android devices.
         * 
         * @return builder
         * 
         */
        public Builder androidDevices(Output<List<AndroidDeviceArgs>> androidDevices) {
            $.androidDevices = androidDevices;
            return this;
        }

        /**
         * @param androidDevices A list of Android devices.
         * 
         * @return builder
         * 
         */
        public Builder androidDevices(List<AndroidDeviceArgs> androidDevices) {
            return androidDevices(Output.of(androidDevices));
        }

        /**
         * @param androidDevices A list of Android devices.
         * 
         * @return builder
         * 
         */
        public Builder androidDevices(AndroidDeviceArgs... androidDevices) {
            return androidDevices(List.of(androidDevices));
        }

        public AndroidDeviceListArgs build() {
            $.androidDevices = Objects.requireNonNull($.androidDevices, "expected parameter 'androidDevices' to be non-null");
            return $;
        }
    }

}
