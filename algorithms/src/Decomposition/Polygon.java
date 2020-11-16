package Decomposition;

public class Polygon {
    public static double polygon(double a){
        return (6*polygonSquare(a));
    }
    public static double polygonSquare(double a) {
        double r = (a*Math.sqrt(3))/2;
        double b = (2*r)/Math.sqrt(3);
        double c = a;
        return squareOfTriangle(a,b,c);
    }

    public static double squareOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
