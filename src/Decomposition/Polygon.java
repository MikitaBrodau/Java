package Decomposition;

public class Polygon {
    public static double polygon(double a){
        return (6*PolygonSquare(a));
    }
    public static double PolygonSquare(double a) {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2);
    }
}
