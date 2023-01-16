public class Triangle extends Shape{
    private Point[] points;

//    public Triangle(){
//        points = new Point[]{new Point(),new Point(),new Point()};
//    }
//    public Triangle(Point[] points){
//        this.points = points;
//    }

    //}

    public Triangle(Point[] points) {
        this.points = points;
    }
    public Triangle(){
        points = new Point[3];
    }
    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
    public String getName(){
        return "triangle";
    }
}

