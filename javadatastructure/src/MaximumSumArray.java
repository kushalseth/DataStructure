public class MaximumSumArray {
    public static int Find(int[] arr) {

        int max = 0;
        int current = arr[0];

        for(int i = 1; i < arr.length; i++) {
                if(arr[i] > 0 || current > -arr[i]) {
                    current = current + arr[i];
                }
                else {
                    if(current > max) {
                        max = current;
                        current = 0;
                    }
                }
        }

        if(current > max) {
            max = current;
        }

        return max;
    }
}
