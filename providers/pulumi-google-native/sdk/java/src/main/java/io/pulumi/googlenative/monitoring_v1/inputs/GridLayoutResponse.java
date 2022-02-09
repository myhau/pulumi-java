// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GridLayoutResponse extends io.pulumi.resources.InvokeArgs {

    public static final GridLayoutResponse Empty = new GridLayoutResponse();

    @InputImport(name="columns", required=true)
    private final String columns;

    public String getColumns() {
        return this.columns;
    }

    @InputImport(name="widgets", required=true)
    private final List<WidgetResponse> widgets;

    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public GridLayoutResponse(
        String columns,
        List<WidgetResponse> widgets) {
        this.columns = Objects.requireNonNull(columns, "expected parameter 'columns' to be non-null");
        this.widgets = Objects.requireNonNull(widgets, "expected parameter 'widgets' to be non-null");
    }

    private GridLayoutResponse() {
        this.columns = null;
        this.widgets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GridLayoutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columns;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(GridLayoutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.widgets = defaults.widgets;
        }

        public Builder setColumns(String columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public Builder setWidgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }

        public GridLayoutResponse build() {
            return new GridLayoutResponse(columns, widgets);
        }
    }
}