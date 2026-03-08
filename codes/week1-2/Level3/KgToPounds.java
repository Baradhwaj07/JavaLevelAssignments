import java.util.Scanner;
class KgToPounds{
    public static void main(String[] args) {
        double Pounds, Kg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in KG: ");
        Kg=sc.nextDouble();
        Pounds= Kg*2.2;
        System.out.printf(" The weight of the person in pounds is %.4f and in kg is %.2f", Pounds, Kg);
    }
}