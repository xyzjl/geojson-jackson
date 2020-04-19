package org.geojson;

import java.util.Map;

public interface GeojsonObjectProperties {

    void setProperty(String key, Object value);

    <K> K getProperty(String key);

    Map<String, Object> getProperties();

    void setProperties(Map<String, Object> properties);
}
