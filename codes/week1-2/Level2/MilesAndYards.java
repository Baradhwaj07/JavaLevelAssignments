import java.util.Scanner;
class MilesAndYards{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Distance in Feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet*3;
        double distanceInMiles = distanceInYards*1760;
        System.out.println("The distance in yards is "+distanceInYards+" while the distance in miles is "+distanceInMiles);
    }
}