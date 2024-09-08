using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward.Recursion
{
    public static class SumofNNumbers
    {
        public static int Calculate(int n, int sum)
        {
            if(n == 0)
            {
                return sum;
            }
            else
            {
                sum = sum + n;
                n--;
                return Calculate(n, sum);
            }
        }

        static void Func(int i, int sum)
        {
            if (i < 1) // Base condition
            {
                System.Console.WriteLine(sum); // Print the sum
                return; // Exit the function
            }

            Func(i - 1, sum + i); // Recursively call the function
        }
    }
}
