package multi_dimensional_array;

public class Main {
    public static void main(String[] args) {
        UnevenColumns unevenColumns = new UnevenColumns();
        unevenColumns.UnevenColumns(10); //task1

        Diagonal diagonal = new Diagonal();
        diagonal.Diagonal(5); //task2

        KAndPColumn kAndPColumn = new KAndPColumn();
        kAndPColumn.KAndPColumn(5,2,3); //task3

        NRuleMatrix nRuleMatrix = new NRuleMatrix();
        nRuleMatrix.NRuleMatrix(10); //task4

        DiagonalInverse diagonalInverse = new DiagonalInverse();
        diagonalInverse.DiagonalInverse(6); //task5

        FillingInCenter fillingInCenter = new FillingInCenter();
        fillingInCenter.FillingInCenter(14); //task6

        RuleSin ruleSin = new RuleSin();
        ruleSin.RuleSin(10); //task7

        ColumnSwap columnSwap = new ColumnSwap();
        columnSwap.ColumnSwap(6);//task8

        ColumnSum columnSum = new ColumnSum();
        columnSum.ColumnSum(5); //task9
    }

}
