import java.util.Scanner;
class AthleteDistance{
    public static void main(String[] args) {
        double dist1, dist2, dist3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Sides value of the park: ");
        dist1=sc.nextDouble();
        dist2=sc.nextDouble();
        dist3=sc.nextDouble();
        double peri = dist1+dist2+dist3;
        double round, minDist = 5;
        round = minDist/peri;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km", round);
    }
}