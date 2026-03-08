import java.util.Scanner;
class UniversityPriceInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        int fee = sc.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discountPercent = sc.nextInt();
        int discountAmount = fee * discountPercent / 100;
        int finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}