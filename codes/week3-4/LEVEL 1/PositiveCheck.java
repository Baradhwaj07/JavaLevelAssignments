import java.util.Scanner;
class PositiveCheck{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if (number>0){
            System.out.println("The entered number is positive");
        }else if(number<0){
            System.out.println("The entered number is negative");
        }else{
            System.out.println("The entered number is Zero");
        }
    }        
}