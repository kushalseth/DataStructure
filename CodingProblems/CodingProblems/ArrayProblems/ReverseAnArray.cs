using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public class ReverseAnArray
    {
        public static int[] ReversedArray(int[] array)
        {
            int j = -1;
            for(int i = array.Length -1; i >= array.Length / 2; i--)
            {
                j++;
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            return array;
        }
    }
}
