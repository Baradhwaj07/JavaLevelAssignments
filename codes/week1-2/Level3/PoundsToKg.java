import java.util.Scanner;
class PoundsToKg{
    public static void main(String[] args) {
        double Pounds, Kg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in Pounds: ");
        Pounds=sc.nextDouble();
        Kg= Pounds/2.2;
        System.out.printf(" The weight of the person in pounds is %.2f and in kg is %.4f", Pounds, Kg);
    }
}