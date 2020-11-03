package Decomposition;

public class SquareOfQuadrangle {
    public static void SquareOfQuadrangle(int x,int y,int z, int t){
        double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        double s1 = squareOfTriangle(x,y,c);
        double s2 = squareOfTriangle(z,t,c);
        double square = s1+s2;
        System.out.println(square);
    }
    private static double squareOfTriangle(double a,double b,double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
