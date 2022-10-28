package homework_week_7;
import java.util.Scanner;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_FindPositiveNegative {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enyer number ");
        int number=scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        scanner.close();//closing the scanner

    }
    //finding the number is positive or negative or zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if(number>0){
            System.out.println(number+" is positive number");
        } else if (number<0) {
            System.out.println(number+" is Negative number");
        }else {
            System.out.println(number+" is Zero");
        }
    }
}
