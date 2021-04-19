import java.util.Arrays;
import java.util.Comparator;

public class SortCommon {


    public static int[] BubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }

        return  arr;
    }

    public static void Swap(int current, int next) {

    }

    public static Integer[] SortEvenAndOdd(Integer[] arr) {
        Arrays.sort(arr, new MyComparable());
        return arr;
    }

    public static int[] SortSubArray(int[] arr) {
        Arrays.sort(arr, 1, 3 );// start is included but end is not included
        return arr;
    }

    public static int[] InitialSort(int[] arr) {
        Arrays.sort(arr);
       return arr;
    }
}

class MyComparable implements Comparator<Integer> {
    public int Compare(Integer a, Integer b) {
        return a%2 - b%2;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1%2 - o2%2;
    }
}
