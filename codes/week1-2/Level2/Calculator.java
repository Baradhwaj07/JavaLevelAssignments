import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("The Addition, Subtraction, Multiplication and Division of the two numbers are: " + sum + ", " + difference + ", " + product + ", " + quotient);
    }
}