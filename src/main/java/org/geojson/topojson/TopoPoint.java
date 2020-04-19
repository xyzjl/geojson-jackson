package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;
import org.geojson.GeoJsonObjectWithProperties;
import org.geojson.LngLatAlt;

import java.util.HashMap;
import java.util.Map;

public class TopoPoint extends GeoJsonObjectWithProperties {
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
