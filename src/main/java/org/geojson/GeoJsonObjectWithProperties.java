package org.geojson;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

public abstract class GeoJsonObjectWithProperties extends GeoJsonObject {

    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected Map<String, Object> properties = new HashMap<>();

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
}
