package org.geojson.topojson;

import org.geojson.GeoJsonObjectVisitor;
import org.geojson.LngLatAlt;

import java.util.HashMap;
import java.util.Map;

public class TopoPoint extends TopojsonObject {
    private LngLatAlt coordinates;
    private Map<String, Object> properties = new HashMap<>();

    public void setProperty(String key, Object value) {
        properties.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <K> K getProperty(String key) {
        return (K) properties.get(key);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

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
