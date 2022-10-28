package homework_week_7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Programme17_SortArray {
    public static void main(String[] args){
     //  numeric array declaration
        int[] numArray={1789,2035,1899,2040,1950,2255,7897,1455,787};
        //string array declaration
        String[] strArray={"Alpha","Bravo","Delta","Hotel","Mika","Sierra","Peter","Kilo"};
        System.out.println("Actual numeric array was: "+ Arrays.toString(numArray));
        //sorting Arrays
        Arrays.sort(numArray);
        System.out.println("Sorted numerical array is : "+Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String array was: "+Arrays.toString(strArray));
        //sorting string array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: "+Arrays.toString(strArray));
    }
}
