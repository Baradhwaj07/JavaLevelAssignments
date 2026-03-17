/**Create a program to convert the distance of 10.8 kilometers to miles */
import java.util.Scanner;
class KmToMilesInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
    
}