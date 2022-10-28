package homework_week_7;

import java.util.Scanner;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12_FindInputValue {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character");
        char ch=scanner.next().charAt(0);
        //object creation
        Programme12_FindInputValue inputValue=new Programme12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        scanner.close();
    }
    //find the input value is alphabet,number or symbol
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println(ch+" is an alphabet ");
        } else if (ch>='0' && ch<='9') {
            System.out.println(ch+" is a Digit");
        }else {
            System.out.println(ch+" is a symbol");
        }
    }
}
