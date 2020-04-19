package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;

import java.util.ArrayList;
import java.util.List;

public class TopoGeometryCollection extends TopojsonObject {
    private List<TopojsonObject> geometries = new ArrayList<>();

    public List<TopojsonObject> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<TopojsonObject> geometries) {
        this.geometries = geometries;
    }

    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return null;
    }
}
