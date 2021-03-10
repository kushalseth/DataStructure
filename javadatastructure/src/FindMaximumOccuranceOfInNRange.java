public class FindMaximumOccuranceOfInNRange {

    public static int Get(int arrLeft[], int[] arrRight, int length) {

       /* int[] result = new int[arrLeft.length];
        int startFromValue = arrLeft[0];
        int endtoValue = arrLeft[0];

        for(int i = 1; i < result.length; i++) {

            startFromValue = arrLeft[i] >= arrLeft[i - 1] ? arrLeft[i - 1] : arrLeft[i];
            endtoValue = arrRight[i] >= arrRight[i - 1] ? arrRight[i - 1] : arrRight[i];

            for(int j = startFromValue; j < endtoValue; j++) {
                result[j] = result[j] + 1;
            }
        }*/

        int arr[] = new int[length];

        for(int i = 0; i < length; i++) {
            arr[arrLeft[i]] ++;
            arr[arrRight[i] + 1] --;
        }

        int currentMax = arr[0];
        int result = 0;


        for(int i = 1; i < 1000; i++)
        {
            arr[i] += arr[i - 1];

            if(currentMax < arr[i])
            {
                currentMax = arr[i];

                result = i;
            }
        }




        return  result;
    }

}
