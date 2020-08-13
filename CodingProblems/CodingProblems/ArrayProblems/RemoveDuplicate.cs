using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public class RemoveDuplicate
    {
        public static int RemoveDuplicatesFromSortedArray(int[] arr, int arrayLength)
        {
            if (arrayLength == 0 || arrayLength == 1)
                return arrayLength;

            int k = 0;
            for (int i = 0; i < arrayLength - 1; i++)
                if (arr[i] != arr[i + 1])
                    arr[k++] = arr[i];

            arr[k++] = arr[arrayLength - 1];
            return k;
        }

    }
}
