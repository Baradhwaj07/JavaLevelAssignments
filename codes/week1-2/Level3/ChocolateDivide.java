import java.util.Scanner;
class ChocolateDivide{
    public static void main(String[] args) {
        int chocolates, leftover, children;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Chocolates to divide: ");
        chocolates = sc.nextInt();
        System.out.println("Enter Number of children: ");
        children=sc.nextInt();
        int divide = chocolates/children;
        leftover = chocolates-(divide*children);
        System.out.println("The number of chocolates each child gets is "+divide+" and the number of remaining chocolates are "+leftover);
    }
}