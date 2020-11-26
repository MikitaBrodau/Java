package Decomposition;

import java.util.Scanner;

public class DotDistance {
    public static int[] distanceBetween() {
        return dotDistance(readPoints());
    }

    public static double[][] readPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter capacity of dots 1/2/3/4");
        double[][] dots = new double[sc.nextInt()][2];
        soutArr(dots);
        System.out.println("now set coordinates x and y");
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                dots[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        soutArr(dots);
        return dots;
    }

    public static int[] dotDistance(double[][] dots) {
        double max = 0;
        int[] points = new int[2];
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double dist = distBetween(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                if (dist > max) {
                    max = dist;
                    points[0] = i;
                    points[1] = j;
                }
            }
        }
        return points;
    }

    public static double distBetween(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static void soutArr(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
