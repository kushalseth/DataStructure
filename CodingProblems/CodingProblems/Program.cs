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
            int[] testCase1 = { 8, 5, 0, 10, 0, 20 };
            int[] testCase2 = { -42, -42, -22, -23, -12, -12, -3, -1 };
            int[] testCase3 = { 9 };

            int[] testCase4 = { 20, 30, 30, 30, 40, 40, 40 };

            int[] testCase5 = { 5, 7, 10, 12, 12, 15, 15, 17 };


            int[] input = (int[])testCase1.Clone(); 
            int[] output = MoveZerosToEndOfArray.MoveZerosToEnd((int[])input.Clone());

            System.Console.WriteLine("Input:");
            System.Console.Write(string.Join(Environment.NewLine, input));

            System.Console.WriteLine("");
            System.Console.WriteLine("Output:");
            System.Console.Write(string.Join(Environment.NewLine, output));

            System.Console.ReadLine();
        }
    }
}
