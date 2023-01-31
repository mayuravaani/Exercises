/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
public class Maximum{  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize min with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with min  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + max);  
    }  
}  