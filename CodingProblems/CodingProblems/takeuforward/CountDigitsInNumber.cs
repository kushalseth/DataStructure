using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward
{
    // https://takeuforward.org/data-structure/count-digits-in-a-number/
    public static class CountDigitsInNumber
    {
        public static int CountDigits(int number)
        {
            int count = 0;
            while (number / 10 > 0) 
            {
                count++;
                number = number / 10;
            }
            if (number < 10)
            {
                count++;
            }
            return count;
        }

        public static int CountDigitsImproved(int number)
        {
            int count = 0;
            while (number  > 0)
            {
                count++;
                number = number / 10;
            }
            return count;
        }

        public static int CountDigitsOptimized(int number)
        {

            int count = Convert.ToInt32(Math.Log10(number) + 1);
            return count;
        }
    }
}
