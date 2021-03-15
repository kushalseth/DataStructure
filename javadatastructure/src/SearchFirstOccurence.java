public class SearchFirstOccurence {
    public static int Get(int[] arr, int element) {
        int result = -1;

        int lowIndex = 0;
        int highIndex = arr.length;

        while (lowIndex <= highIndex) {
            int mid = (lowIndex + highIndex) / 2;

            if(arr[mid] == element) {
                if(mid != 0 && arr[mid] == arr[mid - 1]) {
                    highIndex = highIndex - 1;
                }
                else  {
                    result = mid;
                    break;
                }
            }
            else if(element < arr[mid]) {
                highIndex = highIndex - 1;
            }
            else {
                lowIndex = lowIndex + 1;
            }

        }



        return result;
    }
}
