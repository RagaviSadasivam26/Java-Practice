
public class MathOperations {

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static void findMaxMin(int a, int b) {
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
    }

    public static double randomBetweenOneAndHundred() {
        return 1 + Math.random() * 99;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void roundingOperations(double num) {
        System.out.println("Math.round: " + Math.round(num));
        System.out.println("Math.floor: " + Math.floor(num));
        System.out.println("Math.ceil: " + Math.ceil(num));
    }

    public static double absoluteDifference(double x, double y) {
        return Math.abs(x - y);
    }

    public static void convertAngles(double degrees) {
        double radians = Math.toRadians(degrees);
        System.out.println(degrees + " degrees in radians: " + radians);
        System.out.println(radians + " radians in degrees: " + Math.toDegrees(radians));
    }

    public static void trigonometryFunctions(double radians) {
        System.out.println("sin(" + radians + ") = " + Math.sin(radians));
        System.out.println("cos(" + radians + ") = " + Math.cos(radians));
        System.out.println("tan(" + radians + ") = " + Math.tan(radians));
    }

    public static void logarithms(double num) {
        System.out.println("Natural log (ln) of " + num + " = " + Math.log(num));
        System.out.println("Base-10 log of " + num + " = " + Math.log10(num));
    }

    public static int randomInRange(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        System.out.println("Square Root of 25: " + squareRoot(25));
        findMaxMin(10, 20);
        System.out.println("Random number between 1 and 100: " + randomBetweenOneAndHundred());
        System.out.println("2^5: " + power(2, 5));
        roundingOperations(4.7);
        System.out.println("Absolute difference between 15 and 7: " + absoluteDifference(15, 7));
        convertAngles(45);
        trigonometryFunctions(Math.PI / 4);
        logarithms(100);
        System.out.println("Random integer between 10 and 50: " + randomInRange(10, 50));
    }
}
