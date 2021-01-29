using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public class RemoveDuplicatesFromSortedArray
    {
        public static int[] RemoveDuplicates(int[] array)
        {
            int capturedIndex = 1;

            for (int i = 1; i < array.Length; i++)
            {
                if (array[i - 1] != array[i])
                {
                    array[capturedIndex] = array[i];
                    capturedIndex++;
                }
            }
            return array;
        }
    }
}
