public class Quad extends Shape{
    private Point[] points;

    public Quad(Point[] points) {
        this.points = points;
    }
    public Quad(){
        points = new Point[4];
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
    public String getName(){
        return "quad";
    }
}
