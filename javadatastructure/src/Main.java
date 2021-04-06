import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // searching inside a unsorted array
        //int[] arr = new int[] {20, 30, 40, 50};
        //int x = 33;
        // int result = search(arr, arr.length, x);
        // System.out.println(result);

        // insertion inside an array
        /*int[] arr = new int[5];
        arr[0] = 20; // {20, 30, 40, 50 };
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;

        int x = 7;
        int result = insert(arr, 4, x, 5, 2);
        System.out.println(result);*/


        // deletion from an array
        /*int[] arr = new int[] {3, 8, 12, 5, 6};
        int x = 12;
        System.out.println(delete(arr, arr.length, x));*/

        // largest element from the array
        /*int[] arr = new int[] { 10, 5, 20, 8 };
        System.out.println(largestElement(arr, arr.length));*/

        // reverse array
        // int[] arr = new int[] { 22, 27, 97 }; //  { 10, 20 }; { 10 }; { 10, 11, 9 }
        // System.out.println(reversedArray(arr, arr.length));

        //int[] arr = new int[] { 10, 10, 10 }; //{ 10, 20, 20, 30, 30, 50, 50 };
        //System.out.println(removeDuplicateFromSortedArrays(arr, arr.length));

        //int[] arr = new int[] { 8, 5, 0, 10, 0, 20 };
        //System.out.println(moveAllZerosToEnd(arr, arr.length));

        //int[] arr = new int[] { 1, 2, 3, 4, 5 };
        //System.out.println(leftRotateByOne(arr, arr.length));

        //int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        //System.out.println(leftRotateByXPlace(arr, arr.length, 3));

        //int[] arr = new int[] { 7, 10, 4, 3, 6, 5, 2 };
        //System.out.println(leadersInArray(arr, arr.length));

        // int[] arr = new int[] { 2, 3, 10, 6, 4, 8, 1 };
        // int[] arr = new int[] { 10, 20, 30 }; //{ 7, 9, 5, 6, 3, 2 };
        // System.out.println(maximumDifference(arr, arr.length));

        //int[] arr = new int[] { 10, 10, 10, 20,  20, 30 }; //{ 7, 9, 5, 6, 3, 2 };
        //System.out.println(FrequenciesSortedArray.Get(arr, arr.length));

        //int[] arr = new int[] {1, 5, 3, 1, 2, 8};
        //System.out.println(StockBuyAndSell.GetProfits(arr));

        //int[] array = new int[] {3, 2, 1, 0, 1, 2, 3};
        //System.out.println(TappingRainWater.Calculate(array));

        //int[] array = new int[] {1, 0, 1, 1, 1, 1, 0, 1, 1};
        //System.out.println(Maxconsecutiveones.Count(array));

        //int[] array = new int[] {1,-2,3,-2};
        //System.out.println(MaximumSumArray.Find(array));

        //int[] array = new int[] {10, 12, 8, 4};
        //System.out.println(MaximumEvenOddSubarray.Get(array));

        //int[] array = new int[] {10, 12, 8, 4};
        //System.out.println(MaximumCircularSumSubarray.maxCircularSum(array, array.length));


        //int[] array = new int[] {3, 7, 4, 7, 7, }; // {8, 3, 4, 8, 8};
        //System.out.println(MajorityElement.Get(array));

        //int[] array = new int[] {1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 }; // {8, 3, 4, 8, 8};
        //MinimumGroupFlips.PrintGroups(array, array.length);

        //int[] array = new int[] {5, -10, 6, 90, 3}; // {1, 8, 30, -5, 20, 7 };
        //System.out.println(MaximumSumOfKConsecutiveNumbers.Get(array, array.length, 2));


        //int[] array = new int[] {1, 4, 20, 3, 10, 5}; // {1, 8, 30, -5, 20, 7 };
        //System.out.println(IsASubarrayWithGivenSum.Get(array, array.length, 33));

        //int[] array = new int[] { 2, 8, 3, 9, 6, 5, 4 };
        //System.out.println(PrefixSum.Get(array, 2, 6 ));

        //int[] array = new int[] { 4, 2, -2 };
        //System.out.println(PrefixSum.IsEquilibriumExits(array));

        //int[] binarySearch = new int[] {10, 20, 30, 40, 50, 60};
        //System.out.println(BinarySearch.GetBetter(binarySearch, 10));


        //int[] binarySearch = new int[] {10, 20, 30, 40, 50, 60};
        //System.out.println(BinarySearch.ResursiveBinarySearch(binarySearch, 55, 0));

        //int[] binarySearch = new int[] {10, 20, 30, 40, 50, 60};
        //System.out.println(BinarySearch.RecursiveBinarySearchUsingDivide(binarySearch, 10, 0, binarySearch.length - 1));

       // int[] binarySearch = new int[] {5, 10, 10, 15, 20, 20, 20};
       // System.out.println(SearchFirstOccurence.Get(binarySearch, 20));

        //int[] searchingLastOccurence = new int[] {10, 15, 20, 20, 40, 40};
        //System.out.println(SearchingLastOccurence.Get(searchingLastOccurence, 11));

        //int[] array = new int[] { 1,1,1,1,1,1,1 };
        //System.out.println(Count1sInSortedArray.Get(array));

        //int number = 25;
        //System.out.println(Common.CalculateSquareRoot(number));

        //int number = 14;
        //System.out.println(Common.CalculateSquareRootOptimized(number));

        //int number = 100;
        //int[] array = new int[] {1, 10, 15, 20, 40, 80, 90, 100, 120, 500};
        //System.out.println(Common.SearchInASortedArrayOptimized(array, number));

        //int[] array = new int[] {40, 80, 40, 30, 20, 50, 45};
        //System.out.println(Common.FindAPeakElement(array));

        int arr[] = new int[] {2,5,8,12,30};
        System.out.println(Common.TwoPointerApproach(arr, 17));

        //int arr[] = {8, -4, 3, -5, 4}; int n = 5;
        //int t = NormalMaxSum.overallMaxSum(arr, n);
        //System.out.println(t);
    }



    private static int maximumDifference(int arr[], int arrayLength) {
        int maximumDifference = Integer.MIN_VALUE;

        for(int i = 0; i < arrayLength; i++) {
            var contextNumber = arr[i];
            for(int j = i + 1; j < arrayLength; j++) {
                int difference = arr[j] -  contextNumber;
                if(difference > maximumDifference) {
                    maximumDifference = difference;
                }
            }
        }

        return maximumDifference;
    }

    private static  int[] leadersInArray(int arr[], int arrayLength) {
        int[] outputArray = new int[arrayLength];
        int outputArrayIndex = 0;

        for(int i = 0; i < arrayLength; i++) {
            var contextElement = arr[i];
            boolean isLeader = true;
            for(int j = i + 1; j < arrayLength; j++ ) {
                if(arr[j] > contextElement) {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader) {
                outputArray[outputArrayIndex] = contextElement;
                outputArrayIndex++;
            }
        }

        return outputArray;
    }


    private static  int[] leftRotateByXPlace(int arr[], int arrayLength, int xPlaces) {
        if(xPlaces < arrayLength) {
            int[] storeArray = new int[xPlaces];
            // storing the variables in storage array, so that it can be used later
            for(int i = 0; i < xPlaces; i++) {
                storeArray[i] = arr[i];
            }

            // rotating the array
            for(int i = xPlaces; i < arrayLength; i++) {
                arr[i - xPlaces] = arr[i];
            }

            // pushing the storage array into arr[]
            for(int i = 0; i < xPlaces; i++) {
                arr[arrayLength - xPlaces + i] = arr[i];
            }

            // it has auxilary space solution as well
        }
        else {
            // throw exception.
        }
        return  arr;
    }

    private static  int[] leftRotateByOne(int arr[], int arrayLength) {

        /*int storeInitial = Integer.MIN_VALUE;

        for(int i = 0; i < arrayLength; i++) {
            if(i == 0) {
                storeInitial = arr[i];
            }
            else {
                arr[i-1] = arr[i];
            }
        }
        arr[arrayLength - 1] = storeInitial;*/

        // more optimized.
        int storeInitial = arr[0];

        for(int i = 0; i < arrayLength; i++) {
                arr[i-1] = arr[i];
        }
        arr[arrayLength - 1] = storeInitial;

        return  arr;
    }

    private static int[] moveAllZerosToEnd(int arr[], int arrayLength) {

        int countOfNonZeros = 0;
        for(int i = 0; i < arrayLength; i ++) {
            if(arr[i] != 0) {
                var temp = arr[countOfNonZeros];
                arr[countOfNonZeros] = arr[i];
                arr[i] = temp;
                countOfNonZeros++;
            }
        }

        return  arr;
    }

    private static int[] removeDuplicateFromSortedArrays(int arr[], int arrayLength) {
        int capturedIndex = -1;

        for(int i = 1; i < arrayLength; i++) {

            /*if(arr[i-1] == arr[i]) {
                if(capturedIndex != -1) {
                }
                else {
                    capturedIndex = i;
                }
            }
            else if(capturedIndex != -1){
                arr[capturedIndex] = arr[i];
                capturedIndex ++;
            }*/
            if(arr[i-1] != arr[i]) {
                arr[capturedIndex] = arr[i];
                capturedIndex ++;
            }
        }

        return arr;
    }

    private static int[] reversedArray(int arr[], int arraylength) {

        var splitLength = arraylength / 2;
        for(int i = 0; i < splitLength; i++) {
            var temp = arr[i];
            arr[i] = arr[arraylength - 1 - i];
            arr[arraylength - 1 - i] = temp;
        }

        return  arr;
    }

    private static boolean isArraySorted(int arr[], int arraylength) {
        boolean result = true;
        int largestElement = Integer.MIN_VALUE;
        /*for(int i = 0; i < arraylength; i++) {
            if(largestElement <= arr[i]) {
                largestElement = arr[i];
            }
            else {
                result = false;
                break;
            }
        }*/

        for(int i = 1; i < arraylength; i++) {
            if(arr[i] < arr[i - 1]) {
                result = false;
                break;
            }
        }

        return result;
    }

    private static int secondLargestElement(int arr[], int length) {
        int largestElement = Integer.MIN_VALUE;
        int secondlargestElement = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++)
        {
            int contextElement = arr[i];
            if (contextElement > largestElement)
            {
                secondlargestElement = largestElement;
                largestElement = contextElement;
            }
            else if(contextElement < largestElement && contextElement > secondlargestElement)
            {
                secondlargestElement = contextElement;
            }
        }
        return secondlargestElement;
    }


    private static int largestElement(int arr[], int length) {
        int result = -1;

        for(int i = 0; i < length; i++) {
            if(result < arr[i]) {
                result =  arr[i];
            }
        }
        return  result;
    }

    private static int search(int arr[], int n, int x) {
        int result = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static int insert(int arr[], int n, int x, int capacity, int position) {
        int result = n;

        if(capacity != n) {
            for(int i = n; i > 0; i-- ) {
                if((i) == position - 1) {
                    arr[i] = x;
                    result = i;
                    break;
                }
                else {
                    arr[i] = arr[i-1];
                }
            }
        }



        return result;

    }

    private static int delete(int arr[], int n, int x) {
        int result = -1;
        boolean isFound = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                isFound = true;
                result = i;
                arr[i] = i == n ? 0 : arr[i + 1];
                if(i != n)
                    arr[i + 1] = 0;
            }
            else if(isFound){
                arr[i] = i < n -1 ? arr[i + 1] : 0;
            }
        }


        return result;
    }
}
