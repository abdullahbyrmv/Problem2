public class Sphere extends Shape{
    private double radius;
    public Sphere(String name, double radius){
        super(name);
        super.setType("sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(this.radius, 2);
    }

    public String toString() {
        return super.toString() + "[" + String.valueOf(this.radius) + "]";
    }
}
