public  class Common {

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
