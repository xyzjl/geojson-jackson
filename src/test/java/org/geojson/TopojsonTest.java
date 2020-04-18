package org.geojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.geojson.topojson.TopojsonObject;
import org.junit.Test;

import java.io.IOException;

public class TopojsonTest {

    @Test
    public void testDeserialze() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TopojsonObject topoObject = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream("test.topojson"), TopojsonObject.class);
        System.out.println(topoObject);
    }
}
