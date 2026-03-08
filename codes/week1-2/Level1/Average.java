/**Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
 */
import java.util.Scanner;
class level1c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics Mark: ");
        int a = sc.nextInt();
        System.out.println("Enter Maths Mark: ");
        int b = sc.nextInt();
        System.out.println("Enter Chemistry Mark: ");
        int c = sc.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("Average of three marks: "+avg);
        
    }
}