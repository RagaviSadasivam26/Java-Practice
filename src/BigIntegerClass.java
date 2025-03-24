import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerClass {

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first large number: ");
        BigInteger num1 = new BigInteger(scanner.next());

        System.out.print("Enter second large number: ");
        BigInteger num2 = new BigInteger(scanner.next());

        System.out.println("Addition: " + num1.add(num2));
        System.out.println("Subtraction: " + num1.subtract(num2));
        System.out.println("Multiplication: " + num1.multiply(num2));

        if (!num2.equals(BigInteger.ZERO)) {
            System.out.println("Division: " + num1.divide(num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

            System.out.print("Enter a number to calculate factorial: ");
            int factorialNumber = scanner.nextInt();
            System.out.println("Factorial: " + factorial(factorialNumber));

        System.out.print("Enter base number: ");
        BigInteger base = new BigInteger(scanner.next());
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("Power: " + base.pow(exponent));

        scanner.close();
    }
}
