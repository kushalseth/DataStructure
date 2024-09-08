using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward.Recursion
{
    public static class PrintNto1
    {
        public static void Calculate(int n) { 
            if(n == 0)
            {
                return;
            }
            else
            {
                System.Console.WriteLine(n);
                n--;
                Calculate(n);
            }
        }
    }
}
