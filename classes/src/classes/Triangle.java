package classes;

/* Task 7. Описать класс, представляющий треугольник.
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.  */
public class Triangle {

    private final Coordinate a;
    private final Coordinate b;
    private final Coordinate c;
    private Coordinate median;
    private double perimeter;
    private double square;

    public Triangle(Coordinate a, Coordinate b, Coordinate c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateMedian(Triangle tr) {
        double x = ((tr.a.getX() + tr.b.getX() + tr.c.getX()) / 3.0);
        double y = ((tr.a.getY() + tr.b.getY() + tr.c.getY()) / 3.0);
        Coordinate coordinate = new Coordinate(x,y);
        this.median = coordinate;
    }
//
//    public void calculatePerimeter(Triangle triangle) {
//        this.perimeter = (triangle.a + triangle.b + triangle.c) / 2;
//    }

    public void calculateSquare(Triangle triangle) {
        this.square = Math.abs((((a.getX() - c.getX()) * (b.getY() - c.getY())) - ((b.getX() - c.getX()) * (a.getY() - c.getY())))/2);
    }

    @Override
    public String toString() {
        return "Triangle " + "\ta = " + a + "\tb = " + b + "\tc = " + c
                + "\nmedian = " + median + "\nperimeter = " + perimeter + "\nsquare = " + square;
    }
}

class Coordinate {
    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " ; " + y;
    }
}