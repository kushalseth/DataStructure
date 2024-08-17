using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.takeuforward
{
    public static class IsPrime
    {
        public static bool Calculate(int number)
        {
            bool result = true;

            for(int i = 0; i < number; i++)
            {
                if((number % (i + 1)) == 0 && i != 0 && i != number)
                {
                    result = false;
                    break;
                }
            }

            return result;
        }
    }
}
