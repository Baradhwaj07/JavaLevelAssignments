import java.util.Scanner;
class bonusCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Salary, YearsofExpp;
        System.out.println("Enter your salary: ");
        Salary = sc.nextInt();
        System.out.println("Enter your Years of Experience in this Company: ");
        YearsofExpp = sc.nextInt();
        if(YearsofExpp<5){
            System.out.println("Sorry your are not eligible for Bonus");
        }
        else{
            double Bonus;
            Bonus = Salary*0.05;
            System.out.printf("Your Bonus is %.2f and your Salary with bonus is %.2f", Bonus, Salary+Bonus);
        }
    }
}