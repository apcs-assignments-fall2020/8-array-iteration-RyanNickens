//import java.util.Scanner;
//import java.util.Math;
import java.util.stream.*;
import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
      //not enhanced for loop, regular one is suited for this
      for(int i = 0; i < arr.length / 2; i++) {
        //creating variable to temporarily story the individual values of array
        int newnew = arr[i];
        arr[i] = arr[arr.length - i - 1];
        //i ran into problems getting code to iterate past the midpoint 
        //original code below
        //newnew = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = newnew; 
      }
        //returning array after it has been altered
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
      int length = arr.length;
      Arrays.sort(arr); //using function from Arrays import
      int x = length - 2; //subtracting 2 from length because counting in array starts at zero, if i subtracted 1 it would just be the last item of array
      int y = arr[x];
      //returning single int       
      return y; 
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
      //if rate is not the same throughout, counter will go up
      //if counter isnt 0, then it isnt geometric
      //added second counter for separate for loop
      int counter = 0;
      int countertwo = 0;
      //getting original rate
      int a = arr[0];
      int b = arr[1];
      double r = (double)Math.log(b) / Math.log(a);
      double p = (double)b/a;
      //for loop compares rates to check if they are all the same
      for(int i = 1; i < arr.length; i++) {
        double z = Math.log(arr[i]) / Math.log(arr[i-1]);
        if(z == r) {
          counter = counter + 0;
        }
        else {
          counter = counter + 1;
        }
      }
      //for loop compares rates in a different way
      for(int i = 1; i < arr.length; i++) {
        double z = (double)(arr[i]) / (arr[i-1]);
        if(z == p) {
          countertwo = countertwo + 0;
        }
        else {
          countertwo = countertwo + 1;
        }
      }
      
      //returning boolean
      if (counter == 0 || countertwo == 0) {
        return true;
      }
      else {
        return false;
      }
      
    }


    public static void main(String[] args) {
      //did not use scanner
      //test array that is the input for all of the methods
      int[] x = {5, 7, 1, 3, 50};
      //geometric array to test isGeometric
      int[] y = {2, 4, 16, 256, 65536};
      int[] z = {1, 2, 4, 8, 16};

      System.out.println("original array: ");
      System.out.println(Arrays.toString(x));
      System.out.println(" "); 
      System.out.println("reverse of array: ");
      System.out.println(Arrays.toString(reverse(x)));
      System.out.println("Is this a geometric series? ");
      System.out.println(isGeometric(x));
      System.out.println("the second largest number: ");
      System.out.println(secondLargest(x));

      System.out.println("test geometric: " + isGeometric(y));
      System.out.println(isGeometric(z));
      

        
    }
}
