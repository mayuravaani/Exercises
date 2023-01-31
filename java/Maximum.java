/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/

import java.io.*;
 
class Test {
    static int arr[] = { 10, 324, 45, 90, 400, 200, 100 };
 
    static int largest()
    {
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
 
        return max;
    }
 
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is "
                           + largest());
    }
}