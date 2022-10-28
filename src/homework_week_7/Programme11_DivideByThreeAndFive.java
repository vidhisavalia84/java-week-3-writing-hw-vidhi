package homework_week_7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Number divide by 3 are :");
        for (int i = 0; i <= 100; i++) {
            dividByThree(i);
        }
        System.out.println("\n______________________________________________");
        System.out.println("Number divide by 5 are:");
        for (int x = 0; x <= 100; x++) {
            dividebyFive(x);
        }
    }

    //divided by three method
    public static void dividByThree(int number) {
        if (number % 3 == 0) {
            System.out.print(number + ",");
        }
    }

    //divide by 5
    public static void dividebyFive(int number) {
        if (number % 5 == 0) {
            System.out.print(number + ",");
        }
    }
}
