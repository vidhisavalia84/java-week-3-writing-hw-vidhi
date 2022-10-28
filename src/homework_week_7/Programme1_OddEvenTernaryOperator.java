package homework_week_7;
import java.util.Scanner;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme1_OddEvenTernaryOperator {
    public static void main(String[] args){
        //scanner declaration for reding input from consol
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number=scanner.nextInt();
        isOddOrEvenNumber(number);
        scanner.close();  //clpsing the scanner
    }

    //checking the number is even or odd
    public static void isOddOrEvenNumber(int number){
        String evenOrOdd=(number%2==0) ?"Even":"Odd";
        System.out.println("the number "+number+" is "+evenOrOdd+" number");
    }
}
