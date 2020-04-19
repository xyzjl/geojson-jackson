package org.geojson.topojson;

import java.util.List;

public abstract class TopoGeometry<T> extends TopoJsonObjectWithProperties {
    private List<T> arcs;

    public List<T> getArcs() {
        return arcs;
    }

    public void setArcs(List<T> arcs) {
        this.arcs = arcs;
    }
}
