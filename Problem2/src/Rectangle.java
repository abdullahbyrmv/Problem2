public class Rectangle extends Shape {
    private double width, height;
    public Rectangle(String name, double width, double height) {
        super(name);
        super.setType("rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public String toString() {
        return super.toString() + "["+String.valueOf(this.width)+","+String.valueOf(this.height)+"]";
    }
}
