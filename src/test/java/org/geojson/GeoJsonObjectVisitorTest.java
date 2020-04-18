package org.geojson;

import org.geojson.topojson.TopoLineString;
import org.geojson.topojson.TopoPoint;
import org.geojson.topojson.TopoPolygon;
import org.geojson.topojson.Topology;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class GeoJsonObjectVisitorTest {

	private final GeoJsonObject geoJsonObject;
	private GeoJsonObjectVisitor<GeoJsonObject> instance = new GeoJsonObjectVisitor<GeoJsonObject>() {

		@Override
		public GeoJsonObject visit(GeometryCollection geoJsonObject) {
			Assert.assertEquals(GeometryCollection.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(FeatureCollection geoJsonObject) {
			Assert.assertEquals(FeatureCollection.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(Point geoJsonObject) {
			Assert.assertEquals(Point.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(Feature geoJsonObject) {
			Assert.assertEquals(Feature.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(MultiLineString geoJsonObject) {
			Assert.assertEquals(MultiLineString.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(Polygon geoJsonObject) {
			Assert.assertEquals(Polygon.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(MultiPolygon geoJsonObject) {
			Assert.assertEquals(MultiPolygon.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(MultiPoint geoJsonObject) {
			Assert.assertEquals(MultiPoint.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(LineString geoJsonObject) {
			Assert.assertEquals(LineString.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(Topology geoJsonObject) {
			Assert.assertEquals(Topology.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(TopoPolygon geoJsonObject) {
			Assert.assertEquals(TopoPolygon.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(TopoPoint geoJsonObject) {
			Assert.assertEquals(TopoPoint.class, geoJsonObject.getClass());
			return geoJsonObject;
		}

		@Override
		public GeoJsonObject visit(TopoLineString geoJsonObject) {
			Assert.assertEquals(TopoLineString.class, geoJsonObject.getClass());
			return geoJsonObject;
		}
	};
	public GeoJsonObjectVisitorTest(GeoJsonObject geoJsonObject) {
		this.geoJsonObject = geoJsonObject;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { new GeometryCollection() }, { new FeatureCollection() },
				{ new Point(12D, 13D) }, { new Feature() },
				{ new MultiLineString(Collections.singletonList(new LngLatAlt(12D, 13D))) }, { new Polygon() },
				{ new MultiPolygon() }, { new MultiPoint() }, { new LineString() } });
	}

	@Test
	public void should_visit_right_class() {
		// When
		GeoJsonObject result = geoJsonObject.accept(this.instance);
		// Then
		Assert.assertEquals(geoJsonObject, result);
	}

	@Test
	public void itShouldAdapter() throws Exception {
		Assert.assertNull(geoJsonObject.accept(new GeoJsonObjectVisitor.Adapter<Void>()));
	}
}