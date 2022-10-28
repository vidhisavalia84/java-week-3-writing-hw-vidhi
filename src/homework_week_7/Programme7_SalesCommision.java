package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 */
public class Programme7_SalesCommision {
    public static void main(String[] args) {
        //Scanner declaration for reading input from consol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller name:");
        String name = scanner.nextLine();
        System.out.println("Enter seller Id: ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter sales amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic salary:");
        int basicSalary = scanner.nextInt();

        //creating an object to call instance method
        Programme7_SalesCommision salescommision = new Programme7_SalesCommision();
        int grossSalary = basicSalary + salescommision.salesCommision(salesAmount);
        System.out.println("Seller name is : " + name);
        System.out.println("Seller Id is: " + sellerId);
        System.out.println("Seller's sales amount is : " + salesAmount);
        System.out.println("Seller's basic salary is : " + basicSalary);
        System.out.println("Seller's gross salary is : " + grossSalary);

        scanner.close();//closing the scanner

    }

    //calculating the sales commision
    public int salesCommision(int salesAmount) {
        int commision;
        if (salesAmount >= 50000) {
            commision = (salesAmount * 35) / 100;
            System.out.println("Sales commision is " + commision);
        } else if (salesAmount >= 30000) {
            commision = (salesAmount * 20) / 100;
            System.out.println("Sales commision is " + commision);
        } else if (salesAmount >= 20000) {
            commision = (salesAmount * 10) / 100;
            System.out.println("Sales commision is: " + commision);
        } else if (salesAmount >= 10000) {
            commision = (salesAmount * 5) / 100;
            System.out.println("Sales commision is: " + commision);
        } else {
            commision = (salesAmount * 2) / 100;
            System.out.println("Sales commision is: " + commision);
        }
        return commision;

    }

}
