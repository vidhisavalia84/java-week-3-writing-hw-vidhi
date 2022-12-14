package homework_week_7;
/**
 * Input any alphabet from âA to âFâ and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
import java.util.Scanner;
public class Programme9_PrintCityNameWithSwitch {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F");
        String city=scanner.nextLine();
        Programme9_PrintCityNameWithSwitch cityName= new Programme9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        scanner.close();  //closing scanner

    }

    //printing cityname
    public void printCityName(String city){
        switch (city){
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburg");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F ");

        }
    }
}
