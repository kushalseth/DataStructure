﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Console
{
    public static class Factorial
    {
        // Constraints: 1 <= n <= power(10,7)
        public static int GetFactorial(int number)
        {
            if(number == 0)
            {
                return 1;
            } 
            else
            {
                var exe = number * GetFactorial(number - 1);
                return exe;
            }
        }
    }
}
