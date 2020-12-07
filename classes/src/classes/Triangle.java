package classes;

import java.util.ArrayList;
import java.util.List;
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
        this.median = new Coordinate(x,y);
    }

    public void calculatePerimeter(Triangle triangle) {
        List<Double> list = new ArrayList<>();
        list.add(calculateSides(a,b));
        list.add(calculateSides(a,c));
        list.add(calculateSides(b,c));
        this.perimeter = perimeter(list);
    }
    private double perimeter(List<Double> list){
        return (list.get(0) + list.get(1) + list.get(2))/2;
    }

    private static double calculateSides(Coordinate v1, Coordinate v2){
        return Math.sqrt(Math.pow(v1.getX() - v2.getX(),2) + Math.pow(v1.getY() - v2.getY(),2));
    }
    public void calculateSquare(Triangle tr) {
        this.square = Math.abs((((tr.a.getX() - tr.c.getX()) * (tr.b.getY() - tr.c.getY()))
                - ((tr.b.getX() - tr.c.getX()) * (tr.a.getY() - tr.c.getY())))/2);
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