package practice;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 方法的重写
    public double findArea() {
        return 2 * Math.PI * getRadius() * length + 2 * Math.PI * getRadius() * getRadius();
    }

    public double findVolume() {
        return super.findArea() * length;
    }
}
