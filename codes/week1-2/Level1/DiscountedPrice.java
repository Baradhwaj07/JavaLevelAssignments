/**The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course. */
class DiscountedPrice{
    public static void main(String[] args){
        int fees = 125000;
        int discountPercent = 10;
        int finalDiscount = fees*discountPercent/100;
        int finalFees = fees-finalDiscount;
        System.out.println("Fees Amount: " +fees+ "Discount Percentage: "+discountPercent+ "Discount Amount" +finalDiscount+ "Final Fees: "+finalFees);        
    }
}