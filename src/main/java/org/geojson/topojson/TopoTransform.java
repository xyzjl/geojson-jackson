package org.geojson.topojson;

public class TopoTransform {
    private double[] scale;
    private double[] translate;

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
}
