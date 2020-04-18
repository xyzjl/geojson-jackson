package org.geojson.topojson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.geojson.GeoJsonObject;

@JsonTypeInfo(property = "type", use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Topology.class, name = "Topology"),
        @JsonSubTypes.Type(value = TopoGeometryCollection.class, name = "GeometryCollection"),
        @JsonSubTypes.Type(value = TopoPolygon.class, name = "Polygon"),
        @JsonSubTypes.Type(value = TopoLineString.class, name = "LineString"),
        @JsonSubTypes.Type(value = TopoPoint.class, name = "Point")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class TopojsonObject extends GeoJsonObject {
}
