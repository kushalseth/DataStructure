public class NormalMaxSum {
    public static int NormalMax(int arr[], int n)
    {
        int res = arr[0];

        int maxEnding = arr[0];

        for(int i = 1; i < n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }

    public static int overallMaxSum(int arr[], int n)
    {
        int max_normal = NormalMax(arr, n);

        if(max_normal < 0)
            return max_normal;

        int arr_sum = 0;

        for(int i = 0; i < n; i++)
        {
            arr_sum += arr[i];

            arr[i] = -arr[i];
        }

        int max_circular = arr_sum + NormalMax(arr, n);

        return Math.max(max_circular, max_normal);
    }
}
