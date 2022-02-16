// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.WirelessDeviceArgs;
import io.pulumi.awsnative.iotwireless.enums.WirelessDeviceType;
import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceLoRaWANDevice;
import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iotwireless:WirelessDevice")
public class WirelessDevice extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="destinationName", type=String.class, parameters={})
    private Output<String> destinationName;

    public Output<String> getDestinationName() {
        return this.destinationName;
    }
    @OutputExport(name="lastUplinkReceivedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastUplinkReceivedAt;

    public Output</* @Nullable */ String> getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt;
    }
    @OutputExport(name="loRaWAN", type=WirelessDeviceLoRaWANDevice.class, parameters={})
    private Output</* @Nullable */ WirelessDeviceLoRaWANDevice> loRaWAN;

    public Output</* @Nullable */ WirelessDeviceLoRaWANDevice> getLoRaWAN() {
        return this.loRaWAN;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={WirelessDeviceTag.class})
    private Output</* @Nullable */ List<WirelessDeviceTag>> tags;

    public Output</* @Nullable */ List<WirelessDeviceTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="thingArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> thingArn;

    public Output</* @Nullable */ String> getThingArn() {
        return this.thingArn;
    }
    @OutputExport(name="thingName", type=String.class, parameters={})
    private Output<String> thingName;

    public Output<String> getThingName() {
        return this.thingName;
    }
    @OutputExport(name="type", type=WirelessDeviceType.class, parameters={})
    private Output<WirelessDeviceType> type;

    public Output<WirelessDeviceType> getType() {
        return this.type;
    }

    public WirelessDevice(String name, WirelessDeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:WirelessDevice", name, args == null ? WirelessDeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WirelessDevice(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:WirelessDevice", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WirelessDevice get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WirelessDevice(name, id, options);
    }
}