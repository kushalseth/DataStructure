public class BinarySearch {
    public static int Get(int[] arr, int inputNumber) {
        int  result = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == inputNumber) {
                result = i;
            }
        }

        return result;
    }

    public static int GetBetter(int[] arr, int inputNumber) {
        int  result = -1;
        int lowIndex = 0;
        int highIndex = arr.length;


        while (lowIndex <= highIndex ) {
            int midIndex = (highIndex + lowIndex) / 2;
            if(inputNumber > arr[midIndex]) {
                lowIndex = midIndex + 1;
            }
            else if(inputNumber == arr[midIndex]) {
                result = midIndex;
                break;
            }
            else {
                highIndex = midIndex - 1;
            }
        }

        return result;
    }
}
