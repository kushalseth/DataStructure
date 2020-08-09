﻿using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class ArrayRotation
{

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d)
    {
        int[] result = new int[a.Length];

        for (var i = 0; i < a.Length; i++)
        {
            int x = i - d;
            int new_index = (x >= 0) ? x : (a.Length + x);
            result[new_index] = a[i];
        }
        return result;
    }

    static void Main2(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string[] nd = Console.ReadLine().Split(' ');

        int n = Convert.ToInt32(nd[0]);

        int d = Convert.ToInt32(nd[1]);

        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp))
        ;
        int[] result = rotLeft(a, d);

        textWriter.WriteLine(string.Join(" ", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
