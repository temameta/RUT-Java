package laba8;

public class Cone {
    private double height = 0, baseRadius = 0;

    public void setHeight(double height) {
        if (height != 0) this.height = Math.abs(height);
        else throw new Error("HeightEqualsZero");
    }

    public void setBaseRadius(double baseDiameter) {
        if (baseDiameter != 0) this.baseRadius = baseDiameter / 2;
        else throw new Error("BaseDiameterEqualsZero");
    }

    public long getArea() {
        return Math.round(Math.PI * this.baseRadius * (Math.pow(Math.pow(this.baseRadius, 2) + Math.pow(this.height, 2), 0.5) + this.baseRadius));
    }

    public long getVolume() {
        return Math.round((Math.PI * this.height * Math.pow(this.baseRadius, 2)) / 3);
    }

    public Cone(double baseDiameter, double height) {
        setHeight(height);
        setBaseRadius(baseDiameter);
    }

    public boolean isEqualAreas(Cone cone) {
        return this.getArea() == cone.getArea();
    }

    public boolean isEqualVolumes(Cone cone) {
        return this.getVolume() == cone.getVolume();
    }

}
