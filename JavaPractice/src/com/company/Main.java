package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("hello");
        int arr[] = [20, 30, 40, 50];
        int x = 30;
        System.out.println("result is: ", search(arr, arr.length, x));

    }

    private search(int arr[], int n, int x) {
        int result = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }
}
