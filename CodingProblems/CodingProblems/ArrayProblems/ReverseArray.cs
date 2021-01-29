using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public class ReverseArray
    {
        public static int[] ReversedArray(int[] array)
        {
            int splitedLength = array.Length / 2;
            for(int i = 0; i < splitedLength; i++)
            {
                int temp = array[i];
                array[i] = array[array.Length - 1 - i];
                array[array.Length - 1 - i] = temp;
            }

            return array;
        }
    }
}
