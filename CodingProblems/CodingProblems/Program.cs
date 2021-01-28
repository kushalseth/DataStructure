using CodingProblems.ArrayProblems;
using CodingProblems.Recursion;

namespace CodingProblems.Console
{
    class Program
    {
        static void Main(string[] args)
        {
            // -10, -4, -2, -33, -12
            // 8, 10, 10
            // 9
            // 10, 20, 30


            int[] array = { 9 }; // { -10, -4, -2, -33, -12 };
            System.Console.WriteLine(ArrayIsSorted.IsSortedArray(array));
            System.Console.ReadLine();
        }
    }
}
