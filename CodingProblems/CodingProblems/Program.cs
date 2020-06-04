using CodingProblems.ArrayProblems;
using CodingProblems.Recursion;

namespace CodingProblems.Console
{
    class Program
    {
        static void Main(string[] args)
        {
            #region Recursion
            //PrintNos.PrintNo(5);
            //int result_factorial = Factorial.GetFactorial(5);
            //int sumofdigits = SumOfDigits.Sum(7530);
            //int countDigits = CountDigits.CountDigitsInNumber(530);
            //int digitalRoot = DigitalRoot.GetDigitalRoot(9999);
            //long nthFibonacciNumber = Fibonacci.GetNthFibonacciNumber(20);
            #endregion Recursion

            int[] theArray = { 1, 3, 5, 7, 9 };
            ArrayInsertAtEnd.insertAtEnd(theArray, 6, 90);
        }
    }
}
