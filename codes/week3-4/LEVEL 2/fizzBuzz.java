import java.util.Scanner;
class fizzBuzz{
    public static void main(String[] args) {
        int number, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        number = sc.nextInt();
        if(number<0){
            System.out.println("No Negative Number");
        }
        else{
            for(i=1;i<=number;i++){
                if(i%3==0)System.out.println("Fizz");
                else if(i%5==0)System.out.println("Buzz");
                else System.out.println(i);
            }
        }
    }
}