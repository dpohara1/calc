import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String input;
        double x;
        double y;
        double result;

        calculator.printInstructions();
        do {
            System.out.println("Type a command: ");
            input = scanner.next();
            switch (input) {
                case "quit":
                    System.out.println("Exiting program...");
                    break;
                case "add":
                    System.out.println("Enter number 1:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter number 2:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.add(x, y);
                    System.out.println(x + " + " + y + " = " + result);
                    break;
                case "subtract":
                    System.out.println("Enter number 1:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter number 2:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.subtract(x, y);
                    System.out.println(x + " - " + y + " = " + result);
                    break;
                case "multiply":
                    System.out.println("Enter number 1:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter number 2:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.multiply(x, y);
                    System.out.println(x + " * " + y + " = " + result);
                    break;
                case "divide":
                    System.out.println("Enter number 1:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter number 2:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.divide(x, y);
                    System.out.println(x + " ÷ " + y + " = " + result);
                    break;
                case "modulo":
                    System.out.println("Enter number 1:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter number 2:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.modulo(x, y);
                    System.out.println(x + " % " + y + " = " + result);
                    break;
                case "sqrt":
                    System.out.println("Enter a number:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.squareRoot(x);
                    System.out.println("The square root of " + x + " = " + result);
                    break;
                case "power":
                    System.out.println("Enter a number:");
                    try {
                        x = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    System.out.println("Enter an exponent:");
                    try {
                        y = scanner.nextInt();
                    }
                    catch (Exception e) {
                        System.out.println("Invalid input!");
                        scanner.next();
                        break;
                    }
                    result = calculator.exponent(x, y);
                    System.out.println(x + "^" + y + " = " + result);
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
        while (!input.equals("quit"));
        scanner.close();
    }

    public void printInstructions() {
        System.out.println("Commands:");
        System.out.println("\tquit: Exit the program");
        System.out.println("\tadd: Add two numbers");
        System.out.println("\tsubtract: Subtract two numbers");
        System.out.println("\tmultiply: Multiply two numbers");
        System.out.println("\tdivide: Divide two numbers");
        System.out.println("\tmodulo: Calculate the remainder of the division of two numbers");
        System.out.println("\tsqrt: Take the square root of a number");
        System.out.println("\tpower: Multiply a number by an exponent");
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double modulo(double x, double y) {
        return x % y;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public double exponent(double x, double y) {
        return Math.pow(x, y);
    }
}
