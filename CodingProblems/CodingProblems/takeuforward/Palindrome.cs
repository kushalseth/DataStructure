using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward
{
    public static class Palindrome
    {
        public static bool Calculate(int number)
        {
            bool result = true;

            char[] numberArray = number.ToString().ToCharArray();

            int counter = 0;

            while(counter < (numberArray.Length / 2))
            {
                if (numberArray[counter] == numberArray[numberArray.Length - 1]) {
                    counter++;
                    continue;
                }
                else
                {
                    result = false;
                    break;
                }
            }

            return result;
        }
    }
}
