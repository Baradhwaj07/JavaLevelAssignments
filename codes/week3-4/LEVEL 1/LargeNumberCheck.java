import java.util.Scanner;
class LargeNumberCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();
        if (num1>num2 && num1>num3){
            System.out.println("Is the first number the largest? YES");
            System.err.println("Is the second number the largest? NO");
            System.err.println("Is the third number the largest? NO");
        }else if(num2>num1 && num2>num3){
            System.out.println("Is the first number the largest? NO");
            System.err.println("Is the second number the largest? YES");
            System.err.println("Is the third number the largest? NO");
        }else{
            System.out.println("Is the first number the largest? NO");
            System.err.println("Is the second number the largest? NO");
            System.err.println("Is the third number the largest? YES");
        }
    }
}