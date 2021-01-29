using CodingProblems.ArrayProblems;
using CodingProblems.Recursion;
using System;
using System.Collections.Generic;
using System.Linq;

namespace CodingProblems.Console
{
    class Program
    {
        static void Main(string[] args)
        {
            // 12, 9, 90, 80
            // -10, -4, -2, -33, -12
            // 9
            // 10, 20, 30
            int[] testCase1 = { 12, 9, 90, 80 };
            int[] testCase2 = { -10, -4, -2, -33, -12 };
            int[] testCase3 = { 9 };
            int[] testCase4 = { 20, 30, 30, 30, 40, 40, 40 };


            int[] input = (int[])testCase4.Clone(); ; 
            int[] output = RemoveDuplicatesFromSortedArray.RemoveDuplicates((int[])input.Clone());

            System.Console.WriteLine("Input:");
            System.Console.Write(string.Join(Environment.NewLine, input));

            System.Console.WriteLine("");
            System.Console.WriteLine("Output:");
            System.Console.Write(string.Join(Environment.NewLine, output));

            System.Console.ReadLine();
        }
    }
}
