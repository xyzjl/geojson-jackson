package org.geojson.topojson;

import org.geojson.GeoJsonObjectWithProperties;

import java.util.List;

public abstract class TopoGeometry<T> extends GeoJsonObjectWithProperties {
    private List<T> arcs;

    public List<T> getArcs() {
        return arcs;
    }

    public void setArcs(List<T> arcs) {
        this.arcs = arcs;
    }
}
