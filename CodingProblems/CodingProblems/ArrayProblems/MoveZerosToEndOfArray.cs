using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public class MoveZerosToEndOfArray
    {
        public static int[] MoveZerosToEnd(int[] arr)
        {
            int bucketIndex = 0;

            for(int i =0; i < arr.Length; i++)
            {
                if(arr[i] != 0)
                {
                    int temp = arr[bucketIndex];
                    arr[bucketIndex] = arr[i];
                    arr[i] = temp;
                    bucketIndex++;
                }
            }

            return arr;
        }
    }
}
