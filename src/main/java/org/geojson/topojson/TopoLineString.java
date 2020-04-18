package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;

public class TopoLineString extends TopoGeometry<Integer>{
    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return geoJsonObjectVisitor.visit(this);
    }
}
