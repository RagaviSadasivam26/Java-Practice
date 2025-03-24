import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {

        double num1 = 0.1;
        double num2 = 0.2;
        double sumDouble = num1 + num2;
        System.out.println("Floating-point sum: " + sumDouble);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        BigDecimal sumBigDecimal = bd1.add(bd2);
        System.out.println("BigDecimal sum: " + sumBigDecimal);

        BigDecimal num3 = new BigDecimal("1.0");
        BigDecimal num4 = new BigDecimal("3.0");
        BigDecimal divisionResult = num3.divide(num4, 10, RoundingMode.HALF_UP);
        System.out.println("BigDecimal division (1/3): " + divisionResult);
    }
}
