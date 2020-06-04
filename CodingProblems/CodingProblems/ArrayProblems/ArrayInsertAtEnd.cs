using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public static class ArrayInsertAtEnd
    {
        public static int[] insertAtEnd(int[] arr, int sizeOfArray, int element)
        {
            Array.Resize(ref arr, sizeOfArray);
            // equilvaent of java array = Arrays.copyOf(array, array.length + 1);

            arr[sizeOfArray - 1] = element;
            return arr;
            

        }
    }
}
