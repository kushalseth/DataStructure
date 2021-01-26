using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public static class SecondLargestInArray
    {
        // {10, 1, 2, 33, 12}; 
        // {3, 3, 3, 3 };
        // { 2, 2, 3, 3, 10, 10 };
        // { -10, -4, -2, -33, -12 };
        public static int SecondLargest(int[] arr, int arrayLength)
        {
            int largest = int.MinValue;
            int secondlargest = int.MinValue;

            for(int i =0; i < arrayLength; i++)
            {
                if(arr[i] > largest)
                {
                    secondlargest = largest;
                    largest = arr[i];
                }
                else if(arr[i] < largest && arr[i] > secondlargest)
                {
                    secondlargest = arr[i];
                }
            }
            return secondlargest;
        }
    }
}
