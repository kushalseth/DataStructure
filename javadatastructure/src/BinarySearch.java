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
        int highIndex = arr.length - 1;


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

    public  static  int ResursiveBinarySearch(int[] arr, int element, int currentIndex) {
        int result = -1;

        while (currentIndex < arr.length) {
            if(arr[currentIndex] == element) {
                result = currentIndex;
                break;
            }
            currentIndex++;
            return ResursiveBinarySearch(arr, element, currentIndex);
        }

        return result;
    }

    public static int RecursiveBinarySearchUsingDivide(int[] arr, int element,
                                                       int lowIndex, int highIndex) {

        if(lowIndex > highIndex) {
            return -1;
        }

            int mid = (lowIndex + highIndex) / 2;

            if(arr[mid] == element) {
                return  mid;
            }
            else if(arr[mid] < element) {
                return RecursiveBinarySearchUsingDivide(arr, element, mid + 1, highIndex);
            }
            else if(arr[mid] > element){
                return RecursiveBinarySearchUsingDivide(arr, element, lowIndex, mid - 1);
            }
            else {
                return -1;
            }


    }

}
