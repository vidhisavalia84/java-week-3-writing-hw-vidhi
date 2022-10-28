package homework_week_7;
import java.util.Scanner;
/*
        *Write a java program to input any year like (ex.2007) and find out if it is leap year or
        * not?
        */
public class Programme2_LeapYear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year=scanner.nextInt();
        Programme2_LeapYear leapyear=new Programme2_LeapYear();
        leapyear.isLeapYear(year);
        scanner.close();
    }
    //checking is it leapyear or not
    public void isLeapYear(int year){
        if(year%4==0&&year%100!=0 || year%400==0){
            System.out.println("The year "+ year+" is leap year");
        }
        else{
            System.out.println("The year "+year+" is not Leap year ");
        }
    }




}
