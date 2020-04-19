package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;
import org.geojson.LngLatAlt;

public class TopoPoint extends TopoJsonObjectWithProperties {
    private LngLatAlt coordinates;

    public LngLatAlt getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(LngLatAlt coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return geoJsonObjectVisitor.visit(this);
    }
}
