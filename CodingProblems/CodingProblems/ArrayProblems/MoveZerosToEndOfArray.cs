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
            int countOfNonZeros = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                if (arr[i] != 0)
                {
                    var temp = arr[countOfNonZeros];
                    arr[countOfNonZeros] = arr[i];
                    arr[i] = temp;
                    countOfNonZeros++;
                }
            }
            return arr;
        }
    }
}
