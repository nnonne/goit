public class Circle extends Shape {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }
    public String getName(){
        return "circle";
    }

}