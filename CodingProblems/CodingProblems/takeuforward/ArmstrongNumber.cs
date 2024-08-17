using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward
{
    public static class ArmstrongNumber
    {
        public static bool Calculate(int input)
        {
            bool result = false;
            double sum = 0;

            int[] digits = input.ToString().Select(x => x - '0').ToArray();
            int numberOfDigits = digits.Length;

            for(int i = 0; i < numberOfDigits; i++)
            {
                sum = sum + Math.Pow(digits[i], numberOfDigits);
            }

            result = sum == input ? true : false;

            return result;
        }
    }
}
