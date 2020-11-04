package Decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DotDistance {
    public static List<Double> distanceBetween(){
        ArrayList<Double> list = dotDistance(setDots());
        System.out.println(list.toString());
        return list;
    }
    public static double[] setDots(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter capacity of dots 1/2/3/4");
        double[] dots = new double[sc.nextInt()*2];
        System.out.println("now set coordinates x and y");
        for (int i = 0; i < dots.length; i++) {
            dots[i] = sc.nextInt();
            System.out.println("On current moment u had next dots " + Arrays.toString(dots));
        }
        return dots;
    }
    public static ArrayList<Double> dotDistance(double[] dots){
        ArrayList<Double> dotsDist = new ArrayList<>();
        for (int i = 0; i <dots.length-3 ; i++) {
                dotsDist.add(distBetween(dots[i],dots[i+1],dots[i+2],dots[i+3]));
        }
        return dotsDist;
    }
    public static double distBetween(double x1,double y1,double x2, double y2){
        return Math.sqrt((y2 - y1) *  (y2 - y1) + (x2 - x1) *  (x2 - x1));
    }
}