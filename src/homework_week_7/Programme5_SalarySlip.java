package homework_week_7;
import java.util.Scanner;
public class Programme5_SalarySlip {
public static void main(String[] args){
    //scanner declaration
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your Name:");
    String name=scanner.nextLine();
    System.out.println("Enter your EmployeeID: ");
    int employeeId=scanner.nextInt();
    System.out.println("Enter your basic salary: ");
    double basicSalary=scanner.nextDouble();
    //calculating HRA,TA,DA and PF
    double hRA=calculateHRA(basicSalary);
    double da=calculateDA(basicSalary);
    double ta=calculateTA(basicSalary);
    double pf=calculatePF(basicSalary);
    //calculating gross salary
    double grossSalary=basicSalary+hRA+ta+da+pf;
    System.out.println("_____________________________________");
    System.out.println("|  Salary Slip                      |");
    System.out.println("|___________________________________|");
    System.out.println("|  Employee ID: "+employeeId+"                  |");
    System.out.println("|  EmployeeName: "+name+"               |");
    System.out.println("|___________________________________|");
    System.out.println("|  Basic Salary: "+basicSalary+"            |");
    System.out.println("|  HRA 10%     : "+hRA+"             |");
    System.out.println("|  TA 8%       : "+ta+"             |");
    System.out.println("|  DA 9%       : "+da+"             |");
    System.out.println("|  PF -20%     : "+pf+"             |");
    System.out.println("|___________________________________|");
    System.out.println("|  Gross Salary: "+grossSalary+"            |");
    System.out.println("|___________________________________|");

    scanner.close();

}
//calculating hra
    public static double calculateHRA(double basicSalary){
    return (basicSalary*10)/100;
    }
    //calculating DA
    public static double calculateDA(double basicSalary){
    return (basicSalary*8)/100;
    }
    // calculating TA
    public static double calculateTA(double basicSalary){
    return (basicSalary*9)/100;
    }
    //calculating PF
    public static double calculatePF(double basicSalary){
    return (basicSalary*20)/100;

    }


}
