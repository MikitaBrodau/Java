package Decomposition;

public class Polygon {
    public static double polygon(double a){
        return (6*squareOfTriangle(a,a,a));
    }

    public static double squareOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
