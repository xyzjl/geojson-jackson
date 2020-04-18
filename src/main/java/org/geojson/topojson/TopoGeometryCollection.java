package org.geojson.topojson;

import org.geojson.GeoJsonObject;
import org.geojson.GeoJsonObjectVisitor;

import java.util.ArrayList;
import java.util.List;

public class TopoGeometryCollection extends TopojsonObject {
    private List<GeoJsonObject> geometries = new ArrayList<>();

    public List<GeoJsonObject> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<GeoJsonObject> geometries) {
        this.geometries = geometries;
    }

    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return null;
    }
}
