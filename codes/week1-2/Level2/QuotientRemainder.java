import java.util.Scanner;
class QuotientRemainder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        double quotient = number1/number2;
        double remainder = number1%number2;
        System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two number "+number1+" and "+number2);
    }
}