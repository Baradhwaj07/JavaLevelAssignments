import java.util.Scanner;
class voteEligibility{
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age>=18){
            System.out.println("The person can vote!");
        }
        else{
            System.out.println("The person cannot vote");
        }
    }
}