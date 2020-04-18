package org.geojson.topojson;

import org.geojson.GeoJsonObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class TopoGeometry<T> extends GeoJsonObject {
    private List<T> arcs;
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

    public List<T> getArcs() {
        return arcs;
    }

    public void setArcs(List<T> arcs) {
        this.arcs = arcs;
    }
}
