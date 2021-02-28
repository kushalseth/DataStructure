public class MajorityElement {
    public static  int Get(int[] arr) {

        int highestCount = -1;

        for(int i = 0; i < arr.length; i++) {
            var context = arr[i];
            int contextCount = 0;

            for(var j = 0; j < arr.length; j++) {
                if(context == arr[j]) {
                    contextCount ++;
                }
            }

            if(contextCount > highestCount ) {
                highestCount = contextCount;
            }
        }

        highestCount = highestCount > (arr.length/2) ? highestCount : -1;

        return highestCount;
    }
}
