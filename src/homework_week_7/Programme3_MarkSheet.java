package homework_week_7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;
public class Programme3_MarkSheet {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nEnter Student name  \t \t:\t"  );
        String name=scanner.next();
        System.out.println("enter student Roll number \t\t:\t");
        int rollno=scanner.nextInt();
        System.out.println("Enter marks of subject Maths \t:\t");
        int mathMarks= scanner.nextInt();
        if(mathMarks<0||mathMarks>100){
            System.out.println("\n Ivalid Input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks \t\t:\t");
            mathMarks=scanner.nextInt();
        }
        System.out.println("Please enter  mark of subject science\t:\t");
        int scienceMarks=scanner.nextInt();
        if(scienceMarks<0||scienceMarks>100){
            System.out.println("\n Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks \t\t:\t");
            scienceMarks=scanner.nextInt();
        }
        System.out.println("Plase enter marks of subject English\t:\t");
        int englishMarks=scanner.nextInt();
        if(englishMarks<0||englishMarks>100){
            System.out.println("\n Invalid input, Marks should be between 0 to 100");
            System.out.println("Please enter correct marks \t\t:\t");
            englishMarks=scanner.nextInt();
        }
        int total=sum(mathMarks,scienceMarks,englishMarks);
        int percentage=(total*100)/300;
        String result=calculateResult(mathMarks,scienceMarks,englishMarks);
        String grade=calculateGrade(percentage,result);
        printTheMarkSheet(name,rollno,mathMarks,scienceMarks,englishMarks,total,percentage,result,grade);
        scanner.close();//closing scanner
    }
    // calculating the sum
    public static int sum(int a,int b, int c){
        return a+b+c;
    }
    //calculating the results on subject marks
    public static String calculateResult(int mathsMarks, int scienceMarks,int englishMarks){
        if(mathsMarks<35||scienceMarks<35||englishMarks<35){
            return "Fail";
        }
            else{
                return "Pass";
            }
    }
    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage > +80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "c";
            } else {
                grade = "_";
            }

    }return grade;
    }
    //printing the marksheet
    public static void printTheMarkSheet(String name,int rollno,int mathsMarks,int scienceMarks,int englishMarks,double totle
    ,double percentage,String result,String grade){
        System.out.println("______________________________________");
        System.out.println("|                                    |");
        System.out.println("|      Mark Sheet                    |");
        System.out.println("|____________________________________|");
        System.out.println("|  Name:"+name+"                              |");
        System.out.println("|  Roll No"+rollno+"                         |");
        System.out.println("|____________________________________|");
        System.out.println("|  Math:"+mathsMarks+"                           |");
        System.out.println("|  Science: "+scienceMarks+"                         |");
        System.out.println("|  English: "+englishMarks+"                         |");
        System.out.println("|____________________________________|");
        System.out.println("|  Total: "+totle+"                      |");
        System.out.println("|____________________________________|");
        System.out.println("|  Percentage:"+percentage+"                   |");
        System.out.println("|  Result: "+ result+"                      |");
        System.out.println("|  Grade: "+grade+"                         |");
        System.out.println("|____________________________________|");
    }
}
