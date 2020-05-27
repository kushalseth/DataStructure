using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;

namespace CodingProblems.Recursion
{
    // Print numbers from 1 to N without the help of loops.
    // if N = 10
    // output = 1 2 3 4 5 6 7 8 9 10
    public static class PrintNos
    {
        public static void PrintNo(int N)
        {
            if(N != 0)
            {
                PrintNo(N - 1);
                Debug.WriteLine(N);
            }

        }
    }
}
