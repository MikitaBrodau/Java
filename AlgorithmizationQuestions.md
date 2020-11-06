1.	Массив – коллекция для хранения примитивных типов данных(одного типа) и ссылок на объекты. Индексация массива осуществляется с 0 например int []arr = {1,3,5,7,9}; индексу 0 соответствует значение = 1. К элементам массива необходимо обращаться через указания их индекса например arr[0].
2.	Объявление и инициализция происходит следующим способом int [] arr; - объявление
arr[] = {0,3,5,7,2} – инициализация. Аналогично для многомерных массивов int[][]arr; - объявление.
arr[][]={{3,6,73,2},{624,376,23,5}} – инициализация. Пример ссылочного Object[] a = new Object[5];
3.	Клонирование происходит через интерфейс cloneable(при этом объекты не поддерживающие этот интерфейс, не могут им клонироваться) с помощь метода clone().
В стандартной библиотеке имеется статический ( s t a t i c ) метод с именем System .
a rr a y c o p y ( ) , который способен гораздо быстрее копировать массивы чем через цикл For.
осуществляется с помощь метода
 System.arraycopy (```Object src```,``` int srcPos```, ```Object dest```, ```int destPos```,``` int length```)
Разница состоит в том что ссылочный тип не клонируется.
Так же есть возможность копировать массив с помощью Arrays.copyOf(```arr name```, ```new lenght```)
4.	Двумерный массив – массив массивов, в каждой его ячейке содержится ссылка на элемент массива. По сути это матрица которую проще представить таблицой 5х5 например. Рваный массив – это массив внутри которого массивы разной длинны. Для начала мы создаем массив int arr[][] = new int[][];
далее объявляем длину строк arr[0] = new int[3];   	arr[1] = new int[2] итого мы имеем две строки с длинной 3 и 2.
for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        }

5.	Первая ошибка возникает в случае если мы вышли за размер массива. Вторая ошибка встречается в случае разности типов данных.
6.	Это один из уровней абстракции который необходим для того чтобы думать неподсредственно над решением конкретной задачи. Один метод – одна задача, imho  требуется для универсальности метода. 
7.	Параметры передаются в метод по принципу 
(доступ)(возвращаемое значение метода)(имя)	((Тип принимаемого значения) (имя))
Private	int Task7		(int a, int b)
в методах Java все передается по значению. Разница с ссылкой состоит в том, что если мы передает имя объекта в метод, то в этом случае появляется новая ссылка на объект. Внутри метода объект может изменить свои значения.
8.	Передача массива в метод происходит по тому же принципу private int[] task8 (int[] a) после чего return a;
Размер массива четко фиксируется при инициализации, соответственно изменять его размер невозможно.
9.	return – возвращает из метода значение. Значение внутри метода может быть изменено. Разницы между возвращением ссылочного и примитивного типа нет.
10.	Сортировка вставками, обменами, шелла, слиянием.
```public class InsertionSort {
    public static int[] sort(int[] a){
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1;
            while( j>=0 && a[j] > key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1] = key;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
```
```public class QuickSort {
    public static int[] startSorting(int[] arr){
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    private static void sort(int[] arr, int begin, int end){
        if (begin < end){
            int pI = partition(arr, begin, end);
            sort(arr,begin, pI-1);
            sort(arr, pI+1, end);
        }
    }
    private static int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i =(begin -1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot){
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
}
```
```public class SelectionSort {
    public static int[] Sort(int [] arr){
        System.out.println(Arrays.toString(arr));
        for (int left = 0; left < arr.length; left++) {
            int right = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[right]){
                    right = i;
                }
            }
            swap(arr,left,right);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
```
```public class ShellSort {
    public static void Sort(int[] a) {
        System.out.println(Arrays.toString(a));
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i++)
            {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
                {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
```



