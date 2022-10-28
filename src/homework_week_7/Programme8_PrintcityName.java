package homework_week_7;
/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
import java.util.Scanner;
public class Programme8_PrintcityName {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the alphabet between A to F :");
        char city=scanner.next().charAt(0);

        //object creation
        Programme8_PrintcityName cityname=new Programme8_PrintcityName();
        cityname.printCity(city);

        scanner.close();//closing scanner

    }
    //printing city name
    public void printCity(char city){
        if(city=='A'||city=='a'){
            System.out.println("Aberdeen");
        } else if (city=='B'||city=='b') {
            System.out.println("Belfast");
        } else if (city=='C'||city=='c') {
            System.out.println("Cambridge");
        } else if (city=='D'||city=='d') {
            System.out.println("Derby");
        } else if (city=='E'||city=='e') {
            System.out.println("Edinburg");
        } else if (city=='F'||city=='f') {
            System.out.println("Feltham");
        }else {
            System.out.println("The alphabet you enter is not between A to F");
        }

    }
}
