import java.util.Scanner;
class TemperaturConversionCtoF {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}