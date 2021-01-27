using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public static class ArrayIsSorted
    {
        // -10, -4, -2, -33, -12
        // 8, 10, 10
        // 9
        // 10, 20, 30
        public static bool IsSortedArray(int[] arr)
        {
            bool result = true;

            for (int i = 1; i < arr.Length; i++)
            {
                if (arr[i] < arr[i - 1])
                {
                    result = false;
                    break;
                }
            }

            return result;
        }

    }
}
