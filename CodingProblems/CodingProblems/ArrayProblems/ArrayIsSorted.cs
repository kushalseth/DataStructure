using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.ArrayProblems
{
    public static class ArrayIsSorted
    {
public static bool IsArraySorted(int[] array)
{
    bool isSorted = false;

    for (int i = 1; i < array.Length; i++)
    {
        if (!(array[i-1] < array[i]))
        {
            isSorted = false;
            break;
        }
        else
        {
            isSorted = true;
        }
    }

    if (array.Length == 0 || array.Length == 1)
        isSorted = true;

    return isSorted;

}
    }
}
