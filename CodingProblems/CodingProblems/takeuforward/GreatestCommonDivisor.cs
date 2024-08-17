using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Linq;

namespace CodingProblems.takeuforward
{
    public static class GreatestCommonDivisor
    {
        public static int Calcualate(int N1, int N2) {
            int result = 0;
            int[] factorsOfN1 = new int[N1];
            int[] factorsOfN2 = new int[N2];

            for (int i = 0; i < factorsOfN1.Length; i++) {
                if (N1 % i == 0) {
                    factorsOfN1.Append(i);
                }
            }

            for (int i = 0; i < factorsOfN2.Length; i++)
            {
                if (N2 % i == 0)
                {
                    factorsOfN2.Append(i);
                }
            }

            if (factorsOfN1.Length > factorsOfN2.Length)
            {
                for(int i = 0; i < factorsOfN1.Length; i ++)
                {
                   // if()
                }
            }
            else {
                for (int i = 0; i < factorsOfN2.Length; i++)
                {

                }
            }

            return result;
        }
    }
}
