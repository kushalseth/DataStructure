using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward
{
    public static class ReverseDigitsOfNumber
    {
        public static int ReverseDigits(int number)
        {
            int result = 0;

            while(number > 0)
            {
                int quotient = number / 10;
                int remainder = number % 10;
                number = quotient;
                result = result * 10 + remainder;
            } 

            return result;
        }
    }
}
