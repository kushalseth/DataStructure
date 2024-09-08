using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward.Recursion
{
    public static class PrintName
    {
        public static void Calculate(int index, int n, string name) {
            if (index == n) {
                return;
            }
            else
            {
                index++;
                Calculate(index, n, name);

                System.Console.WriteLine(name);
            }
        }
    }
}
