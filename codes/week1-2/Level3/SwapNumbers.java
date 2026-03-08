
import java.util.Scanner;
class SwapNumbers{
    public static void main(String[] args) {
        double num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        // Swapping the numbers
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: First number is " + num1 + " and Second number is " + num2);
    }
}