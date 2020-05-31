using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Recursion
{
    /// <summary>
    /// You are given a number n. You need to find the digital root of n.
    // DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
    // Eg.DigitalRoot(191)=1+9+1=>11=>1+1=>2
    /// </summary>
    public static class DigitalRoot
    {
        public static int GetDigitalRoot(int n)
        {
            int sumofDigits = SumOfDigits(n);

            if (sumofDigits > 9)
                return GetDigitalRoot(sumofDigits);

            return sumofDigits;
                
        }

        public static int SumOfDigits(int n)
        {
            if (n == 0)
                return 0;

            return n % 10 + SumOfDigits(n / 10);
        }
    }
}
