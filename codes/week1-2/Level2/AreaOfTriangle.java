import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        double base, height, area, sqinches, sqcentimeters;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle:");
        height = sc.nextDouble();
        area = 0.5 * base * height;
        sqinches = area / 6.4516; // 1 square inch = 6.4516 square centimeters
        sqcentimeters = area;
        System.out.println("The area of the triangle is: " + sqcentimeters + " square centimeters or " + sqinches + " square inches.");
    }
}