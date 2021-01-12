import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        // searching inside a unsorted array
        //int[] arr = new int[] {20, 30, 40, 50};
        //int x = 33;
        // int result = search(arr, arr.length, x);
        // System.out.println(result);

        // insertion inside an array
        /*int[] arr = new int[5];
        arr[0] = 20; // {20, 30, 40, 50 };
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;

        int x = 7;
        int result = insert(arr, 4, x, 5, 2);
        System.out.println(result);*/


        // deletion from an array
        int[] arr = new int[] {3, 8, 12, 5, 6};
        int x = 12;
        System.out.println(delete(arr, arr.length, x));

    }

    private static int search(int arr[], int n, int x) {
        int result = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static int insert(int arr[], int n, int x, int capacity, int position) {
        int result = n;

        if(capacity != n) {
            for(int i = n; i > 0; i-- ) {
                if((i) == position - 1) {
                    arr[i] = x;
                    result = i;
                    break;
                }
                else {
                    arr[i] = arr[i-1];
                }
            }
        }



        return result;

    }

    private static int delete(int arr[], int n, int x) {
        int result = -1;
        boolean isFound = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                isFound = true;
                result = i;
                arr[i] = i == n ? 0 : arr[i + 1];
                if(i != n)
                    arr[i + 1] = 0;
            }
            else if(isFound){
                arr[i] = i < n -1 ? arr[i + 1] : 0;
            }
        }


        return result;
    }
}
