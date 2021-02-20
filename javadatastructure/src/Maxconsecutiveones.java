public class Maxconsecutiveones {
    public static int Count(int[] arr) {
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            }
            else if(count > maxCount){
                maxCount = count;
                count = 0;
            }
            else {
                count = 0;
            }
        }

            return maxCount;
    }
}
