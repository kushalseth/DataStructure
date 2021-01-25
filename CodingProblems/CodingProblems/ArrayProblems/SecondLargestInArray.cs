using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public static class SecondLargestInArray
    {
        public static int SecondLargest(int[] arr, int arrayLength)
        {
            int largestNumber = -1;
            int secondLargestNumber = -1;

            for (int i = 0; i < arrayLength; i++)
            {
                if ((arr[i] > largestNumber || arr[i] > secondLargestNumber))
                {
                    var storeLargest = arr[i] == largestNumber ? secondLargestNumber : largestNumber;
                    largestNumber = arr[i] >= largestNumber ? arr[i] : largestNumber;
                    secondLargestNumber = arr[i] < largestNumber ? arr[i] : storeLargest;
                }
            }
            return secondLargestNumber;
        }
    }
}
