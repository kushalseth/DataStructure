public class MaximumCircularSumSubarray {
    public static int Get(int[] arr) {
        int result = 0;
        int maxSum = 0;
        int currentSum  = 0;


        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i] > 0 || (arr[i] < 0 && -arr[i] < currentSum)) {
                currentSum = arr[i];
            }

            if(i == arr.length - 1) {
                //for (int j = 0; j < arr)
            }
        }

        return result;
    }

    static int maxCircularSum(int arr[], int n)
    {
        int res = arr[0];

        for(int i = 0; i < n; i++)
        {
            int curr_max = arr[i];
            int curr_sum = arr[i];

            for(int j = 1; j < n; j++)
            {
                int index = (i + j) % n;

                curr_sum += arr[index];

                curr_max = Math.max(curr_max, curr_sum);
            }

            res = Math.max(res, curr_max);
        }
        return res;
    }
}
