package sorting;

public class Main {
    public static void main(String[] args) {
        KAndPElement kAndPElement = new KAndPElement();
        kAndPElement.CopyArray(3);//task 1
        System.out.println();

        int[] a = {3,67,32,57,3,6,23,7,342,73257,43,23,4,677,32,1,843,23};
        SelectionSort.Sort(a); //task 2
        System.out.println();

        int[] arr ={21651235,32424,15236,3462346,234234,72547,2345,432,234,32,4,1235,6432,23412,34,2346,2357,23,4524,5,2134773246,234627245,2345,};
        QuickSort.startSorting(arr); //task 3
        System.out.println();

        int[] array = {4,32346,85,345,12,6243,5,345,235,6,234,3,6234,15,35476,1234,6734,5,234,7,2,354,136,3,45,86,342,5};
        InsertionSort.sort(array);
        System.out.println();

        int[] arrayShell = {5,2457,2345,1234,612,35,12,342,346,1,76,123,723,34256,
                234572345,665743,34612,632,3424,154,2346,
                3154,52,452134,14264,235,23,32,123,7534,967,
                598763452,345,245,54,342723,54,523417,2463,
                23,5,1,32742,34651,34,5172,345,2364};
        ShellSort.Sort(arrayShell);
    }
}
