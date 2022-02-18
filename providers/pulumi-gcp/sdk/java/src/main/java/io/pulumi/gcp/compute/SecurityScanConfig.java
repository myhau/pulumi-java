// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SecurityScanConfigArgs;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigState;
import io.pulumi.gcp.compute.outputs.SecurityScanConfigAuthentication;
import io.pulumi.gcp.compute.outputs.SecurityScanConfigSchedule;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A ScanConfig resource contains the configurations to launch a scan.
 * 
 * To get more information about ScanConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/security-scanner/docs/reference/rest/v1beta/projects.scanConfigs)
 * * How-to Guides
 *     * [Using Cloud Security Scanner](https://cloud.google.com/security-scanner/docs/scanning)
 * 
 * > **Warning:** All arguments including `authentication.google_account.password` and `authentication.custom_account.password` will be stored in the raw
 * state as plain-text.[Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ScanConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/securityScanConfig:SecurityScanConfig default projects/{{project}}/scanConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/securityScanConfig:SecurityScanConfig default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/securityScanConfig:SecurityScanConfig default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/securityScanConfig:SecurityScanConfig")
public class SecurityScanConfig extends io.pulumi.resources.CustomResource {
    /**
     * The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="authentication", type=SecurityScanConfigAuthentication.class, parameters={})
    private Output</* @Nullable */ SecurityScanConfigAuthentication> authentication;

    /**
     * @return The authentication configuration.
     * If specified, service will use the authentication configuration during scanning.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SecurityScanConfigAuthentication> getAuthentication() {
        return this.authentication;
    }
    /**
     * The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    @OutputExport(name="blacklistPatterns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> blacklistPatterns;

    /**
     * @return The blacklist URL patterns as described in
     * https://cloud.google.com/security-scanner/docs/excluded-urls
     * 
     */
    public Output</* @Nullable */ List<String>> getBlacklistPatterns() {
        return this.blacklistPatterns;
    }
    /**
     * The user provider display name of the ScanConfig.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user provider display name of the ScanConfig.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    @OutputExport(name="exportToSecurityCommandCenter", type=String.class, parameters={})
    private Output</* @Nullable */ String> exportToSecurityCommandCenter;

    /**
     * @return Controls export of scan configurations and results to Cloud Security Command Center.
     * Default value is `ENABLED`.
     * Possible values are `ENABLED` and `DISABLED`.
     * 
     */
    public Output</* @Nullable */ String> getExportToSecurityCommandCenter() {
        return this.exportToSecurityCommandCenter;
    }
    /**
     * The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    @OutputExport(name="maxQps", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxQps;

    /**
     * @return The maximum QPS during scanning. A valid value ranges from 5 to 20 inclusively.
     * Defaults to 15.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxQps() {
        return this.maxQps;
    }
    /**
     * A server defined name for this index. Format: 'projects/{{project}}/scanConfigs/{{server_generated_id}}'
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A server defined name for this index. Format: 'projects/{{project}}/scanConfigs/{{server_generated_id}}'
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    @OutputExport(name="schedule", type=SecurityScanConfigSchedule.class, parameters={})
    private Output</* @Nullable */ SecurityScanConfigSchedule> schedule;

    /**
     * @return The schedule of the ScanConfig
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SecurityScanConfigSchedule> getSchedule() {
        return this.schedule;
    }
    /**
     * The starting URLs from which the scanner finds site pages.
     * 
     */
    @OutputExport(name="startingUrls", type=List.class, parameters={String.class})
    private Output<List<String>> startingUrls;

    /**
     * @return The starting URLs from which the scanner finds site pages.
     * 
     */
    public Output<List<String>> getStartingUrls() {
        return this.startingUrls;
    }
    /**
     * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    @OutputExport(name="targetPlatforms", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetPlatforms;

    /**
     * @return Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be used as a default.
     * Each value may be one of `APP_ENGINE` and `COMPUTE`.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetPlatforms() {
        return this.targetPlatforms;
    }
    /**
     * Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    @OutputExport(name="userAgent", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAgent;

    /**
     * @return Type of the user agents used for scanning
     * Default value is `CHROME_LINUX`.
     * Possible values are `USER_AGENT_UNSPECIFIED`, `CHROME_LINUX`, `CHROME_ANDROID`, and `SAFARI_IPHONE`.
     * 
     */
    public Output</* @Nullable */ String> getUserAgent() {
        return this.userAgent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityScanConfig(String name, SecurityScanConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/securityScanConfig:SecurityScanConfig", name, args == null ? SecurityScanConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityScanConfig(String name, Input<String> id, @Nullable SecurityScanConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/securityScanConfig:SecurityScanConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecurityScanConfig get(String name, Input<String> id, @Nullable SecurityScanConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityScanConfig(name, id, state, options);
    }
}
