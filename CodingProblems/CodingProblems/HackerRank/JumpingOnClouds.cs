using System.IO;
using System;

class JumpingOnClouds
{

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c)
    {
        int steps = 0;
        for (int index = 0; index < c.Length;)
        {
            if ((index + 2) < c.Length && c[index + 2] != 1)
            {
                steps = steps + 1;
                index = index + 2;
            }
            else if ((index + 1) < c.Length && c[index + 1] != 1)
            {
                steps = steps + 1;
                index = index + 1;
            }
            else
            {
                break;
            }
        }
        return steps;
    }

    static void Main4(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int[] c = Array.ConvertAll(Console.ReadLine().Split(' '), cTemp => Convert.ToInt32(cTemp))
        ;
        int result = jumpingOnClouds(c);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
