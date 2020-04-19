package org.geojson.topojson;

import org.geojson.LngLatAlt;

public class TopoTransform {
    private double[] scale = new double[]{1, 1};
    private double[] translate = new double[]{0, 0};

    public double[] getScale() {
        return scale;
    }

    public void setScale(double[] scale) {
        this.scale = scale;
    }

    public double[] getTranslate() {
        return translate;
    }

    public void setTranslate(double[] translate) {
        this.translate = translate;
    }

    public LngLatAlt transform(LngLatAlt point) {
        double lon = point.getLongitude() * scale[0] + translate[0];
        double lat = point.getLatitude() * scale[1] + translate[1];
        double alt = Double.NaN;
        if (!Double.isNaN(point.getAltitude()) && scale.length > 2 && translate.length > 2) {
            alt = point.getAltitude() * scale[2] + translate[2];
        }
        return new LngLatAlt(lon, lat, alt);
    }
}
