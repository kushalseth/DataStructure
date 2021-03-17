public class SearchingLastOccurence {
    public static int Get(int[] arr, int element) {

        int result = -1;

        int highIndex = arr.length;
        int lowIndex = 0;

        while (lowIndex <= highIndex) {

            int midIndex = (lowIndex + highIndex) / 2;

            if(arr[midIndex]  == element) {
                if((midIndex < arr.length - 1) && arr[midIndex] == arr[midIndex + 1]) {
                    lowIndex = lowIndex + 1;
                }
                else {
                    result = midIndex;
                    break;
                }
            }
            else if(element < arr[midIndex]) {
                highIndex = highIndex - 1;
            }
            else {
                lowIndex = lowIndex + 1;
            }
        }

        return result;
    }
}
