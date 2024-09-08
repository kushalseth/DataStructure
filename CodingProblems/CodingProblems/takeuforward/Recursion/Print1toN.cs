using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward.Recursion
{
    public static class Print1toN
    {
        public static void Calculate(int index, int n) { 
            if(index == n)
            {
                return;
            }
            else
            {
                System.Console.WriteLine(index + 1);

                index++;
                Calculate(index, n);
            }
        } 
    }
}
