package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;

import java.util.List;

public class TopoPolygon extends TopoGeometry<List<Integer>> {
    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return geoJsonObjectVisitor.visit(this);
    }
}
