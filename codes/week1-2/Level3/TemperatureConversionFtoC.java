import java.util.Scanner;
class TemperatureConversionFtoC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)*5.0/9.0;
        System.out.println("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
    }
}