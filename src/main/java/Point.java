public class Point extends Shape {
    /** just a class for coordinates of our shapes.
     * I made it so I don't need to give two coords for one point
     */
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String getName(){
        return "point";
    }
}
