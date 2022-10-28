package homework_week_7;
/**
 * Write a Java program to calculate the average value of array
 */
import java.util.Arrays;

public class Programme19_AverageOfArray {
    public static void main(String[] args){
        //numeric array declaration
        int[] numArray={1789,2035,1899,2040,1950,2255,7897,1455,787};
        int sum=0;
        //calculating the sum of the value
        for(int i=0;i<numArray.length;i++){
            sum=sum+numArray[i];
        }
        //finding the average of arrays value
        int average=sum/numArray.length;
        System.out.println("Values of the elements of the arrays are: "+ Arrays.toString(numArray));
        System.out.println("Average of all the values of the Array are: "+average);
    }
}
