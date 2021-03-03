public class MaximumSumOfKConsecutiveNumbers {
    public static int Get(int[] arr, int length, int numberOfElements) {

        int max_result = Integer.MIN_VALUE;

        int i = 0;
        while (i < length - numberOfElements) {

            var sum = 0;// Integer.MIN_VALUE;
            for(int j = i; j < i + numberOfElements; j++) {
                sum = sum + arr[j];
            }

            if(sum > max_result) {
                max_result = sum;
            }

            i++;
        }

        return max_result;
    }
}
