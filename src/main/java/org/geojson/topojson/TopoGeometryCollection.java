package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;

import java.util.ArrayList;
import java.util.List;

public class TopoGeometryCollection extends TopojsonObject {
    private List<TopoJsonObjectWithProperties> geometries = new ArrayList<>();

    public List<TopoJsonObjectWithProperties> getGeometries() {
        return geometries;
    }

    public void setGeometries(List<TopoJsonObjectWithProperties> geometries) {
        this.geometries = geometries;
    }

    @Override
    public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
        return null;
    }
}
