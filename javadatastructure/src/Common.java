public  class Common {

    public static int MaximumNumberOfPagesReadByAnyStudent(int arr[], int numberOfStudents, int arrayLength) {
        int result = 0;

        

        return result;
    }

    public static int RepeatingElement(int arr[], int n) {
        int result = 0;
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(visited[arr[i]]) {
                result = arr[i];
                break;
            }
            else {
                visited[arr[i]] = true;
            }
        }

        return result;
    }

    public static int FindMajorityElement(int arr[], int n) {
        int result = 0;
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(arr[result] == arr[i]) {
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                result = i;
                count = 1;
            }
        }

        count = 0;

        for(int i =0; i < n; i++) {
            if(arr[result] == arr[i]) {
                count++;
            }
        }

        if(count <= n/2) {
            result = -1;
        }

        return result;
    }

    public static float MedianOfSortedArray(int arr1[], int arr2[]) {
        float result = -1;

        int midIndex = (((arr1.length) + (arr2.length)) / 2);


        int midIndexReminder = ((arr1.length) + (arr2.length)) % 2;

            int arr1Pointer = 0;
            int arr2Pointer = 0;
            int combinedLength = arr1.length + arr2.length;

            int[] resultendArray = new int[combinedLength];

            for(int i = 0; i < combinedLength; i++) {

                if(arr1[arr1Pointer] < arr2[arr2Pointer]) {
                    resultendArray[i] = arr1[arr1Pointer];
                    arr1Pointer++;
                }
                else {
                    resultendArray[i] = arr2[arr2Pointer];
                    arr2Pointer++;
                }

                if(midIndex == i)  {
                    if(midIndex %2 != 0) {
                        //result = resultendArray[(midIndex + (midIndex - 1)) / 2];
                        int quotent  = (resultendArray[midIndex] + resultendArray[midIndex - 1]) / 2;

                        result = quotent;
                    }
                    else {
                        result = resultendArray[midIndex];
                    }
                    break;
                }

            }


        return result;
    }

    public static boolean TwoPointerApproach(int arr[], int x) {
        boolean result = false;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];
            if(sum == x) {
                result = true;
                break;
            }
            else if(sum < x ) {
                left = left + 1;
            }
            else {
                right = right - 1;
            }
        }

        return result;
    }

    public static int FindAPeakElement(int arr[]) {
        int result = -1;

            int lowIndex = 1;
            int highIndex = arr.length - 1;
            while (lowIndex <= highIndex) {
                int midIndex = (lowIndex + highIndex) / 2;

                if((midIndex == 0 || arr[midIndex -1 ] <= arr[midIndex] ) &&
                        (midIndex == arr.length-1 || arr[midIndex + 1] <= arr[midIndex])) {
                    result = arr[midIndex];
                    break;
                }

                if(arr[midIndex - 1] > arr[midIndex]){
                    highIndex = midIndex - 1;
                }
                else  {
                    lowIndex = midIndex + 1;
                }
            }


        return result;
    }


    public static int SearchInSortedRotatedArray(int arr[], int x) {
        int result = -1;

        int lowIndex = arr[0];
        int highIndex = arr[arr.length - 1];

        while (lowIndex < highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if(x == arr[midIndex] ) {
                result = midIndex;
                break;
            }
            else if(arr[lowIndex] < arr[midIndex]) {
                if(x < arr[midIndex] && x >= arr[lowIndex]) {
                    highIndex = midIndex - 1;
                }
                else  {
                    lowIndex = midIndex + 1;
                }
            }
            else {
                if(x > arr[midIndex] && x <= arr[highIndex]) {
                    lowIndex = midIndex + 1;
                }
                else {
                    highIndex = midIndex -1;
                }
            }

        }

        return  result;
    }


    public  static int SearchInASortedArrayOptimized(int arr[], int x) {
        int index = -1;

        if(arr[0] == x) {
            index = 0;
        }
        else {
            index = 1;
            while(true) {
                if(arr[index] == x) {
                    break;
                }
                else if(arr[index] < x){
                    index = index * 2;
                }
                else {
                    index = BinarySearch(arr, x, (index/2) + 1, index);
                    break;
                }
            }
        }

        return index;
    }

    public static int BinarySearch(int arr[], int x, int lowIndex, int highIndex) {
        int result = 0;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if(arr[midIndex] == x) {
                result = midIndex;
                break;
            }
            else if(arr[midIndex] < x) {
                lowIndex = lowIndex + 1;
            }
            else {
                highIndex = highIndex -1;
            }

        }

        return result;
    }


    public static int SearchInASortedArray(int arr[], int x) {
        int index = -1;

        while (true) {
            if(arr[index] == x) {
                break;
            }
            else if(arr[index] > x) {
                index = -1;
                break;
            }
        }

        return  index;
    }

    public static int CalculateSquareRootOptimized(int context) {
        int result = 0;

        int highIndex = context;
        int lowindex = 1;

        while (lowindex <= highIndex) {

            int middleIndex = (highIndex + lowindex) / 2;
            int squareOfMiddle = middleIndex * middleIndex;

            if(squareOfMiddle == context) {
                result = middleIndex;
                break;
            }
            else if(squareOfMiddle > context) {
                highIndex = middleIndex -1;
            }
            else {
                lowindex = middleIndex + 1;
                result = middleIndex;
            }


        }

        return  result;
    }

    public  static int CalculateSquareRoot(int context) {
        int result = 0;

        for(int i =0; i < context/2 + 1; i++) {
                if(i * i == context) {
                    result = i;
                    break;
                }
                else if(i * i > context) {
                    result = i - 1;
                    break;
                }
        }

        return result;
    }


}
