class EarthVolume{
    public static void main(String[] args) {
        double pi = 3.1415;
        double r = 6378;
        double km, miles;
        km=(4*pi*r*r*r)/3;
        km=km/1000000000;
        miles=km/1.6;
        System.out.println("The volume of earth in cubic kilometers is " +km+ " * 10^9 and cubic miles is " +miles+ " * 10^9");
    }
}