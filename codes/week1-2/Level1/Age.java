/**Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024 */
import java.util.Scanner;
class age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth year: ");
        int yr= sc.nextInt();
        int a = 2024-yr;
        if (a<0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Your age is: "+ a);
        }
    }
}