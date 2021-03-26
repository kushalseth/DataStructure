public  class Common {


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
