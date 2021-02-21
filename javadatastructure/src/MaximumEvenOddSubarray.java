public class MaximumEvenOddSubarray {

    public  static  int Get(int[] arr) {
        int result = 0;
        int maxCount = 1;
        boolean isEven = (arr[0] % 2 == 0) ? true : false;


        for(int i = 1; i < arr.length; i++ ) {
            boolean conext = arr[i] % 2 == 0 ? true : false;
            if(conext == !isEven) {
                maxCount = maxCount + 1;
                isEven = !isEven;
            }
            else {
                maxCount = 1;
                isEven = conext;
            }
        }

        return maxCount;
    }
}
