public class Count1sInSortedArray {
    public static int Get(int arr[]) {
        int resultIndex = -1;

        int lowIndex = 0;
        int highIndex = arr.length -1;

        int midIndex = (lowIndex + highIndex) / 2;

        while (midIndex > 0) {


            if((arr[midIndex] == 1 && arr[midIndex - 1] != 1) || midIndex == 0) {
                resultIndex = midIndex;
                break;
            }
            else if(arr[midIndex - 1]  == 1){
                midIndex = midIndex - 1;
            }
            else {
                midIndex = midIndex + 1;
            }
        }

        if(resultIndex != -1) {
            resultIndex = arr.length - resultIndex;
        }


        return resultIndex;
    }
}
