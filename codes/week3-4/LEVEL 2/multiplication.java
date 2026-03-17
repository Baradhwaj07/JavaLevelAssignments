import java.util.Scanner;
class multiplication{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int i=6;i<=9;i++){
            int a;
            a = number*i;
            System.out.println(+number+"*"+i+"="+a);
        }
    }
}