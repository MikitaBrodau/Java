package one_dimensional_array;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
    Aliquot aliquot = new Aliquot();
    aliquot.Aliquot(6); //task 1
        System.out.println();

    ReplaceHigherValue replaceHigherValue = new ReplaceHigherValue();
    replaceHigherValue.ReplaceHigherValue(7); //task 2
        System.out.println();

    PosNegNull posNegNull = new PosNegNull();
    posNegNull.PosNegNull(); //task 3
        System.out.println();

    int[]a = {5, 3, 7, 6123, 4, 2, 4, 3, 2, 76, 32, 4, -9, -4, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    ReplaceMinMax replaceMinMax = new ReplaceMinMax();
    System.out.println(Arrays.toString((replaceMinMax.ReplaceMinMax(a)))); //task 4
        System.out.println();

    LessThan_I lessThan_i = new LessThan_I();
    lessThan_i.LessThan_I(a); //task 5
        System.out.println();

    RealNumbers realNumbers = new RealNumbers();
    System.out.println("\nYour sum = " + realNumbers.RealNumbers(a)); //task 6
        System.out.println();

    MaxInArray maxInArray = new MaxInArray();
    maxInArray.MaxInArray(a); //task 7

    MinOrder minOrder = new MinOrder();
        System.out.println(minOrder.MinOrder(a)); //task 8

    MostSequenceNumber mostSequenceNumber = new MostSequenceNumber();
    mostSequenceNumber.MostSequenceNumber(a); //task 9

    SecondArrayNumber secondArrayNumber = new SecondArrayNumber();
    secondArrayNumber.KillArray(a);
    }
}
