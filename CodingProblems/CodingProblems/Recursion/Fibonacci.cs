using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodingProblems.Recursion
{
    public static class Fibonacci
    {
        public static long GetNthFibonacciNumber(int n)
        {
            if(n <= 1)
            {
                return n;
            }

            return GetNthFibonacciNumber(n - 1) + GetNthFibonacciNumber(n - 2);
        }
    }

    #region question
    //    Fibonacci Using Recursion
    //You are given a number n.You need to find nth Fibonacci number.
    //F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

    //Input:
    //The first line of input contains T denoting the number of testcases.T testcases follow. Each testcase contains one line of input containing n.

    //Output:
    //For each testcase, in a newline, print F(n).

    //Your Task:
    //This is a function problem.You only need to complete the function fibonacci that takes n as parameters and returns F(n).

    //Constraints:
    //1 <= T <= 20
    //1 <= n <= 20

    //Examples:
    //Input:
    //2
    //1
    //20
    //Output:
    //1
    //6765

    //Explanation:
    //Testcase 1: 1st fibonacci number is 1.
    //Testcase 2: 20th fibonacci number is 6765
    #endregion
}


