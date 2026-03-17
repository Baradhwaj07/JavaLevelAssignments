import java.util.Scanner;
class IntOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double result1 = a + b * c; // Multiplication has higher precedence than addition
        double result2 = a * b + c; // Multiplication has higher precedence than addition
        double result3 = c + a / b; // Division has higher precedence than addition
        double result4 = a % b + c; // Modulus has higher precedence than addition
        
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}