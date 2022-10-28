package homework_week_7;
/**
        * Write a Java program to sum values of an array.
        */
import java.util.Arrays;

public class Programme18_SumOfArrays {
    public static void main(String[] args) {


    //numeric Array declaration
    int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
    int sum = 0;
//calculating sum of arrays value using for loop
    for(int i = 0;i<numArray.length; i++)

    {
        sum = sum + numArray[i];
    }
    System.out.println("Values of the elements of the array are: "+ Arrays.toString(numArray));
    System.out.println("Sum of all values of the Array: "+sum);
}
}
