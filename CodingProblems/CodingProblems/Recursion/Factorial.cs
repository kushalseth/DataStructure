using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Console
{
    public static class Factorial
    {
        public static int GetFactorial(int number)
        {
            if(number == 0)
            {
                return 1;
            } 
            else
            {
                return number * GetFactorial(number - 1);
            }
        }
    }
}
