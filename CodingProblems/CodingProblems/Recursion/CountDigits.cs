using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Recursion
{
    public static class CountDigits
    {
        // Constraints: 0 <= n <= power(10,7)
        public static int CountDigitsInNumber(int n)
        {
            // Constraints: 0 <= n <= power(10,7)
            if (n < 10)
                return 1;

            return CountDigitsInNumber(n / 10) + 1;

        }
    }
}
