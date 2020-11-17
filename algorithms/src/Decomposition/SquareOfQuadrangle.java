package Decomposition;

import static Decomposition.Polygon.squareOfTriangle;

public class SquareOfQuadrangle {
    public static double SquareOfQuadrangle(int x, int y, int z, int t) {
        double c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double s1 = squareOfTriangle(x, y, c);
        double s2 = squareOfTriangle(z, t, c);
        return s1 + s2;
    }
}
