import java.util.Scanner;
class SmallNumberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        if(num1>num2 && num1>num3){
            System.out.println("Is the first number the smallest? YES");
        }else{
            System.out.println("Is the first number the smallest? NO");
        }
    }
}