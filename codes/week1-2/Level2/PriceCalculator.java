import java.util.Scanner;
class PriceCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int quantity;
        double unitPrice, totalPrice;
        System.out.println("Enter the quantity of the item:");
        quantity = sc.nextInt();
        System.out.println("Enter the unit price of the item:");
        unitPrice = sc.nextDouble();
        totalPrice = quantity * unitPrice;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}