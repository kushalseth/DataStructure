using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Recursion
{
    public static class SumOfDigits
    {
        // Constraints: 1 <= n <= power(10,7)
        public static int Sum(int n)
          {
            if (n == 0)
                return 0;

            return n % 10 + Sum(n / 10);

        }
    }
}
