import java.util.Scanner;
class TotalIncome{
    public static void main(String[] args) {
        double salary, bonus, totalIncome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        salary = sc.nextDouble();
        System.out.println("Enter your bonus:");
        bonus = sc.nextDouble();
        totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}