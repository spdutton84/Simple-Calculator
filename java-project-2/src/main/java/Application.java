import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        double var1;
        double var2;
        int process;
        double result;
        Scanner scan = new Scanner(System.in);

        //ask user which mathematical process they would like to use.
        System.out.println("Enter 1 for addition, enter 2 for subtraction, enter 3 for multiplication, enter 4 for division");
        process = scan.nextInt();

        if (process == 1){
            System.out.println("You chose addition");
        }
        if (process == 2) {
            System.out.println("You chose subtraction");
        }
        if (process == 3) {
            System.out.println("You chose multiplication");
        }
        if (process == 4) {
            System.out.println("You chose division");
        }

        //ask for 2 variables user would like to use
        System.out.println("Enter first variable");
        var1 = scan.nextDouble();

        System.out.println("Enter second variable");
        var2 = scan.nextDouble();

        //math for addition
        if (process == 1) {
            result = var1 + var2;
            System.out.println(var1 + " + " + var2 + " = " + result);
        }

        //math for subtraction
        if (process == 2) {
            result = var1 - var2;
            System.out.println(var1 + " - " + var2 + " = " + result);
        }

        //math for multiplication
        if (process == 3) {
            result = var1 * var2;
            System.out.println(var1 + " * " + var2 + " = " + result);
        }

        //math for division
        if (process == 4) {
            result = var1 / var2;
            System.out.println(var1 + " / " + var2 + " = " + result);
        }
    }
}
