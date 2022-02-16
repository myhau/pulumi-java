// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cassandra.TableArgs;
import io.pulumi.awsnative.cassandra.outputs.TableBillingMode;
import io.pulumi.awsnative.cassandra.outputs.TableClusteringKeyColumn;
import io.pulumi.awsnative.cassandra.outputs.TableColumn;
import io.pulumi.awsnative.cassandra.outputs.TableEncryptionSpecification;
import io.pulumi.awsnative.cassandra.outputs.TableTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cassandra:Table")
public class Table extends io.pulumi.resources.CustomResource {
    @OutputExport(name="billingMode", type=TableBillingMode.class, parameters={})
    private Output</* @Nullable */ TableBillingMode> billingMode;

    public Output</* @Nullable */ TableBillingMode> getBillingMode() {
        return this.billingMode;
    }
    @OutputExport(name="clusteringKeyColumns", type=List.class, parameters={TableClusteringKeyColumn.class})
    private Output</* @Nullable */ List<TableClusteringKeyColumn>> clusteringKeyColumns;

    public Output</* @Nullable */ List<TableClusteringKeyColumn>> getClusteringKeyColumns() {
        return this.clusteringKeyColumns;
    }
    @OutputExport(name="defaultTimeToLive", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultTimeToLive;

    public Output</* @Nullable */ Integer> getDefaultTimeToLive() {
        return this.defaultTimeToLive;
    }
    @OutputExport(name="encryptionSpecification", type=TableEncryptionSpecification.class, parameters={})
    private Output</* @Nullable */ TableEncryptionSpecification> encryptionSpecification;

    public Output</* @Nullable */ TableEncryptionSpecification> getEncryptionSpecification() {
        return this.encryptionSpecification;
    }
    @OutputExport(name="keyspaceName", type=String.class, parameters={})
    private Output<String> keyspaceName;

    public Output<String> getKeyspaceName() {
        return this.keyspaceName;
    }
    @OutputExport(name="partitionKeyColumns", type=List.class, parameters={TableColumn.class})
    private Output<List<TableColumn>> partitionKeyColumns;

    public Output<List<TableColumn>> getPartitionKeyColumns() {
        return this.partitionKeyColumns;
    }
    @OutputExport(name="pointInTimeRecoveryEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> pointInTimeRecoveryEnabled;

    public Output</* @Nullable */ Boolean> getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }
    @OutputExport(name="regularColumns", type=List.class, parameters={TableColumn.class})
    private Output</* @Nullable */ List<TableColumn>> regularColumns;

    public Output</* @Nullable */ List<TableColumn>> getRegularColumns() {
        return this.regularColumns;
    }
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    @OutputExport(name="tags", type=List.class, parameters={TableTag.class})
    private Output</* @Nullable */ List<TableTag>> tags;

    public Output</* @Nullable */ List<TableTag>> getTags() {
        return this.tags;
    }

    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cassandra:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Table(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cassandra:Table", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Table get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}