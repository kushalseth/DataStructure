using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;

namespace ConsoleApp4
{
    static class Program
    {
        static void Main(string[] args)
        {
            InsertionSort(new int[] { 2, 9, 7, 5, 13, 2 });
            //int[] index = BubbleSort(new int[] { 2, 3, 5, 7, 9 });
        }

        static void InsertionSort(int[] arr)
        {
            for (int i = 1; i < arr.Length; i++)
            {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        static void SelectionSort(int[] arr)
        {
            int n = arr.Length;
            for (int i = 0; i < n; i++)
            {
                int min_ind = i;

                for (int j = i + 1; j < n; j++)
                {
                    if (arr[j] < arr[min_ind])
                    {
                        min_ind = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[min_ind];
                arr[min_ind] = temp;
            }
        }


        public static int[] BubbleSort(int[] input)
        {
            input = new int[] { 9, 7, 5, 3, 2 };
            int size = input.Length;
            bool swapped = false;
            // loop to access each array element
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size - i - 1; j++)
                {
                     if (input[j] > input[j + 1])
                    {

                        // swapping occurs if elements
                        // are not in the intended order
                        int temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped)
                    break; 
            }
            return input;
        }


        /// <param name="input">input array to search in</param>
        /// <param name="elementToBeSearched">element that we need to search in 'input' array</param>
        /// <returns>index of the index in input array</returns>
        public static int LinearSearch(int[] input, int elementToBeSearched) {
            int index = -1;

            for (int i = 0; i < input.Length; i++) { 
                if(input[i] == elementToBeSearched)
                {
                    index = i;
                    break;
                }    
            }
            return index;
        }

        /// <param name="input">input array to search in</param>
        /// <param name="elementToBeSearched">element that we need to search in 'input' array</param>
        /// <returns>index of the index in input array</returns>
        public static int BinarySearchIterative(int[] input, int elementToBeSearched)
        {

            List<int> inp = input.ToList();

            inp.Sort();

            int index = -1;

            // first index
            int low = 0;
            // last index
            int high = input.Length - 1; // length - 1

            while (high >= low) {
                // middle
                int mid = (low + high) / 2;

                if (input[mid] == elementToBeSearched) {
                    index = mid;
                    break;
                }
                else if (input[mid] > elementToBeSearched) {
                    high = mid - 1;  // mid - 1, because we don't have value at mid.                   
                }
                else if(input[mid] < elementToBeSearched)
                {
                    low = mid + 1;
                }
            }
            return index;
        }
    }
}
