import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        double principal, rate, time, SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        principal = sc.nextDouble();
        System.out.println("Enter Rate: ");
        rate = sc.nextDouble();
        System.out.println("Enter time: ");
        time = sc.nextDouble();
        SI = principal*rate*time/100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f",SI,principal,rate,time);
    }
}