package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;
import org.geojson.LngLatAlt;

import java.util.List;
import java.util.Map;

public class Topology extends TopojsonObject {
    private TopoTransform transform;
    private Map<String, TopoGeometryCollection> objects;
    private List<List<LngLatAlt>> arcs;

    public TopoTransform getTransform() {
        return transform;
    }

    public void setTransform(TopoTransform transform) {
        this.transform = transform;
    }

    public Map<String, TopoGeometryCollection> getObjects() {
        return objects;
    }

    public void setObjects(Map<String, TopoGeometryCollection> objects) {
        this.objects = objects;
    }

    public List<List<LngLatAlt>> getArcs() {
        return arcs;
    }

    public void setArcs(List<List<LngLatAlt>> arcs) {
        this.arcs = arcs;
    }

    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return geoJsonObjectVisitor.visit(this);
    }
}
