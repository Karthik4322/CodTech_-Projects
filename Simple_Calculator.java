import java.util.Scanner;

class Simple_Calculator {
    int number1;
    int number2;

    public int Add() {
        int sum = number1 + number2;
        return sum;
    }

    public int Subtraction() {
        int sub = number1 - number2;
        return sub;
    }

    public int Multiplication() {
        int mul = number1 * number2;
        return mul;
    }

    public int Division() {
        int div = number1 / number2;
        return div;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose mode of operation");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int mode_selection = s.nextInt();

        System.out.println("Enter the first number: ");
        int number1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = s.nextInt();

        Simple_Calculator obj = new Simple_Calculator();
        obj.number1 = number1;
        obj.number2 = number2;

        int result = 0;
        switch (mode_selection) {
            case 1:
                result = obj.Add();
                System.out.println("Result: " + result);
                break;
            case 2:
                result = obj.Subtraction();
                System.out.println("Result: " + result);
                break;
            case 3:
                result = obj.Multiplication();
                System.out.println("Result: " + result);
                break;
            case 4:
                result = obj.Division();
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid selection");
        }

        s.close();
    }
}
