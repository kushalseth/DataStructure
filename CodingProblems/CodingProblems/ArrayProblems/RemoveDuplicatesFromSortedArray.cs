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
            int bucketIndex = 1;
            for(int i = 1; i < array.Length; i++)
            {
                if(array[i] != array[i-1])
                {
                    array[bucketIndex] = array[i];
                    bucketIndex++;
                }
            }
            return array;
        }
    }
}
