using CodingProblems.ArrayProblems;
using CodingProblems.Recursion;

namespace CodingProblems.Console
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] array = { -10, -4, -2, -33, -12 };
            System.Console.WriteLine(SecondLargestInArray.SecondLargest(array, array.Length));
            System.Console.ReadLine();
        }
    }
}
