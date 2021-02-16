public class TappingRainWater {
    public static int Calculate(int[] arr) {
        int result = 0;
        int left_max;
        int right_max;

        for(int i = 1; i < arr.length - 1; i++) {
            right_max = findMaxRight(i, arr);
            left_max = findMaxLeft(i, arr);
            int min = right_max < left_max ? right_max : left_max;
            result = result + (min - arr[i]);
        }

        return result;
    }

    public static int findMaxRight(int currentIndex, int[] arr) {
        int maxRight = arr[currentIndex];
        for(int i = currentIndex + 1; i < arr.length; i++) {
            if(maxRight < arr[i]) {
                maxRight = arr[i];
            }
        }
        return  maxRight;
    }

    public  static int findMaxLeft(int currentIndex, int[] arr) {
        int maxLeft = arr[0];
        for(int i = 1; i < currentIndex; i++) {
            if(arr[i] > maxLeft) {
                maxLeft = arr[i];
            }
        }
        return maxLeft;
    }
}
